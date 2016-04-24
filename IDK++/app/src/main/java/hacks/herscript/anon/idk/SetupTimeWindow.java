package hacks.herscript.anon.idk;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class SetupTimeWindow extends AppCompatActivity implements View.OnClickListener {

    Button button11;
    Button button12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setup_time_window);
        button11 = (Button) findViewById(R.id.button11);
        button12 = (Button) findViewById(R.id.button12);
        button11.setOnClickListener(this);
        button12.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.button11) {
            Log.d("button11", "Back Button Clicked");
            Intent intentSetup = new Intent(this, Setup.class);
            startActivity(intentSetup);
        }
        if (v.getId() == R.id.button12) {
            Intent intentAppSelector = new Intent(this, AppSelectorActivity.class);
            startActivity(intentAppSelector);
        }
    }
}
