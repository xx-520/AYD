package com.xx.ayd.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

@Data
@TableName(value = "book")
public class Book {

    @TableId(value = "bookid", type = IdType.AUTO)
    private int bookid;
    private String bookname;
    private String details;
    private String writer;
    private Date uploading;
    private String imgurl;
    private String bookurl;
    private int uid;
    private int gid;

}
