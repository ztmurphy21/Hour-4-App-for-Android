package com.example.zacha.hour4application;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public final static int MESSAGE_REQUEST_CODE = 0;
    TextView messageTextView;
    Button getMessageButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        messageTextView = (TextView)findViewById(R.id.textView1);
        getMessageButton = (Button)findViewById(R.id.button1);
        getMessageButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View v){
                Intent getResult = new Intent(getApplicationContext(), MessageActivity.class);
                startActivityForResult(getResult, MESSAGE_REQUEST_CODE);
            }
        });
    }
    @Override
    protected void onActivityResult (int requestCode, int resultCode, Intent data){
        if(requestCode == MESSAGE_REQUEST_CODE){
            String message = data.getStringExtra("MESSAGE_DATA");
            messageTextView.setText(message);
        }
    }
}
