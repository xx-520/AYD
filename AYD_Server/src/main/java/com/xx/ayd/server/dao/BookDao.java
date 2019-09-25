package com.xx.ayd.server.dao;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xx.ayd.entity.Book;
import org.apache.ibatis.annotations.Param;


public interface BookDao extends BaseMapper<Book> {

    /**
     * 查询书城书籍详情
     */
    Book selectBook(@Param("bookname") String bookname);

    /**
     * 查询书城分类书籍
     */
    Book selectGenre(@Param("type") String type);

    /**
     * 从书籍姓名和作者查询书籍
     */
    Book select(@Param("bookname") String bookname, @Param("writer") String writer);

}
