package com.bignerdranch.android.pharmsampleproject.ui;

/*
* project will need a parent debugging class that overrides onCreate, onPause,
* onRestart, onDestroy, onSavedInstanceState and onAnythingElse so to help the
* development process.
*
* */

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.bignerdranch.android.pharmsampleproject.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getToast(getString(R.string.getting_smarter_here));
    }

    private void getToast(String message){
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}
