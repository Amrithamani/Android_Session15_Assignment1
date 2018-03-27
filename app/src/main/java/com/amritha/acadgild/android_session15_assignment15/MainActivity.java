package com.amritha.acadgild.android_session15_assignment15;

import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;

public class MainActivity extends AppCompatActivity {

    //Initializing RecyclerView , LayoutManager , Adapter, Toolbar, FloatingActionButton to variables

    RecyclerView recyclerView;

    RecyclerView.LayoutManager layoutManager;

    RecyclerView.Adapter adapter;

    Toolbar mToolBar;

    FloatingActionButton floatingActionButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //finding Ids for Toolbar, FloatingActionButton, RecyclerView

        mToolBar = findViewById(R.id.toolbar);

        floatingActionButton = findViewById(R.id.fab);

        recyclerView = findViewById(R.id.recycler_view);

        //setting Toolbar

        setSupportActionBar(mToolBar);

        //creating new linear layoutManager

        layoutManager = new LinearLayoutManager(this);

        //setting Layout Manager

        recyclerView.setLayoutManager(layoutManager);

        //creating new RecyclerAdapter and setting that

        adapter = new RecyclerAdapter();

        recyclerView.setAdapter(adapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.card_menu, menu);//inflating menu

        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();//getting id

        return super.onOptionsItemSelected(item);
    }
}
