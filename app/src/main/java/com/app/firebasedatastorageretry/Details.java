package com.app.firebasedatastorageretry;

import android.widget.Button;

/**
 * Created by Android on 19-Dec-16.
 */

public class Details {

    private String mName,mMailId,mAddress;
    private String mPhoneNo;
    private Button mSubmit;


    public Button getmSubmit() {
        return mSubmit;
    }

    public void setmSubmit(Button mSubmit) {
        this.mSubmit = mSubmit;
    }



    public String getmPhoneNo() {
        return mPhoneNo;
    }

    public void setmPhoneNo(String mPhoneNo) {
        this.mPhoneNo = mPhoneNo;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getmMailId() {
        return mMailId;
    }

    public void setmMailId(String mMailId) {
        this.mMailId = mMailId;
    }

    public String getmAddress() {
        return mAddress;
    }

    public void setmAddress(String mAddress) {
        this.mAddress = mAddress;
    }


}
