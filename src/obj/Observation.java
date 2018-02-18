
package obj;
public class Observation
{
    private ObservationCode ObservationCode;

    private String ObservationValueType;

    private String Comments;

    private String ObservationValue;

    private String ObservationTime;

    private String EncounterNumber;

    public void setObservationCode(ObservationCode ObservationCode){
        this.ObservationCode = ObservationCode;
    }
    public ObservationCode getObservationCode(){
        return this.ObservationCode;
    }
    public void setObservationValueType(String ObservationValueType){
        this.ObservationValueType = ObservationValueType;
    }
    public String getObservationValueType(){
        return this.ObservationValueType;
    }
    public void setComments(String Comments){
        this.Comments = Comments;
    }
    public String getComments(){
        return this.Comments;
    }
    public void setObservationValue(String ObservationValue){
        this.ObservationValue = ObservationValue;
    }
    public String getObservationValue(){
        return this.ObservationValue;
    }
    public void setObservationTime(String ObservationTime){
        this.ObservationTime = ObservationTime;
    }
    public String getObservationTime(){
        return this.ObservationTime;
    }
    public void setEncounterNumber(String EncounterNumber){
        this.EncounterNumber = EncounterNumber;
    }
    public String getEncounterNumber(){
        return this.EncounterNumber;
    }
}

