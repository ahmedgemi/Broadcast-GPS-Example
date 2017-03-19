package com.example.ahmed.broadcast_gps_example;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.NotificationCompat;

/**
 * Created by ahmed on 15/03/17.
 */

public class GPSDetector extends BroadcastReceiver {


    @Override
    public void onReceive(Context context, Intent intent) {


        NotificationCompat.Builder builder = new NotificationCompat.Builder(context);

        builder.setContentTitle("GPS Status");
        builder.setContentText("Chage");
        builder.setSmallIcon(R.drawable.ic_launcher);
        builder.setTicker("New Notification");

        Intent intent1= new Intent(context,MainActivity.class);

        PendingIntent pending = PendingIntent.getActivity(context,0,intent1,0);

        builder.setContentIntent(pending);

        NotificationManager manager = (NotificationManager) context.getSystemService(context.NOTIFICATION_SERVICE);

        manager.notify(111,builder.build());
    }


}
