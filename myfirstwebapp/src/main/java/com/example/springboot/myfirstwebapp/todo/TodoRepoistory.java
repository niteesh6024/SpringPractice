package com.example.springboot.myfirstwebapp.todo;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TodoRepoistory extends JpaRepository<Todo, Integer> {
    public List<Todo> findByUsername(String username);

}
