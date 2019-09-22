package com.carlos.ayd.api.controller;

import com.carlos.ayd.api.service.WeeService;
import com.xx.ayd.common.vo.RJson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by IntelliJ IDEA.
 * User: Carlos
 * Date: 2019/9/21
 * Time: 11:39
 */
@RestController
public class WeeApiController {
    @Autowired
    private WeeService weeService;

    @DeleteMapping("/api/book/del.do")
    public RJson del(@RequestParam int id) {
        return weeService.del(id);
    }

    @PostMapping("/api/add.do")
    public RJson add(@RequestParam int bookid) {
        return weeService.add(bookid);
    }

    @PutMapping("/api/update.do")
    public RJson update(@RequestParam String imgurl,@RequestParam int id){
        return weeService.update(imgurl,id);
    }

    @PutMapping("/server/uodatepage.do")
    public RJson updatepage(@RequestParam int pagination,@RequestParam int id){
        return weeService.updatepage(pagination,id);
    }
}
