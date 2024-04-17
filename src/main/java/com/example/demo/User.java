package com.example.demo;

import lombok.*;

import javax.persistence.*;

/**
 * @author Frank
 * @date 2023/12/16 12:49
 */
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer id;

    String name;

    String password;
}
