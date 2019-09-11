package com.example.proteintracker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = findViewById(R.id.MainActivityTextView);
        textView.setText(R.string.Test);

        Button myBtn = findViewById(R.id.MainButton);
        myBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText myEditText = findViewById(R.id.MainEdit);
                Log.d("ProteinTracker", myEditText.getText().toString());
            }
        });


        Button myBtn2 = findViewById(R.id.HelpButton);
        myBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,HelpActivity.class);
                Bundle b = new Bundle();
                EditText myEditText = findViewById(R.id.MainEdit);
                b.putString("helpString", myEditText.getText().toString());
                intent.putExtras(b);
                startActivity(intent);
                //tes

            }
        });



    }

}
