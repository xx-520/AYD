package com.carlos.ayd.api.service;

import com.xx.ayd.common.dto.LookListTopDto;
import com.xx.ayd.common.vo.RJson;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Author: Carlos
 * Date: 2019/9/22
 * Time: 18:49
 * Description:
 */
@FeignClient("LookListService")
public interface LookListService {
    @GetMapping("/provider/look/queryLookListTop.do")
    public RJson<List<LookListTopDto>> queryLookListTop();
}
