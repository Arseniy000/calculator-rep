package com.company;
import com.company.commands.ICommand;
import com.company.exceptions.*;
import com.company.numbers.BaseNumber;

public class ExpressionCalculator {
    String expression;

    public ExpressionCalculator(String expression) {
        this.expression = expression;
    }

    public BaseNumber execute() throws InvalidOperationException, InvalidNumberException, MixNumberException {
        char[] operations = {'+', '-', '*', '/'};
        char oper = ' ';
        String a = "", b = "";

        for (int i = 0; i < operations.length; i++) {
            int index = expression.indexOf(operations[i]);
            if (index != -1)
            {
                oper = operations[i];
                a = expression.substring(0, index).trim();
                b = expression.substring(index + 1).trim();
                break;
            }
        }

        if (oper == ' ')
            throw new InvalidOperationException();

        BaseNumber number1 = FactoryNumber.create(a);
        BaseNumber number2 = FactoryNumber.create(b);
        if (number1.getClass() != number2.getClass())
            throw new MixNumberException();

        ICommand command = FactoryCommand.create(oper);
        return command.execute(number1, number2);
    }
}
