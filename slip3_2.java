/* Define a class patient (patient_name, patient_age, patient_oxy_level,patient_HRCT_report).
Create an object of patient. Handle appropriate exception while patient oxygen level less than
95% and HRCT scan report greater than 10, then throw user defined Exception “Patient is Covid
Positive(+) and Need to Hospitalized” otherwise display its information. */

import java.util.*;

class COVIDException extends Exception {
    COVIDException(String p_name) {
        super(p_name + " has COVID and needs to be admitted.");
    }
}

class Patient {
    String p_name;
    int p_age, p_oxy, p_HRTC_report;

    Patient(String p_name, int p_age, int p_oxy, int p_HRTC_report) {
        this.p_HRTC_report = p_HRTC_report;
        this.p_age = p_age;
        this.p_name = p_name;
        this.p_oxy = p_oxy;
    }

    void checkCovid() throws COVIDException {
        if (p_oxy < 95 && p_HRTC_report > 10)
            throw new COVIDException(p_name + " has covid and must be admitted!\n");
    }
}

public class slip3_2 {

    public static void main(String[] args) {
        // int n;
        String p_name;
        int p_age, p_oxy, p_HRTC_report;
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter how many patients you want to check");
        // n = sc.nextInt();
        // for (int i = 0; i < n; i++) {
        p_name = sc.next();
        p_age = sc.nextInt();
        p_oxy = sc.nextInt();
        p_HRTC_report = sc.nextInt();
        Patient p = new Patient(p_name, p_age, p_oxy, p_HRTC_report);
        try {
            p.checkCovid();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        // }
        sc.close();
    }
}
