package com.jasminekaur.optionsmenu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView txtViewTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtViewTitle = findViewById(R.id.textViewTitle);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.menu_settings) {
            Toast.makeText(this, "Settings", Toast.LENGTH_LONG).show();
            txtViewTitle.setText("Settings was selected.");
        } else if (item.getItemId() == R.id.menu_one) {
            Toast.makeText(this, "One", Toast.LENGTH_LONG).show();
            txtViewTitle.setText("One was selected.");
        } else if (item.getItemId() == R.id.menu_two) {
            Toast.makeText(this, "Two", Toast.LENGTH_LONG).show();
            txtViewTitle.setText("Two was selected.");
        } else if (item.getItemId() == R.id.menu_activity_one) {
//            Toast.makeText(this, "Activity One", Toast.LENGTH_LONG).show();
            Intent intent = new Intent(MainActivity.this,OneActivity.class);
            startActivity(intent);
        } else if (item.getItemId() == R.id.menu_activity_two) {
//            Toast.makeText(this, "Activity Two", Toast.LENGTH_LONG).show();
            Intent intent = new Intent(MainActivity.this,TwoActivity.class);
            startActivity(intent);
        } else if (item.getItemId() == R.id.menu_search) {
            Toast.makeText(this, "Search", Toast.LENGTH_LONG).show();
            txtViewTitle.setText("Search was selected.");
        } else if (item.getItemId() == R.id.menu_discard) {
            Toast.makeText(this, "Delete", Toast.LENGTH_LONG).show();
            txtViewTitle.setText("Delete was selected.");
        }



        else {
            return super.onContextItemSelected(item);
        }
        return true;
    }
}
