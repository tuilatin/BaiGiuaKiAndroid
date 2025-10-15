package com.example.ktgkandroid;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {
    @Override
    public void onCreate(Bundle saveInstance_144){
        super.onCreate(saveInstance_144);

        setContentView(R.layout.login);
        Button btnLogin_144 = findViewById(R.id.btnLogin_144);
        btnLogin_144.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v_144) {
                Intent intent_144 = new Intent(MainActivity.this, ProfileActivity.class);
                startActivity(intent_144);
            }
        });


    }
}
