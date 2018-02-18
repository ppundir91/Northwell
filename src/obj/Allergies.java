
package obj;
import java.util.ArrayList;
import java.util.List;
public class Allergies
{
    private List<Allergy> Allergy;

    public void setAllergy(List<Allergy> Allergy){
        this.Allergy = Allergy;
    }
    public List<Allergy> getAllergy(){
        return this.Allergy;
    }
}

