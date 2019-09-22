package com.carlos.ayd.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xx.ayd.entity.BookRack;
import org.apache.ibatis.annotations.Param;

/**
 * Created by IntelliJ IDEA.
 * User: Carlos
 * Date: 2019/9/21
 * Time: 11:22
 */
public interface WeeDao extends BaseMapper<BookRack> {
    int add(@Param("bookid") int bookid);

    int update(@Param("imgurl")String imgurl, @Param("id")int id);

    int updatepage(@Param("pagination")int pagination, @Param("id")int id);
}
