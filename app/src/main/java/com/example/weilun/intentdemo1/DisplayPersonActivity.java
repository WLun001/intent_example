package com.example.weilun.intentdemo1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayPersonActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_person);

        Intent intent = getIntent();
        //have to cast to Person becuase it returns serializable type
        Person person = (Person)intent.getSerializableExtra(MainActivity.EXTRA_PERSON);

        TextView tvName = (TextView) findViewById(R.id.tv_name);
        TextView tvEmail = (TextView) findViewById(R.id.tv_email);
        TextView tvAge = (TextView) findViewById(R.id.tv_age);

        tvName.setText(person.getName());
        tvEmail.setText(person.getEmail());
        tvAge.setText(Integer.toString(person.getAge()));

    }
}
