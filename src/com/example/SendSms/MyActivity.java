package com.example.SendSms;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MyActivity extends Activity {
    EditText editText;
    EditText content;
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        editText=(EditText)findViewById(R.id.address);
        content=(EditText)findViewById(R.id.content);
        Button button=(Button)findViewById(R.id.send);
        button.setOnLongClickListener(new SendSmsListener(this,editText,content));
    }
}
