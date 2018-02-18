
import java.io.IOException;
import java.net.URI;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;

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
            httpResponse.setContentType("application/json");
            
            if (entity != null) 
            {
            	String result = EntityUtils.toString(entity);
            	JSONObject obj = new JSONObject(result);
            	httpResponse.getWriter().print(obj);
            	
//            	JSONObject container = obj.getJSONObject("Container");
//            	Map<String,Object> map = new HashMap<String,Object>();
//            	Iterator keys = container.keys();
//            	while(keys.hasNext()) {
//            		String key = keys.next().toString();
//            		Object value = container.get(key);
//            		map.put(key, value);
//            	}
//            	HttpSession session = httpRequest.getSession();
//            	setSession(session,map);
//            	RequestDispatcher dispatcher = httpRequest.getRequestDispatcher("Summary.jsp");
//            	dispatcher.forward( httpRequest, httpResponse );
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
	}
	
	public void setSession(HttpSession session, Map<String,Object> map) {
		for(String key: map.keySet()) {
			session.setAttribute(key, map.get(key));
		}
	}

}
