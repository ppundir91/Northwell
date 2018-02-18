
package obj;
public class Clinician
{
    private String Description;

    private String SDACodingStandard;

    private Address Address;

    private ContactInfo ContactInfo;

    private CareProviderType CareProviderType;

    private String Code;

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
    public void setAddress(Address Address){
        this.Address = Address;
    }
    public Address getAddress(){
        return this.Address;
    }
    public void setContactInfo(ContactInfo ContactInfo){
        this.ContactInfo = ContactInfo;
    }
    public ContactInfo getContactInfo(){
        return this.ContactInfo;
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

