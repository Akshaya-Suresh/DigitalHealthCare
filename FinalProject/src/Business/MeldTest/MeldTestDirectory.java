/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.MeldTest;

import java.util.ArrayList;

/**
 *
 * @author Niranjanii
 */
public class MeldTestDirectory {
    
    ArrayList<MeldTest> meldList;
    
    public MeldTestDirectory()
    {
        meldList = new ArrayList<MeldTest>();
    }

    public ArrayList<MeldTest> getMeldList() {
        return meldList;
    }

    public void setMeldList(ArrayList<MeldTest> meldList) {
        this.meldList = meldList;
    }
    
    public MeldTest addMeldTest()
    {
       MeldTest meldtest = new MeldTest();
       meldList.add(meldtest);
       return meldtest;
    }
}
