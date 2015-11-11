package com.qchu;

import java.util.HashMap;
import java.util.Map;

public class LoginInteractor {

  public enum LoginState {
    SUCCESS,
    ERROR
  }

  private Map<String, String> users = new HashMap<>();

  public LoginState login(String username, String password){
    return users.containsKey(username) ? LoginState.SUCCESS: LoginState.ERROR;
  }

  public void createUser(String username, String password){
    users.put(username, password);
  }

}
