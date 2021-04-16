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
public class Students{

    private String name;
    private String fatherName;
    private String dateOfBirth;
    private String contactNumber;
    private String emailPassword;
    private String studentID;
    private String semester;
    private String session;
    private String section;
    private String emailID;
    private String degree;

    public Students() {
        name = "Ali";
        fatherName = "Ahmed";
        dateOfBirth = "25-March-2002";
        contactNumber = "03094768457";
        emailPassword = "Qwerty123?";
        studentID = "2020-CS-125";
        semester = "2";
        session = "2020";
        section = "C";
        emailID = "2020-CS-125@student.uet.edu.pk";
        degree = "BS";
    }

    public Students(String myName, String father, String birthDate, String contact, String stuID, String sess,
            String email) {
        name = myName;
        fatherName = father;
        dateOfBirth = birthDate;
        contactNumber = contact;
        studentID = stuID;
        session = sess;
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

    public String getStudentID() {
        return studentID;
    }

    public void setSemester(String sem) {
        semester = sem;
    }

    public String getSemester() {
        return semester;
    }

    public String getSession() {
        return session;
    }

    public void setSection(String sec) {
        section = sec;
    }

    public String getSection() {
        return section;
    }

    public String getEmailID() {
        return emailID;
    }

    public void setDegree(String deg) {
        degree = deg;
    }

    public String getDegree() {
        return degree;
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

    public boolean isValidStudentID(String ID, String sess) {
        boolean flag = true;
        int size = ID.length();
        if (size >= 9 && size <= 11) {
            String[] id = ID.split("-");
            if (id.length == 3) {
                int num = 0;
                try {
                    num = Integer.parseInt(id[2]);
                    if (!(id[0].equals(sess) && id[1].equals("CS") && (num >= 1 && num <= 160))) {
                        flag = false;
                    }
                } catch (Exception ex) {
                    System.out.print("Invalid Year");
                    flag = false;
                }

            } else {
                flag = false;
            }
        } else {
            flag = false;
        }
        return flag;
    }

    public boolean isValidSemester(String sem) {
        boolean flag = true;
        int s = 0;
        try {
            s = Integer.parseInt(sem);
        } catch (Exception ex) {
            System.out.println("Invalid Semester");
            flag = false;
        }
        return flag;
    }

    public boolean isValidSession(String sess) {
        boolean flag = true;
        int ses = 0;
        try {
            ses = Integer.parseInt(sess);
            if(!(ses >= 2015 && ses <= 2021)) {
                flag = false;
            }
        } catch (Exception ex) {
            flag = false;
            System.out.println("Invalid Session");
        }
        return flag;
    }

    public boolean isValidSection(String sec) {
        boolean flag = true;
        if (!(sec.equals("A") || sec.equals("B") || sec.equals("C"))) {
            flag = false;
        }
        return flag;
    }

    public boolean isValidEmailID(String email, String stuID) {
        boolean flag = true;
        int size = email.length();
        String[] emId = email.split("@");
        if (emId.length == 2) {
            if (!(emId[0].equals(stuID) && emId[1].equals("student.uet.edu.pk"))) {
                flag = false;
            }
        }
        return flag;
    }

    public boolean isValidDegree(String deg) {
        boolean flag = false;
        if (deg.equals("BS")) {
            flag = true;
        }
        return flag;
    }
}
