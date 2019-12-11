package com.elderly.aid.models.ApiBaseModels;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@ApiModel(value = "基础请求返回带实体信息")
public class ApiModelBase<T> extends ApiBase
{

    @Getter
    @Setter
    @ApiModelProperty("实体信息")
    public T data;


    public ApiModelBase<T> Error(String message)
    {
        this.state = OperationReturns.Error.State;
        this.msg = message;
        return this;
    }

    public ApiModelBase<T> Success(T data, String message)
    {
        this.state = OperationReturns.Ok.State;
        this.msg = message;
        this.data = data;
        return this;
    }

}
