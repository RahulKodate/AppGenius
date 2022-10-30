/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.SOSRequest;

/**
 *
 * @author shrutikasalian
 */
public class SOSRequests {
    String RequestId;
    String AmbulanceId;
    String PatientName;
    String AmbulancePhoneNo;
    String PatientPhone;
    String PatientAddr;
    String AmbuBaseLocation;
    String ReqStatus;

    public String getReqStatus() {
        return ReqStatus;
    }

    public void setReqStatus(String ReqStatus) {
        this.ReqStatus = ReqStatus;
    }
    
   
    public String getRequestId() {
        return RequestId;
    }

    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }    

    public String getAmbulanceId() { 
        return AmbulanceId;
    }

    public void setAmbulanceId(String AmbulanceId) {
        this.AmbulanceId = AmbulanceId;
    }

    public String getPatientName() {
        return PatientName;
    }

    public void setPatientName(String PatientName) {
        this.PatientName = PatientName;
    }

    public String getAmbulancePhoneNo() {
        return AmbulancePhoneNo;
    }

    public void setAmbulancePhoneNo(String AmbulancePhoneNo) {
        this.AmbulancePhoneNo = AmbulancePhoneNo;
    }

    public String getPatientPhone() {
        return PatientPhone;
    }

    public void setPatientPhone(String PatientPhone) {
        this.PatientPhone = PatientPhone;
    }

    public String getPatientAddr() {
        return PatientAddr;
    }

    public void setPatientAddr(String PatientAddr) {
        this.PatientAddr = PatientAddr;
    }

    public String getAmbuBaseLocation() {
        return AmbuBaseLocation;
    }

    public void setAmbuBaseLocation(String AmbuBaseLocation) {
        this.AmbuBaseLocation = AmbuBaseLocation;
    }
    
}
