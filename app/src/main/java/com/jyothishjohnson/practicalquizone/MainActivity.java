package com.jyothishjohnson.practicalquizone;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText name,email,info;
    String nameText,emailText,infoText;
    CardView login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);



        name = findViewById(R.id.editText);
        email = findViewById(R.id.editText2);
        info = findViewById(R.id.editText3);
        login = findViewById(R.id.cardViewLaunch);

       /* nameText= name.getText().toString();
        emailText= email.getText().toString();
        infoText= info.getText().toString();
        //Toast.makeText(getApplicationContext(),nameText,Toast.LENGTH_SHORT).show();*/


        if(savedInstanceState!=null){
            Toast.makeText(getApplicationContext(),"Notnull",Toast.LENGTH_SHORT).show();
            if(savedInstanceState.containsKey("name")){
                name.setText(savedInstanceState.getString("name"));
            }if(savedInstanceState.containsKey("email")){
                name.setText(savedInstanceState.getString("email"));
            }if(savedInstanceState.containsKey("info")){
                name.setText(savedInstanceState.getString("info"));
            }
        }

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                nameText= name.getText().toString();
                emailText= email.getText().toString();
                infoText= info.getText().toString();
                //Toast.makeText(getApplicationContext(),nameText,Toast.LENGTH_SHORT).show();
                Intent i = new Intent(getApplicationContext(),Detailed.class);
                i.putExtra("name",nameText);
                i.putExtra("email",emailText);
                i.putExtra("info",infoText);
                startActivity(i);

                name.setText("");
                email.setText("");
                info.setText("");

            }
        });


    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("name",name.getText().toString());
        outState.putString("email",email.getText().toString());
        outState.putString("info",info.getText().toString());

    }

}
