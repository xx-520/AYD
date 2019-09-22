package com.xx.ayd.server.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xx.ayd.common.vo.RJson;
import com.xx.ayd.entity.Book;

public interface BookService extends IService<Book> {

    public RJson selectBook(int bookid);

}