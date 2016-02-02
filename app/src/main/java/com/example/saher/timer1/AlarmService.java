package com.example.saher.timer1;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/**
 * Created by saher on 2/2/2016.
 */
public class AlarmService extends Service {
    Alarm alarm;
    public AlarmService() {
        alarm=new Alarm();
    }

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        alarm.SetAlarm(this);

        return Service.START_STICKY;
    }
}
