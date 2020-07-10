package com.company.commands;

import com.company.numbers.BaseNumber;

public class MultCommand implements ICommand {
    @Override
    public BaseNumber execute(BaseNumber a, BaseNumber b) {
        return a.mult(b);
    }
}
