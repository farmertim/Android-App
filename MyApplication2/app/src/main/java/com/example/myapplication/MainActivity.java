package com.example.myapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.math.BigDecimal;

public class MainActivity extends AppCompatActivity {
    private Double doubleanswer;
    private ImageButton buttonshow, buttonshow2;
    private EditText number, number1;
    private Double answer;

    private void errorMessage(String s) {
        AlertDialog.Builder alert = new AlertDialog.Builder(this);
        alert.setTitle("error");
        alert.setMessage("不能空白");
        alert.show();
    }

    private String a(Double d) {
        BigDecimal bd = new BigDecimal(d);
        bd = bd.setScale(6, BigDecimal.ROUND_HALF_UP);
        return bd.toString();
    }

    private class ButtonListener implements View.OnClickListener {

        @Override
        public void onClick(View v) {
            try {
                switch (v.getId()) {
                    case R.id.buttonshow:
                        number = (EditText) findViewById(R.id.number);
                        answer = Double.parseDouble(number.getText().toString());
                        doubleanswer = answer * 0.621371;
                        number1.setText(a(doubleanswer));
                        break;
                    case R.id.buttonshow2:
                        number1 = (EditText) findViewById(R.id.number1);
                        answer = Double.parseDouble(number1.getText().toString());
                        doubleanswer = answer / 0.621371;
                        number.setText(a(doubleanswer));
                        break;
                }
            }catch (Exception e){
                errorMessage(e.toString());
            }
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        number1 = (EditText) findViewById(R.id.number1);
        number = (EditText) findViewById(R.id.number);
        buttonshow = (ImageButton) findViewById(R.id.buttonshow);
        buttonshow2 = (ImageButton) findViewById(R.id.buttonshow2);
        buttonshow.setOnClickListener(new ButtonListener());
        buttonshow2.setOnClickListener(new ButtonListener());

    }
}