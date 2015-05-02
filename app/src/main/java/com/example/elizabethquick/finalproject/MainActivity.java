package com.example.elizabethquick.finalproject;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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

    public void onFact1Pressed(View view){
        EditText user = (EditText)findViewById(R.id.usernum1);
        TextView finAns = (TextView)findViewById(R.id.answer);
        String num = user.getText().toString();
        int numToFact = Integer.parseInt(num);
        int ans;
        int i;
        int k = 1;
        if(numToFact == 0){
            ans = 1;
        }else if(numToFact == 1){
            ans = 1;
        }else{
            for(i = numToFact; i > 0; i--){
                k = k * i;
            }
            ans = k;
        }
        String answer = "" + ans;
        finAns.setText(answer);
    }

    public void onFact2Pressed(View view){
        EditText user = (EditText)findViewById(R.id.usernum2);
        TextView finAns = (TextView)findViewById(R.id.answer);
        String num = user.getText().toString();
        int numToFact = Integer.parseInt(num);
        int ans;
        int i;
        int k = 1;
        if(numToFact == 0){
            ans = 1;
        }else if(numToFact == 1){
            ans = 1;
        }else{
            for(i = numToFact; i > 0; i--){
                k = k * i;
            }
            ans = k;
        }
        String answer = "" + ans;
        finAns.setText(answer);
    }

    public void onAddPressed(View view){
        EditText user1 = (EditText)findViewById(R.id.usernum1);
        EditText user2 = (EditText)findViewById(R.id.usernum2);
        TextView finAns = (TextView)findViewById(R.id.answer);
        String num1 = user1.getText().toString();
        String num2 = user2.getText().toString();
        int numToAdd1 = Integer.parseInt(num1);
        int numToAdd2 = Integer.parseInt(num2);
        int ans = numToAdd1 + numToAdd2;
        String answer = "" + ans;
        finAns.setText(answer);
    }

    public void onSubPressed(View view){
        EditText user1 = (EditText)findViewById(R.id.usernum1);
        EditText user2 = (EditText)findViewById(R.id.usernum2);
        TextView finAns = (TextView)findViewById(R.id.answer);
        String num1 = user1.getText().toString();
        String num2 = user2.getText().toString();
        int numToSub1 = Integer.parseInt(num1);
        int numToSub2 = Integer.parseInt(num2);
        int ans = numToSub1 - numToSub2;
        String answer = "" + ans;
        finAns.setText(answer);
    }

    public void onMultPressed(View view){
        EditText user1 = (EditText)findViewById(R.id.usernum1);
        EditText user2 = (EditText)findViewById(R.id.usernum2);
        TextView finAns = (TextView)findViewById(R.id.answer);
        String num1 = user1.getText().toString();
        String num2 = user2.getText().toString();
        int numToMult1 = Integer.parseInt(num1);
        int numToMult2 = Integer.parseInt(num2);
        int ans = numToMult1 * numToMult2;
        String answer = "" + ans;
        finAns.setText(answer);
    }

    public void onDivPressed(View view){
        EditText user1 = (EditText)findViewById(R.id.usernum1);
        EditText user2 = (EditText)findViewById(R.id.usernum2);
        TextView finAns = (TextView)findViewById(R.id.answer);
        String num1 = user1.getText().toString();
        String num2 = user2.getText().toString();
        int numToDiv1 = Integer.parseInt(num1);
        int numToDiv2 = Integer.parseInt(num2);
        int ans = numToDiv1 / numToDiv2;
        String answer = "" + ans;
        finAns.setText(answer);
    }

    public void onFibPressed(View view){
        EditText user = (EditText)findViewById(R.id.usernum1);
        TextView finAns = (TextView) findViewById(R.id.answer);
        String num = user.getText().toString();
        int numToFib = Integer.parseInt(num);
        int ans = fibonacci(numToFib);
        String answer = "" + ans;
        finAns.setText(answer);
    }

    public int fibonacci(int x){
        if(x == 0){
            return 0;
        }else if(x == 1){
            return 1;
        }else{
            return fibonacci(x-1) + fibonacci(x-2);
        }
    }
}
