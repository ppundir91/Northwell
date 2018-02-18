
package obj;
public class EnteringOrganization
{
    private String Description;

    private Organization Organization;

    private String Code;

    public void setDescription(String Description){
        this.Description = Description;
    }
    public String getDescription(){
        return this.Description;
    }
    public void setOrganization(Organization Organization){
        this.Organization = Organization;
    }
    public Organization getOrganization(){
        return this.Organization;
    }
    public void setCode(String Code){
        this.Code = Code;
    }
    public String getCode(){
        return this.Code;
    }
}

