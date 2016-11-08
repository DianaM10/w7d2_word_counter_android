package com.example.user.wordcounter;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

/**
 * Created by user on 08/11/2016.
 */

public class CountActivity extends AppCompatActivity {

    TextView mCountText;

    @Override
    protected void onCreate(Bundle savedInstancesState) {
        Log.d("CounterOfWords","CountActivity onCreate called");
        super.onCreate(savedInstancesState);
        setContentView(R.layout.activity_count);

        mCountText = (TextView)findViewById(R.id.answer_text);

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();

        int count = extras.getInt("answer");

        mCountText.setText(Integer.toString(count));

    }
}
