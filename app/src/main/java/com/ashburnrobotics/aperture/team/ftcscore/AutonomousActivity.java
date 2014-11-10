package com.ashburnrobotics.aperture.team.ftcscore;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by Austin on 11/9/14.
 */
public class AutonomousActivity extends Activity implements View.OnClickListener {
    Button cancelButton, nextButton;
    CheckBox check1, check2, check3;
    EditText edit1, edit2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cancelButton = (Button)findViewById(R.id.cancelButton);
        cancelButton.setOnClickListener(this);
        nextButton = (Button)findViewById(R.id.nextButton);
        nextButton.setOnClickListener(this);

        check1 = (CheckBox)findViewById(R.id.check1);
        check2 = (CheckBox)findViewById(R.id.check2);
        check3 = (CheckBox)findViewById(R.id.check3);

        edit1 = (EditText)findViewById(R.id.edit1);
        edit2 = (EditText)findViewById(R.id.edit2);
    }

    @Override
    public void onClick(View view){
        if(view.getId()==R.id.cancelButton){
            startActivity(new Intent(this, MainActivity.class));
        }
        else if(view.getId()==R.id.nextButton){
            if(edit1.getText().equals("")||edit2.getText().equals("")){
                Toast savedToast = Toast.makeText(getApplicationContext(), "Please fill in all fields.",
                        Toast.LENGTH_SHORT);
                savedToast.show();
            }
            else{
                
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
