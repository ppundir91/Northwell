
package obj;
public class Container
{
    private SocialHistories SocialHistories;

    private String Action;

    private FamilyHistories FamilyHistories;

    private Encounters Encounters;

    private Patient Patient;

    private Procedures Procedures;

    private RadOrders RadOrders;

    private Allergies Allergies;

    private Appointments Appointments;

    private Medications Medications;

    private ClinicalRelationships ClinicalRelationships;

    private LabOrders LabOrders;

    private Observations Observations;

    private Diagnoses Diagnoses;

    public void setSocialHistories(SocialHistories SocialHistories){
        this.SocialHistories = SocialHistories;
    }
    public SocialHistories getSocialHistories(){
        return this.SocialHistories;
    }
    public void setAction(String Action){
        this.Action = Action;
    }
    public String getAction(){
        return this.Action;
    }
    public void setFamilyHistories(FamilyHistories FamilyHistories){
        this.FamilyHistories = FamilyHistories;
    }
    public FamilyHistories getFamilyHistories(){
        return this.FamilyHistories;
    }
    public void setEncounters(Encounters Encounters){
        this.Encounters = Encounters;
    }
    public Encounters getEncounters(){
        return this.Encounters;
    }
    public void setPatient(Patient Patient){
        this.Patient = Patient;
    }
    public Patient getPatient(){
        return this.Patient;
    }
    public void setProcedures(Procedures Procedures){
        this.Procedures = Procedures;
    }
    public Procedures getProcedures(){
        return this.Procedures;
    }
    public void setRadOrders(RadOrders RadOrders){
        this.RadOrders = RadOrders;
    }
    public RadOrders getRadOrders(){
        return this.RadOrders;
    }
    public void setAllergies(Allergies Allergies){
        this.Allergies = Allergies;
    }
    public Allergies getAllergies(){
        return this.Allergies;
    }
    public void setAppointments(Appointments Appointments){
        this.Appointments = Appointments;
    }
    public Appointments getAppointments(){
        return this.Appointments;
    }
    public void setMedications(Medications Medications){
        this.Medications = Medications;
    }
    public Medications getMedications(){
        return this.Medications;
    }
    public void setClinicalRelationships(ClinicalRelationships ClinicalRelationships){
        this.ClinicalRelationships = ClinicalRelationships;
    }
    public ClinicalRelationships getClinicalRelationships(){
        return this.ClinicalRelationships;
    }
    public void setLabOrders(LabOrders LabOrders){
        this.LabOrders = LabOrders;
    }
    public LabOrders getLabOrders(){
        return this.LabOrders;
    }
    public void setObservations(Observations Observations){
        this.Observations = Observations;
    }
    public Observations getObservations(){
        return this.Observations;
    }
    public void setDiagnoses(Diagnoses Diagnoses){
        this.Diagnoses = Diagnoses;
    }
    public Diagnoses getDiagnoses(){
        return this.Diagnoses;
    }
}

