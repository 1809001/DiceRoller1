package com.example.diceroller;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int sc =0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void on_button_click(View view) {

        TextView tv = this.findViewById(R.id.numberTextView);
        EditText et = this.findViewById(R.id.editText2);
        TextView st = this.findViewById(R.id.score);

        try {
            int numberentered = Integer.parseInt(et.getText().toString());

            Random r = new Random();
            int number = r.nextInt(10);

            tv.setText(Integer.toString(number));

            if (numberentered == number) {
                Toast.makeText(this, "Congratulations", Toast.LENGTH_SHORT).show();
                sc++;
                st.setText(Integer.toString(sc));


        }
    }
        catch (Exception ex) {
            Log.e("ButtonErrors",
            ex.toString());
        }
        }

    public void on_icebreaker_click(View view) {

        TextView q = findViewById(R.id.QuestionsText);


        ArrayList<String> stringArrayList = new ArrayList<String>();
        stringArrayList.add(0,"if you could go anywhere in the world, where would you go?");
        stringArrayList.add(1,"if you were stranded on a desert island, what three things would you want to take with you?");
        stringArrayList.add(2,"if you could eat only one food for the rest of your life, what would it be?");
        stringArrayList.add(3,"If you won a million dollars, what is the first thing you would buy?");
        stringArrayList.add(4,"If you could spend the day with one fictional character, who would it be?");
        stringArrayList.add(5,"If you found a magical latern and a genie gave you three wishes, what would you wish?");


        Random n = new Random();
        int random = n.nextInt((5+1));
        q.setText(stringArrayList.get(random));
    }




    }


