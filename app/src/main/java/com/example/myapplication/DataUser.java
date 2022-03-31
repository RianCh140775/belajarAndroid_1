package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.myapplication.Model.DataUserModel;
import com.example.myapplication.Model.UserModel;

public class DataUser extends AppCompatActivity {

    EditText editUsername,editTanggalLahir,editnoHP;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_user);
        editUsername = findViewById(R.id.editUsername);
        editTanggalLahir = findViewById(R.id.editTanggalLahir);
        editnoHP =  findViewById(R.id.editnoHP);
    }

    public void inputdata(View view) {

        DataUserModel datauser = new DataUserModel();
        datauser.setUsername(editUsername.getText().toString());
        datauser.setTanggallahir(editTanggalLahir.getText().toString());
        datauser.setNoHP(editnoHP.getText().toString());

        Intent intent = new Intent(this, DetailUser.class);
        intent.putExtra("datauser",datauser);
        startActivity(intent);
        finish();
    }


}