package com.izadalab.belajarintent;

import android.content.Intent;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private Button btnMoveActivity;
    private Button btnMoveActivityWithData;
    private Button btnMoveActivityWithObject;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnMoveActivity = (Button) findViewById(R.id.btn_move_activity);
        btnMoveActivity.setOnClickListener(this);

        btnMoveActivityWithData = (Button) findViewById(R.id.btn_move_activity_data);
        btnMoveActivityWithData.setOnClickListener(this);

        btnMoveActivityWithObject = (Button) findViewById(R.id.btn_move_activity_object);
        btnMoveActivityWithObject.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_move_activity:
                Intent moveIntent = new Intent(MainActivity.this, MoveActivity.class);
                startActivity(moveIntent);
                break;

            case R.id.btn_move_activity_data:
                Intent moveIntentData = new Intent(MainActivity.this, MoveActivityData.class);
                moveIntentData.putExtra(MoveActivityData.EXTRA_NAME, "Zoey");
                moveIntentData.putExtra(MoveActivityData.EXTRA_AGE,17);
                startActivity(moveIntentData);
                break;

            case R.id.btn_move_activity_object:
                Person mPerson = new Person();
                mPerson.setNama("Zoey");
                mPerson.setUsia(17);
                mPerson.setEmail("mine@zoey.com");
                mPerson.setKota("Bandung");

                Intent moveIntentObject = new Intent(MainActivity.this, MoveActivityObject.class);
                moveIntentObject.putExtra(MoveActivityObject.EXTRA_PERSON, (Parcelable) mPerson);
                startActivity(moveIntentObject);
        }
    }
}
