package com.gulati;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginActivity extends Activity implements View.OnClickListener{

    Button main_btn_signup,main_btn_login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

    }
    private void init()
    {
//        main_btn_signup = (Button)findViewById(R.id.main_btn_signup);
//        main_btn_login = (Button)findViewById(R.id.main_btn_login);
//        main_btn_signup.setOnClickListener(this);
//        main_btn_login.setOnClickListener(this);
    }// init

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.main_btn_signup)
        {
//            Intent intent = new Intent(LoginActivity.this, SingInActivity.class);
//            startActivity(intent);
//            finish();
        }// clikc on login btn

        if(v.getId() == R.id.main_btn_login)
        {
//            Intent intent = new Intent(LoginActivity.this, LoginActivity.class);
//            startActivity(intent);
//            finish();
        }
    } // onClick
} // activity
