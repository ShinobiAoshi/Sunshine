package com.example.stephen.sunshine.app;

import android.content.Intent;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.support.v7.widget.ShareActionProvider;


public class DetailActivity extends ActionBarActivity
{
    ShareActionProvider mShareActionProvider;

    @Override
    protected void onCreate (Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
    }


    @Override
    public boolean onCreateOptionsMenu (Menu menu)
    {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_detail, menu);
        MenuItem item = menu.findItem(R.id.action_share);
        mShareActionProvider = (ShareActionProvider)  MenuItemCompat.getActionProvider(item);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected (MenuItem item)
    {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        if(id == R.id.action_settings)
        {
            Intent intent = new Intent(this, SettingsActivity.class);
            startActivity(intent);
            return true;
        }

        if(id == R.id.action_share)
        {
            Intent intent = new Intent(this, SettingsActivity.class);
            startActivity(intent);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
