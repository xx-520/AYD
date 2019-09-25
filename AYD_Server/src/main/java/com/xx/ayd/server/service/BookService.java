package com.xx.ayd.server.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xx.ayd.common.vo.RJson;
import com.xx.ayd.entity.Book;

public interface BookService extends IService<Book> {

    public RJson selectBook(String bookname);

    public RJson selectGenre(String type);

    public RJson select(String bookname, String writer);

}