package com.android.drawer2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toolbar;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<String> list = new ArrayList<>();
        list.add("AAA");
        list.add("BBBBBBB");
        list.add("CCC");
        list.add("DDDDDDDDDD");
        list.add("EEEEEE");
        list.add("FFFF");
        list.add("GGGG");


        RecyclerView recycler = findViewById(R.id.recycler);
        RecyclerAdapter adapter = new RecyclerAdapter(list);
        recycler.setAdapter(adapter);
        recycler.setLayoutManager(new LinearLayoutManager(MainActivity.this, RecyclerView.HORIZONTAL, false));
    }
}
