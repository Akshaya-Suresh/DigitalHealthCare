/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.ECGTest;

import java.util.ArrayList;

/**
 *
 * @author Niranjanii
 */
public class ecgTestDirectory {
    ArrayList<ecgTest> ecgList;
    
    public ecgTestDirectory()
    {
        ecgList = new ArrayList<ecgTest>();
    }

    public ArrayList<ecgTest> getEcgList() {
        return ecgList;
    }

    public void setEcgList(ArrayList<ecgTest> ecgList) {
        this.ecgList = ecgList;
    }
    public ecgTest addEcgTest()
    {
        ecgTest ecgTst = new ecgTest();
        ecgList.add(ecgTst);
        return ecgTst;
    }
    
}
