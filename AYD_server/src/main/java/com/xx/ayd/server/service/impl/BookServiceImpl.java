package com.xx.ayd.server.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xx.ayd.common.util.RJsonUtil;
import com.xx.ayd.common.vo.RJson;
import com.xx.ayd.entity.Book;
import com.xx.ayd.server.dao.BookDao;
import com.xx.ayd.server.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl extends ServiceImpl<BookDao, Book> implements BookService {

    @Autowired(required = false)
    private BookDao bookDao;

    @Override
    public RJson selectBook(int bookid) {
        Book book = bookDao.selectBook(bookid);
        return RJsonUtil.setOK("OK", book);
    }
}
