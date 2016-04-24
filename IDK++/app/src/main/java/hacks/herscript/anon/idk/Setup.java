package hacks.herscript.anon.idk;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.app.Activity;

public class Setup extends AppCompatActivity implements View.OnClickListener {

    public static Integer dayClicked;
    Button button3;
    Button button4;
    Button button5;
    Button button6;
    Button button7;
    Button button8;
    Button button9;
    Button button10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setup);
        button3 =  (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        button10 = (Button) findViewById(R.id.button10);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        button7.setOnClickListener(this);
        button8.setOnClickListener(this);
        button9.setOnClickListener(this);
        button10.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intentTimeWindow = new Intent(this, SetupTimeWindow.class);
        if (v.getId() == R.id.button3) {
            Log.d("button3", "Monday Button Clicked");
            dayClicked = 1;
            startActivity(intentTimeWindow);
        }
        if (v.getId() == R.id.button4) {
            Log.d("button4", "Tuesday Button Clicked");
            dayClicked = 2;
            startActivity(intentTimeWindow);
        }
        if (v.getId() == R.id.button5) {
            Log.d("button5", "Wednesday Button Clicked");
            dayClicked = 3;
            startActivity(intentTimeWindow);
        }
        if (v.getId() == R.id.button6) {
            Log.d("button6", "Thursday Button Clicked");
            dayClicked = 4;
            startActivity(intentTimeWindow);
        }
        if (v.getId() == R.id.button7) {
            Log.d("button7", "Friday Button Clicked");
            dayClicked = 5;
            startActivity(intentTimeWindow);
        }
        if (v.getId() == R.id.button8) {
            Log.d("button8", "Sunday Button Clicked");
            dayClicked = 6;
            startActivity(intentTimeWindow);
        }
        if (v.getId() == R.id.button9) {
            Log.d("button9", "Saturday Button Clicked");
            dayClicked = 7;
            startActivity(intentTimeWindow);
        }
        if (v.getId() == R.id.button10) {
            Log.d("button10", "Back Button Clicked");
            Intent intentHome = new Intent(this, Home.class);
            startActivity(intentHome);
        }
    }
}
