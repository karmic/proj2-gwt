package test.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.Window;
import com.google.gwt.http.client.Request;
import com.google.gwt.http.client.RequestBuilder;
import com.google.gwt.http.client.Response;
import com.google.gwt.http.client.RequestCallback;

public class Sample implements EntryPoint 
{
   public void onModuleLoad() 
   {
      //Window.alert("Hello");
      String url = "http://localhost:3000/workers.json";
      getRequest(url);
   }
   private void getRequest(String url)
   {
      final RequestBuilder rb =
         new RequestBuilder(RequestBuilder.GET,url);
   try {
      rb.sendRequest(null, new RequestCallback()
      {
         public void onError(final Request request,
            final Throwable exception)
      {
         Window.alert(exception.getMessage());
      }
      public void onResponseReceived(final Request request,
         final Response response)
      {
         Window.alert(response.getText());
      }
   });
   }
   catch (final Exception e) {
      Window.alert(e.getMessage());
   }
  }
}
