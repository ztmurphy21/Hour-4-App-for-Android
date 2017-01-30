package com.example.zacha.hour4application;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.app.Activity;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.content.Intent;

public class MessageActivity extends AppCompatActivity {
    //Global variable declarations
    Button sendMessageButton;
    Button cancelButton;
    EditText messageEditText;

    @Override
    protected void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message);
        messageEditText = (EditText) findViewById(R.id.editText);
        sendMessageButton = (Button) findViewById(R.id.buttonSend);
        sendMessageButton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick (View v){
                String message = messageEditText.getText().toString();
                Intent result = new Intent();
                result.putExtra("MESSAGE_DATA", message);
                setResult(Activity.RESULT_OK, result);
                finish();

            }
        });

        cancelButton = (Button) findViewById(R.id.buttonCancel);
        cancelButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View v){
                setResult(Activity.RESULT_CANCELED);
                finish();
            }
        });
    }

}
