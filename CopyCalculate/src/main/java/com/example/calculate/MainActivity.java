package com.example.calculate;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private Button one, two, three, fore, five, six, seven, eight, nine, zero, add, reduce, mul, divide, answer, clear, point;
    //private EditText appear;
    private TextView process, appear;
    private String str = "", str1 = "", temp = "";
    private double count = 0;
    private double finalAnswer, first, second;
    public void alertMessage(String alert){
        AlertDialog.Builder Alert=new AlertDialog.Builder(this);
        Alert.setTitle("Error");
        Alert.setMessage(alert);
        Alert.show();
        process.setText("");
        appear.setText("");
    }
    public void addString(String s) {
        try {
            if (s.equals("clear")) {
                str1 = "";
                str = "";
                count = 0;
                appear.setText("");
                process.setText("");
            } else {

                if (s.equals("=")) {

                    second = Double.parseDouble(str1);
                    if (temp.equals("X"))
                        finalAnswer = first * second;
                    else if (temp.equals("-"))
                        finalAnswer = first - second;
                    else if (temp.equals("+"))
                        finalAnswer = first + second;
                    else if (temp.equals("/"))
                        finalAnswer = (first / second);
                    appear.setText(String.valueOf(finalAnswer));

                } else if (count == 1) {
                    str1 += s;
                }
                if (s.equals("/") || s.equals("+") || s.equals("-") || s.equals("X")) {//|| s=="+" || s=="/" || s=="-"
                    temp = s;
                    first = Double.parseDouble(str);
                    count = 1;
                }
                str += s;
                process.setText(str);
            }
        }catch (Exception e){
            alertMessage(e.toString());
        }

    }

    private class ButtonListener implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.zero:
                    zero = (Button) findViewById(R.id.zero);
                    MainActivity.this.addString(zero.getText().toString());
                    break;
                case R.id.one:
                    one = (Button) findViewById(R.id.one);
                    MainActivity.this.addString(one.getText().toString());
                    break;
                case R.id.two:
                    two = (Button) findViewById(R.id.two);
                    MainActivity.this.addString(two.getText().toString());
                    break;
                case R.id.three:
                    three = (Button) findViewById(R.id.three);
                    MainActivity.this.addString(three.getText().toString());
                    break;
                case R.id.fore:
                    fore = (Button) findViewById(R.id.fore);
                    MainActivity.this.addString(fore.getText().toString());
                    break;
                case R.id.five:
                    five = (Button) findViewById(R.id.five);
                    MainActivity.this.addString(five.getText().toString());
                    break;
                case R.id.six:
                    six = (Button) findViewById(R.id.six);
                    MainActivity.this.addString(six.getText().toString());
                    break;
                case R.id.seven:
                    seven = (Button) findViewById(R.id.seven);
                    MainActivity.this.addString(seven.getText().toString());
                    break;
                case R.id.eight:
                    eight = (Button) findViewById(R.id.eight);
                    MainActivity.this.addString(eight.getText().toString());
                    break;
                case R.id.nine:
                    nine = (Button) findViewById(R.id.nine);
                    MainActivity.this.addString(nine.getText().toString());
                    break;
                case R.id.add:
                    add = (Button) findViewById(R.id.add);
                    MainActivity.this.addString(add.getText().toString());
                    break;
                case R.id.reduce:
                    reduce = (Button) findViewById(R.id.reduce);
                    MainActivity.this.addString("-");
                    break;
                case R.id.mul:
                    mul = (Button) findViewById(R.id.mul);
                    MainActivity.this.addString(mul.getText().toString());
                    break;
                case R.id.divide:
                    divide = (Button) findViewById(R.id.divide);
                    MainActivity.this.addString(divide.getText().toString());
                    break;
                case R.id.answer:
                    answer = (Button) findViewById(R.id.answer);
                    MainActivity.this.addString(answer.getText().toString());
                    appear = (TextView) findViewById(R.id.appear);

                    appear.setText(String.valueOf(finalAnswer));
                    break;
                case R.id.clear:
                    clear = (Button) findViewById(R.id.clear);
                    MainActivity.this.addString("clear");
                    break;
                case R.id.point:
                    point = (Button) findViewById(R.id.point);
                    MainActivity.this.addString(point.getText().toString());
                    break;
            }
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        one = (Button) findViewById(R.id.one);
        two = (Button) findViewById(R.id.two);
        three = (Button) findViewById(R.id.three);
        fore = (Button) findViewById(R.id.fore);
        five = (Button) findViewById(R.id.five);
        six = (Button) findViewById(R.id.six);
        seven = (Button) findViewById(R.id.seven);
        eight = (Button) findViewById(R.id.eight);
        nine = (Button) findViewById(R.id.nine);
        zero = (Button) findViewById(R.id.zero);
        appear = (TextView) findViewById(R.id.appear);
        process = (TextView) findViewById(R.id.process);
        answer = (Button) findViewById(R.id.answer);
        clear = (Button) findViewById(R.id.clear);
        add = (Button) findViewById(R.id.add);
        point = (Button) findViewById(R.id.point);
        reduce = (Button) findViewById(R.id.reduce);
        mul = (Button) findViewById(R.id.mul);
        divide = (Button) findViewById(R.id.divide);
        one.setOnClickListener(new ButtonListener());
        two.setOnClickListener(new ButtonListener());
        three.setOnClickListener(new ButtonListener());
        fore.setOnClickListener(new ButtonListener());
        five.setOnClickListener(new ButtonListener());
        six.setOnClickListener(new ButtonListener());
        seven.setOnClickListener(new ButtonListener());
        eight.setOnClickListener(new ButtonListener());
        nine.setOnClickListener(new ButtonListener());
        zero.setOnClickListener(new ButtonListener());
        one.setOnClickListener(new ButtonListener());
        add.setOnClickListener(new ButtonListener());
        reduce.setOnClickListener(new ButtonListener());
        mul.setOnClickListener(new ButtonListener());
        divide.setOnClickListener(new ButtonListener());
        point.setOnClickListener(new ButtonListener());
        answer.setOnClickListener(new ButtonListener());
        clear.setOnClickListener(new ButtonListener());
    }
}