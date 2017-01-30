package com.dylanwaynefoster.phoneapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import static android.provider.AlarmClock.EXTRA_MESSAGE;
import static com.dylanwaynefoster.phoneapp.R.id.edit_message;
//import static com.dylanwaynefoster.phoneapp.DisplayMessageActivity;

public class MainActivity extends AppCompatActivity {

    public final static String EXTRA_MESSAGE = "com.dylanwaynefoster.phoneapp.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // Event Handler on button click...
    public void sendMessage(View view){
       Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText editText = (EditText) findViewById(edit_message);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }

}
