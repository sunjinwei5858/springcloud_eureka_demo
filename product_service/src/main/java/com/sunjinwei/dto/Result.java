package com.sunjinwei.dto;

/**
 * @program: com.sunjinwei
 * @author: sun jinwei
 * @create: 2023-03-02 08:11
 * @description:
 **/
public class Result {

    private boolean success;

    private String msg;

    public Result(boolean success, String msg) {
        this.success = success;
        this.msg = msg;
    }

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