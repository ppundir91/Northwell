
package obj;
import java.util.ArrayList;
import java.util.List;
public class Medications
{
    private List<Medication> Medication;

    public void setMedication(List<Medication> Medication){
        this.Medication = Medication;
    }
    public List<Medication> getMedication(){
        return this.Medication;
    }
}

