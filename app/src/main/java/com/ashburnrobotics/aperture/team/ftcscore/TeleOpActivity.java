package com.ashburnrobotics.aperture.team.ftcscore;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by Austin on 11/13/14.
 */
public class TeleOpActivity extends Activity implements View.OnClickListener{

    private EditText edit1, edit2, edit3, edit4, edit5, edit6;
    private Button backButton, cancelButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edit1 = (EditText)findViewById(R.id.edit1);
        edit2 = (EditText)findViewById(R.id.edit2);
        edit3 = (EditText)findViewById(R.id.edit3);
        edit4 = (EditText)findViewById(R.id.edit4);
        edit5 = (EditText)findViewById(R.id.edit5);
        edit6 = (EditText)findViewById(R.id.edit6);

        backButton = (Button)findViewById(R.id.backButton);
        backButton.setOnClickListener(this);
        cancelButton = (Button)findViewById(R.id.doneButton);
        cancelButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view){
        if(view.getId()==R.id.backButton){
            finish();
        }
        else if(view.getId()==R.id.doneButton){
            if((edit1.getText()+"").equals("")||(edit2.getText()+"").equals("")||(edit3.getText()+"").equals("")||
                    (edit4.getText()+"").equals("")||(edit5.getText()+"").equals("")||(edit6.getText()+"").equals("")){
                Toast savedToast = Toast.makeText(getApplicationContext(), "Please fill in all fields.",
                        Toast.LENGTH_SHORT);
                savedToast.show();
            }
            else{
                int numBallsIn30cm = Integer.parseInt(edit1.getText()+"");
                int numBallsIn60cm = Integer.parseInt(edit2.getText()+"");
                int numBallsIn90cm = Integer.parseInt(edit3.getText()+"");
                int numRobotsOrRollGoalsInParkZoneEnd = Integer.parseInt(edit4.getText()+"");
                int numRobotsOrRollGoalsOffFloor = Integer.parseInt(edit5.getText()+"");
                int numBallsInCenGoal = Integer.parseInt(edit6.getText()+"");

                Score score = (Score)getIntent().getSerializableExtra("score");
                score.setTeleOpScore(numBallsIn30cm, numBallsIn60cm, numBallsIn90cm,
                                    numRobotsOrRollGoalsInParkZoneEnd, numRobotsOrRollGoalsOffFloor, numBallsInCenGoal);

                super.finish();

                /*Intent i = new Intent(TeleOpActivity.this, TeleOpActivity.class);

                i.putExtra("score", score);//find a way to put a score into this method.
                startActivity(new Intent(this, TeleOpActivity.class));*/
            }
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
