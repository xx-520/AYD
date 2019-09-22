package com.xx.ayd.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

@Data
@TableName(value = "bookrack")
public class BookRack {
    private int id;
    private String bookname;
    private String imgurl;
    private String bookurl;
    private int uid;
    private int pagination;
    private int bookid;
    private Date timerank;
}
