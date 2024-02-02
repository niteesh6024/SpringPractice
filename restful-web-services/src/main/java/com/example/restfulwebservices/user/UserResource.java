package com.example.restfulwebservices.user;

import jakarta.validation.Valid;
import org.springframework.context.MessageSource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
public class UserResource {
    private UserDaoSerivce userDaoSerivce;

    public UserResource(UserDaoSerivce userDaoSerivce) {
        this.userDaoSerivce = userDaoSerivce;
    }

    @GetMapping(path = "/users")
    public List<User>  findAll(){
        return userDaoSerivce.findAll();
    }

    @GetMapping(path = "/users/{id}")
    public User findUser(@PathVariable int id){
        User user=userDaoSerivce.findOne(id);
        if(user==null){
            throw new UserNotFoundException("id:"+id);
        }
        return user;
    }

    @PostMapping (path = "/users")
    public ResponseEntity<User> addUser(@Valid @RequestBody User user){
        userDaoSerivce.saveUser(user);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(user.getId())
                .toUri();
        
        return ResponseEntity.created(location).build();
    }


    @DeleteMapping(path = "/users/{id}")
    public void deleteUser(@PathVariable int id) {
        userDaoSerivce.deleteById(id);
    }



}
