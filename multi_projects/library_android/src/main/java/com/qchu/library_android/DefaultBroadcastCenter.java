package com.qchu.library_android;

import android.content.Context;
import android.content.Intent;

import com.qchu.BroadcastCenter;

/**
 * Created by louischu on 13/11/15.
 */
public class DefaultBroadcastCenter implements BroadcastCenter {

  private Context context;

  public DefaultBroadcastCenter(Context context){
    this.context = context;
  }

  @Override
  public void sendBroadcast(String action) {
    this.context.sendBroadcast(new Intent(action));
  }
}
