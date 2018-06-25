package com.example.karolblazejewski.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, badd, bsub, bmul, bdiv, bdot, bequal;
    TextView result;
    double var1, var2;
    boolean add, sub, mul, div, eql;

    public void clearText()
    {
        result.setText( "" );
    }

    @Override
    protected void onCreate( Bundle savedInstanceState )
    {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        b1 = ( Button ) findViewById( R.id.btn1 );
        b2 = ( Button ) findViewById( R.id.btn2 );
        b3 = ( Button ) findViewById( R.id.btn3 );
        b4 = ( Button ) findViewById( R.id.btn4 );
        b5 = ( Button ) findViewById( R.id.btn5 );
        b6 = ( Button ) findViewById( R.id.btn6 );
        b7 = ( Button ) findViewById( R.id.btn7 );
        b8 = ( Button ) findViewById( R.id.btn8 );
        b9 = ( Button ) findViewById( R.id.btn9 );
        b0 = ( Button ) findViewById( R.id.btn0 );
        badd = ( Button ) findViewById( R.id.btnadd );
        bsub = ( Button ) findViewById( R.id.btnsub );
        bmul = ( Button ) findViewById( R.id.btnmul );
        bdiv = ( Button ) findViewById( R.id.btndiv );
        bdot = ( Button ) findViewById( R.id.btndot );
        bequal = ( Button ) findViewById( R.id.btnequal );

        result = ( TextView ) findViewById( R.id.Result );

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if( result.equals( "" ) || ( result.getText().toString().contains( "." ) && eql == false  ) )
                {
                    result.setText( result.getText() + "1" );
                }
                else
                {
                    clearText();
                    result.setText( result.getText() + "1" );
                }
                eql = false;
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if( result.equals( "" ) || ( result.getText().toString().contains( "." ) && eql == false  ) )
                {
                    result.setText( result.getText() + "2" );
                }
                else
                {
                    clearText();
                    result.setText( result.getText() + "2" );
                }
                eql = false;
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if( result.equals( "" ) || ( result.getText().toString().contains( "." ) && eql == false  ) )
                {
                    result.setText( result.getText() + "3" );
                }
                else
                {
                    clearText();
                    result.setText( result.getText() + "3" );
                }
                eql = false;
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if( result.equals( "" ) || ( result.getText().toString().contains( "." ) && eql == false  ) )
                {
                    result.setText( result.getText() + "4" );
                }
                else
                {
                    clearText();
                    result.setText( result.getText() + "4" );
                }
                eql = false;
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if( result.equals( "" ) || ( result.getText().toString().contains( "." ) && eql == false  ) )
                {
                    result.setText( result.getText() + "5" );
                }
                else
                {
                    clearText();
                    result.setText( result.getText() + "5" );
                }
                eql = false;
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if( result.equals( "" ) || ( result.getText().toString().contains( "." ) && eql == false  ) )
                {
                    result.setText( result.getText() + "6" );
                }
                else
                {
                    clearText();
                    result.setText( result.getText() + "6" );
                }
                eql = false;
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if( result.equals( "" ) || ( result.getText().toString().contains( "." ) && eql == false  ) )
                {
                    result.setText( result.getText() + "7" );
                }
                else
                {
                    clearText();
                    result.setText( result.getText() + "7" );
                }
                eql = false;
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if( result.equals( "" ) || ( result.getText().toString().contains( "." ) && eql == false  ) )
                {
                    result.setText( result.getText() + "8" );
                }
                else
                {
                    clearText();
                    result.setText( result.getText() + "8" );
                }
                eql = false;
            }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if( result.equals( "" ) || ( result.getText().toString().contains( "." ) && eql == false  ) )
                {
                    result.setText( result.getText() + "9" );
                }
                else
                {
                    clearText();
                    result.setText( result.getText() + "9" );
                }
                eql = false;
            }
        });

        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if( result.equals( "" ) || ( result.getText().toString().contains( "." ) && eql == false  ) )
                {
                    result.setText( result.getText() + "0" );
                }
                else
                {
                    clearText();
                    result.setText( result.getText() + "0" );
                }
                eql = false;
            }
        });

        bdot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText( result.getText() + "." );
            }
        });

        badd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                var1 = Double.parseDouble( result.getText() + "" );
                add = true;
                result.setText( null );
            }
        });

        bsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                var1 = Double.parseDouble( result.getText() + "" );
                sub= true;
                result.setText( null );
            }
        });

        bmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                var1 = Double.parseDouble( result.getText() + "" );
                mul = true;
                result.setText( null );
            }
        });

        bdiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                var1 = Double.parseDouble( result.getText() + "" );
                div = true;
                result.setText( null );
            }
        });

        bequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                var2 = Double.parseDouble( result.getText() + "" );
                if( add == true )
                {
                    result.setText( var1 + var2 + "" );
                    add = false;
                }
                if( sub == true )
                {
                    result.setText( var1 - var2 + "" );
                    sub = false;
                }
                if( mul == true )
                {
                    result.setText( var1 * var2 + "" );
                    mul = false;
                }
                if( div == true )
                {
                    try
                    {
                        if( var2 == 0 )
                        {
                            throw new IllegalArgumentException("Argument 'divisor' is 0");
                        }
                        result.setText( var1 / var2 + "" );
                    }
                    catch( IllegalArgumentException e )
                    {
                        result.setText( "Division by 0" + "\n" + e.getMessage() );
                    }
                    div = false;
                }
                eql = true;
            }
        });
    }
}
