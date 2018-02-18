
package obj;
public class DosageStep
{
    private String DoseQuantity;

    private DoseUoM DoseUoM;

    private String TextInstruction;

    public void setDoseQuantity(String DoseQuantity){
        this.DoseQuantity = DoseQuantity;
    }
    public String getDoseQuantity(){
        return this.DoseQuantity;
    }
    public void setDoseUoM(DoseUoM DoseUoM){
        this.DoseUoM = DoseUoM;
    }
    public DoseUoM getDoseUoM(){
        return this.DoseUoM;
    }
    public void setTextInstruction(String TextInstruction){
        this.TextInstruction = TextInstruction;
    }
    public String getTextInstruction(){
        return this.TextInstruction;
    }
}

