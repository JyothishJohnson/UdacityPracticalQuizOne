package com.jyothishjohnson.practicalquizone;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.WindowManager;
import android.widget.TextView;
import android.widget.Toast;

public class Detailed extends AppCompatActivity {

    protected String name,email,info;

    TextView nameText,emailText,infoText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailed);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        Bundle i =getIntent().getExtras();
        if(i!=null) {
            name = i.getString("name");
            email = i.getString("email");
            info = i.getString("info");
        }

        nameText = findViewById(R.id.nameDetail);
        emailText = findViewById(R.id.emailDetail);
        infoText = findViewById(R.id.infoDetail);

        Toast.makeText(getApplicationContext(),name,Toast.LENGTH_SHORT).show();
        nameText.setText(name);
        emailText.setText(email);
        infoText.setText(info);




    }
}
