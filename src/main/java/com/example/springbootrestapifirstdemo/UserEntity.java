package com.example.springbootrestapifirstdemo;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@NoArgsConstructor
@Setter
public class UserEntity {
  private long id;
  private String name;
  private String email;
}
