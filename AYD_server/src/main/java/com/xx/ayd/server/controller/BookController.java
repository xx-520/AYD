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

    @GetMapping("/server/selectBook.do")
    public RJson selectBook(int bookid) {
        return bookService.selectBook(bookid);
    }

}
