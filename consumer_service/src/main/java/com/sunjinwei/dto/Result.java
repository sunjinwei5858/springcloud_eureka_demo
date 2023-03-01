package com.sunjinwei.dto;

/**
 * @program: com.sunjinwei.dto
 * @author: sun jinwei
 * @create: 2023-03-02 07:34
 * @description:
 **/
public class Result {

    private boolean success;

    private String msg;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}