package com.example.miwok;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.widget.ArrayAdapter;

import android.widget.ListView;


import java.util.ArrayList;

public class Numbers_activity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        ArrayList<Word> Numbers = new ArrayList<Word>();
        Numbers.add(new Word("one","lutti"));
        Numbers.add(new Word("two","ottiko"));
        Numbers.add(new Word("three","tolookosu"));
        Numbers.add(new Word("four","oyyisa"));
        Numbers.add(new Word("five","massokka"));
        Numbers.add(new Word("six","temmokka"));
        Numbers.add(new Word("seven","kenekaku"));
        Numbers.add(new Word("eight","kawinta"));
        Numbers.add(new Word("nine","wo'e"));
        Numbers.add(new Word("ten","na'aacha"));

        ArrayAdapter<Word> itemsAdapter
                = new ArrayAdapter<Word>(this, R.layout.activity_list, Numbers);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);
    }
}