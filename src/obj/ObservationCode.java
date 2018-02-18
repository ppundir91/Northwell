
package obj;
public class ObservationCode
{
    private String Description;

    private String SDACodingStandard;

    private ObservationValueUnits ObservationValueUnits;

    private String Code;

    public void setDescription(String Description){
        this.Description = Description;
    }
    public String getDescription(){
        return this.Description;
    }
    public void setSDACodingStandard(String SDACodingStandard){
        this.SDACodingStandard = SDACodingStandard;
    }
    public String getSDACodingStandard(){
        return this.SDACodingStandard;
    }
    public void setObservationValueUnits(ObservationValueUnits ObservationValueUnits){
        this.ObservationValueUnits = ObservationValueUnits;
    }
    public ObservationValueUnits getObservationValueUnits(){
        return this.ObservationValueUnits;
    }
    public void setCode(String Code){
        this.Code = Code;
    }
    public String getCode(){
        return this.Code;
    }
}

