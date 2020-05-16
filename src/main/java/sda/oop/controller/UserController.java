package sda.oop.controller;

import sda.oop.data.UserData;
import sda.oop.model.Role;
import sda.oop.model.User;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class UserController {
    public void getAllUsers(){
        for (User user : UserData.userList){
            System.out.println(user.toString());
        }
    }
    public Optional<User> getUserByEmail(String searchEmail){
        return UserData.userList                                                   //List<User>
                .stream()                                                   //Stream<User>
                .filter(user -> user.getEmail().equals(searchEmail))        //Stream<User>
                .findFirst();                                                 //
    }
    public String getUserByEmailWithValidation(String searchEmail){
        Optional<User> userOpt = getUserByEmail(searchEmail);
        return userOpt.map(user -> "znaleziono użytkownia" +  user.toString())
                .orElseGet(() ->"Nie znaleziono użytkownika " + searchEmail);
    }
    public List<User> getAllUsersWithTheStatus(boolean status){
       return UserData.userList
                .stream()
                .filter(user -> user.isStatus() == status)
                .collect(Collectors.toList());
    }
    public void updateUserStatusById(int userID, boolean status){
        UserData.userList.stream().filter(user -> user.getID() == userID)
                .forEach(user -> user.setStatus(status));
    }
    public void updateUserRoleById(int userID, Role role){
        Optional<User> userOpt = UserData.userList.stream().filter(user -> user.getID() == userID).findFirst();
                if (userOpt.isPresent()){
                    userOpt.get().setRole(role);
                }

//                UserData.userList.stream().filter(user -> user.getID() == userID)
//                .forEach(user -> user.setRole(role));
    }
    public List<User> getAllUsersWithTheRole(Role role){
        return UserData.userList
                .stream()
                .filter(user -> user.getRole() == role)
                .collect(Collectors.toList());
    }
    public int countActiveUsers(){
        return (int) UserData.userList.stream().filter(user -> user.isStatus() == true).count();

    }
    public int countAdmins(){
        return (int) UserData.userList.stream().filter(user -> user.getRole() == Role.ROLE_ADMIN).count();
    }
    public List<User> getAllUsersOrderByregistrationDateDesc(){
        return UserData.userList
                .stream()
                .sorted(Comparator.comparing(User::getRegistrationDate)
                        .reversed())
                .collect(Collectors.toList());
    }

    public List<User> getAllAdminsOrderByEmailAsc(){
        return UserData.userList
                .stream()
                .filter(user -> user.getRole() == Role.ROLE_ADMIN)
                .sorted(Comparator.comparing(User::getEmail))
                .collect(Collectors.toList());
    }

}
