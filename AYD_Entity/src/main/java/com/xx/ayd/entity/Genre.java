package com.xx.ayd.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class Genre {

    @TableId(type = IdType.AUTO)
    private Integer gid;
    private String type;

}
