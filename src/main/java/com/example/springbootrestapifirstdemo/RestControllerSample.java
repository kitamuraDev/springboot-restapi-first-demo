package com.example.springbootrestapifirstdemo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;

@RestController
public class RestControllerSample {

  @Autowired
  Gson gson;

  @RequestMapping(path = "/users", produces = MediaType.APPLICATION_JSON_VALUE)
  public String getUser() {
    List<UserEntity> userList = new ArrayList<UserEntity>();

    UserEntity user1 = createUserEntity(1, "Hitori", "hitori@foo.email");
    userList.add(user1);

    UserEntity user2 = createUserEntity(2, "Nijika", "nijika@foo.email");
    userList.add(user2);

    UserEntity user3 = createUserEntity(3, "Ryo", "ryo@foo.email");
    userList.add(user3);

    UserEntity user4 = createUserEntity(4, "Ikuyo", "ikuyo@foo.email");
    userList.add(user4);

    String jsonData = gson.toJson(userList);
    return jsonData;
  }

  private UserEntity createUserEntity(long id, String name, String email) {
    UserEntity userEntity = new UserEntity();

    userEntity.setId(id);
    userEntity.setName(name);
    userEntity.setEmail(email);

    return userEntity;
  }

}
