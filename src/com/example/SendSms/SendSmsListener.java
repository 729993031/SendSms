package com.example.SendSms;

import android.app.Activity;
import android.app.PendingIntent;
import android.app.WallpaperInfo;
import android.content.Intent;
import android.content.Loader;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by Administrator on 2016/4/12.
 */
public class SendSmsListener implements View.OnLongClickListener {
    private Activity activity;
    private EditText editText;
    private EditText content;
    public SendSmsListener(Activity activity,EditText editText,
                           EditText content)
    {
        this.activity=activity;
        this.editText=editText;
        this.content=content;

    }
    @Override
    public boolean onLongClick(View source)
    {
        String addressStr=editText.getText().toString();
        String contentStr=content.getText().toString();
        SmsManager smsManager=SmsManager.getDefault();
        PendingIntent sentIntent=PendingIntent.getBroadcast(activity,0,new Intent(),0);
        smsManager.sendTextMessage(addressStr,null,contentStr,sentIntent,null);
        Toast.makeText(activity,"短信发送完成",Toast.LENGTH_SHORT).show();
        return false;
    }
}
