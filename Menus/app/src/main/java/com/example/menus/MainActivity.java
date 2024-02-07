package com.example.menus;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button popup, context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        popup = findViewById(R.id.popup);
        context = findViewById(R.id.context);

        registerForContextMenu(context);

        popup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PopupMenu popupMenu = new PopupMenu(MainActivity.this,view);
                popupMenu.inflate(R.menu.mymenu);
                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem menuItem) {

                        switch (menuItem.getItemId()){
                            case R.id.profile:

                            case R.id.settings:
                        }
                        return false;
                    }
                });
                popupMenu.show();
            }
        });
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);

        menu.add(0,v.getId(),1,"Accounts");
        menu.add(1,v.getId(),0,"Settings");
        menu.add(1,v.getId(),3,"Profile");
        menu.add(0,v.getId(),2,"Log Out");
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {


        Toast.makeText(this, item.getTitle(), Toast.LENGTH_SHORT).show();

        return super.onContextItemSelected(item);
    }
}