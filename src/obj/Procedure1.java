
package obj;
public class Procedure1
{
    private CustomPairs CustomPairs;

    private String EnteredOn;

    private String UpdatedOn;

    private Procedure Procedure;

    private String EncounterNumber;

    private Clinician Clinician;

    private EnteredAt EnteredAt;

    public void setCustomPairs(CustomPairs CustomPairs){
        this.CustomPairs = CustomPairs;
    }
    public CustomPairs getCustomPairs(){
        return this.CustomPairs;
    }
    public void setEnteredOn(String EnteredOn){
        this.EnteredOn = EnteredOn;
    }
    public String getEnteredOn(){
        return this.EnteredOn;
    }
    public void setUpdatedOn(String UpdatedOn){
        this.UpdatedOn = UpdatedOn;
    }
    public String getUpdatedOn(){
        return this.UpdatedOn;
    }
    public void setProcedure(Procedure Procedure){
        this.Procedure = Procedure;
    }
    public Procedure getProcedure(){
        return this.Procedure;
    }
    public void setEncounterNumber(String EncounterNumber){
        this.EncounterNumber = EncounterNumber;
    }
    public String getEncounterNumber(){
        return this.EncounterNumber;
    }
    public void setClinician(Clinician Clinician){
        this.Clinician = Clinician;
    }
    public Clinician getClinician(){
        return this.Clinician;
    }
    public void setEnteredAt(EnteredAt EnteredAt){
        this.EnteredAt = EnteredAt;
    }
    public EnteredAt getEnteredAt(){
        return this.EnteredAt;
    }
}

