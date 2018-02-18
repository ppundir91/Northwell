
package obj;
public class ReferringClinician
{
    private String Description;

    private String SDACodingStandard;

    private Name Name;

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
    public void setName(Name Name){
        this.Name = Name;
    }
    public Name getName(){
        return this.Name;
    }
}

