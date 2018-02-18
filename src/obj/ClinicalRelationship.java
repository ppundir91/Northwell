
package obj;
public class ClinicalRelationship
{
    private String StartDate;

    private String UpdatedOn;

    private Clinician Clinician;

    public void setStartDate(String StartDate){
        this.StartDate = StartDate;
    }
    public String getStartDate(){
        return this.StartDate;
    }
    public void setUpdatedOn(String UpdatedOn){
        this.UpdatedOn = UpdatedOn;
    }
    public String getUpdatedOn(){
        return this.UpdatedOn;
    }
    public void setClinician(Clinician Clinician){
        this.Clinician = Clinician;
    }
    public Clinician getClinician(){
        return this.Clinician;
    }
}

