package sda.oop.data;

import sda.oop.model.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public interface UserData {
     //publiczne, statyczne, finalne
    List<User> userList = new ArrayList<>(Arrays.asList(
            new User("Adam", "Stępień","a@a.com","1234"),
            new User("Bdam", "BBB","b@a.com","1234"),
            new User("Cdam", "CCC","c@a.com","1234"),
            new User("Ddam", "DDD","d@a.com","1234"),
            new User("Edam", "EEE","e@a.com","1234"),
            new User("Fdam", "FFF","f@a.com","1234"),
            new User("Gdam", "GGG","g@a.com","1234"),
            new User("ASDdam", "GGGasd","g@a.com","1234"),
            new User("dadam", "GGGdss","g@a.com","1234"),
            new User("wedam", "GGGdfs","g@a.com","1234")
     ));
}
