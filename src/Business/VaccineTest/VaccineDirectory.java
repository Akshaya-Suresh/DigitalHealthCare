/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.VaccineTest;

import java.util.ArrayList;

/**
 *
 * @author Niranjanii
 */
public class VaccineDirectory {
    
    ArrayList<Vaccine>  vaccineList;
    
    public VaccineDirectory()
    {
        vaccineList = new ArrayList<Vaccine>();
    }

    public ArrayList<Vaccine> getVaccineList() {
        return vaccineList;
    }

    public void setVaccineList(ArrayList<Vaccine> vaccineList) {
        this.vaccineList = vaccineList;
    }

    public Vaccine addVaccine()
    {
        Vaccine vaccine = new Vaccine();
        vaccineList.add(vaccine);
        return vaccine;
    }
}
