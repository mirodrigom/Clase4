package com.example.alumno.clase4;

import android.util.Log;
import android.view.View;

/**
 * Created by alumno on 19/04/2018.
 */

public class MyListener implements View.OnClickListener {

    private int position;

    public MyListener(int position)
    {
        this.position = position;
    }

    @Override
    public void onClick(View v)
    {
        Log.d("posicion", String.valueOf(this.position));
    }

    public void setPosition(int position) {
        this.position = position;
    }
}
