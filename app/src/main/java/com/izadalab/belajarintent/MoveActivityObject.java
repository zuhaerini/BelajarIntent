package com.izadalab.belajarintent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MoveActivityObject extends AppCompatActivity {
    public static String EXTRA_PERSON = "extra_person";
    public TextView tvObject;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_move_object);

        tvObject = (TextView) findViewById(R.id.tv_object_received);
        Person mPerson = getIntent().getParcelableExtra(EXTRA_PERSON);

        String text = "Nama : "+mPerson.getNama()+", Email : "+mPerson.getEmail()+", Usia : "+mPerson.getUsia()+", Lokasi : "+mPerson.getKota();
        tvObject.setText(text);
    }
}
