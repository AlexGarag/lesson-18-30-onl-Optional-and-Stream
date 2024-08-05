package by.tms.onl30.trainingmanual;

import by.tms.onl30.trainingmanual.task1.classes.User;
import by.tms.onl30.trainingmanual.task1.classes.UserStorage;

import java.util.List;

public class Executor {
    public static void main(String[] args) {
//        Задача 1:
//        Создать класс User с полем name. В Main создать поле user типа User. Заранее мы не
//        знаем лежит там объект или отсутствует. Написать логику, которая будет выводить имя
//        пользователя если объект присутствует в user, либо ‘DEFAULT’ в противном случае.
//                Использовать класс Optional
        UserStorage users = new UserStorage();
        users.addUser(new User("A"));
        users.addUser(new User());
        users.addUser(new User("B"));
        users.addUser(new User("C"));

        List<User> usersClone = users.getUserStorage();
        for (User user : usersClone) {
            System.out.println(user.getName().orElse("DEFAULT"));
        }
    }
}