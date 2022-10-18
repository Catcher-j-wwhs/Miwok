/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.miwok;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);
    }
    public void Open_NumbersActivity(View view) {
        Intent iN = new Intent(this, Numbers_activity.class);
        startActivity(iN);
    }
    public void Open_FamilyActivity(View view) {
        Intent iF = new Intent(this, Family_members.class);
        startActivity(iF);
    }
    public void Open_ColorsActivity(View view) {
        Intent iC = new Intent(this, Colors_activity.class);
        startActivity(iC);
    }
    public void Open_PhrasesActivity(View view) {
        Intent iP = new Intent(this, Phrases_activity.class);
        startActivity(iP);
    }



}
