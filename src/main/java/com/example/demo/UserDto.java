package com.example.demo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Frank
 * @date 2023/12/16 17:31
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserDto {
    Integer id;
    String name;
}
