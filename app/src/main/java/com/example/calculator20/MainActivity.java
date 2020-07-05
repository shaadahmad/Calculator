package com.example.calculator20;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    Button one;
    Button two;
    Button three;
    Button four;
    Button five;
    Button six;
    Button seven;
    Button eight;
    Button nine;
    Button zero;
    Button decimal;
    Button add;
    Button sub;
    Button mul;
    Button div;
    Button mod;
    Button clear;
    Button equal;
    TextView result ;
     boolean isAdd;
     boolean isSub;
     boolean isMul;
     boolean isDiv;
     boolean ismod = true;


    float v1;
    float v2;
    String s;



    @SuppressLint("WrongViewCast")
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        one=(Button)findViewById(R.id.button7);
        two=(Button)findViewById(R.id.button8);
        three=(Button)findViewById(R.id.button9);
        four=(Button)findViewById(R.id.button4);
        five=(Button)findViewById(R.id.button5);
        six=(Button)findViewById(R.id.button6);
        seven=(Button)findViewById(R.id.button1);
        eight=(Button)findViewById(R.id.button2);
        nine=(Button)findViewById(R.id.button3);
        zero=(Button)findViewById(R.id.button10);
        decimal=(Button)findViewById(R.id.button15);
        add=(Button)findViewById(R.id.button11);
        sub=(Button)findViewById(R.id.button12);
        mul=(Button)findViewById(R.id.button13);
        div=(Button)findViewById(R.id.button14);
        mod=(Button)findViewById(R.id.button17);
        clear=(Button)findViewById(R.id.button18);
        equal=(Button)findViewById(R.id.button16);
        result = (TextView) findViewById(R.id.textView);



        one.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"1");
            }

        });

        two.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"2");
            }

        });
        three.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"3");
            }

        });
        four.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"4");
            }

        });
        five.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"5");
            }

        });
        six.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"6");
            }

        });
        seven.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"7");
            }

        });
        eight.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"8");
            }

        });
        nine.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"9");
            }

        });
        zero.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"0");
            }

        });

        add.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                if(result.getText().length()!=0)
                {
                v1=Float.parseFloat(result.getText()+"");
                isAdd =true;
                result.setText(null);
                }
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                if(result.getText().length()!=0)
                {
                v1=Float.parseFloat(result.getText()+"");
                isSub=true;
                result.setText(null);
            }}
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                if(result.getText().length()!=0)
                {
                v1=Float.parseFloat(result.getText()+"");
                isMul=true;
                result.setText(null);
            }}
        });
        div.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                if(result.getText().length()!=0)
                {
                v1=Float.parseFloat(result.getText()+"");
                isDiv=true;
                result.setText(null);
            }}
        });
        equal.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                if(result.getText().length()!=0)
                {
                v2=Float.parseFloat(result.getText()+"");
               if(isAdd)
               {
                 result.setText(v1+v2+"");
                 isAdd=false;
               }
               if(isSub)
               {
                   result.setText(v1-v2+"");
                   isSub=false;

               }
               if(isMul)
               {
                   result.setText(v1*v2+"");
                   isMul=false;
               }
               if(isDiv)
               {
                   result.setText(v1/v2+"");
                   isDiv=false;
               }
              if(ismod)
              {
                  result.setText(v1%v2+"");
                  ismod=false;
              }

            }}
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                result.setText(null);

            }
        });
        decimal.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+".");
            }
        });
        mod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(result.getText().length()!=0)
                {
                    v1=Float.parseFloat(result.getText()+"");
                    ismod=true;
                    result.setText(null);
                }
            }
        });
    }
}