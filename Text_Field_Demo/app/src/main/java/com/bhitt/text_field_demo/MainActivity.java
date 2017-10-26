package com.bhitt.text_field_demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public void submitStuff(View view){
        EditText userEdit = (EditText) findViewById(R.id.userEdit);
        EditText passEdit = (EditText) findViewById(R.id.passEdit);

        Log.i("Username", userEdit.getText().toString());
        Log.i("Password", passEdit.getText().toString());
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
