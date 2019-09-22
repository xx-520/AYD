package com.xx.ayd.api.controller;

import com.xx.ayd.api.service.BookService;
import com.xx.ayd.common.vo.RJson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class BookController {

    @Autowired
    private BookService bookService;

    /**
     * 查询书城所有书籍
     */
    @GetMapping("/server/selectBook.do")
    public RJson selectBook(@RequestParam int bookid) {
        return bookService.selectBook(bookid);
    }

}
