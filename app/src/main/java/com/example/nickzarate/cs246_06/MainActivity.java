package com.example.nickzarate.cs246_06;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // Called when "Create" button is clicked
    public void create() {
        String filename = "numbers.txt";
        FileOutputStream outputStream;

        try {
            outputStream = openFileOutput(filename, Context.MODE_PRIVATE);
            for (int i = 1; i < 11; i++) {
                String string = Integer.toString(i) + "\n";
                outputStream.write(string.getBytes());
                Thread.sleep(250);
            }
            outputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Called when "Load" button is clicked
    public void load() {
    }

    // Called when "Clear" button is clicked
    public void clear() {
    }
}
