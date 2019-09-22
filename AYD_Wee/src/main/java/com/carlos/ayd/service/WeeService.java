package com.carlos.ayd.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xx.ayd.common.vo.RJson;
import com.xx.ayd.entity.BookRack;

/**
 * Created by IntelliJ IDEA.
 * User: Carlos
 * Date: 2019/9/21
 * Time: 11:23
 */
public interface WeeService extends IService<BookRack> {
    RJson add(int bookid);

    RJson update(String imgurl, int id);

    RJson updatepage(int pagination, int id);
}
