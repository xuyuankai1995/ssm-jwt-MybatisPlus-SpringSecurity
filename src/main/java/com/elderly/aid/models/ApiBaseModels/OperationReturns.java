package com.elderly.aid.models.ApiBaseModels;

public enum  OperationReturns {

    Ok(600), Error(601), ExError(602);

    public int State;

    private OperationReturns(int State) {
        this.State = State;
    }
}
