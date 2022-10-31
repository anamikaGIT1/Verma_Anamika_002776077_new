package model;

import java.util.UUID;

/**
 *
 * @author saket
 */
public class Patient {
    
    private int patientID;
    private String primaryDoctorName;
    private String prefferedPharmacy;
    private VitalSignsHistory vitalSignHistory;
    // private static int count = 0;
     
    public Patient() {
        this.vitalSignHistory = new VitalSignsHistory();
    }

    public Patient(int patientID, String primaryDoctorName, String prefferedPharmacy) {
        this.patientID =  patientID;
//           count++;
//        patientID = count;
        this.primaryDoctorName = primaryDoctorName;
        this.prefferedPharmacy = prefferedPharmacy;
       
    }
   

    public int getPatientID() {
        return patientID;
    }

    public void setPatientID(int patientID) {
        this.patientID = patientID;
    }
    
   
    
    public String getPrimaryDoctorName() {
        return primaryDoctorName;
    }
    
    public void setPrimaryDoctorName(String primaryDoctorName) {
        this.primaryDoctorName = primaryDoctorName;
    }
    
    public String getPrefferedPharmacy() {
        return prefferedPharmacy;
    }
    
    public void setPrefferedPharmacy(String prefferedPharmacy) {
        this.prefferedPharmacy = prefferedPharmacy;
    }
    
    public VitalSignsHistory getVitalSignHistory() {
        return vitalSignHistory;
    }
    
    public void setVitalSignHistory(VitalSignsHistory vitalSignHistory) {
        this.vitalSignHistory = vitalSignHistory;
    }
    
    @Override
    public String toString()
    {
        return String.valueOf(this.patientID);
    }
}
