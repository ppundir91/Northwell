
package obj;
public class LabResultItem
{
    private String ResultInterpretation;

    private String ObservationValueType;

    private TestItemCode TestItemCode;

    private String ResultValueUnits;

    private String ResultValue;

    private String ResultNormalRange;

    private String TestItemStatus;

    private PerformedAt PerformedAt;

    public void setResultInterpretation(String ResultInterpretation){
        this.ResultInterpretation = ResultInterpretation;
    }
    public String getResultInterpretation(){
        return this.ResultInterpretation;
    }
    public void setObservationValueType(String ObservationValueType){
        this.ObservationValueType = ObservationValueType;
    }
    public String getObservationValueType(){
        return this.ObservationValueType;
    }
    public void setTestItemCode(TestItemCode TestItemCode){
        this.TestItemCode = TestItemCode;
    }
    public TestItemCode getTestItemCode(){
        return this.TestItemCode;
    }
    public void setResultValueUnits(String ResultValueUnits){
        this.ResultValueUnits = ResultValueUnits;
    }
    public String getResultValueUnits(){
        return this.ResultValueUnits;
    }
    public void setResultValue(String ResultValue){
        this.ResultValue = ResultValue;
    }
    public String getResultValue(){
        return this.ResultValue;
    }
    public void setResultNormalRange(String ResultNormalRange){
        this.ResultNormalRange = ResultNormalRange;
    }
    public String getResultNormalRange(){
        return this.ResultNormalRange;
    }
    public void setTestItemStatus(String TestItemStatus){
        this.TestItemStatus = TestItemStatus;
    }
    public String getTestItemStatus(){
        return this.TestItemStatus;
    }
    public void setPerformedAt(PerformedAt PerformedAt){
        this.PerformedAt = PerformedAt;
    }
    public PerformedAt getPerformedAt(){
        return this.PerformedAt;
    }
}

