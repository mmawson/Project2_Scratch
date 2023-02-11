package com.example.project2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.ShareActionProvider;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.MenuItemCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

public class NavigationDrawerActivity extends AppCompatActivity { // implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation_drawer);
    }
}
/*
        // set toolbar as Actionbar
        Toolbar myToolBar=findViewById(R.id.my_drawer);
        setSupportActionBar(myToolBar);

        ActionBar ab=getSupportActionBar();

        // // set bottom toolbar
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //set_bottom_bar();

        //inflate the Actionbar items.
        getMenuInflater().inflate(R.menu.drawer_menu, menu);

        // Handle search action
//        MenuItem myActionMenuItem = menu.findItem(R.id.search_action);
        //getActionView Returns the currently set action view for this menu item, then convert the view to SearchView
//        SearchView searchView=(SearchView)myActionMenuItem.getActionView();
//        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
//            @Override
/*            public boolean onQueryTextSubmit(String query) {
                Toast toast=Toast.makeText(getApplicationContext(),"Query Text="+query,Toast.LENGTH_SHORT);
                toast.show();
                return true;
            }
            @Override
            public boolean onQueryTextChange(String newText) {
                Toast toast=Toast.makeText(getApplicationContext(),newText,Toast.LENGTH_SHORT);
                toast.show();
                return true;
            }
        });

        // Handle share action
        MenuItem shareItem = menu.findItem(R.id.sharewith_action);
        /*
         * This is a provider for a share action. It is responsible for creating views that
         * enable data sharing and also to show a sub menu with sharing activities if the hosting
         * item is placed on the overflow menu.
         * We would first get the menu item that refers to the ShareActionProvider element, and then convert this menu item to a ShareActionProvider object.
         *https://developer.android.com/reference/android/widget/ShareActionProvider
         * */
        /* ShareActionProvider myShareActionProvider =(ShareActionProvider) MenuItemCompat.getActionProvider(shareItem);
        Intent myShareIntent = new Intent(Intent.ACTION_SEND);
        myShareIntent.setType("text/plain");
        myShareIntent.putExtra(Intent.EXTRA_TEXT,"Hello World!");
        myShareActionProvider.setShareIntent(myShareIntent);
        return true;
    } */

        // The onOptionsItemSelected() callback method is invoked when a user selects an app bar item.
//    return true;
//    }
//    @Override
//    public boolean onNavigationItemSelected(MenuItem item) {
//        Toast.makeText(this, "Test", Toast.LENGTH_SHORT).show();
/*        switch (item.getItemId()) {
            case R.id.search_action:
                Toast.makeText(this, "Search", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.settings_action:
                Toast.makeText(this, "Settings", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.share_action:
                // No need to do this part, we did it up lines 81 to 84
                Toast.makeText(this, "Share", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.cut_action:
                Toast toast=Toast.makeText(getApplicationContext(),"Cut Clicked",Toast.LENGTH_SHORT);
                toast.show();
                return true;
            case R.id.extras_action:
                toast=Toast.makeText(getApplicationContext(),"Extra Clicked",Toast.LENGTH_SHORT);
                toast.show();
                return true;
            case R.id.extras1_action:
                toast=Toast.makeText(getApplicationContext(),"Extra1 Clicked",Toast.LENGTH_SHORT);
                toast.show();
                return true;
            default: */
 //               return super.onOptionsItemSelected(item);
 //       }


//    public void HideShow(View view) {
//        ActionBar actionBar=getSupportActionBar();
//        if(actionBar.isShowing()){
//            actionBar.hide();
//            ((Button)view).setText("SHOW");
//        }
//        else{
//            actionBar.show();
//            ((Button)view).setText("HIDE");
//        }
//    }
// }

/*package com.example.project2;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;
// import android.widget.Toolbar;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.navigation.NavigationView;

public class NavigationDrawerActivity extends AppCompatActivity {
//implements NavigationView.OnNavigationItemSelectedListener {
//    Toolbar toolbar;
//    NavigationView navigationView;
//    DrawerLayout drawerLayout;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this,"You clicked my Biography", Toast.LENGTH_SHORT).show();

/*        toolbar=(Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(toolbar);
        navigationView.setNavigationItemSelectedListener(this);
        ActionBarDrawerToggle actionBarDrawerToggle=new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.ndopen, R.string.ndclose);
        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();
*/
/*
    @Override
    public boolean onNavigationItemSelected(MenuItem menuItem) {
        int id = menuItem.getItemId();
        switch (id)
        {
            case R.id.biography:
                Toast.makeText(this,"You clicked my Biography", Toast.LENGTH_SHORT).show();
                break;
            case R.id.movie_frag:
                Toast.makeText(this,"You clicked my Movie Fragment", Toast.LENGTH_SHORT).show();
                break;
            case R.id.movie_detail:
                Toast.makeText(this,"You clicked my Movie Detail", Toast.LENGTH_SHORT).show();
                break;
        }
        drawerLayout.closeDrawer(GravityCompat.START);
        return true;
    }
} */
