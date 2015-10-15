package com.byui.andrew.scripturereference;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Scripture extends AppCompatActivity {

    public final static String EXTRA_MESSAGE = "com.byui.andrewt.scripturereference.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scripture);
    }

    public void shareScrip (View v){
        Intent intent = new Intent(this, SharedScripture.class);

        EditText bookT = (EditText) findViewById(R.id.bookText);
        EditText chapterT = (EditText) findViewById(R.id.chapterText);
        EditText verseT = (EditText) findViewById(R.id.verseText);

        String bookName = bookT.getText().toString();
        String chapterNum = chapterT.getText().toString();
        String verseNum = verseT.getText().toString();
        String scripture = new String(bookName + " " + chapterNum + ":" + verseNum);

        intent.putExtra(EXTRA_MESSAGE,scripture);
        startActivity(intent);
    }

}
