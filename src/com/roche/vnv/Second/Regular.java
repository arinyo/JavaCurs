package com.roche.vnv.Second;

public class Regular implements ResultCreator {
    @Override
    public Result create() {
        return new Result("3","4");
    }
}
