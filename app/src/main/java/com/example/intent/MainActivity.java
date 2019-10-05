package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText usernameEditText;
    EditText passwordEditText;
    Button submit1;
    String goodUsername="Good";
    String goodPassword="12345";
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        usernameEditText = findViewById(R.id.username);
        passwordEditText = findViewById(R.id.password);
        textView = findViewById(R.id.textView);

        submit1 = findViewById(R.id.submit);
        submit1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Editable usernameEditable= usernameEditText.getText();
                String username=usernameEditable.toString();
                Editable passwordEditable= passwordEditText.getText();
                String password=passwordEditable.toString();
                System.out.println();
                if (goodUsername=="Good" && goodPassword=="12345"){


                    Intent intent= new Intent( MainActivity.this,secondActivity.class);
                    startActivity(intent);}

            }




        });
    }
}
