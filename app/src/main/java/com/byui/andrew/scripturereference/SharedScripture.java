package com.byui.andrew.scripturereference;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SharedScripture extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        String message = intent.getStringExtra(Scripture.EXTRA_MESSAGE);

        TextView textView = new TextView(this);
        textView.setTextSize(20);
        textView.setText("Your favorite scripture is: " + message);
        setContentView(textView);
    }
}
