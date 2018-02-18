
package obj;
public class Result1
{
    private String ResultInterpretation;

    private ResultItems ResultItems;

    private String ResultStatus;

    private String ResultTime;

    private String Comments;

    private String DocumentURL;

    private String ResultType;

    public void setResultInterpretation(String ResultInterpretation){
        this.ResultInterpretation = ResultInterpretation;
    }
    public String getResultInterpretation(){
        return this.ResultInterpretation;
    }
    public void setResultItems(ResultItems ResultItems){
        this.ResultItems = ResultItems;
    }
    public ResultItems getResultItems(){
        return this.ResultItems;
    }
    public void setResultStatus(String ResultStatus){
        this.ResultStatus = ResultStatus;
    }
    public String getResultStatus(){
        return this.ResultStatus;
    }
    public void setResultTime(String ResultTime){
        this.ResultTime = ResultTime;
    }
    public String getResultTime(){
        return this.ResultTime;
    }
    public void setComments(String Comments){
        this.Comments = Comments;
    }
    public String getComments(){
        return this.Comments;
    }
    public void setDocumentURL(String DocumentURL){
        this.DocumentURL = DocumentURL;
    }
    public String getDocumentURL(){
        return this.DocumentURL;
    }
    public void setResultType(String ResultType){
        this.ResultType = ResultType;
    }
    public String getResultType(){
        return this.ResultType;
    }
}

