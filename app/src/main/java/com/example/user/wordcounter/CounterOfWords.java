package com.example.user.wordcounter;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by user on 08/11/2016.
 */

public class CounterOfWords extends AppCompatActivity {

    EditText mSentenceEditText;
    Button mCountButton;
    WordCounter sentence;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d("CounterOfWords", "onCreate called");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mSentenceEditText = (EditText) findViewById(R.id.sentence_text);

        mCountButton = (Button)findViewById(R.id.count_button);

        mCountButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("CounterOfWords", "Count button clicked");
                String sentence = mSentenceEditText.getText().toString();
                Log.d("CounterOfWords", "The sentence is '" + sentence + "'");

                WordCounter wordCounter = new WordCounter(sentence);
                int count = wordCounter.countWords(sentence);
                Intent intent = new Intent(CounterOfWords.this, CountActivity.class);
                Log.d("CounterOfWords", "here!");
                intent.putExtra("answer", count);

                startActivity(intent);
            }
        });
    }

}
