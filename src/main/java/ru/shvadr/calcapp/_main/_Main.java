package ru.shvadr.calcapp._main;

import static ru.shvadr.calcapp.util.Calculator.*;
import static ru.shvadr.calcapp.service.ResultWriterService.*;

public class _Main {
    public static void main(String[] args){
        int res1 = Add(2, 4);
        WriteResult(2, 4, res1, "Сложение");
        int res2 = Subtract(34, 26);
        WriteResult(34, 26, res2, "Вычитание");
        int res3 = Multiply(4, 7);
        WriteResult(4, 7, res3, "Умножение");


    }
}
