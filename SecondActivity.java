package com.example.zainulmustafa.intents;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    private TextView secText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        initialize();
    }

    public void initialize(){
        secText = (TextView)findViewById(R.id.zainsSecondText);

        Bundle intent = getIntent().getExtras();
        if(intent == null){
            return;
        }
        String secMessage = intent.getString("this_is_a_key_for_the_message");
        secText.setText(secMessage);
    }
}

//END
