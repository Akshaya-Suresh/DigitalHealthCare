/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Niranjanii
 */
public class Validation {
    
     public boolean checkNullAndAssign(String objectValue,String textFieldValue)
    {
        if(textFieldValue.equals("") || textFieldValue.equals("N/A") )
        {
            return true;
        }
        else
        {
            return objectValue.equalsIgnoreCase(textFieldValue);
        }
    }
     
     
      public static boolean validateFieldText(JTextField textField,JLabel label) {
       
         String name = textField.getText();
        Pattern pt1 = Pattern.compile("^[a-zA-Z]+([\\s][a-zA-Z]+)*$");
            Matcher mh1 = pt1.matcher(name);
            boolean matchFound = mh1.matches();
            if (!matchFound) {
                
                textField.setText("");
                label.setText("* Character only *");
                textField.requestFocus();
            }
            return matchFound;
         
    }
      
       public static boolean validateFieldNum(JTextField textField,JLabel label) {
       
         String name = textField.getText();
        Pattern pt1 = Pattern.compile("^[0-9]*$");
            Matcher mh1 = pt1.matcher(name);
            boolean matchFound = mh1.matches();
            if (!matchFound) {
               
                textField.setText("");
                label.setText("* Number only *");
               // textField.requestFocus();
            }
            return matchFound;
         
    }
       
 
  
    
     public static String dateToStringConveter(Date formatDate)
    {
       if(formatDate!= null)
       {   
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        return sf.format(formatDate);
       }
       else
       {
           return "";
       }
    }
     
    public static boolean  nullPointerException(JTextField textField)
    {
        if(textField.getText().equals(null) ||textField.getText().equals( ""))
        {
            return true;
        }
        else 
        {
            return false;
        }
        
    }
}
