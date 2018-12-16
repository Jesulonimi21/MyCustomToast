package com.example.jesulonimi.mycustomtoast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.muddzdev.styleabletoastlibrary.StyleableToast;

//https://codinginflow.com/tutorials/android/styleabletoast   url to learn more
//https://github.com/Muddz/StyleableToast github url to learn more
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showoast(View v){
        StyleableToast.makeText(MainActivity.this,"am styled", R.style.exampletoast).show();
    }
}
