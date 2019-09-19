package com.xx.ayd.common.util;


import com.xx.ayd.common.menum.RJsonEnum;
import com.xx.ayd.common.vo.RJson;

/**
 * R工具类  设置返回的信息
 *
 * @author xx
 */
public class RJsonUtil {
    /**
     * 设置成功*/
    public static <T> RJson setOK(String msg, T obj){
        RJson<T> r=new RJson<>();
        r.setCode(RJsonEnum.SUCCESS.getCode());
        r.setMsg(msg);
        r.setData(obj);
        return r;
    }

    public static <T> RJson setOK(String msg){
        RJson<T> r=new RJson<>();
        r.setCode(RJsonEnum.SUCCESS.getCode());
        r.setMsg(msg);
        r.setData(null);
        return r;
    }
    public static <T> RJson setOK(){
        RJson<T> r=new RJson<>();
        r.setCode(RJsonEnum.SUCCESS.getCode());
        r.setMsg("OK");
        r.setData(null);
        return r;
    }

    // 设置失败
    public static <T> RJson setERROR(String msg, T obj){
        RJson<T> r=new RJson<>();
        r.setCode(RJsonEnum.ERROR.getCode());
        r.setMsg(msg);
        r.setData(obj);
        return r;
    }
    public static <T> RJson setERROR(String msg){
        RJson<T> r=new RJson<>();
        r.setCode(RJsonEnum.ERROR.getCode());
        r.setMsg(msg);
        r.setData(null);
        return r;
    }
    public static <T> RJson setERROR(){
        RJson<T> r=new RJson<>();
        r.setCode(RJsonEnum.ERROR.getCode());
        r.setMsg("ERROR");
        r.setData(null);
        return r;
    }
    // 根据情况判断
    public static <T> RJson setR(boolean issuccess, String msg){
        return issuccess?setOK(msg):setERROR(msg);
    }
}
