package com.blundell.annotationtut.ui;

import com.blundell.annotationtut.R;
import com.blundell.annotationtut.util.FromXML;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @FromXML
    public void onAccept(View button){
    	Toast.makeText(this, "You clicked me! 1", Toast.LENGTH_SHORT).show();
    }

    @FromXML
    public void onDecline(View button){
    	Toast.makeText(this, "You clicked me! 2", Toast.LENGTH_SHORT).show();
    }
}