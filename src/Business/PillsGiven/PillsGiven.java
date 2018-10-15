/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.PillsGiven;

/**
 *
 * @author Niranjanii
 */
public class PillsGiven {
    
    String nameOfMedication;
    String frequency;
    String conditionMedicationTaken;
    String physician;
    String notes;
    String strength;

    public String getStrength() {
        return strength;
    }

    public void setStrength(String strength) {
        this.strength = strength;
    }
    
    

    public String getNameOfMedication() {
        return nameOfMedication;
    }

    public void setNameOfMedication(String nameOfMedication) {
        this.nameOfMedication = nameOfMedication;
    }

    public String getFrequency() {
        return frequency;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    public String getConditionMedicationTaken() {
        return conditionMedicationTaken;
    }

    public void setConditionMedicationTaken(String conditionMedicationTaken) {
        this.conditionMedicationTaken = conditionMedicationTaken;
    }


    public String getPhysician() {
        return physician;
    }

    public void setPhysician(String physician) {
        this.physician = physician;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
    
    
    
}
