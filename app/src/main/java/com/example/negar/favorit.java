package com.example.negar;

import android.content.SharedPreferences;
import android.util.Log;

import java.util.ArrayList;

public class favorit {
    SharedPreferences favorit_preference;
    SharedPreferences.Editor editor;
    ArrayList<item> arry_item;
    public favorit (SharedPreferences favorit_preference, ArrayList<item> arry_item){
        this.favorit_preference=favorit_preference;
        this.arry_item=arry_item;
    }
    public void add_item (String name,String ussd){
        editor.putString(name, ussd);
        editor.apply();
        Log.d("",favorit_preference.getAll().toString());
    }
}
