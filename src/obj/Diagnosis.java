
package obj;
public class Diagnosis
{
    private Status Status;

    private DiagnosingClinician DiagnosingClinician;

    private DiagnosisType DiagnosisType;

    private Diagnosis Diagnosis;

    private String EncounterNumber;

    private EnteredAt EnteredAt;

    public void setStatus(Status Status){
        this.Status = Status;
    }
    public Status getStatus(){
        return this.Status;
    }
    public void setDiagnosingClinician(DiagnosingClinician DiagnosingClinician){
        this.DiagnosingClinician = DiagnosingClinician;
    }
    public DiagnosingClinician getDiagnosingClinician(){
        return this.DiagnosingClinician;
    }
    public void setDiagnosisType(DiagnosisType DiagnosisType){
        this.DiagnosisType = DiagnosisType;
    }
    public DiagnosisType getDiagnosisType(){
        return this.DiagnosisType;
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

