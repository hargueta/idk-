package hacks.herscript.anon.idk;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Home extends AppCompatActivity implements View.OnClickListener {

    Button button2;
    Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        button1 = (Button) findViewById(R.id.button);
        button2 = (Button) findViewById(R.id.button2);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.button) {
            Log.d("button1", "Setup New Event Clicked");
            Intent intentSetup = new Intent(this, Setup.class);
            startActivity(intentSetup);
        }
        if (v.getId() == R.id.button2){
            Log.d("button2", "Edit Event Clicked");
            Intent intentEdit = new Intent(this, Edit.class);
        }
    }
}
