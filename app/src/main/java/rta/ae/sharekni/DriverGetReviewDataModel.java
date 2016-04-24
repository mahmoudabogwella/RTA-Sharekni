package rta.ae.sharekni;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;

/**
 * Created by Nezar Saleh on 10/8/2015.
 */
public class DriverGetReviewDataModel extends ArrayList<Parcelable> implements  Parcelable {


    public String Review,AccountName,AccountNationalityEn;
    public int AccountID;
    public int DriverID;
    public int Route_ID;

    public int getRoute_ID() {
        return Route_ID;
    }

    public void setRoute_ID(int route_ID) {
        Route_ID = route_ID;
    }

    public Bitmap getPhoto() {
        return Photo;
    }

    public void setPhoto(Bitmap photo) {
        Photo = photo;
    }

    public Bitmap Photo;

    public int getReviewID() {
        return ReviewID;
    }

    public void setReviewID(int reviewID) {
        ReviewID = reviewID;
    }

    public int ReviewID;

    public int getDriverID() {
        return DriverID;
    }

    public void setDriverID(int driverID) {
        DriverID = driverID;
    }




    public DriverGetReviewDataModel(Parcel in) {
        Review = in.readString();
        AccountName = in.readString();
        AccountID = in.readInt();
        AccountNationalityEn=in.readString();
        DriverID=in.readInt();
        Route_ID=in.readInt();
    }

    public static final Creator<DriverGetReviewDataModel> CREATOR = new Creator<DriverGetReviewDataModel>() {
        @Override
        public DriverGetReviewDataModel createFromParcel(Parcel in) {
            return new DriverGetReviewDataModel(in);
        }

        @Override
        public DriverGetReviewDataModel[] newArray(int size) {
            return new DriverGetReviewDataModel[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }


    public void setAccountNationalityEn(String accountNationalityEn) {
        AccountNationalityEn = accountNationalityEn;
    }

    public String getAccountNationalityEn() {
        return AccountNationalityEn;
    }

    public String getReview() {
        return Review;
    }

    public void setReview(String review) {
        Review = review;
    }

    public String getAccountName() {
        return AccountName;
    }

    public void setAccountName(String accountName) {
        AccountName = accountName;
    }

    public int getAccountID() {
        return AccountID;
    }

    public void setAccountID(int accountID) {
        AccountID = accountID;
    }




    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(Review);
        dest.writeString(AccountName);
        dest.writeInt(AccountID);
        dest.writeString(AccountNationalityEn);
        dest.writeInt(DriverID);
        dest.writeInt(Route_ID);
    }
}
