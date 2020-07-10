package com.company;

import com.company.commands.*;
import com.company.exceptions.InvalidOperationException;

public class FactoryCommand {
    public static ICommand create(char operation) throws InvalidOperationException {
        ICommand command = null;

        if (operation == '+')
            command = new PlusCommand();
        else if (operation == '-')
            command = new MinusCommand();
        else if (operation == '*')
            command = new MultCommand();
        else if (operation == '/')
            command = new DivideCommand();
        else
            throw new InvalidOperationException();

        return command;
    }
}
