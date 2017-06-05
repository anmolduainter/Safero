package com.example.joginderpal.safero.Main;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TimePicker;

import com.example.joginderpal.safero.R;
import com.example.joginderpal.safero.Service.powerButton;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by joginderpal on 05-06-2017.
 */

public class firstActivity extends AppCompatActivity {

    @BindView(R.id.startservice)
    Switch serviceSwitch;

    @BindView(R.id.timePick)
    TimePicker timePicker;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.firstactivity);

        ButterKnife.bind(this);


        serviceSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if (isChecked){


                }
                else{



                }

            }
        });

        if (serviceSwitch.isChecked()){
            IntentFilter filter = new IntentFilter(Intent.ACTION_SCREEN_ON);
            filter.addAction(Intent.ACTION_SCREEN_OFF);
            powerButton btn = new powerButton (this);
            registerReceiver(btn, filter);
        }
        else{



        }
    }
}
