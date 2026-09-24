import java.util.ArrayList;

public class Driver {
    public static void main(String[] args) {

        ArrayList <MedicalCondition> patientList = new ArrayList<MedicalCondition>();

        MedicalCondition m1 = new BrokenBone("Gus", "9/23/2026");
        MedicalCondition m2 = new StrepThroat("Tavo", "9/24/2026");

        patientList.add(m1);
        patientList.add(m2);

        for (int i =0; i <= patientList.size()-1; i++){
            System.out.println("Treatment is " + patientList.get(i).getTreatment());
        } 
    }
}