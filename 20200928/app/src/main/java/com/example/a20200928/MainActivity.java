package com.example.a20200928;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    String s;
    EditText editText;
    EditText editText1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=(TextView)findViewById(R.id.answer);
        editText=(EditText)findViewById(R.id.name);
        editText1=(EditText)findViewById(R.id.gmail);

    }
    public void onclick(View v){
        textView.setText("姓名:"+editText.getText()+"\nGmail:"+editText1.getText());
    }
}