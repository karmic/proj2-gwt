package test.client;
import com.google.gwt.core.client.JavaScriptObject;

class Worker extends JavaScriptObject
{
   protected Worker()
   {}
   public final native String getName()
   /*-{
      return this.name;
   }-*/;
   public final native String getUsername()
   /*-{
      return this.username;
   }-*/;
}
