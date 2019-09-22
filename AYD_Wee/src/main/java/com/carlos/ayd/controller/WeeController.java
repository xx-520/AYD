package com.carlos.ayd.controller;

import com.carlos.ayd.service.WeeService;
import com.xx.ayd.common.util.RJsonUtil;
import com.xx.ayd.common.vo.RJson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IntelliJ IDEA.
 * User: Carlos
 * Date: 2019/9/21
 * Time: 11:25
 */
@RestController
public class WeeController {
    @Autowired
    private WeeService weeService;

    @DeleteMapping("/server/delete.do")
    public RJson del(int id) {
        boolean b = weeService.removeById(id);
        return RJsonUtil.setR(b, "删除成功");
    }

    @PostMapping("/server/add.do")
    public RJson add(int bookid){
        return weeService.add(bookid);
    }

    @PutMapping("/server/update.do")
    public RJson update(String imgurl,int id){
        return weeService.update(imgurl,id);
    }
}
