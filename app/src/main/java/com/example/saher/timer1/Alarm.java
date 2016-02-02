package com.example.saher.timer1;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/**
 * Created by saher on 2/2/2016.
 */
public class Alarm extends BroadcastReceiver {
    MainActivity mainActivity;
    @Override
    public void onReceive(Context context, Intent intent) {
        mainActivity=new MainActivity();
        mainActivity.tv_show.setText("saher");
        //mainActivity.tv_show.setText(System.currentTimeMillis()+"");

    }
    public void SetAlarm(Context context)
    {
        AlarmManager am =( AlarmManager)context.getSystemService(Context.ALARM_SERVICE);
        Intent i = new Intent(context, Alarm.class);
        PendingIntent pi = PendingIntent.getBroadcast(context, 0, i, 0);
        am.setRepeating(AlarmManager.RTC_WAKEUP, System.currentTimeMillis(), 10000 , pi); // Millisec * Second * Minute
    }
}
