package com.elderly.aid.models.ApiBaseModels;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@ApiModel(value = "基础请求返回")
public class ApiBase {


    @Getter
    @Setter
    @ApiModelProperty(value = "state",dataType = "int",name = "状态码",notes = "600：正常，601：错误，602：异常")
    public int state;

    @Getter
    @Setter
    @ApiModelProperty(value = "msg",dataType = "String",name = "文本消息内容",notes = "返回的文本消息内容")
    public String msg;

    /**
     * 返回失败
     */
    public ApiBase Error(String message) {
        this.state = OperationReturns.Error.State;
        this.msg = message;
        return this;
    }

    /**
     * 返回成功
     */
    public ApiBase Success(String message) {
        this.state = OperationReturns.Ok.State;
        this.msg = message;
        return this;
    }

    /**
     * 返回异常
     **/
    public ApiBase ExError(String message) {
        this.state = OperationReturns.ExError.State;
        this.msg = message;
        return this;
    }
}