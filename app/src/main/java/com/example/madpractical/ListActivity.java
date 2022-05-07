package com.example.madpractical;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import java.util.Random;


public class ListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        Random rand = new Random();

        ImageView v1 = findViewById(R.id.imageView3);
        v1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                AlertDialog.Builder ab= new AlertDialog.Builder(ListActivity.this);
                ab.setMessage("MADness");
                ab.setTitle("Profile");

                ab.setPositiveButton("View", new DialogInterface.OnClickListener(){
                    public void onClick(DialogInterface dialog, int id){
                        int randNo = rand.nextInt(10000000);
                        Intent i = new Intent(ListActivity.this, MainActivity.class);
                        i.putExtra("Number", randNo);
                        startActivity(i);
                    }
                });
                ab.setNegativeButton("Close", new DialogInterface.OnClickListener(){
                    public void onClick(DialogInterface dialog, int id){
                        //empty
                    }
                });


                ab.show();

            };
        });


    }

}