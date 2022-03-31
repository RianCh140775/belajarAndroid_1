package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.myapplication.Model.UserModel;

public class MainActivity extends AppCompatActivity {
    EditText editEmail,editPassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editEmail = findViewById(R.id.editEmail);
        editPassword = findViewById(R.id.editPassword);
    }


    public void halamanselanjutnya(View view) {
        Intent intent =  new Intent(this, SecondActivity.class);
        startActivity(intent);
    }

    public void pergiDialup(View view) {
        Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel: 081286"));
        startActivity(intent);
    }

    public void login(View view) {
        UserModel user = new UserModel();
        user.setEmail(editEmail.getText().toString());
        user.setPassword(editPassword.getText().toString());

        Intent intent = new Intent(this, HomeActivity.class);
        intent.putExtra("user",user);
        startActivity(intent);
        finish();
    }



}