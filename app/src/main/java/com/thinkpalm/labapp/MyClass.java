package com.thinkpalm.labapp;

import android.support.annotation.IdRes;
import android.view.View;
import android.widget.Toast;

public class MyClass {

    public static void myStaticMethod(View view, @IdRes int num) {
        Toast.makeText(view.getContext(), "Click works!!", Toast.LENGTH_SHORT).show();
    }
}
