package com.oscarrecinos.restapi.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.oscarrecinos.restapi.model.DAO.UserDao;
import com.oscarrecinos.restapi.model.DTO.ResponseDTO;
import com.oscarrecinos.restapi.model.Entities.User;
import com.oscarrecinos.restapi.utils.ErrorException;

import jakarta.validation.Valid;
import jakarta.websocket.server.PathParam;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class UserController {

    @Autowired
    private UserDao userDao;

    @GetMapping(value = "/users")
    public List<User> getUsers() {

        return userDao.findAll();
    }

    @GetMapping(value = "/users/{id}")
    public User getUser(@PathVariable int id) {
        User user = userDao.findOne(id);
        if (user == null) {
            throw new ErrorException("id: not found");
        }
        return user;
    }

    @PostMapping(value = "/users")
    public ResponseEntity<?> createUser(@Valid @RequestBody User user, BindingResult result) {
        if(result.hasErrors()){
            return new ResponseEntity<ResponseDTO>(new ResponseDTO("Debe existir nombre y usaurio"),HttpStatus.BAD_REQUEST);
        }
        User savedUser = userDao.save(user);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}").buildAndExpand(savedUser.getId()).toUri();

        return ResponseEntity.created(location).body(user);
        
    }
    @DeleteMapping(value="/users/{id}")
    public ResponseEntity<?> postMethodName(@PathVariable int id) {
        userDao.deleteById(id);
        
        return ResponseEntity.ok().body(new ResponseDTO("Deleted!"));
    }
    
}
