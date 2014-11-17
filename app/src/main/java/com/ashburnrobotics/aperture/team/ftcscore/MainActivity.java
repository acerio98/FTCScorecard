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
<<<<<<< HEAD
import com.parse.Parse;
import com.parse.ParseObject;

public class MainActivity extends Activity implements View.OnClickListener{
ImageButton addScore;
private Score myScore;
=======
import android.widget.TextView;


public class MainActivity extends Activity implements View.OnClickListener{
ImageButton addScore;
private TextView text;
>>>>>>> 9d4a884fc520250283ce5cfb1d825ac40968a9cf

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Parse.initialize(this, "TvzrdoaTGxZR0UUkn2WWRhrSMWBFBk8e8I7Lbjp0", "GAgZ0yTuln3vH1HcYaPB3u8KVW84POMmEC0EGZwe");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addScore = (ImageButton)findViewById(R.id.addButton);
<<<<<<< HEAD
        addScore.setOnClickListener(this);
        myScore = new Score();
        int c = 4;
        int x = 4;
        ParseObject testObject = new ParseObject("TestObject");
        testObject.put("foo", "bar"); // -- Sends Parse object to cloud
        testObject.saveInBackground();
=======
        text = (TextView)findViewById(R.id.textView);
        addScore.setOnClickListener(this);

<<<<<<< HEAD
=======
        if(savedInstanceState == null){
            getFragmentManager().beginTransaction()
                    .add(R.id.mainLayout, new AutonomousFragment())
                    .commit();
        }
>>>>>>> 9d4a884fc520250283ce5cfb1d825ac40968a9cf
>>>>>>> FETCH_HEAD
    }

    @Override
    public void onClick(View view){
        if(view.getId()==R.id.addButton){
            Intent i = new Intent(MainActivity.this, AutonomousActivity.class);
            Score score = new Score();

            i.putExtra("score", score);//find a way to put a score into this method.
            startActivity(i);

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
