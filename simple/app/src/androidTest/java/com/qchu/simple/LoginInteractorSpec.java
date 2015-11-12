package com.qchu.simple;


import android.support.test.runner.AndroidJUnit4;

import com.qchu.LoginInteractor;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by louischu on 12/11/15.
 */
@RunWith(MockitoJUnitRunner.class)
public class LoginInteractorSpec {
  LoginInteractor loginInteractor;

  @Before
  public void setup(){
    this.loginInteractor = new LoginInteractor();
  }

  @Test
  public void success(){

    loginInteractor.createUser("tom","tom pwd");

    assertThat(loginInteractor.login("tom","tom pwd"),
      equalTo(LoginInteractor.LoginState.ERROR));
  }
}
