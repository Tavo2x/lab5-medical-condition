public class StrepThroat extends MedicalCondition {
    StrepThroat(String name, String date){
        super(name,date);
    }
    @Override
    public String getTreatment(){
        return "Amoxycillin twice a day for two weeks";
    }
}
