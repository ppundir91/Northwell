
package obj;
public class Allergy1
{
    private String Status;

    private Allergy Allergy;

    private AllergyCategory AllergyCategory;

    private String Comments;

    private String UpdatedOn;

    private EnteredAt EnteredAt;

    public void setStatus(String Status){
        this.Status = Status;
    }
    public String getStatus(){
        return this.Status;
    }
    public void setAllergy(Allergy Allergy){
        this.Allergy = Allergy;
    }
    public Allergy getAllergy(){
        return this.Allergy;
    }
    public void setAllergyCategory(AllergyCategory AllergyCategory){
        this.AllergyCategory = AllergyCategory;
    }
    public AllergyCategory getAllergyCategory(){
        return this.AllergyCategory;
    }
    public void setComments(String Comments){
        this.Comments = Comments;
    }
    public String getComments(){
        return this.Comments;
    }
    public void setUpdatedOn(String UpdatedOn){
        this.UpdatedOn = UpdatedOn;
    }
    public String getUpdatedOn(){
        return this.UpdatedOn;
    }
    public void setEnteredAt(EnteredAt EnteredAt){
        this.EnteredAt = EnteredAt;
    }
    public EnteredAt getEnteredAt(){
        return this.EnteredAt;
    }
}

