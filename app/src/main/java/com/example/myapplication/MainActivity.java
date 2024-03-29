package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.app.Activity;
import android.app.ActionBar;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.os.Build;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends Activity {
    ImageView iv;
    boolean isChanged=false;
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iv.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                if (v == iv) {
                    if(isChanged){
                        iv.setImageDrawable(getResources().getDrawable(R.drawable.open_button));

                    }else
                    {
                        iv.setImageDrawable(getResources().getDrawable(R.drawable.close_button));
                    }
                    isChanged = !isChanged;
                }

            }
        });
    }
}