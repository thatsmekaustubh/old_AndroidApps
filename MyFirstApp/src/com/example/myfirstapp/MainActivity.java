package com.example.myfirstapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {

	public final static String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
    
    /** Called when the user clicks the Send button */
    public void sendMessage(View view) {
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText editText = (EditText) findViewById(R.id.a1);
        EditText editText1 = (EditText) findViewById(R.id.a2);
        String message = editText.getText().toString();
        String message1 = editText1.getText().toString();
        int add =Integer.parseInt(message)+Integer.parseInt(message1);
        
        message.concat("+");
        message.concat(message1);
        message.concat("=");
        message.concat(Integer.toString(add));
        intent.putExtra(EXTRA_MESSAGE,Integer.toString(add));
        startActivity(intent);
    }
}
