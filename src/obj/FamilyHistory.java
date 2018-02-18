
package obj;
public class FamilyHistory
{
    private String Status;

    private String EnteredOn;

    private FamilyMember FamilyMember;

    private String NoteText;

    private String UpdatedOn;

    private Diagnosis Diagnosis;

    private String EncounterNumber;

    private EnteredAt EnteredAt;

    public void setStatus(String Status){
        this.Status = Status;
    }
    public String getStatus(){
        return this.Status;
    }
    public void setEnteredOn(String EnteredOn){
        this.EnteredOn = EnteredOn;
    }
    public String getEnteredOn(){
        return this.EnteredOn;
    }
    public void setFamilyMember(FamilyMember FamilyMember){
        this.FamilyMember = FamilyMember;
    }
    public FamilyMember getFamilyMember(){
        return this.FamilyMember;
    }
    public void setNoteText(String NoteText){
        this.NoteText = NoteText;
    }
    public String getNoteText(){
        return this.NoteText;
    }
    public void setUpdatedOn(String UpdatedOn){
        this.UpdatedOn = UpdatedOn;
    }
    public String getUpdatedOn(){
        return this.UpdatedOn;
    }
    public void setDiagnosis(Diagnosis Diagnosis){
        this.Diagnosis = Diagnosis;
    }
    public Diagnosis getDiagnosis(){
        return this.Diagnosis;
    }
    public void setEncounterNumber(String EncounterNumber){
        this.EncounterNumber = EncounterNumber;
    }
    public String getEncounterNumber(){
        return this.EncounterNumber;
    }
    public void setEnteredAt(EnteredAt EnteredAt){
        this.EnteredAt = EnteredAt;
    }
    public EnteredAt getEnteredAt(){
        return this.EnteredAt;
    }
}

