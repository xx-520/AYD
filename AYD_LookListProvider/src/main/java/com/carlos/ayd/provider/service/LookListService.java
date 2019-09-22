package com.carlos.ayd.provider.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xx.ayd.common.dto.LookListTopDto;
import com.xx.ayd.common.vo.RJson;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Author: Carlos
 * Date: 2019/9/22
 * Time: 17:11
 * Description:
 */
public interface LookListService extends IService<LookListTopDto> {
    public RJson<List<LookListTopDto>> selectLookListTop();
}
