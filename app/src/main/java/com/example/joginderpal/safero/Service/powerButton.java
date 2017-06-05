package com.example.joginderpal.safero.Service;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

import com.example.joginderpal.safero.MapsActivity;

/**
 * Created by joginderpal on 05-06-2017.
 */

public class powerButton extends BroadcastReceiver {


    int countClick=0;

    Activity activity=null;

    public powerButton(Activity activity) {
        this.activity=activity;
    }

    @Override
    public void onReceive(Context context, Intent intent) {


        if (intent.getAction().equals(Intent.ACTION_SCREEN_OFF)){

            countClick++;

        }

        else if (intent.getAction().equals(Intent.ACTION_SCREEN_ON)){

            if (countClick==1){

                Intent i=new Intent(activity, MapsActivity.class);
                activity.startActivity(i);
                countClick=0;

            }

        }

    }
}
