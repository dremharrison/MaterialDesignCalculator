package com.example.materialdesigncalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    MaterialButton btnLeftParenthesis, btnRightParenthesis, btnPercent, btnClear, btnDivide, btnMultiply, btnAdd, btnSubtract, btnDecimal, btnEquals;
    MaterialButton btnZero, btnOne, btnTwo, btnThree, btnFour, btnFive, btnSix, btnSeven, btnEight, btnNine;
    TextInputEditText calcDisplayTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        calcDisplayTextView = findViewById(R.id.displayEditText);
        btnZero = findViewById(R.id.zeroButton);
        btnOne = findViewById(R.id.oneButton);
        btnTwo = findViewById(R.id.twoButton);
        btnThree = findViewById(R.id.threeButton);
        btnFour = findViewById(R.id.fourButton);
        btnFive = findViewById(R.id.fiveButton);
        btnSix = findViewById(R.id.sixButton);
        btnSeven = findViewById(R.id.sevenButton);
        btnEight = findViewById(R.id.eightButton);
        btnNine = findViewById(R.id.nineButton);
        btnRightParenthesis = findViewById(R.id.rightParenthesisButton);
        btnLeftParenthesis = findViewById(R.id.leftParenthesisButton);
        btnPercent = findViewById(R.id.percentageButton);
        btnClear = findViewById(R.id.clearButton);
        btnDivide = findViewById(R.id.divisionButton);
        btnMultiply = findViewById(R.id.multiplyButton);
        btnAdd = findViewById(R.id.addButton);
        btnSubtract = findViewById(R.id.minusButton);
        btnDecimal = findViewById(R.id.decimalButton);
        btnEquals = findViewById(R.id.equalsButton);

        btnZero.setOnClickListener(this);
        btnOne.setOnClickListener(this);
        btnTwo.setOnClickListener(this);
        btnThree.setOnClickListener(this);
        btnFour.setOnClickListener(this);
        btnFive.setOnClickListener(this);
        btnSix.setOnClickListener(this);
        btnSeven.setOnClickListener(this);
        btnEight.setOnClickListener(this);
        btnNine.setOnClickListener(this);
        btnClear.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.clearButton:
                calcDisplayTextView.setText("");
                break;
            case R.id.zeroButton:
                calcDisplayTextView.append("0");
                break;
            case R.id.oneButton:
                calcDisplayTextView.append("1");
                break;
            case R.id.twoButton:
                calcDisplayTextView.append("2");
                break;
            case R.id.threeButton:
                calcDisplayTextView.append("3");
                break;
            case R.id.fourButton:
                calcDisplayTextView.append("4");
                break;
            case R.id.fiveButton:
                calcDisplayTextView.append("5");
                break;
            case R.id.sixButton:
                calcDisplayTextView.append("6");
                break;
            case R.id.sevenButton:
                calcDisplayTextView.append("7");
                break;
            case R.id.eightButton:
                calcDisplayTextView.append("8");
                break;
            case R.id.nineButton:
                calcDisplayTextView.append("9");
                break;
            case R.id.decimalButton:
                calcDisplayTextView.append(".");
                break;
        }
    }
}
