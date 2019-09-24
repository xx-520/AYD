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

    /**
     * 查询书城书籍详情
     */
    @Override
    public RJson selectBook(int bookid) {
        Book book = bookDao.selectBook(bookid);
        return RJsonUtil.setOK("OK", book);
    }

    /**
     * 查询书城分类书籍
     */
    @Override
    public RJson selectGenre(int gid) {
        Book book = bookDao.selectGenre(gid);
        return RJsonUtil.setOK("OK", book);
    }

    /**
     * 从书籍姓名和作者查询书籍
     */
    @Override
    public RJson select(String bookname, String writer) {
        Book book = bookDao.select(bookname, writer);
        return RJsonUtil.setOK("OK", book);
    }
}
