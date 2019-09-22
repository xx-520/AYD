package com.carlos.ayd.api.service;

import com.xx.ayd.common.vo.RJson;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by IntelliJ IDEA.
 * User: Carlos
 * Date: 2019/9/21
 * Time: 11:38
 */
@FeignClient("WeeProvider")
public interface WeeService {
    @DeleteMapping("/server/delete.do")
    public RJson del(@RequestParam int id);

    @PostMapping("/server/add.do")
    public RJson add(@RequestParam int bookid);

    @PutMapping("/server/update.do")
    public RJson update(@RequestParam String imgurl,@RequestParam int id);

    @PutMapping("/server/uodatepage.do")
    public RJson updatepage(@RequestParam int pagination,@RequestParam int id);
}
