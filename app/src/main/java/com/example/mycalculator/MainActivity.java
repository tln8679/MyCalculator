package com.example.mycalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void btnClick7(View v){
        EditText editText = (EditText)findViewById(R.id.editText);
        editText.setText(editText.getText()+ "7", TextView.BufferType.EDITABLE);
    }

    public void btnClick8(View view) {
        EditText editText = (EditText)findViewById(R.id.editText);
        editText.setText(editText.getText()+ "8", TextView.BufferType.EDITABLE);
    }

    public void btnClick9(View view) {
        EditText editText = (EditText)findViewById(R.id.editText);
        editText.setText(editText.getText()+ "9", TextView.BufferType.EDITABLE);
    }

    public void btnClickClear(View view) {
        EditText editText = (EditText)findViewById(R.id.editText);
        editText.setText(" ", TextView.BufferType.EDITABLE);
    }

    public void btnClickAdd(View view) {
        EditText editText = (EditText)findViewById(R.id.editText);
        editText.setText(editText.getText()+ " + ", TextView.BufferType.EDITABLE);

    }

    public void btnClick4(View view) {
        EditText editText = (EditText)findViewById(R.id.editText);
        editText.setText(editText.getText()+ "4", TextView.BufferType.EDITABLE);
    }

    public void btnClick5(View view) {
        EditText editText = (EditText)findViewById(R.id.editText);
        editText.setText(editText.getText()+ "5", TextView.BufferType.EDITABLE);
    }

    public void btnClick6(View view) {
        EditText editText = (EditText)findViewById(R.id.editText);
        editText.setText(editText.getText()+ "6", TextView.BufferType.EDITABLE);
    }

    public void btnClick1(View view) {
        EditText editText = (EditText)findViewById(R.id.editText);
        editText.setText(editText.getText()+ "1", TextView.BufferType.EDITABLE);
    }

    public void btnClick2(View view) {
        EditText editText = (EditText)findViewById(R.id.editText);
        editText.setText(editText.getText()+ "2", TextView.BufferType.EDITABLE);
    }

    public void btnClick3(View view) {
        EditText editText = (EditText)findViewById(R.id.editText);
        editText.setText(editText.getText()+ "3", TextView.BufferType.EDITABLE);
    }

    public void btnClickDecimal(View view) {
        EditText editText = (EditText)findViewById(R.id.editText);
        //Need to add checks
        editText.setText(editText.getText()+ ".", TextView.BufferType.EDITABLE);
    }

    public void btnClick0(View view) {
        EditText editText = (EditText)findViewById(R.id.editText);
        editText.setText(editText.getText()+ " 0 ", TextView.BufferType.EDITABLE);
    }

    public void btnClickEq(View view) {
        EditText editText = (EditText)findViewById(R.id.editText);
        // Need to add my parser
    }

    public void btnClickDiv(View view) {
        EditText editText = (EditText)findViewById(R.id.editText);
        editText.setText(editText.getText()+ " / ", TextView.BufferType.EDITABLE);
    }

    public void btnClickMult(View view) {
        EditText editText = (EditText)findViewById(R.id.editText);
        editText.setText(editText.getText()+ " * ", TextView.BufferType.EDITABLE);
    }

    public void btnClickSub(View view) {
        EditText editText = (EditText)findViewById(R.id.editText);
        editText.setText(editText.getText()+ " - ", TextView.BufferType.EDITABLE);
    }
}
