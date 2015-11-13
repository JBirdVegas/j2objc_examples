package com.qchu.multi_projects;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.qchu.BroadcastCenter;
import com.qchu.LoginInteractor;
import com.qchu.library_android.DefaultBroadcastCenter;

public class MainActivity extends AppCompatActivity {

  BroadcastReceiver broadcastReceiver;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);

    this.broadcastReceiver = new BroadcastReceiver() {
      @Override
      public void onReceive(Context context, Intent intent) {
        Log.d("login", intent.getAction());
      }
    };

    registerReceiver(broadcastReceiver, new IntentFilter(LoginInteractor.CREATE_USER));

    setContentView(R.layout.activity_main);



    BroadcastCenter broadcastCenter = new DefaultBroadcastCenter(this);
    LoginInteractor loginInteractor = new LoginInteractor(broadcastCenter);
    loginInteractor.createUser("tom","tom pwd");
  }

  @Override
  public void onDestroy(){
    unregisterReceiver(broadcastReceiver);
    super.onDestroy();
  }
}
