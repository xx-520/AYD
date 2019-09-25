package com.xx.ayd.api.service;

import com.xx.ayd.common.vo.RJson;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("AydProvider")
public interface BookService {

    /**
     * 查询书城书籍详情
     */
    @GetMapping("/server/selectBook.do")
    public RJson selectBook(@RequestParam String bookname);

    /**
     * 查询书城分类书籍
     */
    @GetMapping("server/selectGenre.do")
    public RJson selectGenre(@RequestParam String type);

    /**
     * 从书籍姓名和作者查询书籍
     */
    @GetMapping("/server.select.do")
    public RJson select(@RequestParam String bookname, @RequestParam String writer);

}
