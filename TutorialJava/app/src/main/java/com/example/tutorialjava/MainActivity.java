package com.example.tutorialjava;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.widget.TextView;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationCompat.Action;
import androidx.core.app.NotificationCompat.BigPictureStyle;
import androidx.core.app.NotificationCompat.BigTextStyle;
import androidx.core.app.NotificationCompat.InboxStyle;
import androidx.core.app.NotificationCompat.MessagingStyle;
import androidx.core.app.NotificationManagerCompat;
import androidx.core.app.Person;
import androidx.core.app.RemoteInput;
import androidx.core.app.TaskStackBuilder;
import androidx.core.content.ContextCompat;

import org.w3c.dom.Text;


public class MainActivity extends AppCompatActivity implements View.OnClickListener{


    Button buttonA;
    Button buttonB;
    Button buttonC;

    TextView txtView;

    public static final int NOTIFICATION_ID = 888;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonA = (Button)findViewById(R.id.btn1);
        buttonB = (Button)findViewById(R.id.btn2);
        buttonC = (Button)findViewById(R.id.btn3);

        txtView = (TextView)findViewById(R.id.txt);
        buttonA.setOnClickListener(this);
        buttonC.setOnClickListener(this);
        buttonB.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        if (v.getId() == R.id.btn1){
            txtView.setText("A is clicked");



        }
        if (v.getId() == R.id.btn2){
            txtView.setText("B is clicked");
        }
        if (v.getId() == R.id.btn3){
            txtView.setText("C is clicked");

          //  MockDatabase.BigTextStyleReminderAppData bigTextStyleReminderAppData =
                //    MockDatabase.getBigTextStyleData();
/*
            String notificationChannelId =
                   NotificationUtil.createNotificationChannel(this, bigTextStyleReminderAppData);


            NotificationCompat.Builder builder = new NotificationCompat.Builder(this, notificationChannelId)
                  //  .setSmallIcon(R.drawable.notification_icon)
                    .setContentTitle("textTitle")
                    .setContentText("textContent")
                    .setPriority(NotificationCompat.PRIORITY_DEFAULT);*/
        }
    }/*
    private void createNotificationChannel() {
        // Create the NotificationChannel, but only on API 26+ because
        // the NotificationChannel class is new and not in the support library
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            CharSequence name = getString(R.string.channel_name);
            String description = getString(R.string.channel_description);
            int importance = NotificationManager.IMPORTANCE_DEFAULT;
            NotificationChannel channel = new NotificationChannel(CHANNEL_ID, name, importance);
            channel.setDescription(description);
            // Register the channel with the system; you can't change the importance
            // or other notification behaviors after this
            NotificationManager notificationManager = getSystemService(NotificationManager.class);
            notificationManager.createNotificationChannel(channel);
        }
    }*/
}

