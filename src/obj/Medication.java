
package obj;
public class Medication
{
    private String Status;

    private String PlacerId;

    private String EnteredOn;

    private String FillerId;

    private OrderedBy OrderedBy;

    private Priority Priority;

    private String Comments;

    private String TextInstruction;

    private String PrescriptionNumber;

    private String OrderQuantity;

    private String EncounterNumber;

    private OrderItem OrderItem;

    private String PharmacyStatus;

    private Frequency Frequency;

    private DosageSteps DosageSteps;

    private EnteredBy EnteredBy;

    private OrderCategory OrderCategory;

    private String FromTime;

    private DosageForm DosageForm;

    private Route Route;

    private EnteredAt EnteredAt;

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
    public void setPrescriptionNumber(String PrescriptionNumber){
        this.PrescriptionNumber = PrescriptionNumber;
    }
    public String getPrescriptionNumber(){
        return this.PrescriptionNumber;
    }
    public void setOrderQuantity(String OrderQuantity){
        this.OrderQuantity = OrderQuantity;
    }
    public String getOrderQuantity(){
        return this.OrderQuantity;
    }
    public void setEncounterNumber(String EncounterNumber){
        this.EncounterNumber = EncounterNumber;
    }
    public String getEncounterNumber(){
        return this.EncounterNumber;
    }
    public void setOrderItem(OrderItem OrderItem){
        this.OrderItem = OrderItem;
    }
    public OrderItem getOrderItem(){
        return this.OrderItem;
    }
    public void setPharmacyStatus(String PharmacyStatus){
        this.PharmacyStatus = PharmacyStatus;
    }
    public String getPharmacyStatus(){
        return this.PharmacyStatus;
    }
    public void setFrequency(Frequency Frequency){
        this.Frequency = Frequency;
    }
    public Frequency getFrequency(){
        return this.Frequency;
    }
    public void setDosageSteps(DosageSteps DosageSteps){
        this.DosageSteps = DosageSteps;
    }
    public DosageSteps getDosageSteps(){
        return this.DosageSteps;
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
    public void setDosageForm(DosageForm DosageForm){
        this.DosageForm = DosageForm;
    }
    public DosageForm getDosageForm(){
        return this.DosageForm;
    }
    public void setRoute(Route Route){
        this.Route = Route;
    }
    public Route getRoute(){
        return this.Route;
    }
    public void setEnteredAt(EnteredAt EnteredAt){
        this.EnteredAt = EnteredAt;
    }
    public EnteredAt getEnteredAt(){
        return this.EnteredAt;
    }
}

