/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.BloodTest;

import java.util.ArrayList;

/**
 *
 * @author Niranjanii
 */
public class BloodTestDirectory {
    ArrayList<BloodTest> bloodTestList;
    
    public BloodTestDirectory()
    {
        bloodTestList = new ArrayList<BloodTest>();
        
    }

    public ArrayList<BloodTest> getBloodTestList() {
        return bloodTestList;
    }

    public void setBloodTestList(ArrayList<BloodTest> bloodTestList) {
        this.bloodTestList = bloodTestList;
    }
    
    public BloodTest addBloodTest()
    {
        BloodTest bloodTest = new BloodTest();
        bloodTestList.add(bloodTest);
        return bloodTest;
    }
    
}
