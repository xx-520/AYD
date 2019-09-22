package com.carlos.ayd.provider.service.impl;

import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.carlos.ayd.provider.cache.JedisUtil;
import com.carlos.ayd.provider.config.RedisKeyConfig;
import com.carlos.ayd.provider.dao.LookListDao;
import com.carlos.ayd.provider.service.LookListService;
import com.xx.ayd.common.dto.LookListTopDto;
import com.xx.ayd.common.util.RJsonUtil;
import com.xx.ayd.common.vo.RJson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * Author: Carlos
 * Date: 2019/9/22
 * Time: 17:14
 * Description:
 */
@Service
public class LookListServcieImpl extends ServiceImpl<LookListDao, LookListTopDto> implements LookListService {
    @Autowired(required = false)
    private LookListDao lookListDao;
    
    private JedisUtil jedisUtil = JedisUtil.getInstance();
    
    @Override
    public RJson<List<LookListTopDto>> selectLookListTop() {
        Map<String, String> map = jedisUtil.hgetall(RedisKeyConfig.LOOKTOP);
        if (map == null || map.size() == 0) {
            List<LookListTopDto> list = lookListDao.selectLookListTop();
            map = new LinkedHashMap<>();
            for (int i = 0; i < list.size(); i++) {
                map.put(i+1+"", JSON.toJSONString(list.get(i)));
            }
            jedisUtil.hmset(RedisKeyConfig.LOOKTOP, map);
            return RJsonUtil.setOK("OK", list);
        } else {
            List<LookListTopDto> list = new ArrayList<>();
            for (String k : map.keySet()) {
                String s = map.get(k);
                list.add(JSON.parseObject(s, LookListTopDto.class));
            }
            return RJsonUtil.setOK("OK", list);
        }
    }
}
