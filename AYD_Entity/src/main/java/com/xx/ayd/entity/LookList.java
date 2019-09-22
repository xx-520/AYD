package com.xx.ayd.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * Created by IntelliJ IDEA.
 * Author: Carlos
 * Date: 2019/9/22
 * Time: 16:43
 * Description:
 */
@Data
@TableName(value = "a_looklist")
public class LookList {
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    private String looks;
    private Integer bookid;
}
