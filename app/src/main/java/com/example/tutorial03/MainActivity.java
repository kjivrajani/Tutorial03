package com.example.tutorial03;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btnlogin;
    EditText editemail,editpassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnlogin = findViewById(R.id.btnlogin);
        editemail = findViewById(R.id.editemail);
        editpassword = findViewById(R.id.editpassword);



    }

    public void btnLoginClick(View view) {
        String Valueusername = editemail.getText().toString();
        String Valuepassword = editpassword.getText().toString();
        if (Valueusername.equals("kjivrajani728@rku.ac.in") && Valuepassword.equals("komal"))
        {
            Intent intent = new Intent(MainActivity.this,login.class);
            startActivity(intent);
            Toast.makeText(this, "Login Succesful", Toast.LENGTH_SHORT).show();
            finish();
        }
        else {
            Toast.makeText(this, "Login Failed", Toast.LENGTH_SHORT).show();
        }
        }
    }

