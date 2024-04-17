package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Frank
 * @date 2023/12/16 12:49
 */
public interface UserRepo extends JpaRepository<User, Integer> {

    User getUserById(int id);

}
