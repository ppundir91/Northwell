
package obj;
public class OrderedBy1
{
    private String Description;

    private CareProviderType CareProviderType;

    private String Code;

    private Name Name;

    public void setDescription(String Description){
        this.Description = Description;
    }
    public String getDescription(){
        return this.Description;
    }
    public void setCareProviderType(CareProviderType CareProviderType){
        this.CareProviderType = CareProviderType;
    }
    public CareProviderType getCareProviderType(){
        return this.CareProviderType;
    }
    public void setCode(String Code){
        this.Code = Code;
    }
    public String getCode(){
        return this.Code;
    }
    public void setName(Name Name){
        this.Name = Name;
    }
    public Name getName(){
        return this.Name;
    }
}

