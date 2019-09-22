package com.carlos.ayd.provider.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xx.ayd.common.dto.LookListTopDto;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Author: Carlos
 * Date: 2019/9/22
 * Time: 17:02
 * Description:
 */
public interface LookListDao extends BaseMapper<LookListTopDto> {
    public List<LookListTopDto> selectLookListTop();
}
