package com.carlos.ayd.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.carlos.ayd.dao.WeeDao;
import com.carlos.ayd.service.WeeService;
import com.xx.ayd.common.util.RJsonUtil;
import com.xx.ayd.common.vo.RJson;
import com.xx.ayd.entity.BookRack;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by IntelliJ IDEA.
 * User: Carlos
 * Date: 2019/9/21
 * Time: 11:24
 */
@Service
public class WeeServiceImpl extends ServiceImpl<WeeDao, BookRack> implements WeeService {

    @Autowired(required = false)
    private WeeDao weeDao;

    @Override
    public RJson add(int bookid) {
        return RJsonUtil.setR(weeDao.add(bookid)>0,"添加书架");
    }

    @Override
    public RJson update(String imgurl,int id) {
        return RJsonUtil.setR(weeDao.update(imgurl,id)>0,"修改书架中小说封面");
    }
}
