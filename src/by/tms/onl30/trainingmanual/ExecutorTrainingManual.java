package by.tms.onl30.trainingmanual;

import by.tms.onl30.trainingmanual.task1.classes.User;
import by.tms.onl30.trainingmanual.task1.classes.UserStorage;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ExecutorTrainingManual {
    public static void main(String[] args) {
//        Задача 1:
//        Создать класс User с полем name. В Main создать поле user типа User. Заранее мы не
//        знаем лежит там объект или отсутствует. Написать логику, которая будет выводить имя
//        пользователя если объект присутствует в user, либо ‘DEFAULT’ в противном случае.
//                Использовать класс Optional
        System.out.println();
        System.out.println("Задача 1");
        UserStorage users = new UserStorage();
        users.addUser(new User("A"));
        users.addUser(new User());
        users.addUser(new User("B"));
        users.addUser(new User("C"));

        List<User> usersClone = users.getUserStorage();
        for (User user : usersClone) {
            System.out.println(user.getName().orElse("DEFAULT"));
        }

//        Задача 2:
//        При помощи стримов из списка строк вывести только те, которые начинаются с буквы ‘A’
        System.out.println();
        System.out.println("Задача 1");

        List<String> lines = new ArrayList<>();
        lines.add("ABBA");
        lines.add("Albano e Ramina Power");
        lines.add("Dwight Yoakam");
        lines.add("ELO");
        lines.add("Arabesque");
        lines.add("Dire Straits");

        Stream<String> stream = lines.stream();
        stream.filter(s -> s.substring(0, 1).equals("A")).forEach(System.out::println);

    }
}