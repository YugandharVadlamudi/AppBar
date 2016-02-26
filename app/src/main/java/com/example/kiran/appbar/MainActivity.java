package com.example.kiran.appbar;

import android.content.Intent;
import android.os.Build;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Toolbar toolbar;
    RecyclerView recyclerView;
    DrawerLayout drawerLayout;
    MyAdapterRecycleView myAdapterRecycleView;
    ActionBarDrawerToggle DrawLayout;
    final String TITLES[] = {"ace","audio","king","play"};
    final int[] ICONS={R.drawable.ic_ace,R.drawable.ic_audio,R.drawable.ic_king,R.drawable.ic_play};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
//        recyclerView=(RecyclerView)findViewById(R.id.RecyclerView);
        Log.d("string",""+recyclerView);
//        recyclerView.setHasFixedSize(true);
        myAdapterRecycleView=new MyAdapterRecycleView(TITLES,ICONS);
        drawerLayout=(DrawerLayout)findViewById(R.id.DraswerLayout);
       /* DrawLayout=new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.OpenDraw,R.string.CloseDraw){
            @Override
            public void onDrawerOpened(View drawerView) {
                super.onDrawerOpened(drawerView);
            }

            @Override
            public void onDrawerClosed(View drawerView) {
                super.onDrawerClosed(drawerView);
            }
        };*/
        drawerLayout.setDrawerListener(DrawLayout);
        recyclerView.setAdapter(myAdapterRecycleView);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        menu.clear();
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
       /* if(item.getItemId()==R.id.action_forword)
        {
            Log.d("hello","ture");
            Toast.makeText(getApplicationContext(),"hello",Toast.LENGTH_SHORT).show();
            return true;
        }*/
        switch (item.getItemId())
        {
            case R.id.action_forword:
                Log.d("hello","ture");
                startActivity(new Intent(getApplicationContext(),subactivity.class));
                return true;
        default:return super.onOptionsItemSelected(item);
        }
    }
}
