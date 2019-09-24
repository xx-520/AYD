package com.xx.ayd.server.controller;

import com.xx.ayd.common.vo.RJson;
import com.xx.ayd.server.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

    @Autowired
    private BookService bookService;

    /**
     * 查询书城书籍详情
     */
    @GetMapping("/server/selectBook.do")
    public RJson selectBook(int bookid) {
        return bookService.selectBook(bookid);
    }

    /**
     * 查询书城分类书籍
     */
    @GetMapping("/server/selectGenre.do")
    public RJson selectGenre(int gid) {
        return bookService.selectGenre(gid);
    }

    /**
     * 从书籍姓名和作者查询书籍
     */
    @GetMapping("/server.select.do")
    public RJson select(String bookname, String writer) {
        return bookService.select(bookname, writer);
    }

}
