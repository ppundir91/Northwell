
package obj;
public class Appointment
{
    private String Status;

    private Type Type;

    private String NoShow;

    private String EnteredOn;

    private OrderItem OrderItem;

    private CareProvider CareProvider;

    private EnteredBy EnteredBy;

    private String FillerApptId;

    private String FromTime;

    private String EncounterNumber;

    private Location Location;

    private EnteredAt EnteredAt;

    public void setStatus(String Status){
        this.Status = Status;
    }
    public String getStatus(){
        return this.Status;
    }
    public void setType(Type Type){
        this.Type = Type;
    }
    public Type getType(){
        return this.Type;
    }
    public void setNoShow(String NoShow){
        this.NoShow = NoShow;
    }
    public String getNoShow(){
        return this.NoShow;
    }
    public void setEnteredOn(String EnteredOn){
        this.EnteredOn = EnteredOn;
    }
    public String getEnteredOn(){
        return this.EnteredOn;
    }
    public void setOrderItem(OrderItem OrderItem){
        this.OrderItem = OrderItem;
    }
    public OrderItem getOrderItem(){
        return this.OrderItem;
    }
    public void setCareProvider(CareProvider CareProvider){
        this.CareProvider = CareProvider;
    }
    public CareProvider getCareProvider(){
        return this.CareProvider;
    }
    public void setEnteredBy(EnteredBy EnteredBy){
        this.EnteredBy = EnteredBy;
    }
    public EnteredBy getEnteredBy(){
        return this.EnteredBy;
    }
    public void setFillerApptId(String FillerApptId){
        this.FillerApptId = FillerApptId;
    }
    public String getFillerApptId(){
        return this.FillerApptId;
    }
    public void setFromTime(String FromTime){
        this.FromTime = FromTime;
    }
    public String getFromTime(){
        return this.FromTime;
    }
    public void setEncounterNumber(String EncounterNumber){
        this.EncounterNumber = EncounterNumber;
    }
    public String getEncounterNumber(){
        return this.EncounterNumber;
    }
    public void setLocation(Location Location){
        this.Location = Location;
    }
    public Location getLocation(){
        return this.Location;
    }
    public void setEnteredAt(EnteredAt EnteredAt){
        this.EnteredAt = EnteredAt;
    }
    public EnteredAt getEnteredAt(){
        return this.EnteredAt;
    }
}

