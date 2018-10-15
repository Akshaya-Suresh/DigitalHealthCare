/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.ECGTest;

import java.util.Date;

/**
 *
 * @author Niranjanii
 */
public class ecgTest {
    
    String heartRateCal;
    String prInterval;
    String orsComplex;
    String otInterval;
    Date ecgTaken;
    String hospital;
    String doctor;

    public String getHospital() {
        return hospital;
    }

    public void setHospital(String hospital) {
        this.hospital = hospital;
    }

    public String getDoctor() {
        return doctor;
    }

    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }
    
    
    
    public Date getEcgTaken() {
        return ecgTaken;
    }

    public void setEcgTaken(Date ecgTaken) {
        this.ecgTaken = ecgTaken;
    }

    public String getHeartRateCal() {
        return heartRateCal;
    }

    public void setHeartRateCal(String heartRateCal) {
        this.heartRateCal = heartRateCal;
    }

    public String getPrInterval() {
        return prInterval;
    }

    public void setPrInterval(String prInterval) {
        this.prInterval = prInterval;
    }

    public String getOrsComplex() {
        return orsComplex;
    }

    public void setOrsComplex(String orsComplex) {
        this.orsComplex = orsComplex;
    }

    public String getOtInterval() {
        return otInterval;
    }

    public void setOtInterval(String otInterval) {
        this.otInterval = otInterval;
    }
    
    
}
