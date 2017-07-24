package com.example.hp_pc.tasabeh;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by User on 2/28/2017.
 */

public class EditDataActivity extends AppCompatActivity {

    private static final String TAG = "EditDataActivity";

    private Button btnSave,btnDelete;
    private EditText editable_item;

    Db_Azkaar_user mDb_Azkaar_user;

    private String selectedAzkaar;
    private int selectedID;
   

    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addremove);
        btnSave = (Button) findViewById(R.id.btnSave);
        btnDelete = (Button) findViewById(R.id.btnDelete);
        editable_item = (EditText) findViewById(R.id.editable_item);
        mDb_Azkaar_user = new Db_Azkaar_user(this);

        //get the intent extra from the ListDataActivity
        Intent receivedIntent = getIntent();

        //now get the itemID we passed as an extra
        selectedID = receivedIntent.getIntExtra("id",-1);
        //now get the name we passed as an extra
        selectedAzkaar = receivedIntent.getStringExtra("Azkaar");

        //set the text to show the current selected name
        editable_item.setText(selectedAzkaar);

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String item = editable_item.getText().toString();
                if(!item.equals("")){
                    mDb_Azkaar_user.UpdateAzkaar(item,selectedID,selectedAzkaar);
                }else{
                    toastMessage("You must enter yours");
                }
            }
        });

        btnDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mDb_Azkaar_user.DeleteAzkaar(selectedAzkaar,selectedID);
                editable_item.setText("");
                toastMessage("removed from database");
            }
        });

    }

    /**
     * customizable toast
     * @param message
     */
    private void toastMessage(String message){
        Toast.makeText(this,message, Toast.LENGTH_SHORT).show();
    }
}
