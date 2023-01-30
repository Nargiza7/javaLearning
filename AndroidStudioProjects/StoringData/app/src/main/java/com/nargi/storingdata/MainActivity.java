package com.nargi.storingdata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity     {
    EditText editText1;
    TextView textView1;
    SharedPreferences sharedPreferences;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText1 = findViewById(R.id.editText);
        textView1 = findViewById(R.id.TextView);

       sharedPreferences = this.getSharedPreferences(" com.nargi.storingdata", Context.MODE_PRIVATE );
       int storedAge = sharedPreferences.getInt("storedAge", 0);

       if (storedAge ==0){
           textView1.setText("Your age:");
       }else {
           textView1.setText("Your age: " + storedAge);
       }


    }
    public void save(View view)
    {
        if(!editText1.getText().toString().matches("")){
            int userAge = Integer.parseInt(editText1.getText().toString());
           textView1.setText("Your Age:" + userAge);

           sharedPreferences.edit().putInt("storedAge", userAge).apply();

        }

    }

    public void Delete (View view){
        int storedData = sharedPreferences.getInt("storedAge", 0);
        if(storedData != 0)
            sharedPreferences.edit().remove("storedAge").apply();
        textView1.setText("Your age:");
    }
}
