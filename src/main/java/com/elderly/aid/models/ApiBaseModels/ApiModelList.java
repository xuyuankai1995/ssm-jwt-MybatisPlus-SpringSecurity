package com.elderly.aid.models.ApiBaseModels;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@ApiModel(value = "基础请求返回带list数据")
public class ApiModelList<T> extends ApiBase {

    @Getter
    @Setter
    @ApiModelProperty("列表总数")
    public int count;


    @Getter
    @Setter
    @ApiModelProperty("返回数据")
    public List<T> data;


    public ApiModelList<T> Error(String message) {
        this.state = OperationReturns.Error.State;
        this.msg = message;
        return this;
    }


    public ApiModelList<T> Success(List<T> data, String message) {
        this.state = OperationReturns.Ok.State;
        this.msg = message;
        this.count = data == null ? 0 : data.size();
        this.data = data;
        return this;
    }
}
