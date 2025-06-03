package com.example.yourapp; // Change this to your actual package name

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class ProfileActivity extends AppCompatActivity {

    private TextView textViewProfileName;
    private TextView textViewProfileId;
    private TextView textViewProfileTopic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        // Get references to UI elements
        textViewProfileName = findViewById(R.id.textViewProfileName);
        textViewProfileId = findViewById(R.id.textViewProfileId);
        textViewProfileTopic = findViewById(R.id.textViewProfileTopic);

        // Retrieve the Intent that started this activity
        Intent intent = getIntent();
        if (intent != null && intent.getExtras() != null) {
            // Extract the data using the same keys used in MainActivity
            String name = intent.getStringExtra("USER_NAME");
            String studentId = intent.getStringExtra("USER_ID");
            String researchTopic = intent.getStringExtra("USER_TOPIC");

            // Display the data in the TextViews
            textViewProfileName.setText(name);
            textViewProfileId.setText(studentId);
            textViewProfileTopic.setText(researchTopic);
        }
    }
}
