package com.app.firebasedatastorageretry;

import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.widget.EditText;
import android.widget.ProgressBar;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.gson.Gson;

/**
 * Created by Android on 19-Dec-16.
 */

public class Async extends AsyncTask< String, Void , Void>{


    private ProgressBar progressBar;

    @Override
    protected Void doInBackground(String... params) {


        Gson gson=new Gson();

        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference("fir-datastorageretry");
        System.out.print(params[0]+"..............................................................."+params[3]);
        //myRef.setValue("Hello, World!");
        Details obj=new Details();
        obj.setmName(params[0]);
        obj.setmPhoneNo(params[1]);
        obj.setmMailId(params[2]);
        obj.setmAddress(params[3]);
        System.out.print(obj);
        String data=gson.toJson(obj);
        System.out.print(data);

        myRef.setValue(gson);

        return null;
    }



    @Override
    protected void onPreExecute() {

        progressBar.setVisibility(ProgressBar.VISIBLE);

    }

    @Override
    protected void onPostExecute(Void aVoid) {

        progressBar.setVisibility(ProgressBar.INVISIBLE);
    }

}
