package com.marrog.messenger;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.lang.annotation.Target;

public class CreateMessageActivity extends AppCompatActivity {


    EditText send;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_message);

        send = (EditText)findViewById(R.id.message);
    }

    public void onSendMessage(View view) {

        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT, "Текст сообщения");



//        Intent intent = new Intent(this, ReceiveMessageActivity.class);
//        intent.putExtra(ReceiveMessageActivity.EXTRA_MESSAGE, String.valueOf(send.getText()));

//        //send via telegramm
//        final String appName = "org.telegram.messenger";
//            Intent myIntent = new Intent(Intent.ACTION_SEND);
//            myIntent.setType("text/plain");
//            myIntent.setPackage(appName);
//            myIntent.putExtra(Intent.EXTRA_TEXT, String.valueOf(send.getText()));//
//           startActivity(Intent.createChooser(myIntent, "Share with"));

        startActivity(intent);

    }
}
