package com.example.miwok;

import android.content.Context;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;

public class WordAdapter extends ArrayAdapter<Word> {
    public WordAdapter(@NonNull Context context, int resource) {
        super(context, resource);
    }
}
