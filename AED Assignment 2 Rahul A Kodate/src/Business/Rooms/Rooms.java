/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Rooms;

import Business.Hospital.Hospital;

/**
 *
 * @author shrutikasalian
 */
public class Rooms {
    private String RoomType;
    private int RoomQuantity;
    private String RoomStatus;

    public String getRoomStatus() {
        return RoomStatus;
    }

    public void setRoomStatus(String RoomStatus) {
        this.RoomStatus = RoomStatus;
    }
    private Hospital Hospital;
    
    
    public Hospital getHospital() {
        return Hospital;
    }

    public void setHospital(Hospital hospital) {
        this.Hospital = hospital;
    }

    public String getRoomType() {
        return RoomType;
    }

    public void setRoomType(String roomType) {
        this.RoomType = roomType;
    }

    public Integer getRoomQuantity() {
        return RoomQuantity;
    }

    public void setRoomQuantity(Integer roomQuantity) {
        this.RoomQuantity = roomQuantity;
    }
    
    private int SerialNo;
    private static int count = 0;
    public int getSerialNo() {
        return SerialNo;    
    }
    public void setSerialNo(int SerialNo) {
        this.SerialNo = SerialNo;
    }
    public Rooms(){
        count++;
        SerialNo = count;    
    }
    @Override
    public String toString() {
        return this.RoomType;
    }
   
    
}
