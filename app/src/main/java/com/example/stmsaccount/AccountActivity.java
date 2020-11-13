package com.example.stmsaccount;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ListView;

import java.util.ArrayList;

public class AccountActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account);


        ArrayList<Information> infos = new ArrayList<Information>();

        infos.add(new Information("Street 1","30%"));
        infos.add(new Information("Street 2","10%"));
        infos.add(new Information("Street 3","20%"));
        infos.add(new Information("Street   4","40%"));

        InformationAdapter infoAdapter = new InformationAdapter(this,infos);


        ListView listView = (ListView) findViewById(R.id.list);


        listView.setAdapter(infoAdapter);
}
}