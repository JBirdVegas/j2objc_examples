package com.qchu.simple;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.qchu.LoginInteractor;

public class MainActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    LoginInteractor loginInteractor = new LoginInteractor();
    loginInteractor.createUser("tom", "tom pwd");
    Log.d("login", loginInteractor.login("tom", "tom pwd").toString());

  }
}
