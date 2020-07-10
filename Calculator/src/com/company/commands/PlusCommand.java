package com.company.commands;

import com.company.numbers.BaseNumber;

public class PlusCommand implements ICommand {
    @Override
    public BaseNumber execute(BaseNumber a, BaseNumber b) {
        return a.plus(b);
    }
}
