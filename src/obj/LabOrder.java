
package obj;
public class LabOrder
{
    private String Status;

    private String PlacerId;

    private String FillerId;

    private OrderedBy OrderedBy;

    private Priority Priority;

    private String Comments;

    private Result Result;

    private String EncounterNumber;

    private String SpecimenCollectedTime;

    private String VerifiedComments;

    private OrderItem OrderItem;

    private OrderCategory OrderCategory;

    private String FromTime;

    public void setStatus(String Status){
        this.Status = Status;
    }
    public String getStatus(){
        return this.Status;
    }
    public void setPlacerId(String PlacerId){
        this.PlacerId = PlacerId;
    }
    public String getPlacerId(){
        return this.PlacerId;
    }
    public void setFillerId(String FillerId){
        this.FillerId = FillerId;
    }
    public String getFillerId(){
        return this.FillerId;
    }
    public void setOrderedBy(OrderedBy OrderedBy){
        this.OrderedBy = OrderedBy;
    }
    public OrderedBy getOrderedBy(){
        return this.OrderedBy;
    }
    public void setPriority(Priority Priority){
        this.Priority = Priority;
    }
    public Priority getPriority(){
        return this.Priority;
    }
    public void setComments(String Comments){
        this.Comments = Comments;
    }
    public String getComments(){
        return this.Comments;
    }
    public void setResult(Result Result){
        this.Result = Result;
    }
    public Result getResult(){
        return this.Result;
    }
    public void setEncounterNumber(String EncounterNumber){
        this.EncounterNumber = EncounterNumber;
    }
    public String getEncounterNumber(){
        return this.EncounterNumber;
    }
    public void setSpecimenCollectedTime(String SpecimenCollectedTime){
        this.SpecimenCollectedTime = SpecimenCollectedTime;
    }
    public String getSpecimenCollectedTime(){
        return this.SpecimenCollectedTime;
    }
    public void setVerifiedComments(String VerifiedComments){
        this.VerifiedComments = VerifiedComments;
    }
    public String getVerifiedComments(){
        return this.VerifiedComments;
    }
    public void setOrderItem(OrderItem OrderItem){
        this.OrderItem = OrderItem;
    }
    public OrderItem getOrderItem(){
        return this.OrderItem;
    }
    public void setOrderCategory(OrderCategory OrderCategory){
        this.OrderCategory = OrderCategory;
    }
    public OrderCategory getOrderCategory(){
        return this.OrderCategory;
    }
    public void setFromTime(String FromTime){
        this.FromTime = FromTime;
    }
    public String getFromTime(){
        return this.FromTime;
    }
}

