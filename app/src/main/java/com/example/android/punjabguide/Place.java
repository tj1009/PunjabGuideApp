package com.example.android.punjabguide;

/**
 * Created by TanyaJain on 11/12/2017.
 */

public class Place {
    private static final int NO_IMAGE = -1;

    private int mName;

    private int mAddress;

    private int mImageResourceId = NO_IMAGE;

    private int mdescription;

    public Place(int name, int address, int desc, int image) {
        mName = name;
        mAddress = address;
        mImageResourceId = image;
        mdescription = desc;
    }

    public Place(int name, int address, int desc) {
        mName = name;
        mAddress = address;
        mdescription = desc;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public int getAddress() {
        return mAddress;
    }

    public int getName() {
        return mName;
    }

    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE;
    }

    public int getDescription() {
        return mdescription;
    }
}
