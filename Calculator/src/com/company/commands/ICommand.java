package com.company.commands;

import com.company.numbers.BaseNumber;

public interface ICommand {
    BaseNumber execute(BaseNumber a, BaseNumber b);
}
