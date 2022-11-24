package com.example.resolve;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ContentResolver resolver=getContentResolver();

        ContentValues values=new ContentValues();
        values.put("name","cc");
        values.put("age",20);
        Uri uri=Uri.parse("content://wcc.provider1/person");
        Integer.parseInt("20");
        Button button1=findViewById(R.id.button);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resolver.insert(uri,values);
            }
        });
    }
}
