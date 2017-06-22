package com.example.weilun.intentdemo1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import static android.support.v7.appcompat.R.styleable.View;

public class MainActivity extends AppCompatActivity {


    public static final String EXTRA_PERSON = "com.example.weilun.intentdemo1.PERSON";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendData(View view){
        EditText etName = (EditText) findViewById(R.id.name);
        EditText etEmail = (EditText) findViewById(R.id.email);
        EditText etAge = (EditText) findViewById(R.id.age);

        String name = etName.getText().toString();
        String email = etEmail.getText().toString();
        int age = Integer.parseInt(etAge.getText().toString());

        Person person = new Person(name, email, age);

        Intent intent = new Intent(this, DisplayPersonActivity.class);
        intent.putExtra(EXTRA_PERSON, person);
        startActivity(intent);

    }
}
