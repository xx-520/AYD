package com.xx.ayd.server.dao;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xx.ayd.entity.Book;
import org.apache.ibatis.annotations.Param;


public interface BookDao extends BaseMapper<Book> {

    Book selectBook(@Param("bookid") int bookid);

}
