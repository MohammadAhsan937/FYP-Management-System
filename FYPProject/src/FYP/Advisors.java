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
public class Advisors {

    private String name;
    private String fatherName;
    private String dateOfBirth;
    private String contactNumber;
    private String emailPassword;
    private String dateOfJoin;
    private String advisorID;
    private String emailID;
    private String qualification;
    private String status;

    // Advisor University Joining Year and becoming Advisor Year can be change.
    public Advisors() {
        name = "Ali";
        fatherName = "Ahmed";
        dateOfBirth = "25-March-2002";
        contactNumber = "03094768457";
        emailPassword = "Qwerty123?";
        dateOfJoin = "20-March-2015";
        advisorID = "2018-AD-101";
        emailID = "advisor@advisor.uet.edu.pk";
        qualification = "MS";
        status = "Main Advisor"; // Advisor can be Main Advisor, Co-Advisor, and Industry Advisor.
    }

    public Advisors(String myName, String father, String birthDate, String contact, String date, String ID, String email) {
        name = myName;
        fatherName = father;
        dateOfBirth = birthDate;
        contactNumber = contact;
        dateOfJoin = date;
        advisorID = ID;
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
    
    public String getDateOfJoin() {
        return dateOfJoin;
    }
    
    public String getAdvisorID() {
        return advisorID;
    }
    
    public String getEmailID() {
        return emailID;
    }
    
    public void setQualification(String qua) {
        qualification = qua;
    }
    
    public String getQualification() {
        return qualification;
    }
    
    public void setStatus(String sta) {
        status = sta;
    }
    
    public String getStatus() {
        return status;
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
    
    public boolean isValidAdvisorID(String ID) {
        boolean flag = true;
        String []id = ID.split("-");
        if(id.length == 3) {
            int year = 0;
            int num = 0;
            try {
                year = Integer.parseInt(id[0]);
                num = Integer.parseInt(id[2]);
                if(!((year >= 2002 && year <= 2020) && (id[1].equals("AD")) && (num >= 1 && num <= 120))) {
                    flag = false;
                }
            }
            catch (Exception ex) {
                flag = false;
                System.out.println("Invalid Advisor ID");
            }
        }
        else {
            flag = false;
        }
        return flag;
    } 
    
    public boolean isValidEmailID(String email) {
        boolean flag = true;
        String []id = email.split("@");
        if(id.length == 2) {
            if(id[1].equals("student.uet.edu.pk")) {
                for(int i=0; i<id[0].length(); i++) {
                    if(i != id[0].length()) {
                        if(!((id[0].charAt(i) >= 65 && id[0].charAt(i) <= 90) ||
                                (id[0].charAt(i) >= 97 && id[0].charAt(i) <= 122) ||
                                (id[0].charAt(i) >= 48 && id[0].charAt(i) <= 57))) {
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
        return flag;
    }
    
    public boolean isValidQualification(String qua) {
        boolean flag = false;
        if(qua.equals("BS") || qua.equals("MS") || qua.equals("MPhil")) {
            flag = true;
        }
        return flag;
    }
    
    public boolean isValidStatus(String sta) {
        boolean flag = false;
        if(sta.equals("Main Advisor") || sta.equals("Co Advisor") || sta.equals("Industry Advisor")) {
            flag = true;
        }
        return flag;
    }
}
