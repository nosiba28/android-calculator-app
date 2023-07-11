package com.example.appcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button btnZero, btnOne, btnTwo, btnThree, btnFour, btnFive, btnSix, btnSeven, btnEight, btnNine,btnPlus, btnDel,btnAC,btnMinus, btnMul,btnPoint,btnPercent,btnEqual,btnDivide;
    EditText edtIn;
    float mValueOne, mValueTwo;
    boolean Addition, Subtract, Multiplication, Division;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnZero = findViewById(R.id.btnZero);
        btnOne = findViewById(R.id.btnOne);
        btnTwo = findViewById(R.id.btnTwo);
        btnThree = findViewById(R.id.btnThree);
        btnFour = findViewById(R.id.btnFour);
        btnFive = findViewById(R.id.btnFive);
        btnSix = findViewById(R.id.btnSix);
        btnSeven = findViewById(R.id.btnSeven);
        btnEight = findViewById(R.id.btnEight);
        btnNine = findViewById(R.id.btnNine);
        btnDel=findViewById(R.id.btnDel);
        btnAC=findViewById(R.id.btnAC);
        btnPercent =findViewById(R.id.btnPercent);
        btnPlus = findViewById(R.id.btnPlus);
        btnMinus=findViewById(R.id.btnMinus);
        btnMul=findViewById(R.id.btnMul);
        btnPoint=findViewById(R.id.btnPoint);
        btnEqual=findViewById(R.id.btnEqual);
        btnDivide=findViewById(R.id.btnDivide);

        edtIn = findViewById(R.id.edtName);

        btnZero.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                edtIn.setText(edtIn.getText()+"0");
            }
        });

        btnOne.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                edtIn.setText(edtIn.getText()+"1");
            }
        });
        btnTwo.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                edtIn.setText(edtIn.getText()+"2");
            }
        });
        btnThree.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                edtIn.setText(edtIn.getText()+"3");
            }
        });
        btnFour.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                edtIn.setText(edtIn.getText()+"4");
            }
        });
        btnFive.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                edtIn.setText(edtIn.getText()+"5");
            }
        });
        btnSix.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                edtIn.setText(edtIn.getText()+"6");
            }
        });
        btnSeven.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                edtIn.setText(edtIn.getText()+"7");
            }
        });
        btnEight.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                edtIn.setText(edtIn.getText()+"8");
            }
        });
        btnNine.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                edtIn.setText(edtIn.getText()+"9");
            }
        });
        btnPoint.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                edtIn.setText(edtIn.getText()+".");
            }
        });
        btnAC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtIn.setText("");
            }
        });
        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(edtIn == null)
                {
                    edtIn.setText("");
                }
                else{
                    mValueOne = Float.parseFloat(edtIn.getText()+"");
                    Addition = true;
                    edtIn.setText(null);
                }
            }
        });
        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(edtIn.getText()+"");
                Subtract=true;
                edtIn.setText(null);
            }
        });
        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(edtIn.getText()+"");
                Multiplication=true;
                edtIn.setText(null);
            }
        });
        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(edtIn.getText()+"");
                Division=true;
                edtIn.setText(null);
            }
        });
        btnAC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueTwo = Float.parseFloat(edtIn.getText()+"");

                if(Addition == true)
                {
                    edtIn.setText(mValueOne + mValueTwo + "");
                    Addition = false;
                }
                if(Subtract == true )
                {
                    edtIn.setText(mValueOne - mValueTwo + "");
                    Subtract = false;
                }
                if(Multiplication ==  true)
                {
                    edtIn.setText(mValueOne * mValueTwo + "");
                    Multiplication = false;
                }
                if(Division ==  true)
                {
                    edtIn.setText(mValueOne / mValueTwo + "");
                    Division = false;
                }
            }
        });
        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mValueTwo =Float.parseFloat(edtIn.getText()+"");
                if(Addition==true)
                {
                    edtIn.setText(mValueOne+mValueTwo +"");
                    Addition=false;
                }
                if(Subtract==true)
                {
                    edtIn.setText(mValueOne-mValueTwo +"");
                    Subtract=false;
                }
                if(Multiplication==true)
                {
                    edtIn.setText(mValueOne*mValueTwo +"");
                    Multiplication=false;
                }
                if(Division==true)
                {
                    edtIn.setText(mValueOne/mValueTwo +"");
                    Division=false;
                }
            }
        });


    }
}