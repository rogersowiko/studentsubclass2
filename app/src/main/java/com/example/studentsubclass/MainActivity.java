package com.example.yourapp; // Change this to your actual package name

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText editTextName;
    private EditText editTextStudentId;
    private EditText editTextResearchTopic;
    private Button buttonSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Get references to UI elements
        editTextName = findViewById(R.id.editTextName);
        editTextStudentId = findViewById(R.id.editTextStudentId);
        editTextResearchTopic = findViewById(R.id.editTextResearchTopic);
        buttonSubmit = findViewById(R.id.buttonSubmit);

        // Set OnClickListener for the Button
        buttonSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Retrieve text from EditTexts
                String name = editTextName.getText().toString();
                String studentId = editTextStudentId.getText().toString();
                String researchTopic = editTextResearchTopic.getText().toString();

                // Create an Intent to start ProfileActivity
                Intent intent = new Intent(MainActivity.this, ProfileActivity.class);
                // Add data to the Intent
                intent.putExtra("USER_NAME", name);
                intent.putExtra("USER_ID", studentId);
                intent.putExtra("USER_TOPIC", researchTopic);
                // Start ProfileActivity
                startActivity(intent);
            }
        });
    }
}
