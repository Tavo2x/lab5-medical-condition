public abstract class MedicalCondition {
    
    private String patientName;
    private String diagnosisdate;

    public MedicalCondition(String name, String date){
        setName(name);
        setDate(date);
    }
    public void setName(String N){
        patientName = N;
    }   
           
    public String getName(){
        return patientName;
    }

    public void setDate(String D){
        diagnosisdate = D;
    }
    
    public String getDate(){
        return diagnosisdate;
    }   

    public abstract String getTreatment();
}
