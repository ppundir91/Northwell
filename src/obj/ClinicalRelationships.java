
package obj;
import java.util.ArrayList;
import java.util.List;
public class ClinicalRelationships
{
    private List<ClinicalRelationship> ClinicalRelationship;

    public void setClinicalRelationship(List<ClinicalRelationship> ClinicalRelationship){
        this.ClinicalRelationship = ClinicalRelationship;
    }
    public List<ClinicalRelationship> getClinicalRelationship(){
        return this.ClinicalRelationship;
    }
}

