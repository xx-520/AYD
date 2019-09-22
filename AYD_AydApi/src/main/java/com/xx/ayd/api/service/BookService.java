package com.xx.ayd.api.service;

import com.xx.ayd.common.vo.RJson;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("AydProvider")
public interface BookService {

    /**
     * 查询书城所有书籍
     */
    @GetMapping("/server/selectBook.do")
    public RJson selectBook(@RequestParam int bookid);

}
