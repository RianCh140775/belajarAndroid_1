package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.example.myapplication.Model.DataUserModel;
import com.example.myapplication.Model.UserModel;

public class DetailUser extends AppCompatActivity {

    TextView textUsername,textTanggalLahir,textnoHP;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_user);
        textUsername = findViewById(R.id.textUsername);
        textTanggalLahir = findViewById(R.id.textTanggalLahir);
        textnoHP = findViewById(R.id.textnoHP);

        DataUserModel datauser = getIntent().getExtras().getParcelable("datauser");
        textUsername.setText(datauser.getUsername());
        textTanggalLahir.setText(datauser.getTanggallahir());
        textnoHP.setText(datauser.getNoHP());
    }
    public void pergiDialup(View view) {
        String data= textnoHP.getText().toString();
        Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel: "+data));
        startActivity(intent);
    }


}