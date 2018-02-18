
package obj;
public class SocialHistory
{
    private String Status;

    private String UpdatedOn;

    private String SocialHabitComments;

    private SocialHabit SocialHabit;

    public void setStatus(String Status){
        this.Status = Status;
    }
    public String getStatus(){
        return this.Status;
    }
    public void setUpdatedOn(String UpdatedOn){
        this.UpdatedOn = UpdatedOn;
    }
    public String getUpdatedOn(){
        return this.UpdatedOn;
    }
    public void setSocialHabitComments(String SocialHabitComments){
        this.SocialHabitComments = SocialHabitComments;
    }
    public String getSocialHabitComments(){
        return this.SocialHabitComments;
    }
    public void setSocialHabit(SocialHabit SocialHabit){
        this.SocialHabit = SocialHabit;
    }
    public SocialHabit getSocialHabit(){
        return this.SocialHabit;
    }
}

