
package obj;
import java.util.ArrayList;
import java.util.List;
public class Appointments
{
    private List<Appointment> Appointment;

    public void setAppointment(List<Appointment> Appointment){
        this.Appointment = Appointment;
    }
    public List<Appointment> getAppointment(){
        return this.Appointment;
    }
}

