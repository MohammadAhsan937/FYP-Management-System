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
import java.util.*;
public class Administrators {
    private String name;
    private String fatherName;
    private String dateOfBirth;
    private String contactNumber;
    private String emailPassword;
    private String dateOfJoining;
    private String adminID;
    private String qualification;
    private String emailID;
    private List<Students> students = new ArrayList<>();
    private List<Advisors> advisors = new ArrayList<>();
    private List<Projects> projects = new ArrayList<>();
    
    // Admin Year of Joining University and Admin Year of becoming an administrator can be change.
    public Administrators() {
        name = "Ali";
        fatherName = "Ahmed";
        dateOfBirth = "25-March-2002";
        contactNumber = "03094768457";
        emailPassword = "Qwerty123?";
        dateOfJoining = "20-March-2002";
        adminID = "2020-AM-101";
        qualification = "MS";
        emailID = "admin@administrator.uet.edu.pk";
    }
    
    public Administrators(String myName, String father, String birthDate, String contact, String joiningDate, String admID,
            String email) {
        name = myName;
        fatherName = father;
        dateOfBirth = birthDate;
        contactNumber = contact;
        dateOfJoining = joiningDate;
        adminID = admID;
        emailID = email;
    }
    
    public String getName() {
        return name;
    }
    
    public String getFatherName() {
        return fatherName;
    }
    
    public String getDateofBirth() {
        return dateOfBirth;
    }
    
    public String getContactNumber() {
        return contactNumber;
    }
    
    public void setEmailPassword(String pass) {
        emailPassword = pass;
    }
    
    public String getEmailPassword() {
        return emailPassword;
    }
    
    public String getDateOfJoining() {
        return dateOfJoining;
    }
    
    public String getAdminID() {
        return adminID;
    }
    
    public void setQualfication(String qua) {
        qualification = qua;
    }
    
    public String getQualification() {
        return qualification;
    }
    
    public String getEmailID() {
        return emailID;
    }
    
    public List<Students> getStudents() {
        return students;
    }
    
    public List<Advisors> getAdvisors() {
        return advisors;
    }
    
    public List<Projects> getProjects() {
        return projects;
    }
    
    
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
    
    public boolean isValidAdminID(String ID) {
        boolean flag = true;
        int size = ID.length();
        if(size >= 9 && size <= 11) {
            String []admin = ID.split("-");
            if(admin.length == 3) {
                int year = Integer.parseInt(admin[0]);
                int num = Integer.parseInt(admin[2]);
                if(!((year >= 2010 && year <= 2020) && (admin[1].equals("AM")) && (num >= 1 && num <= 100))) {
                    flag =  false;
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
 
    public boolean isValidQualification(String qua) {
        boolean flag = false;
        if(qua.equals("BS") || qua.equals("MS") || qua.equals("MPhil") || qua.equals("PHD")) {
            flag = true;
        }
        return flag;
    }
    
    public boolean isValidEmailID(String ID) {
        boolean flag = true;
        int size = ID.length();
        if(size >= 30 && size <= 70) {
            String []email = ID.split("@");
            if(email.length == 2) {
                if(email[1].equals("administrator.uet.edu.pk")) {
                    for(int i=0; i<email[0].length(); i++) {
                        if(i != email[0].length()) {
                            if(!((email[0].charAt(i) >= 65 && email[0].charAt(i) <= 90) ||
                                    (email[0].charAt(i) >= 97 && email[0].charAt(i) <= 122) || 
                                    (email[0].charAt(i) >= 48 && email[0].charAt(i) <= 57))) {
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
}
