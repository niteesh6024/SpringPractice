package com.example.restfulwebservices.user;

import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Component
public class UserDaoSerivce {
    private static List<User> users=new ArrayList<>();
    private static int ci=0;
    static {
        users.add(new User(++ci,"niteesh", LocalDate.now().minusYears(30)));
        users.add(new User(++ci,"satya", LocalDate.now().minusYears(5)));
        users.add(new User(++ci,"sai", LocalDate.now().minusYears(24)));

    }

    public List<User> findAll(){
        return users;
    }
    public User saveUser(User user){
        user.setId(++ci);
        users.add(user);
        return user;
    }
    public User findOne(int id) {
        Predicate<? super User> predicate = user -> user.getId().equals(id);
        return users.stream().filter(predicate).findFirst().orElse(null);
    }

    public void deleteById(int id) {
        Predicate<? super User> predicate = user -> user.getId().equals(id);
        users.removeIf(predicate);
    }
}
