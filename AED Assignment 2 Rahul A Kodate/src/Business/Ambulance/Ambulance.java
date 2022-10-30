/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Ambulance;

import Business.SOSRequest.SOSRequests;
import java.util.ArrayList;

/**
 *
 * @author shrutikasalian
 */
public class Ambulance {
    
    private String ambulanceId;
    private String driverName;
    private String username;
    private String password;
    private String phoneNo;
    private String licenseNo;
    private String baseLocation;
    private String ReqStatus;
    private ArrayList<SOSRequests> Sosreq;

    public ArrayList<SOSRequests> getSosreq() {
        return Sosreq;
    }

    public void setSosreq(ArrayList<SOSRequests> sosreq) {
        this.Sosreq = sosreq;
    }
    public Ambulance(){
        Sosreq =new ArrayList<SOSRequests>();
    }

    public String getReqStatus() {
        return ReqStatus;
    }

    public void setReqStatus(String ReqStatus) {
        this.ReqStatus = ReqStatus;
    }
   

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLicenseNo() {
        return licenseNo;
    }

    public void setLicenseNo(String licenseNo) {
        this.licenseNo = licenseNo;
    }

    public String getAmbulanceId() {
        return ambulanceId;
    }

    public void setAmbulanceId(String ambulanceId) {
        this.ambulanceId = ambulanceId;
    }

    public String getDriverName() {
        return driverName;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getBaseLocation() {
        return baseLocation;
    }

    public void setBaseLocation(String baseLocation) {
        this.baseLocation = baseLocation;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }
     int id = 1;
      public void addSOSReq(String AmbulanceId, String BaseLocation, String PhoneNo , String PatientName,String PatientAddr, String PatientPhone ) {
        
        SOSRequests request=new SOSRequests();
        request.setAmbulanceId(AmbulanceId);
        request.setAmbulancePhoneNo(PhoneNo);
        request.setAmbuBaseLocation(BaseLocation);
        request.setPatientName(PatientName);
        request.setPatientPhone(PatientPhone);
        request.setPatientAddr(PatientAddr);
        request.setReqStatus("New Request");
        request.setRequestId("Req"+(Sosreq.size()+1));
        Sosreq.add(request);

        id++;
    }
    
    @Override()
    public String toString() {
        return this.ambulanceId;
    }
    
}
