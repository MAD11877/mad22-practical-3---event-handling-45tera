package com.example.madpractical;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    Button but;
    TextView words;
    User user1 = new User("guest","guest",1,true);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
       super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //New user on start
        but = findViewById(R.id.follow);

        Intent receivingEnd = getIntent();
        Integer message = ((Intent) receivingEnd).getIntExtra("Number",0);

        //event listener for message
        Button m = findViewById(R.id.msg);
        m.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mes = new Intent(MainActivity.this,MessageGroup.class);
                startActivity(mes);
            }
        });

        //set text of the activity
        if (message !=null){
            words = findViewById(R.id.textView);
            words.setText("MAD " +message);

            if (!user1.followed){
                but.setText("Follow");
            }
            else{
                but.setText("Followed");
            }
        }




    }
    public void onClick(View v){
        if(but.getText().toString().equals("Followed")){ //unfollowed
            but.setText("Follow");
            user1.followed= false; //sets the attribute to unfollowed.
            Toast.makeText(MainActivity.this,"Unfollowed!", Toast.LENGTH_SHORT).show();
        }
        else if( but.getText().toString().equals("Follow")){ //followed
            but.setText("Followed");
            user1.followed=true; //sets the attribute to follow.
            Toast.makeText(MainActivity.this,"Followed!", Toast.LENGTH_SHORT).show();
        }

    }



}