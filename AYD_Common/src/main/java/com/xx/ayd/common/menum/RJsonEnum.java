package com.xx.ayd.common.menum;

/**
 * 枚举 类型
 * 统一结果返回状态码
 * 200 成功
 * 400 失败
 */
public enum RJsonEnum {
    SUCCESS(200),ERROR(400);
    private int code;
    private RJsonEnum(int code){
        this.code=code;
    }
    public int getCode(){
        return this.code;
    }
}
