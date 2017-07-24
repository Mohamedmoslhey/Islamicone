package com.example.hp_pc.tasabeh;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MyAzkaar extends AppCompatActivity {





        Db_Azkaar_user mDb_Azkaar_user ;
        private Button btnAdd, btnViewData;
        private EditText editText;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.azkaar_list);
            editText = (EditText) findViewById(R.id.editText);
            btnAdd = (Button) findViewById(R.id.btnAdd);
            btnViewData = (Button) findViewById(R.id.btnview);
            mDb_Azkaar_user = new Db_Azkaar_user(this);

            btnAdd.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String newEntry = editText.getText().toString();
                    if (editText.length() != 0) {
                        AddData(newEntry);
                        editText.setText("");
                    } else {
                        toastMessage("You must put something in the text field!");
                    }

                }
            });

            btnViewData.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(MyAzkaar.this, ListDataActivity.class);
                    startActivity(intent);
                }
            });

        }

        public void AddData(String newEntry) {
            boolean insertData = mDb_Azkaar_user.InsertAzkaar(newEntry);

            if (insertData) {
                toastMessage("Data Successfully Inserted!");
            } else {
                toastMessage("Something went wrong");
            }
        }

        /**
         * customizable toast
         * @param message
         */
        private void toastMessage(String message){
            Toast.makeText(this,message, Toast.LENGTH_SHORT).show();
        }






    }




