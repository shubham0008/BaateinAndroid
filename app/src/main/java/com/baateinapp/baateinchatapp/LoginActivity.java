package com.baateinapp.baateinchatapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

public class LoginActivity extends AppCompatActivity {

    private EditText nameText;
    private ImageView goAheadButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        nameText= findViewById(R.id.name_text);
        goAheadButton = findViewById(R.id.send_button);
        final String userName = nameText.getText().toString();

        goAheadButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LoginActivity.this,ChatActivity.class).putExtra("name",userName));
            }
        });



    }
}
