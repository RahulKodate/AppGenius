package model;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author rahulkodate
 */
public class VitalSigns {

    private double weight; // lbs
    private double height; // cm
    private double temperature; // Celsius
    private double bloodPressure; // mmHG
    private double heartRate; // bpm
    private double oxygenSaturation; // spO2 in %
    private Date time;
    private Doctor doctorName;

    public Doctor getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(Doctor doctorName) {
        this.doctorName = doctorName;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public double getBloodPressure() {
        return bloodPressure;
    }

    public void setBloodPressure(double bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public double getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(double heartRate) {
        this.heartRate = heartRate;
    }

    public double getOxygenSaturation() {
        return oxygenSaturation;
    }

    public void setOxygenSaturation(double oxygenSaturation) {
        this.oxygenSaturation = oxygenSaturation;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    @Override
    public String toString() {
        SimpleDateFormat sdft = new SimpleDateFormat("MM/dd/yyyy 'at' hh:mm:ss a");
        return sdft.format(time);
    }

}
