package com.example.stmsaccount;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
 Boolean userFound; // to check if user is found
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button login = (Button) findViewById(R.id.login);
        login.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View view){
            login();
            }

        });

        Button register = (Button) findViewById(R.id.register_here);
        register.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View view){
                register();
            }

        });
    }

    public void login(){
    checkUser();
    if (userFound){
        Intent intent = new Intent(this , AccountActivity.class);
        startActivity(intent);
    }else{
        Toast.makeText(getApplicationContext(),"User not found",Toast.LENGTH_SHORT).show();
    }
    }

    public void register(){
            Intent intent = new Intent(this , RegistrationActivity.class);
            startActivity(intent);
    }

    public void checkUser (){
        userFound = false;
        EditText userName = (EditText) findViewById(R.id.name);
        String name = userName.getText().toString();
        EditText pass = (EditText) findViewById(R.id.password);
        String password = pass.getText().toString();
         if (name.equals("admin")&&password.equals("admin")){
         userFound = true;
         }
         }

    }
