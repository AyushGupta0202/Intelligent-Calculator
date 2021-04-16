package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CalculatorActivity extends AppCompatActivity implements View.OnClickListener {
    private Button b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, btnDot, btnClear, btnDiv, btnMul, btnSub, btnEq,
            btnAdd, btnPara1, btnPara2;
    private TextView tvInput, tvOutput;
    private String input = "", output = "", operation = "", expression = "";
    private int inputNum = -1, finalResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sample_layout);
        setupViews();
        implementOnClick();
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button0:
                if (!input.equals("")) {
                    if (input.charAt(0) != '0') {
                        if (output.equals("")) {
                            input += "0";
                            setTvInput(1);
                        } else {
                            output += "0";
                            setTvInput(2);
                        }
                    }
                    else {
                        input = "";
                    }
                }
                break;
            case R.id.button1:
                if (output.equals("")) {
                    input += "1";
                    setTvInput(1);
                } else {
                    output += "1";
                    setTvInput(2);
                }
                break;
            case R.id.button2:
                if (output.equals("")) {
                    input += "2";
                    setTvInput(1);
                } else {
                    output += "2";
                    setTvInput(2);
                }
                break;
            case R.id.button3:
                if (output.equals("")) {
                    input += "3";
                    setTvInput(1);
                } else {
                    output += "4";
                    setTvInput(2);
                }
                break;
            case R.id.button4:
                if (output.equals("")) {
                    input += "4";
                    setTvInput(1);
                } else {
                    output += "4";
                    setTvInput(2);
                }
                break;
            case R.id.button5:
                if (output.equals("")) {
                    input += "5";
                    setTvInput(1);
                } else {
                    output += "5";
                    setTvInput(2);
                }
                break;
            case R.id.button6:
                if (output.equals("")) {
                    input += "6";
                    setTvInput(1);
                } else {
                    output += "6";
                    setTvInput(2);
                }
                break;
            case R.id.button7:
                if (output.equals("")) {
                    input += "7";
                    setTvInput(1);
                } else {
                    output += "7";
                    setTvInput(2);
                }
                break;
            case R.id.button8:
                if (output.equals("")) {
                    input += "8";
                    setTvInput(1);
                } else {
                    output += "8";
                    setTvInput(2);
                }
                break;
            case R.id.button9:
                if (output.equals("")) {
                    input += "9";
                    setTvInput(1);
                } else {
                    output += "9";
                    setTvInput(2);
                }
            case R.id.button_divide:

                break;
            case R.id.button_multi:
                if (!input.equals("")) {
                    if (tvOutput.getText().toString().isEmpty()) {
                        tvOutput.setText(input + "*");
                        tvInput.setText("");
                    }
                    else {
                        if (!output.equals("")) {
                            finalResult = Integer.parseInt(input) *
                                    Integer.parseInt(output);
                            tvOutput.setText(input + "*" + output + "=" + finalResult);
                            tvInput.setText("");
                            input = "" + finalResult;
                            output = "";
                        }
                    }
                }
                break;
            case R.id.button_add:
                if (!input.equals("")) {
                    if (tvOutput.getText().toString().isEmpty()) {
                        tvOutput.setText(input + "+");
                        tvInput.setText("");
                    }
                    else {
                        if (!output.equals("")) {
                            finalResult = Integer.parseInt(input) +
                                    Integer.parseInt(output);
                            tvOutput.setText(input + "+" + output + "=" + finalResult);
                            tvInput.setText("");
                            output = "" + finalResult;
                            input = "";
                        }
                    }
                }
                break;
            case R.id.button_dot:
                break;
            case R.id.button_sub:
                if (!input.equals("")) {
                    if (tvOutput.getText().toString().isEmpty()) {
                        tvOutput.setText(input + "-");
                        tvInput.setText("");
                    }
                    else {
                        if (!output.equals("")) {
                            finalResult = Integer.parseInt(input) -
                                    Integer.parseInt(output);
                            tvOutput.setText(input + "-" + output + "=" + finalResult);
                            tvInput.setText("");
                            input = "" + finalResult;
                            output = "";
                        }
                    }
                }
                break;
            case R.id.button_clear:
                tvOutput.setText("");
                tvInput.setText("");
                inputNum = -1;
                input = output = operation = "";
                break;
            case R.id.button_para1:
                if (performOperation()) {

                }
                break;
            case R.id.button_para2:
                if (performOperation()) {

                }
                break;
            case R.id.button_equal:
                tvOutput.setText(output);
                break;
        }
    }

    private void setupViews() {
        b2 = findViewById(R.id.button2);
        b1 = findViewById(R.id.button1);
        b4 = findViewById(R.id.button4);
        b3 = findViewById(R.id.button3);
        b5 = findViewById(R.id.button5);
        b6 = findViewById(R.id.button6);
        b7 = findViewById(R.id.button7);
        b8 = findViewById(R.id.button8);
        b9 = findViewById(R.id.button9);
        b0 = findViewById(R.id.button0);
        btnEq = findViewById(R.id.button_equal);
        btnMul = findViewById(R.id.button_multi);
        btnDiv = findViewById(R.id.button_divide);
        btnAdd = findViewById(R.id.button_add);
        btnSub = findViewById(R.id.button_sub);
        btnClear = findViewById(R.id.button_clear);
        btnDot = findViewById(R.id.button_dot);
        btnPara1 = findViewById(R.id.button_para1);
        btnPara2 = findViewById(R.id.button_para2);
        tvInput = findViewById(R.id.input);
        tvOutput = findViewById(R.id.output);
    }

    private void implementOnClick() {
        b0.setOnClickListener(this);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        b5.setOnClickListener(this);
        b6.setOnClickListener(this);
        b7.setOnClickListener(this);
        b8.setOnClickListener(this);
        b9.setOnClickListener(this);
        btnAdd.setOnClickListener(this);
        btnDiv.setOnClickListener(this);
        btnMul.setOnClickListener(this);
        btnClear.setOnClickListener(this);
        btnSub.setOnClickListener(this);
        btnEq.setOnClickListener(this);
        btnDot.setOnClickListener(this);
        btnPara1.setOnClickListener(this);
        btnPara2.setOnClickListener(this);
    }

    private Boolean performOperation() {
        return inputNum != -1;
    }

    private Boolean noOperation() {
        return !expression.contains("+") || !expression.contains("-") ||
                !expression.contains("*") || !expression.contains("/") ||
                !expression.contains("%");
    }

    private void setTvInput(int i) {
        if (i == 1) {
            tvInput.setText(input);
        } else {
            tvInput.setText(output);
        }
    }
}