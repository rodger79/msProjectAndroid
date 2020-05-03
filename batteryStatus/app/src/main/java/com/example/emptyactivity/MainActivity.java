package com.example.emptyactivity;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.Context;
import android.os.BatteryManager;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // Charging State
        Context context = this;
        IntentFilter ifilter = new IntentFilter(Intent.ACTION_BATTERY_CHANGED);
        Intent batteryStatus = context.registerReceiver(null, ifilter);

        // Are we charging / charged?
        int status = batteryStatus.getIntExtra(BatteryManager.EXTRA_STATUS, -1);
        boolean isCharging = status == BatteryManager.BATTERY_STATUS_CHARGING ||
                status == BatteryManager.BATTERY_STATUS_FULL;


        // How are we charging?
        int chargePlug = batteryStatus.getIntExtra(BatteryManager.EXTRA_PLUGGED, -1);
        boolean usbCharge = chargePlug == BatteryManager.BATTERY_PLUGGED_USB;
        boolean acCharge = chargePlug == BatteryManager.BATTERY_PLUGGED_AC;


        final TextView BatteryIsCharging = (TextView) findViewById(R.id.batteryCharging);
        final TextView pluggedIn = (TextView) findViewById(R.id.pluggedIn);
        final TextView wirelessCharging = (TextView) findViewById(R.id.wirelessCharging);

        //Is phone charging
        if (isCharging) {
            BatteryIsCharging.setText("True");
        }else{
            BatteryIsCharging.setText("False");
        }
        //Is device plugged in
        if (usbCharge) {
            pluggedIn.setText("True");
        }else{
            pluggedIn.setText("False");
        }
        //is device Wireless charging
        if (acCharge) {
            wirelessCharging.setText("True");
        }else{
            wirelessCharging.setText("False");
        }
    }
    /*
    private float getBatteryPercent() {
        IntentFilter ifilter = new IntentFilter(Intent.ACTION_BATTERY_CHANGED);
        Intent batteryStatus = RYLA.getInstance().getContext().registerReceiver(null, ifilter);

        int level = batteryStatus.getIntExtra(BatteryManager.EXTRA_LEVEL, -1);
        int scale = batteryStatus.getIntExtra(BatteryManager.EXTRA_SCALE, -1);

        return level / (float)scale * 100;
    }

     */
}
