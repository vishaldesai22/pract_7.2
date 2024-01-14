package com.example.practicle_72;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText nameEditText, ageEditText, courseEditText;
    private TextView resultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameEditText = findViewById(R.id.e1);
        ageEditText = findViewById(R.id.e2);
        courseEditText = findViewById(R.id.e3);
        resultTextView = findViewById(R.id.t4);
    }

    public void displayInfo(View view) {
        String name = nameEditText.getText().toString();
        String age = ageEditText.getText().toString();
        String course = courseEditText.getText().toString();

        String resultMessage = "Name: " + name + "\nAge: " + age + "\nCourse: " + course;

        resultTextView.setText(resultMessage);
    }
}
