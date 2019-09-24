package com.xx.ayd.server.dao;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xx.ayd.entity.Book;
import org.apache.ibatis.annotations.Param;


public interface BookDao extends BaseMapper<Book> {

    /**
     * 查询书城书籍详情
     */
    Book selectBook(@Param("bookid") int bookid);

    /**
     * 查询书城分类书籍
     */
    Book selectGenre(@Param("gid") int gid);

    /**
     * 从书籍姓名和作者查询书籍
     */
    Book select(@Param("bookname") String bookname, @Param("writer") String writer);

}
