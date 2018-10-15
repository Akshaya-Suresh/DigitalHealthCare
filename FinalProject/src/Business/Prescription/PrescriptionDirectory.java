/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Prescription;

import Business.PillsGiven.PillsGiven;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Niranjanii
 */
public class PrescriptionDirectory {
    
    Date prescriptionGiven;
    ArrayList<Prescription> prescriptionList;
    
    public PrescriptionDirectory()
    {
        prescriptionList = new ArrayList<Prescription>();
    }

 
    public ArrayList<Prescription> getPrescriptionList() {
        return prescriptionList;
    }

    public void setPrescriptionList(ArrayList<Prescription> prescriptionList) {
        this.prescriptionList = prescriptionList;
    }

   

    public Date getPrescriptionGiven() {
        return prescriptionGiven;
    }

    public void setPrescriptionGiven(Date prescriptionGiven) {
        this.prescriptionGiven = prescriptionGiven;
    }
    
    public Prescription addPrescription()
    {
        Prescription pres = new Prescription();
        prescriptionList.add(pres);
        return pres;
    }
    
}
