package com.example.administrator.myapplication;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    boolean next = false;
    int cal = 0;
    TextView in1 ;
    TextView in2 ;
    TextView result ;
    TextView calculator;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        in1 =  (TextView) findViewById(R.id.input1);
        in2 =  (TextView) findViewById(R.id.input2);
        result =  (TextView) findViewById(R.id.result);
        calculator = (TextView) findViewById(R.id.calculator);
    }

    public void CButton(View v) {

        switch (v.getId()) {
            case R.id.num0:
                    if(next == false)
                        if(in1.getText().length() != 0 ) in1.append("0");
                    else
                        if(in2.getText().length() != 0 ) in2.append("0");
                break;
            case R.id.num1:
                if(next == false)
                    in1.append("1");
                else
                    in2.append("1");
                break;
            case R.id.num2:
                if(next == false)
                    in1.append("2");
                else
                    in2.append("2");
                break;
            case R.id.num3:
                if(next == false)
                    in1.append("3");
                else
                    in2.append("3");
                break;
            case R.id.num4:
                if(next == false)
                    in1.append("4");
                else
                    in2.append("4");
                break;
            case R.id.num5:
                if(next == false)
                    in1.append("5");
                else
                    in2.append("5");
                break;
            case R.id.num6:
                if(next == false)
                    in1.append("6");
                else
                    in2.append("6");
                break;
            case R.id.num7:
                if(next == false)
                    in1.append("7");
                else
                    in2.append("7");
                break;
            case R.id.num8:
                if(next == false)
                    in1.append("8");
                else
                    in2.append("8");
                break;
            case R.id.num9:
                if(next == false)
                    in1.append("9");
                else
                    in2.append("9");
                break;
            case R.id.add:
                next = true;
                cal = 0;
                calculator.setText("Add");
                break;
            case R.id.subtract:
                next = true;
                cal = 1;
                calculator.setText("Subtract");
                break;

            case R.id.multiply:
                next = true;
                cal = 2;
                calculator.setText("Multiply");
                break;

            case R.id.divide:
                next = true;
                cal = 3;
                calculator.setText("Divide");
                break;
            case R.id.one :
                next = false;
                break;
            case R.id.two :
                next = true;
                break;
            case R.id.clear:
                next = false;
                in1.setText("");
                in2.setText("");
                result.setText("");
                cal=0;
                calculator.setText("Add");
                break;
            case R.id.resultButton:
                int n1 = Integer.parseInt(in1.getText().toString());
                int n2 = Integer.parseInt(in2.getText().toString());
                if(cal == 0)  result.setText( "Result : " + (n1 + n2)  );
                else if(cal == 1)  result.setText("Result : "+ (n1 - n2));
                else if(cal == 2)  result.setText("Result : "+ (n1 * n2));
                else  result.setText("Result : "+ (n1 / n2));
        }
    }
}


