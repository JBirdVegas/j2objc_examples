package com.qchu;

import java.util.HashMap;
import java.util.Map;

public class LoginInteractor {

  public static final String CREATE_USER = "CREATE USER";
  public static final String LOGIN = "LOGIN_FINISH";

  public enum LoginState {
    SUCCESS,
    ERROR
  }

  private Map<String, String> users = new HashMap<>();
  private BroadcastCenter broadcastCenter;

  public LoginInteractor(BroadcastCenter broadcastCenter){
    this.broadcastCenter = broadcastCenter;
  }

  public LoginState login(String username, String password){
    LoginState loginState = users.containsKey(username) ? LoginState.SUCCESS: LoginState.ERROR;
    broadcastCenter.sendBroadcast("LOGIN_FINISH");
    return loginState;
  }

  public void createUser(String username, String password){
    users.put(username, password);
    broadcastCenter.sendBroadcast("CREATE USER");
  }
}
