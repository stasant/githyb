package com.myproject.calculator;

import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends Activity {

    EditText edv;
    Button bt1, bt2, bt3, bt4, bt5, bt6, bt7, bt8, bt9, bt0, btplu, btmin, btum, btdel, btres, btC, btdot;

    String a = null ;
    String b = null;
    String strI;
    String oper;
    float i ;
    float ii ;
    float iii ;
    int flag = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void onButtonClick(View view) {
        edv = (EditText) findViewById(R.id.edv);
        bt1 = (Button) findViewById(R.id.bt1);
        bt2 = (Button) findViewById(R.id.bt2);
        bt3 = (Button) findViewById(R.id.bt3);
        bt4 = (Button) findViewById(R.id.bt4);
        bt5 = (Button) findViewById(R.id.bt5);
        bt6 = (Button) findViewById(R.id.bt6);
        bt7 = (Button) findViewById(R.id.bt7);
        bt8 = (Button) findViewById(R.id.bt8);
        bt9 = (Button) findViewById(R.id.bt9);
        bt0 = (Button) findViewById(R.id.bt0);
        btplu = (Button) findViewById(R.id.btplu);
        btmin = (Button) findViewById(R.id.btmin);
        btum = (Button) findViewById(R.id.btum);
        btdel = (Button) findViewById(R.id.btdel);
        btres = (Button) findViewById(R.id.btres);
        btC = (Button) findViewById(R.id.btC);
        btdot = (Button) findViewById(R.id.btdot);



        switch (view.getId()) {

            case R.id.bt1:
                if (flag == 0)
                {edv.setText("1");
                flag =1;}
                else
                edv.append("1");
                break;

            case R.id.bt2:
                if (flag == 0)
                {edv.setText("2");
                    flag =1;}
                else
                    edv.append("2");
                break;

            case R.id.bt3:
                if (flag == 0)
                {edv.setText("3");
                    flag =1;}
                else
                    edv.append("3");
                break;

            case R.id.bt4:
                if (flag == 0)
                {edv.setText("4");
                    flag =1;}
                else
                    edv.append("4");
                break;

            case R.id.bt5:
                if (flag == 0)
                {edv.setText("5");
                    flag =1;}
                else
                    edv.append("5");
                break;

            case R.id.bt6:
                if (flag == 0)
                {edv.setText("6");
                    flag =1;}
                else
                    edv.append("6");
                break;

            case R.id.bt7:
                if (flag == 0)
                {edv.setText("7");
                    flag =1;}
                else
                    edv.append("7");
                break;

            case R.id.bt8:
                if (flag == 0)
                {edv.setText("8");
                    flag =1;}
                else
                    edv.append("8");
                break;

            case R.id.bt9:
                if (flag == 0)
                {edv.setText("9");
                    flag =1;}
                else
                    edv.append("9");
                break;

            case R.id.bt0:
                if (flag == 0)
                {edv.setText("0");
                    flag =1;}
                else
                    edv.append("0");
                break;

            case R.id.btdot:
                if (flag == 0)
                {edv.setText("0.");
                    flag =1;}
                else
                    edv.append(".");
                break;

            case R.id.btplu:

              
                if (a==null && b==null)
                    {a= edv.getText().toString();
                    i = Float.parseFloat(a) ;
                    flag=0;
                    oper = "+";}
                else
                    {b= edv.getText().toString();
                    ii = Float.parseFloat(b);
                    iii = i + ii;
                     strI = String.valueOf(iii);
                    edv.setText(strI);
                    strI = null;
              
                    a=null;
                    b=null;
                    flag=0;}
                    break;

            case R.id.btmin:

                if (a==null && b==null)
                {a= edv.getText().toString();
                    i = Float.parseFloat(a) ;
                    flag=0;
                    oper = "-";}
                else
                {b= edv.getText().toString();
                    ii = Float.parseFloat(b);
                    iii = i - ii;
                    strI = String.valueOf(iii);
                    edv.setText(strI);
                    strI = null;

                    a=null;
                    b=null;
                    flag=0;}

                break;


            case R.id.btdel:

                if (a==null && b==null)
                {a= edv.getText().toString();
                    i = Float.parseFloat(a) ;
                    flag=0;
                    oper = "/";}
                else
                {b= edv.getText().toString();
                    ii = Float.parseFloat(b);
                    iii = i / ii;
                    strI = String.valueOf(iii);
                    edv.setText(strI);
                    strI = null;

                    a=null;
                    b=null;
                    flag=0;}

                break;

            case R.id.btum:

                if (a==null && b==null)
                {a= edv.getText().toString();
                    i = Float.parseFloat(a) ;
                    flag=0;
                    oper = "*";}
                else
                {b= edv.getText().toString();
                    ii = Float.parseFloat(b);
                    iii = i * ii;
                    strI = String.valueOf(iii);
                    edv.setText(strI);
                    strI = null;

                    a=null;
                    b=null;
                    flag=0;}

                break;



            case R.id.btres:
                
                if (a==null && b==null)
                    break;
                else if (a!= null && b==null)

                {b= edv.getText().toString();
                    ii = Float.parseFloat(b);
                    if (oper == "+")
                     iii = i + ii;
                    else if (oper == "-")
                    iii = i - ii;
                    else if (oper == "/")
                        iii = i / ii;
                    else if (oper == "*")
                        iii = i * ii;
                    strI = String.valueOf(iii);
                    edv.setText(strI);
                    strI = null;
                    a=null;
                    b=null;
                    flag=0;}

                break;

            case R.id.btC:


                    edv.setText("");
                    strI = null;
                    a=null;
                    b=null;
                    flag=0;

                break;

        }

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
