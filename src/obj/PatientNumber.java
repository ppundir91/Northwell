
package obj;
public class PatientNumber
{
    private String NumberType;

    private Organization Organization;

    private String ISOAssigningAuthority;

    private String Number;

    public void setNumberType(String NumberType){
        this.NumberType = NumberType;
    }
    public String getNumberType(){
        return this.NumberType;
    }
    public void setOrganization(Organization Organization){
        this.Organization = Organization;
    }
    public Organization getOrganization(){
        return this.Organization;
    }
    public void setISOAssigningAuthority(String ISOAssigningAuthority){
        this.ISOAssigningAuthority = ISOAssigningAuthority;
    }
    public String getISOAssigningAuthority(){
        return this.ISOAssigningAuthority;
    }
    public void setNumber(String Number){
        this.Number = Number;
    }
    public String getNumber(){
        return this.Number;
    }
}

