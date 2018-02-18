
import java.io.IOException;
import java.net.URI;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.http.HttpEntity;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClients;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 * Servlet implementation class GetSDAServlet
 */
@WebServlet("/GetSDAServlet")
public class GetSDAServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public GetSDAServlet() {
        // TODO Auto-generated constructor stub
    }
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	// TODO Auto-generated method stub
//    	super.doGet(req, resp);
//    	doPost(req, resp);
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest httpRequest, HttpServletResponse httpResponse) throws ServletException, IOException {
		HttpClient httpclient = HttpClients.createDefault();

        try
        {
            URIBuilder builder = new URIBuilder("https://apim-hie-dev.azure-api.net/restsda/patient/SDA");

            URI uri = builder.build();
            HttpPost request = new HttpPost(uri);
            request.setHeader("Requestor", "pundir");
            request.setHeader("Content-Type", "application/json");
            request.setHeader("Ocp-Apim-Subscription-Key", "88f2714b73cb438cbcc135e276dadf20");
            request.setHeader("Accept","application/json");


            // Request body
            Map<String,String> data = new HashMap<String,String>();
            data.put("MRN", httpRequest.getParameter("MRN"));
            data.put("AssigningAuthority", httpRequest.getParameter("AssigningAuthority"));
            JSONObject body = new JSONObject(data);
            StringEntity reqEntity = new StringEntity(body.toString());
            request.setEntity(reqEntity);

            HttpResponse response = httpclient.execute(request);
            HttpEntity entity = response.getEntity();

            if (entity != null) 
            {
            	ServletContext servletContext = getServletContext();
            	RequestDispatcher requestDispatcher = servletContext.getRequestDispatcher("/ParseDataServlet");
            	requestDispatcher.forward(httpRequest, httpResponse);
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
	}
	
	protected void parseData(HttpRequest request, HttpResponse response) throws UnsupportedOperationException, ParseException, IOException, JSONException {
		System.out.println("request received");
		JSONObject obj = (JSONObject) new JSONParser().parse(response.getEntity().getContent().toString());
		Map Name = (Map) obj.get("Name");
		PatientSession session = new PatientSession();
		session.setName(Name);
		
	}

}
