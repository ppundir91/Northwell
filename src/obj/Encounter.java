
package obj;
public class Encounter
{
    private String EnteredOn;

    private ReferringClinician ReferringClinician;

    private String EndTime;

    private AdmittingClinician AdmittingClinician;

    private SeparationMode SeparationMode;

    private String EncounterNumber;

    private String AccountNumber;

    private String EncounterMRN;

    private String ToTime;

    private AdmissionSource AdmissionSource;

    private AttendingClinicians AttendingClinicians;

    private EnteredBy EnteredBy;

    private String EncounterType;

    private String FromTime;

    private HealthCareFacility HealthCareFacility;

    private EnteredAt EnteredAt;

    public void setEnteredOn(String EnteredOn){
        this.EnteredOn = EnteredOn;
    }
    public String getEnteredOn(){
        return this.EnteredOn;
    }
    public void setReferringClinician(ReferringClinician ReferringClinician){
        this.ReferringClinician = ReferringClinician;
    }
    public ReferringClinician getReferringClinician(){
        return this.ReferringClinician;
    }
    public void setEndTime(String EndTime){
        this.EndTime = EndTime;
    }
    public String getEndTime(){
        return this.EndTime;
    }
    public void setAdmittingClinician(AdmittingClinician AdmittingClinician){
        this.AdmittingClinician = AdmittingClinician;
    }
    public AdmittingClinician getAdmittingClinician(){
        return this.AdmittingClinician;
    }
    public void setSeparationMode(SeparationMode SeparationMode){
        this.SeparationMode = SeparationMode;
    }
    public SeparationMode getSeparationMode(){
        return this.SeparationMode;
    }
    public void setEncounterNumber(String EncounterNumber){
        this.EncounterNumber = EncounterNumber;
    }
    public String getEncounterNumber(){
        return this.EncounterNumber;
    }
    public void setAccountNumber(String AccountNumber){
        this.AccountNumber = AccountNumber;
    }
    public String getAccountNumber(){
        return this.AccountNumber;
    }
    public void setEncounterMRN(String EncounterMRN){
        this.EncounterMRN = EncounterMRN;
    }
    public String getEncounterMRN(){
        return this.EncounterMRN;
    }
    public void setToTime(String ToTime){
        this.ToTime = ToTime;
    }
    public String getToTime(){
        return this.ToTime;
    }
    public void setAdmissionSource(AdmissionSource AdmissionSource){
        this.AdmissionSource = AdmissionSource;
    }
    public AdmissionSource getAdmissionSource(){
        return this.AdmissionSource;
    }
    public void setAttendingClinicians(AttendingClinicians AttendingClinicians){
        this.AttendingClinicians = AttendingClinicians;
    }
    public AttendingClinicians getAttendingClinicians(){
        return this.AttendingClinicians;
    }
    public void setEnteredBy(EnteredBy EnteredBy){
        this.EnteredBy = EnteredBy;
    }
    public EnteredBy getEnteredBy(){
        return this.EnteredBy;
    }
    public void setEncounterType(String EncounterType){
        this.EncounterType = EncounterType;
    }
    public String getEncounterType(){
        return this.EncounterType;
    }
    public void setFromTime(String FromTime){
        this.FromTime = FromTime;
    }
    public String getFromTime(){
        return this.FromTime;
    }
    public void setHealthCareFacility(HealthCareFacility HealthCareFacility){
        this.HealthCareFacility = HealthCareFacility;
    }
    public HealthCareFacility getHealthCareFacility(){
        return this.HealthCareFacility;
    }
    public void setEnteredAt(EnteredAt EnteredAt){
        this.EnteredAt = EnteredAt;
    }
    public EnteredAt getEnteredAt(){
        return this.EnteredAt;
    }
}

