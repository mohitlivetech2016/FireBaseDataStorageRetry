package com.app.firebasedatastorageretry;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.FirebaseDatabase;

import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {

    private EditText mEtName,mEtAddress,mEtMailId,mEtPhoneNo;
    private Button mBtnSubmit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mEtName = (EditText)findViewById(R.id.idEtName);
        mEtPhoneNo=(EditText)findViewById(R.id.idEtPhoneNo);
        mEtMailId=(EditText)findViewById(R.id.idEtMailId);
        mEtAddress=(EditText)findViewById(R.id.idEtAddress);
        mBtnSubmit=(Button)findViewById(R.id.idBtnSubmit);


        mBtnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String name,mailId,address,phoneNo;
                name=mEtName.getText().toString();
                mailId=mEtMailId.getText().toString();
                address=mEtAddress.getText().toString();
                phoneNo=mEtPhoneNo.getText().toString();
                Async obj=new Async();
                //new Async().execute(name);
                obj.execute(name,phoneNo,mailId,address);
             }
        });

    }
}
