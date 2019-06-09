package com.example.myapplication;

import android.app.Application;

public class Global extends Application {
    private String UserID;

    public String getUserID()
    {
        return UserID;
    }

    public void setUserID(String UserID)
    {
        this.UserID = UserID;
    }
}
