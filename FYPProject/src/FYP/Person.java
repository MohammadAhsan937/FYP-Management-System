/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FYP;

/**
 *
 * @author pc
 */
public class Person {

    public String name = "";
    public String fatherName = "";
    public String dateOfBirth = "";
    public String contactNumber = "";
    public String emailPassword = "";

    // It will be used for both name and fatherName.
    public boolean isValidName(String myName) {
        boolean flag = true;
        int size = myName.length();
        if (size >= 3 && size <= 30) {
            for (int i = 0; i < size; i++) {
                if (i != size) {
                    if (!((myName.charAt(i) >= 65 && myName.charAt(i) <= 90)
                            || ((myName.charAt(i)) >= 97 && myName.charAt(i) <= 122) || myName.charAt(i) == 32)) {
                        flag = false;
                    }
                }
            }
        } else {
            flag = false;
        }
        return flag;
    }

    public boolean isValidContactNum(String conNum) {
        boolean flag = true;
        int size = conNum.length();
        if (size == 12) {
            if(conNum.charAt(0) == '0' && conNum.charAt(1) == '1' && conNum.charAt(4) == '-') {
                if((conNum.charAt(2) >= 48 && conNum.charAt(2) <= 57) &&
                    (conNum.charAt(3) >= 48 && conNum.charAt(3) <= 57)) {
                    for(int i=5; i<size; i++) {
                        if(i != size) {
                            if(!(conNum.charAt(i) >= 48 && conNum.charAt(i) <= 57)) {
                                flag = false;
                            }
                        }
                    }
                }
                else {
                    flag = false;
                }
            }
            else {
                flag = false;
            }
        }
        else {
            flag = false;
        }
        return flag;
    }
    
    public boolean isValidEmailPassword(String password) {
        boolean flag = true;
        int size = password.length();
        if(size >= 10 && size <= 50) {
            for(int i=0; i<size; i++) {
                if(i != size) {
                    if(!((password.charAt(i) >= 65 && password.charAt(i) <= 90) ||
                        (password.charAt(i) >= 97 && password.charAt(i) <= 122) || (password.charAt(i) == 32) || 
                        (!((password.charAt(i) >= 65 && password.charAt(i) <= 90)
                         || (password.charAt(i) >= 97 && password.charAt(i) <= 122) || (password.charAt(i) == 32))))) {
                        flag = false;
                    }
                } 
            }
        }
        else {
            flag = false;
        }
        return flag;
    }
}
