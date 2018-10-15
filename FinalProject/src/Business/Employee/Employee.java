/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

import Business.MedicalId.MedicalRecord;
import Business.Person;
import Business.UserAccount.UserAccount;

/**
 *
 * @author akshayasuresh
 */
public class Employee extends Person {
    private int id;
    private static int count = 1;


    public Employee() {
        id = count;
        count++;
       
    }

    public int getId() {
        return id;
    }
        
}
