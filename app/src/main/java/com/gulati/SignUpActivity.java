package com.gulati;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SignUpActivity extends Activity implements View.OnClickListener{

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
        }// clikc on login btn

        if(v.getId() == R.id.main_btn_login)
        {
        }
    } // onClick
} // activity
