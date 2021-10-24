package com.easypref;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

public class EasyPref {

    public static void setValue(Context context, String value){
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor = preferences.edit();
        editor.putString("value",value);
        editor.commit();
    }

    public String getValue(Context context){
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String value = preferences.getString("value","");
        return  value;
    }




}
