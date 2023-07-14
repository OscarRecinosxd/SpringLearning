package com.oscarrecinos.restapi.model.DAO;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.oscarrecinos.restapi.model.Entities.User;

@Service
public class UserDao {
    private static List<User> users = new ArrayList<>();
    public static int usersCount = 0;

    static{
        users.add(new User(++usersCount, "Oscar", LocalDate.now().minusYears(25)));
        users.add(new User(++usersCount, "Agustin", LocalDate.now().minusYears(20)));
        users.add(new User(++usersCount, "Recinos", LocalDate.now().minusYears(15)));
    }

    public List<User> findAll(){
        return users;
    }

    public User findOne(int id){
        return users.stream().filter((user) -> user.getId() == id).findFirst().orElse(null);
    }

    public User save(User user){
        user.setId(++usersCount);
        users.add(user);
        return user;
    }

    public void deleteById(int id){
        users.removeIf(user -> user.getId()==id);
        return;
    }

}
