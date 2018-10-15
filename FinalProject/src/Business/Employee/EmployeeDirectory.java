/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

import Business.Address.Address;
import Business.Enterprise.Enterprise;
import java.util.ArrayList;

/**
 *
 * @author akshayasuresh
 */
public class EmployeeDirectory {
    
    private ArrayList<Employee> employeeList;

    public EmployeeDirectory() {
        employeeList = new ArrayList<>();
    }

    public ArrayList<Employee> getEmployeeList() {
        return employeeList;
    }
    
    public Employee createEmployee(String firstname,String lastname,String age,String phoneNum,Address address){
        Employee employee = new Employee();
        employee.setFirstName(firstname);
        employee.setLastName(lastname);
        employee.setAge(age);
        employee.setPhoneNumber(Long.parseLong(phoneNum));
        employee.setAddress(address);
        employeeList.add(employee);
        return employee;
    }
    public Enterprise createAndAddEnterPrise(String name, Enterprise.EnterpriseType type)
    {
        Enterprise enterprise = null;
      
        return enterprise;
    }
    
}
