package com.xx.ayd.common.vo;

import lombok.Data;

/**
 * 统一结果返回
 *
 * @author xx
 */
@Data
public class RJson<T> {
    private int code;
    private String msg;
    private T data;
}
