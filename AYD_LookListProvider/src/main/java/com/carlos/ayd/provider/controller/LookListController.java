package com.carlos.ayd.provider.controller;

import com.carlos.ayd.provider.service.LookListService;
import com.xx.ayd.common.dto.LookListTopDto;
import com.xx.ayd.common.vo.RJson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Author: Carlos
 * Date: 2019/9/22
 * Time: 18:40
 * Description:
 */
@RestController
public class LookListController {
    @Autowired
    private LookListService lookListService;

    @GetMapping("/provider/look/queryLookListTop.do")
    public RJson<List<LookListTopDto>> queryLookListTop() {
        return lookListService.selectLookListTop();
    }
}
