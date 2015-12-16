package com.example.kahye.myapplication2;

/**
 * Created by kahye on 2015-12-16.
 */

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_login);
    }
    public void onNewBtnBack(View v) {
        Log.d("TEST", "BACK!!!");
        finish();
    }
    public void onLoging(View v) {
        EditText id = (EditText)findViewById(R.id.editTextID);
        Toast.makeText(getApplicationContext(), id.getText(), Toast.LENGTH_LONG).show();
    }

}

