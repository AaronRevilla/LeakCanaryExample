package com.project.aaron.leakcanaryexample;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private String TAG = "AppCompatActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: ");

        new MyTask().execute();
    }


    public class MyTask extends AsyncTask<Void, Void ,Void>{

        @Override
        protected Void doInBackground(Void... voids) {
            try {
                Thread.sleep(50000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return null;
        }
    }

}
