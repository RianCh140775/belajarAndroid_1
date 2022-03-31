package com.example.myapplication.Model;

import android.os.Parcel;
import android.os.Parcelable;

public class DataUserModel implements Parcelable {

    private String username;
    private String tanggallahir;
    private String noHP;

    public DataUserModel(String username, String tanggallahir, String noHP) {
        this.username = username;
        this.tanggallahir = tanggallahir;
        this.noHP = noHP;
    }

    public DataUserModel() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getTanggallahir() {
        return tanggallahir;
    }

    public void setTanggallahir(String tanggallahir) {
        this.tanggallahir = tanggallahir;
    }

    public String getNoHP() {
        return noHP;
    }

    public void setNoHP(String noHP) {
        this.noHP = noHP;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.username);
        dest.writeString(this.tanggallahir);
        dest.writeString(this.noHP);
    }

    public void readFromParcel(Parcel source) {
        this.username = source.readString();
        this.tanggallahir = source.readString();
        this.noHP = source.readString();
    }

    protected DataUserModel(Parcel in) {
        this.username = in.readString();
        this.tanggallahir = in.readString();
        this.noHP = in.readString();
    }

    public static final Parcelable.Creator<DataUserModel> CREATOR = new Parcelable.Creator<DataUserModel>() {
        @Override
        public DataUserModel createFromParcel(Parcel source) {
            return new DataUserModel(source);
        }

        @Override
        public DataUserModel[] newArray(int size) {
            return new DataUserModel[size];
        }
    };
}
