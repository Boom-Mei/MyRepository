package com.example.demo.model;

import java.util.List;

public class MyResult {//通用返回值实例
    private int code;private String msg;
    private List<?> list;
    private Object obj;

    public int getCode(){
        return code;
    }

    public void setCode(int code){
        this.code = code;
    }

    public String getMsg(){
        return msg;
    }

    public void setMsg(String msg){
        this.msg = msg;
    }

    public void setList(List list){
        this.list = list;
    }

    public void setObj(Object obj){
        this.obj = obj;
    }
}
