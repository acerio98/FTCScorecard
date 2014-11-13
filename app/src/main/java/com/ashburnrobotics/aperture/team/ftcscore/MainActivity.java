package com.ashburnrobotics.aperture.team.ftcscore;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;


public class MainActivity extends Activity implements View.OnClickListener{
Button addScore;
private Score myScore;
private TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addScore = (Button)findViewById(R.id.addButton);
        text = (TextView)findViewById(R.id.textView);
        addScore.setOnClickListener(this);
        myScore = new Score();

        if(savedInstanceState == null){
            getFragmentManager().beginTransaction()
                    .add(R.id.mainLayout, new AutonomousFragment())
                    .commit();
        }
    }

    @Override
    public void onClick(View view){
        if(view.getId()==R.id.addButton){
            Intent i = new Intent(MainActivity.this, AutonomousActivity.class);
            Score score = new Score();

            i.putExtra("score", score);//find a way to put a score into this method.
            startActivity(new Intent(this, AutonomousActivity.class));
            
            text.setText(score.toString());
        }
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
}
