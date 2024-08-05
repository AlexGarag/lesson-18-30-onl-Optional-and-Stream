package by.tms.onl30.trainingmanual;

import by.tms.onl30.homework.entities.Developer;
import by.tms.onl30.trainingmanual.task1.entities.User;
import by.tms.onl30.trainingmanual.task1.entities.UserStorage;

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

//        Задача 3:
//        При помощи стримов из списка, содержащего объекты Developer, вывести только те, id >
//        10 и name начинается с ‘An'
        System.out.println();
        System.out.println("Задача 1");

        List<Developer> developers = new ArrayList<>();
        developers.add(new Developer(8, "Ab"));
        developers.add(new Developer(9, "Ak"));
        developers.add(new Developer(10, "Ab"));
        developers.add(new Developer(11, "ab"));
        developers.add(new Developer(12, "An"));
        developers.add(new Developer(14, "ab"));
        developers.add(new Developer(15, "An"));

        Stream<Developer> developersStream = developers.stream();
        developersStream
                .filter(d -> d.getId() > 10 && d.getName().substring(0, 2).equals("An"))
                .forEach(System.out::println);

    }
}