package com.roche.vnv.Second;

public class AON implements ResultCreator {

    @Override
    public Result create() {
        return new Result("1","2");
    }
}
