package com.aniruddh.calculator;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {

    EditText txtAnswer;
    Button btn1, btn2,btn3, btn4,btn5,btn6,btn7,btn8,btn9,btn0,btnDot,btnSqr,btnCrt;
    Button btnAdd, btnSubt,btnMult,btnEquals,btnCe,btnC,btnDiv,btnPerc,btnExp,btnstartPara,btnEndpara;
    Double Answer; Double Val2 =0.0; Double Val1 =0.1;
    String Sign; boolean solved = false; boolean solvedWithouEqu = false;
    EvaluateString es=new EvaluateString();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AddOnclickListenersForButton();
    }
    public boolean Checking() {
        if(solved==true || solvedWithouEqu==true){
            return true;
        }else
      return false;
    }
    //@SuppressLint("WrongViewCast")
    private void AddOnclickListenersForButton(){
        txtAnswer =(EditText)findViewById(R.id.text);
        btn0=(Button)findViewById(R.id.button0);
        btn1=(Button)findViewById(R.id.button1);
        btn2=(Button)findViewById(R.id.button2);
        btn3=(Button)findViewById(R.id.button3);
        btn4=(Button)findViewById(R.id.button4);
        btn5=(Button)findViewById(R.id.button5);
        btn6=(Button)findViewById(R.id.button6);
        btn7=(Button)findViewById(R.id.button7);
        btn9=(Button)findViewById(R.id.button9);
        btn8=(Button)findViewById(R.id.button8);
        btnC=(Button)findViewById(R.id.buttonClear);
        btnCe=(Button)findViewById(R.id.buttonBackspace);
        btnEquals=(Button)findViewById(R.id.buttonEquals);
        btnPerc=(Button)findViewById(R.id.buttonpercent);
        btnDiv=(Button)findViewById(R.id.buttonDivide);
        btnAdd=(Button)findViewById(R.id.buttonPlus);
        btnSubt=(Button)findViewById(R.id.buttonMinus);
        btnDot=(Button)findViewById(R.id.buttonDecimal);
        btnMult=(Button)findViewById(R.id.buttonTimes);
        btnSqr=(Button)findViewById(R.id.buttonSqrRoot);
        btnCrt=(Button)findViewById(R.id.buttonCubeRoot);
        btnExp=(Button)findViewById(R.id.buttonPow);
        btnstartPara=(Button)findViewById(R.id.buttonLeftParen);
        btnEndpara=(Button)findViewById(R.id.buttonRightParen);

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(solved==true || solvedWithouEqu==true){
                    txtAnswer.setText(""); solved=false;solvedWithouEqu=false;
                }
                txtAnswer.setText(txtAnswer.getText().toString() + "0");
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Checking()==true){txtAnswer.setText(""); solved=false;solvedWithouEqu=false;
                }
                txtAnswer.setText(txtAnswer.getText().toString() + "1");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Checking()==true){txtAnswer.setText(""); solved=false;solvedWithouEqu=false;}
                txtAnswer.setText(txtAnswer.getText().toString() +  "2");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Checking()==true){txtAnswer.setText(""); solved=false;solvedWithouEqu=false;}
                txtAnswer.setText(txtAnswer.getText().toString() +  "3");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Checking()==true){txtAnswer.setText(""); solved=false;solvedWithouEqu=false;}
                txtAnswer.setText(txtAnswer.getText().toString() +  "4");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Checking()==true){txtAnswer.setText(""); solved=false;solvedWithouEqu=false;}
                txtAnswer.setText(txtAnswer.getText().toString() + "5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Checking()==true){txtAnswer.setText(""); solved=false;solvedWithouEqu=false;}
                txtAnswer.setText(txtAnswer.getText().toString() + "6");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Checking()==true){txtAnswer.setText(""); solved=false;solvedWithouEqu=false;}
                txtAnswer.setText(txtAnswer.getText().toString() +  "7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Checking()==true){txtAnswer.setText(""); solved=false;solvedWithouEqu=false;}
                txtAnswer.setText(txtAnswer.getText().toString() +  "8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Checking()==true){txtAnswer.setText(""); solved=false;solvedWithouEqu=false;}
                txtAnswer.setText(txtAnswer.getText().toString() +  "9");
            }
        });
        btnDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Checking()==true){txtAnswer.setText(""); solved=false;solvedWithouEqu=false;}
                txtAnswer.setText(txtAnswer.getText().toString() +  ".");
            }
        });
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    //if (Val2==0.0){
                        txtAnswer.setText(txtAnswer.getText().toString()+"+"); Sign="+";Val2=Double.parseDouble("1");
                    //}
                    //else {
                      //  Val1=Val1 + Double.parseDouble(txtAnswer.getText().toString())  ;
                        //txtAnswer.setText(Val1.toString()); Sign="+";solvedWithouEqu=true;}
                }
                catch (Exception ex) {txtAnswer.setText("0");}
                finally {

                }
            }
        });
        btnSubt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    //if (Val2==0.0){
                    txtAnswer.setText(txtAnswer.getText()+"-"); Sign="-";Val2=Double.parseDouble("1");
                    //}
                    //else {
                      //  Val1=Val1 - Double.parseDouble(txtAnswer.getText().toString())  ;
                        //txtAnswer.setText(Val1.toString()); Sign="-";solvedWithouEqu=true;
                    //}
                }
                catch (Exception ex) {txtAnswer.setText("0");}
                finally {

                }

            }
        });
        btnstartPara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtAnswer.setText(txtAnswer.getText().toString()+"(");
                Sign="(";
            }
        });
        btnEndpara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtAnswer.setText(txtAnswer.getText().toString()+")");
                Sign=")";
            }
        });
        btnC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtAnswer.setText("");Val2=0.0; Val1=0.0;
            }
        });
        btnCe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    int i= txtAnswer.getText().length();
                    txtAnswer.setText(txtAnswer.getText().subSequence(0,i-1));
                    if (txtAnswer.getText()==null){Val1=0.0;}
                }
                catch (Exception ex) {txtAnswer.setText("");}
                finally {

                }


            }
        });
        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    //if (Val2==0.0){
                        txtAnswer.setText(txtAnswer.getText().toString()+"/"); Sign="/";Val2=Double.parseDouble("1");
                    //}
                    //else {
                    //    Val1=Val1 / Double.parseDouble(txtAnswer.getText().toString())  ;
                      //  txtAnswer.setText(Val1.toString()); Sign="/";solvedWithouEqu=true;
                    //}
                }
                catch (Exception ex) {txtAnswer.setText("0");}
                finally {

                }

            }
        });
        btnMult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    //if (Val2==0.0){
                        //Val1=Double.parseDouble(txtAnswer.getText().toString()) ;
                        txtAnswer.setText(txtAnswer.getText().toString()+"*"); Sign="*";Val2=Double.parseDouble("1");
                    //}
                    //else {
                      //  Val1=Val1 * Double.parseDouble(txtAnswer.getText().toString())  ;
                        //txtAnswer.setText(Val1.toString()); Sign="*";solvedWithouEqu=true;
                    //}
                }
                catch (Exception ex) {txtAnswer.setText("0");}
                finally {

                }

            }
        });
        btnExp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    if (Val2==0.0){
                        Val1=Double.parseDouble(txtAnswer.getText().toString()) ;
                        txtAnswer.setText(""); Sign="^";Val2=Double.parseDouble("1");
                    }
                    else {
                        Val1=Math.pow(Val1, Double.parseDouble(txtAnswer.getText().toString()))  ;
                        txtAnswer.setText(Val1.toString()); Sign="^";solvedWithouEqu=true;
                    }
                }
                catch (Exception ex) {txtAnswer.setText("0");}
                finally {

                }

            }
        });
        btnSqr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    //if (Val1==0.0){
                    Val1=Double.parseDouble(txtAnswer.getText().toString()) ;
                    Answer=Math.sqrt(Val1);
                    txtAnswer.setText(String.format(Answer.toString()));
                    //}
                    //else {
                      //  Val1=Math.sqrt(Val1.parseDouble(txtAnswer.getText().toString()))  ;
                        //txtAnswer.setText(Val1.toString()); Sign="sqrt";solvedWithouEqu=true;
                    //}
                }
                catch (Exception ex) {txtAnswer.setText("0");}
                finally {

                }

            }
        });
        btnCrt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    //if (Val1==0.0){
                    Val1=Double.parseDouble(txtAnswer.getText().toString()) ;
                    Answer=Math.cbrt(Val1);
                    txtAnswer.setText(String.format(Answer.toString()));
                    //}
                    //else {
                      //  Val1=Math.cbrt(Val1.parseDouble(txtAnswer.getText().toString()))  ;
                        //txtAnswer.setText(Val1.toString()); Sign="^";solvedWithouEqu=true;
                   // }
                }
                catch (Exception ex) {txtAnswer.setText("0");}
                finally {

                }

            }
        });
        btnPerc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    if (Val2==0.0){
                        Val1=Double.parseDouble(txtAnswer.getText().toString()) ;
                        txtAnswer.setText(""); Sign="%";Val2=Double.parseDouble("1");
                    }
                    else {
                        Val1 = Val1 * (Double.parseDouble(txtAnswer.getText().toString()) / 100);
                        txtAnswer.setText(Val1.toString());
                        Sign = "%";
                        solvedWithouEqu = true;
                    }
                }
                catch (Exception ex) {txtAnswer.setText("0");}
                finally {

                }

            }
        });

        btnEquals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    //Val2=Double.parseDouble(txtAnswer.getText().toString());
                    if (Sign=="%")
                       Answer=Val1 * (Val2/100);
                        else if (Sign=="^")Answer=Math.pow(Val1, Val2);
                        else Answer = EvaluateString.eval(txtAnswer.getText().toString());

                    txtAnswer.setText(String.format(Answer.toString()));
                    Val2=0.0; Val1=0.0; solved=true; Sign="";
                }
                catch (Exception ex) {txtAnswer.setText("Error");}
                finally {

                }

            }
        });

    }
}
