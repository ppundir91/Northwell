
package obj;
public class Address
{
    private Zip Zip;

    private State State;

    private String Street;

    private Country Country;

    private City City;

    public void setZip(Zip Zip){
        this.Zip = Zip;
    }
    public Zip getZip(){
        return this.Zip;
    }
    public void setState(State State){
        this.State = State;
    }
    public State getState(){
        return this.State;
    }
    public void setStreet(String Street){
        this.Street = Street;
    }
    public String getStreet(){
        return this.Street;
    }
    public void setCountry(Country Country){
        this.Country = Country;
    }
    public Country getCountry(){
        return this.Country;
    }
    public void setCity(City City){
        this.City = City;
    }
    public City getCity(){
        return this.City;
    }
}

