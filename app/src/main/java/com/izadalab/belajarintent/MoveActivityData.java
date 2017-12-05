package com.izadalab.belajarintent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MoveActivityData extends AppCompatActivity {
    public static String EXTRA_AGE = "extra_age";
    public static String EXTRA_NAME = "extra_name";
    private TextView tvDataReceived;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_move_data);

        tvDataReceived = (TextView) findViewById(R.id.tv_data_received);
        String nama = getIntent().getStringExtra(EXTRA_NAME);
        int usia = getIntent().getIntExtra(EXTRA_AGE, 0);

        String text = "Nama : "+nama+", Usia : "+usia;
        tvDataReceived.setText(text);
    }
}
