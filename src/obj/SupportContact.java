
package obj;
public class SupportContact
{
    private ContactType ContactType;

    private Address Address;

    private Relationship Relationship;

    private ContactInfo ContactInfo;

    private Name Name;

    public void setContactType(ContactType ContactType){
        this.ContactType = ContactType;
    }
    public ContactType getContactType(){
        return this.ContactType;
    }
    public void setAddress(Address Address){
        this.Address = Address;
    }
    public Address getAddress(){
        return this.Address;
    }
    public void setRelationship(Relationship Relationship){
        this.Relationship = Relationship;
    }
    public Relationship getRelationship(){
        return this.Relationship;
    }
    public void setContactInfo(ContactInfo ContactInfo){
        this.ContactInfo = ContactInfo;
    }
    public ContactInfo getContactInfo(){
        return this.ContactInfo;
    }
    public void setName(Name Name){
        this.Name = Name;
    }
    public Name getName(){
        return this.Name;
    }
}

