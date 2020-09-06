package tasks.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;


public class ValidParentheses {

    public static boolean checkValidness(String combination) {
        // довольно классическая задача
        // написать функцию, проверяющую правильность комбинации скобок
        // на вход подается комбинация из обычных, квадратных или фигурных скобок например "[()[{}]]"
        // нужно проверить - является ли такая комбинация верной:
        // 1) каждой открывающей скобке должна соответсвовать закрывающая скобка
        // 2) каждая пара скобок должна начинаться с отрывающей
        // 3) если пара скобок открывается внутри другой пары, то и закрываться она должна внутри нее
        // валидные пары ([{}]), (()[{()}([])])
        // не валидные {], ({[}])
        // нужно попытаться написать код так, чтобы можно было легко добавить новые типы скобок, например <>
        // возможно стоит создать и применить какие-то дополнительные классы
        // чтобы понять какие - нужно ответить на вопрос, какую функцию они выполняют? в чем их смысл

        // подсказка: использовать стэк https://ru.wikipedia.org/wiki/%D0%A1%D1%82%D0%B5%D0%BA
        // в java он реализован в LinkedList (методы push() и pop() )

        // (*) Сделать так, чтобы добавить новый вид скобок можно было максимально просто и понятно.

        if (combination.length() % 2 != 0) {
            return false;
        }
        String[] stringArray = combination.split("");

        LinkedList<String> brackets = new LinkedList<>();

        SymbolOfChain sch = new SymbolOfChain(stringArray[0]);

        if (sch.checkCloseBracket()) {
            return false;
        } else {
            for (int k = 0; k <= combination.length() - 1; k++) {
                sch.setIncString(stringArray[k]);
                if (sch.checkOpenBracket()) {
                    brackets.push(stringArray[k]);
                    System.out.println(stringArray[k]);
                } else {
                    if (sch.checkOppositeBracket(stringArray[k], brackets.getFirst())) {
                        brackets.pop();
                    }
                    else
                        return false;
                }
            }
        }
        return brackets.isEmpty();
    }

    /*public static void main(String[] args) {
        System.out.println(checkValidness(""));
    }*/
}
