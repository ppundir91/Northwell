
package obj;
public class RadOrder
{
    private String Status;

    private String PlacerId;

    private String EnteredOn;

    private String FillerId;

    private OrderedBy OrderedBy;

    private EnteringOrganization EnteringOrganization;

    private Priority Priority;

    private String Comments;

    private String TextInstruction;

    private String OrderQuantity;

    private Result Result;

    private String EncounterNumber;

    private String SpecimenCollectedTime;

    private String VerifiedComments;

    private OrderItem OrderItem;

    private EnteredBy EnteredBy;

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
    public void setEnteredOn(String EnteredOn){
        this.EnteredOn = EnteredOn;
    }
    public String getEnteredOn(){
        return this.EnteredOn;
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
    public void setEnteringOrganization(EnteringOrganization EnteringOrganization){
        this.EnteringOrganization = EnteringOrganization;
    }
    public EnteringOrganization getEnteringOrganization(){
        return this.EnteringOrganization;
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
    public void setTextInstruction(String TextInstruction){
        this.TextInstruction = TextInstruction;
    }
    public String getTextInstruction(){
        return this.TextInstruction;
    }
    public void setOrderQuantity(String OrderQuantity){
        this.OrderQuantity = OrderQuantity;
    }
    public String getOrderQuantity(){
        return this.OrderQuantity;
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
    public void setEnteredBy(EnteredBy EnteredBy){
        this.EnteredBy = EnteredBy;
    }
    public EnteredBy getEnteredBy(){
        return this.EnteredBy;
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

