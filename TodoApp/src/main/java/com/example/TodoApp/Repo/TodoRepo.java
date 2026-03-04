package com.example.TodoApp.Repo;

import com.example.TodoApp.Module.module;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepo extends JpaRepository<module,Integer> {

}
