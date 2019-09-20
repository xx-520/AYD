package com.xx.ayd.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.util.Date;

@Data
public class Book {

    @TableId(type = IdType.AUTO)
    private Integer bid;
    private String bookname;
    private String details;
    private String writer;
    private Date uploading;
    private String imgurl;
    private String bookurl;
    private Integer gid;

}
