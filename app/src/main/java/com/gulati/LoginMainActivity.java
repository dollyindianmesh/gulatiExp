package com.gulati;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.widget.Button;

public class LoginMainActivity extends Activity implements View.OnClickListener{

    Button main_btn_signup,main_btn_login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_main_activity);
        init();

    }
    private void init()
    {
        main_btn_signup = (Button)findViewById(R.id.main_btn_signup);
        main_btn_login = (Button)findViewById(R.id.main_btn_login);
        main_btn_signup.setOnClickListener(this);
        main_btn_login.setOnClickListener(this);
    }// init

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.main_btn_signup)
        {
            Intent intent = new Intent(LoginMainActivity.this, SignUpActivity.class);
            startActivity(intent);
            finish();
        }// clikc on login btn

        if(v.getId() == R.id.main_btn_login)
        {
            Intent intent = new Intent(LoginMainActivity.this, LoginActivity.class);
            startActivity(intent);
            finish();
        }
    } // onClick
} // activity
