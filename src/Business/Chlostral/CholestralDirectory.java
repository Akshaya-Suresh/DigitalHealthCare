/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Chlostral;

import java.util.ArrayList;

/**
 *
 * @author Niranjanii
 */
public class CholestralDirectory {
    ArrayList<Cholestral> cholestralList;
    
    public CholestralDirectory()
    {
        cholestralList = new ArrayList<Cholestral>();
    }

    public ArrayList<Cholestral> getCholestralList() {
        return cholestralList;
    }

    public void setCholestralList(ArrayList<Cholestral> cholestralList) {
        this.cholestralList = cholestralList;
    }
    
    public Cholestral addCholestral()
    {
        Cholestral cholestral = new Cholestral();
        cholestralList.add(cholestral);
        return cholestral;
                
        
    }
}
