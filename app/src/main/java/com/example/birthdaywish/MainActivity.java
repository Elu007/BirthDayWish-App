
package com.example.birthdaywish;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button button;
    EditText text;
    public static final String EXTRA_NAME = "com.example.birthdaywish.extra.NAME";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openActivity(View v){
        Toast.makeText(this, "From Elaf", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this,MainActivity2.class);
        text = findViewById(R.id.text);
        String nameText = text.getText().toString();
        intent.putExtra(EXTRA_NAME, nameText);
        startActivity(intent);
    }
}