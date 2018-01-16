package com.example.widaw.kawiarnia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    //@BindView(R.id.wybierzdane)
    //Button WybierzDane;

    @OnClick(R.id.wybierzdane) //Ustawienie przycisku w MainActivity tak aby po kliknięciu przeszło do MainActivity2
    void OnClick(){
        Intent intent = new Intent(MainActivity.this, Main2Activity.class);
        startActivity(intent);}

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }
}
