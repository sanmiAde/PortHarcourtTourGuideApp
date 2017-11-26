package com.bignerdranch.android.portharcourttourguideapp;

/**
 * Created by HP DV6 on 25/11/2017.
 */

/**
 * The location class represents actual spots in Port Harcourt would want to visit.
 */
public class Location {

    /**
     *  represents the name of the location
     */
    private String  mName;

    /**
     *  represents the location's phone number.
     */
    private int mPhoneNumber;

    /**
     *  represents the address of the location.
     */
    private String mAddress;

    /**
     * Simple detail explaining what the spot is all about.
     */
    private String mDetails;

    /**
     * Image resource ID.
     */
    private int mImageResourceID;


    /**
     *
     * @param name The name of the location.
     * @param phoneNumber The phone number of the location.
     * @param address The address of the location.
     * @param details Simple details about the location.
     * @param  imageResourceID The R.id representing the images of the location.
     */

    public Location(String name, int phoneNumber, String address, String details, int imageResourceID){

        mName = name;
        mPhoneNumber = phoneNumber;
        mAddress = address;
        mDetails = details;
        mImageResourceID = imageResourceID;
    }

    /**
     *
     * @return name of location
     */
    public String getName() {
        return mName;
    }

    /**
     *
     * @param name The name of the location.
     *
     */
    public void setName(String name) {
        mName = name;
    }

    /**
     *
     * @return phone number of location.
     */
    public int getPhoneNumber() {
        return mPhoneNumber;
    }

    /**
     *
     * @param phoneNumber The phone number of the location.
     */
    public void setPhoneNumber(int phoneNumber) {
        mPhoneNumber = phoneNumber;
    }

    /**
     *
     * @return address of location.
     */
    public String getAddress() {
        return mAddress;
    }

    /**
     *
     * @param address The address of the location.
     */
    public void setAddress(String address) {
        mAddress = address;
    }

    /**
     *
     * @return simple detail of the location.
     */
    public String getDetails() {
        return mDetails;
    }

    /**
     *
     * @param details Simple details about the location.
     */
    public void setDetails(String details) {
        mDetails = details;
    }

    /**
     *
     * @return the location of image.
     */
    public int getImageResourceID() {
        return mImageResourceID;
    }

    /**
     *
     * @param imageResourceID location of image of location in user's phone.
     */
    public void setImageResourceID(int imageResourceID) {
        mImageResourceID = imageResourceID;
    }
}
