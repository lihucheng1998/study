package com.example.common.response;

import lombok.Data;

import java.io.Serializable;

/**
 * @author 21167
 */
@Data
public class Result<T> implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 成功
     */
    private static final int SUCCESS=200;
    /**
     * 失败
     */
    private static final int FAIL=500;

    private int code;

    private String msg;

    private T date;

    public static <T> Result<T> success(){return restResult(null,SUCCESS,null);}
    public static <T> Result<T> success(T data){return restResult(data,SUCCESS,null);}
    public static <T> Result<T> success(String msg){return restResult(null,SUCCESS,msg);}
    public static <T> Result<T> success(T data,String msg){return restResult(data,SUCCESS,msg);}
    public static <T> Result<T> fail(){return restResult(null,FAIL,null);}
    public static <T> Result<T> fail(String msg){return restResult(null,FAIL,msg);}
    public static <T> Result<T> fail(int code,String msg){return restResult(null,code,msg);}

    private static <T> Result<T> restResult(T data, int code, String msg){
       Result<T> result=new Result<>();
       result.setCode(code);
       result.setMsg(msg);
       result.setDate(data);
       return result;
    }
}
