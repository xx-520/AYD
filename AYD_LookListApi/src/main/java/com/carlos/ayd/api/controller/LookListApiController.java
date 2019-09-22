package com.carlos.ayd.api.controller;

import com.carlos.ayd.api.service.LookListService;
import com.xx.ayd.common.dto.LookListTopDto;
import com.xx.ayd.common.vo.RJson;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Author: Carlos
 * Date: 2019/9/22
 * Time: 18:52
 * Description:
 */
@Api(value = "榜单操作", tags = "榜单操作")
@RestController
public class LookListApiController {
    @Autowired
    private LookListService lookListService;

    @ApiOperation(value = "查询榜单", notes = "查询榜单")
    @GetMapping("/api/look/queryLookListTop.do")
    public RJson<List<LookListTopDto>> queryLookListTop() {
        return lookListService.queryLookListTop();
    }
}
