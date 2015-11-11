package com.qchu;


import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class LoginInteractorSpec {


  LoginInteractor loginInteractor;

  @Before public void setup(){
    this.loginInteractor = new LoginInteractor();
  }

  @Test public void success(){

    loginInteractor.createUser("tom","tom pwd");

    assertThat(loginInteractor.login("tom","tom pwd"),
      equalTo(LoginInteractor.LoginState.SUCCESS));
  }
}
