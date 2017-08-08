package com.example.zainulmustafa.intents;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import static java.security.AccessController.getContext;

public class MainActivity extends AppCompatActivity {
    private EditText msg;
    private Button mainBTN;
    private Intent intent = new Intent(this, SecondActivity.class);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialize();
    }

    public void initialize(){
        msg = (EditText)findViewById(R.id.zainsMainEdit);
        mainBTN = (Button)findViewById(R.id.buttonMain);

        mainBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent.setClass(getApplicationContext(), SecondActivity.class);
                String message = msg.getText().toString();
                intent.putExtra("this_is_a_key_for_the_message", message);
                startActivity(intent);
            }
        });
    }
}
