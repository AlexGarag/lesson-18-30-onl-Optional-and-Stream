package by.tms.onl30.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ExecutorHomeWork {
    public static void main(String[] args) {

//        Задача 1:
//        Создать коллекцию класса ArrayList наполнить ее элементами типа Integer. С помощью
//        Stream'ов:
//                - Удалить дубликаты
//                - Оставить только четные элементы
//                - Вывести сумму оставшихся элементов в стриме
        List<Integer> array = new ArrayList<>();
        array.add(1);
        array.add(2);
        array.add(2);
        array.add(2);
        array.add(3);
        array.add(4);
        array.add(5);
        array.add(3);
        array.add(5);
        array.add(1);
        array.add(2);
        array.add(2);
        array.add(2);
        array.add(3);
        array.add(4);
        array.add(5);
        array.add(3);
        array.add(5);

        Stream<Integer> streamArray = array.stream();
        System.out.println("Число уникальных чётных значений: " +
                streamArray
                        .distinct()
                        .filter(a -> a % 2 == 0)
                        .count());
    }
}
