package sda.oop;

import org.w3c.dom.ls.LSOutput;
import sda.oop.controller.UserController;
import sda.oop.data.UserData;
import sda.oop.model.Role;
import sda.oop.model.User;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World");
        UserData.userList
                .stream()
                .forEach(user -> System.out.println(user) );


//        UserData.userList
//                .forEach(System.out::println);   to jest to samo tylko dużo uproszczone

        System.out.println();
        System.out.println();
        System.out.println();
        UserController uc = new UserController();
        System.out.println(uc.getUserByEmailWithValidation("c@a.com"));
        System.out.println();
        System.out.println();
        System.out.println();

        uc.updateUserStatusById(1,false);
        uc.updateUserStatusById(2,false);
        uc.updateUserStatusById(3,false);
        uc.updateUserStatusById(300,false);
        System.out.println("Aktywni użytkownicy: ");
        uc.getAllUsersWithTheStatus(true).forEach(System.out::println);
        uc.updateUserRoleById(6, Role.ROLE_ADMIN);
        uc.updateUserRoleById(0, Role.ROLE_ADMIN);
        uc.updateUserRoleById(2, Role.ROLE_ADMIN);
        uc.updateUserRoleById(2, Role.ROLE_ADMIN);
        System.out.println();
        System.out.println();
        System.out.println();
        uc.getAllUsersWithTheRole(Role.ROLE_ADMIN).forEach(System.out::println);

        System.out.println("Aktywni uzytkownicy " + uc.countActiveUsers());
        System.out.println("Admini " + uc.countAdmins());
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        uc.getAllUsersOrderByregistrationDateDesc().forEach(System.out::println);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        uc.getAllAdminsOrderByEmailAsc().forEach(System.out::println);
    }
}
