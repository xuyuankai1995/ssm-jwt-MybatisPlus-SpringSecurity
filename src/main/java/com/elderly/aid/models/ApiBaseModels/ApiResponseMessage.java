package com.elderly.aid.models.ApiBaseModels;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
* 接口返回类
* */
public class ApiResponseMessage {
    /**
     * 返回状态
     * */
    @Getter
    @Setter
    public int code;

    /**
     * 返回消息
     * */
    @Getter
    @Setter
    public String msg;

    /**
     * 返回数据集
     * */
    @Getter
    @Setter
    public Object data;

    /**
     * 返回总数量
     * */
    @Getter
    @Setter
    public int count;
}









