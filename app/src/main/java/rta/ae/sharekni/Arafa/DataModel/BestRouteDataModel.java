package rta.ae.sharekni.Arafa.DataModel;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;

/**
 * Created by Fantom on 03/09/2015.
 */


public class BestRouteDataModel extends ArrayList<Parcelable> implements Parcelable {

    public String FromEm, FromReg, ToEm, ToReg,RouteName,StartFromTime,EndToTime_,driver_profile_dayWeek;
    public int FromEmId,ToEmId,FromRegid,ToRegId,Driver_ID;
    public int RoutePassengerId;
    public int Route_id;
    public  int Passenger_ID;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    int ID;

    public BestRouteDataModel(Parcel in) {
        FromEm = in.readString();
        FromReg = in.readString();
        ToReg = in.readString();
        ToEm = in.readString();
        FromEmId = in.readInt();
        FromRegid=in.readInt();
        ToEmId=in.readInt();
        ToRegId=in.readInt();
        RouteName=in.readString();
        StartFromTime=in.readString();
        EndToTime_=in.readString();
        driver_profile_dayWeek=in.readString();
        Driver_ID=in.readInt();
        RoutePassengerId = in.readInt();
        Route_id=in.readInt();
        Passenger_ID=in.readInt();
    }

    public BestRouteDataModel() {

    }

    public static final Creator<BestRouteDataModel> CREATOR = new Creator<BestRouteDataModel>() {
        @Override
        public BestRouteDataModel createFromParcel(Parcel in) {
            return new BestRouteDataModel(in);
        }

        @Override
        public BestRouteDataModel[] newArray(int size) {
            return new BestRouteDataModel[size];
        }
    };

    public void setRouteName(String routeName) {
        RouteName = routeName;
    }

    public String getRouteName() {
        return RouteName;
    }


    public void setEndToTime_(String endToTime_) {
        EndToTime_ = endToTime_;
    }

    public void setStartFromTime(String startFromTime) {
        StartFromTime = startFromTime;
    }

    public String getEndToTime_() {
        return EndToTime_;
    }

    public String getStartFromTime() {
        return StartFromTime;
    }

    public void setDriver_profile_dayWeek(String driver_profile_dayWeek) {
        this.driver_profile_dayWeek = driver_profile_dayWeek;
    }

    public String getDriver_profile_dayWeek() {
        return driver_profile_dayWeek;
    }

    public int getFromEmId() {
        return FromEmId;
    }

    public void setFromEmId(int fromEmId) {
        FromEmId = fromEmId;
    }

    public int getToEmId() {
        return ToEmId;
    }

    public void setToEmId(int toEmId) {
        ToEmId = toEmId;
    }

    public int getFromRegid() {
        return FromRegid;
    }

    public void setFromRegid(int fromRegid) {
        FromRegid = fromRegid;
    }

    public int getToRegId() {
        return ToRegId;
    }

    public void setToRegId(int toRegId) {
        ToRegId = toRegId;
    }

    public void setFromEm(String fromEm) {
        FromEm = fromEm;
    }

    public void setToEm(String toEm) {
        ToEm = toEm;
    }

    public void setFromReg(String fromReg) {
        FromReg = fromReg;
    }

    public void setToReg(String toReg) {
        ToReg = toReg;
    }

    public int getRoutePassengerId() {
        return RoutePassengerId;
    }

    public void setRoutePassengerId(int routePassengerId) {
        RoutePassengerId = routePassengerId;
    }

    public int getRoute_id() {
        return Route_id;
    }

    public int getPassenger_ID() {
        return Passenger_ID;
    }

    public void setPassenger_ID(int passenger_ID) {
        Passenger_ID = passenger_ID;
    }

    public void setRoute_id(int route_id) {
        Route_id = route_id;
    }

    public String getFromEm() {
        return FromEm;
    }

    public String getFromReg() {
        return FromReg;
    }

    public String getToEm() {
        return ToEm;
    }

    public String getToReg() {
        return ToReg;
    }

    public int getDriver_ID() {
        return Driver_ID;
    }

    public void setDriver_ID(int driver_ID) {
        Driver_ID = driver_ID;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(FromEm);
        parcel.writeString(ToEm);
        parcel.writeString(FromReg);
        parcel.writeString(ToReg);
        parcel.writeInt(FromEmId);
        parcel.writeInt(FromRegid);
        parcel.writeInt(ToEmId);
        parcel.writeInt(ToRegId);
        parcel.writeString(RouteName);
        parcel.writeString(StartFromTime);
        parcel.writeString(EndToTime_);
        parcel.writeString(driver_profile_dayWeek);
        parcel.writeInt(Driver_ID);
        parcel.writeInt(RoutePassengerId);
        parcel.writeInt(Route_id);
        parcel.writeInt(Passenger_ID);
    }
}
