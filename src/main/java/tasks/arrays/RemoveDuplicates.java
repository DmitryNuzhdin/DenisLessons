package tasks.arrays;

import java.util.ArrayList;

public class RemoveDuplicates {
    public static String[] removeDuplicates(String[] array){
        //метод должен возвращать новый массив в котором все повторно встречающиеся элементы удалены
        //например {"a", "b", "a", "b", "c", "c"} становится {"a", "b", "c"}
        //в остальном порядок меняться не должен, просто убрать повторные
        //имей ввиду что получается - ты не знаешь изначально какой длины будет массив с ответом
        ArrayList<String> res = new ArrayList<>();
        for (int k = 0; k < array.length; k++) {
            if (!res.contains(array[k])) {
                res.add(array[k]);
            }
        }
        int size = res.size();
        return res.toArray(new String[size]);
    }
}
