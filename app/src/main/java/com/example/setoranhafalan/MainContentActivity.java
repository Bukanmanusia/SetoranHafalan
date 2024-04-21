package com.example.setoranhafalan;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

public class MainContentActivity extends AppCompatActivity {

    DrawerLayout drawerLayout;
    ImageButton buttonDrawerToggle;
    NavigationView navberandaView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_content);

        drawerLayout = findViewById(R.id.drawerLayout);
        buttonDrawerToggle = findViewById(R.id.buttonDrawerToggle);
        navberandaView = findViewById(R.id.navberandaView);

        buttonDrawerToggle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawerLayout.open();;
            }
        });


        View headerView = navberandaView.getHeaderView(0);
        ImageView useImage = headerView.findViewById(R.id.userImage);
        TextView textUsername = headerView.findViewById(R.id.textUsername);

        useImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainContentActivity.this, textUsername.getText(), Toast.LENGTH_SHORT).show();
            }
        });

        navberandaView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int itemid = item.getItemId();

                if (itemid == R.id.navBeranda){
                    Toast.makeText(MainContentActivity.this, "Beranda Clicked", Toast.LENGTH_SHORT).show();
                }

                if (itemid == R.id.navSetoran){
                    Toast.makeText(MainContentActivity.this, "Setoran Clicked", Toast.LENGTH_SHORT).show();
                }
                if (itemid == R.id.navRiwayat) {
                    Toast.makeText(MainContentActivity.this, "Riwayat Clicked", Toast.LENGTH_SHORT).show();
                }
                drawerLayout.close();

                return false;
            }
        });

    }

}