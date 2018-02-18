
package obj;
public class TestItemCode
{
    private String Description;

    private String SDACodingStandard;

    private PriorCodes PriorCodes;

    private String IsNumeric;

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
    public void setPriorCodes(PriorCodes PriorCodes){
        this.PriorCodes = PriorCodes;
    }
    public PriorCodes getPriorCodes(){
        return this.PriorCodes;
    }
    public void setIsNumeric(String IsNumeric){
        this.IsNumeric = IsNumeric;
    }
    public String getIsNumeric(){
        return this.IsNumeric;
    }
    public void setCode(String Code){
        this.Code = Code;
    }
    public String getCode(){
        return this.Code;
    }
}

