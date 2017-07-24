package com.example.hp_pc.tasabeh;

import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.net.Uri;
import android.support.v4.content.FileProvider;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.ShareActionProvider;

import android.support.v7.app.ActionBar;

import android.os.Bundle;


import android.view.Menu;
import android.view.MenuInflater;


import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import android.widget.Toast;

import java.io.File;

import static android.gesture.GestureLibraries.fromFile;


public class MainActivity extends AppCompatActivity
       {


           private File mPrivateRootDir;

           @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



//*find the view that show azkaarcategorey
        TextView Azkaars = (TextView) findViewById(R.id.Azkaar);
//set clicklistener on that view
        Azkaars.setOnClickListener(new OnClickListener() {
            //when click on azkaarcATEGOREY this code will be executed
            @Override
            public void onClick(View v) {
                //cretae new intent to open {@link azkaar }
                Intent azkaarIntent = new Intent(MainActivity.this, ElsbahWelmasaah.class);
                //start new activity
                startActivity(azkaarIntent);
            }
        });
        //find the view that show Mawqeetcategorey
        TextView Mawqeets = (TextView) findViewById(R.id.Mawqeet);
//set clicklistener on that view
       Mawqeets.setOnClickListener(new OnClickListener() {
           //when click on Mawqeet categorey this code will be executed
            @Override
            public void onClick(View v) {
                //create new intent to open @link mawqeet
                Intent mawgeetIntent = new Intent(MainActivity.this, MawqeetElsalaah.class);
                //start new activity
                startActivity(mawgeetIntent);
            }
        });
               //when click myazkaar category this code execute
               TextView myAzkaar = (TextView) findViewById(R.id.MyAzkhaar);
               myAzkaar.setOnClickListener(new OnClickListener() {
                   @Override
                   public void onClick(View v) {
                       //create new intent for my azkaar
                       Intent myAzkaarIntent = new Intent(MainActivity.this,MyAzkaar.class);
                       //start new activity
                       startActivity(myAzkaarIntent);
                   }
               });
    }


//create share button on program bar
           @Override
           public boolean onCreateOptionsMenu(Menu menu) {
               // Inflate menu resource file.
               getMenuInflater().inflate(R.menu.mainmenu, menu);

               return true;
           }

           @Override
           public boolean onOptionsItemSelected(MenuItem item) {
               switch (item.getItemId()) {
                   case R.id.menu_item_share:

                       ApplicationInfo api = getApplicationContext().getApplicationInfo();
                       String apkPath = api.dataDir;
                       Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
                       sharingIntent.setType("application/vnd.android.package-archive");
//source for file ?? search needed there is problem
                       sharingIntent.putExtra(Intent.EXTRA_STREAM, String.valueOf(fromFile(apkPath)));
                       startActivity(Intent.createChooser(sharingIntent, "Shearing Option"));
                       return true;

                   default:
                       return super.onOptionsItemSelected(item);

               }

           }
}
