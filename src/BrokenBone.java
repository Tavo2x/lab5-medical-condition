public class BrokenBone extends MedicalCondition  {
    public BrokenBone(String name, String date){
        super(name,date);
    }
    @Override
    public String getTreatment(){
        return "Affix a cast";
    }
}
