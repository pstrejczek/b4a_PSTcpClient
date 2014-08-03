
package b4a.example;

import java.io.IOException;
import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RDebug;
import anywheresoftware.b4a.pc.RemoteObject;
import anywheresoftware.b4a.pc.RDebug.IRemote;
import anywheresoftware.b4a.pc.Debug;

public class tcpclient implements IRemote{
	public static tcpclient mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public tcpclient() {
		mostCurrent = this;
	}
    public RemoteObject getRemoteMe() {
        return remoteMe;    
    }
    
public boolean isSingleton() {
		return false;
	}
    public static PCBA staticBA = new PCBA(null, tcpclient.class, null);
    private PCBA pcBA;
    public RemoteObject ba;
    public RemoteObject ref;
	public RemoteObject runMethod(boolean notUsed, String method, Object... args) throws Exception{
		return (RemoteObject) pcBA.raiseEvent(method.substring(1), RemoteObject.addItemToArray(ref, args));
	}
    public void runVoidMethod(String method, Object... args) throws Exception{
		runMethod(false, method, args);
	}
	public PCBA create(Object[] args) throws ClassNotFoundException{
        ref = (RemoteObject) args[0];
        ba = (RemoteObject) args[2];
		pcBA = new PCBA(this, tcpclient.class, ba);
		return pcBA;
	}


public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _tcpsocket = RemoteObject.declareNull("anywheresoftware.b4a.objects.SocketWrapper");
public static RemoteObject _server_address = RemoteObject.createImmutable("");
public static RemoteObject _server_port = RemoteObject.createImmutable(0);
public static RemoteObject _timeout = RemoteObject.createImmutable(0);
public static RemoteObject _response = null;
public static RemoteObject _event_method_name = RemoteObject.createImmutable("");
public static RemoteObject _event_module_name = RemoteObject.declareNull("Object");
public static RemoteObject _last_error = RemoteObject.createImmutable("");
public static RemoteObject _responded_event_method_name = RemoteObject.createImmutable("");
public static RemoteObject _responded_event_module = RemoteObject.declareNull("Object");
public static b4a.example.main _main = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"event_method_name",_ref.getFieldClass("b4a.example.tcpclient", false, "_event_method_name"),"event_module_name",_ref.getFieldClass("b4a.example.tcpclient", false, "_event_module_name"),"last_error",_ref.getFieldClass("b4a.example.tcpclient", false, "_last_error"),"responded_event_method_name",_ref.getFieldClass("b4a.example.tcpclient", false, "_responded_event_method_name"),"responded_event_module",_ref.getFieldClass("b4a.example.tcpclient", false, "_responded_event_module"),"response",_ref.getFieldClass("b4a.example.tcpclient", false, "_response"),"server_address",_ref.getFieldClass("b4a.example.tcpclient", false, "_server_address"),"server_port",_ref.getFieldClass("b4a.example.tcpclient", false, "_server_port"),"TCPSocket",_ref.getFieldClass("b4a.example.tcpclient", false, "_tcpsocket"),"timeout",_ref.getFieldClass("b4a.example.tcpclient", false, "_timeout")};
}
}