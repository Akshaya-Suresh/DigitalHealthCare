/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.GFRTest;

import java.util.ArrayList;

/**
 *
 * @author Niranjanii
 */
public class gfrTestDirectory {
  ArrayList<gfrTest> gfrTestList;
  
  public gfrTestDirectory()
  {
      gfrTestList = new ArrayList<gfrTest>();
  }

    public ArrayList<gfrTest> getGfrTestList() {
        return gfrTestList;
    }

    public void setGfrTestList(ArrayList<gfrTest> gfrTestList) {
        this.gfrTestList = gfrTestList;
    }
  
    public gfrTest addgfrTest()
    {
        gfrTest gfrtst = new gfrTest();
        gfrTestList.add(gfrtst);
        return gfrtst;
        
    }
  
  
}
