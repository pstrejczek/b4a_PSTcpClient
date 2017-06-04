package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class tcpclient extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "b4a.example.tcpclient");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.tcpclient.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.SocketWrapper _tcpsocket = null;
public String _server_address = "";
public int _server_port = 0;
public int _timeout = 0;
public byte[] _response = null;
public String _event_method_name = "";
public Object _event_module_name = null;
public String _last_error = "";
public anywheresoftware.b4a.randomaccessfile.AsyncStreams _astreams = null;
public String _responded_event_method_name = "";
public Object _responded_event_module = null;
public b4a.example.main _main = null;
public String  _astreams_newdata(byte[] _buffer) throws Exception{
 //BA.debugLineNum = 62;BA.debugLine="Sub AStreams_NewData (Buffer() As Byte)";
 //BA.debugLineNum = 63;BA.debugLine="response = Buffer";
_response = _buffer;
 //BA.debugLineNum = 64;BA.debugLine="CallSub(responded_event_module, responded_event_m";
__c.CallSubNew(ba,_responded_event_module,_responded_event_method_name);
 //BA.debugLineNum = 65;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private TCPSocket As Socket";
_tcpsocket = new anywheresoftware.b4a.objects.SocketWrapper();
 //BA.debugLineNum = 4;BA.debugLine="Private server_address As String";
_server_address = "";
 //BA.debugLineNum = 5;BA.debugLine="Private server_port As Int";
_server_port = 0;
 //BA.debugLineNum = 6;BA.debugLine="Private timeout As Int";
_timeout = 0;
 //BA.debugLineNum = 8;BA.debugLine="Private response() As Byte";
_response = new byte[(int) (0)];
;
 //BA.debugLineNum = 10;BA.debugLine="Private event_method_name As String";
_event_method_name = "";
 //BA.debugLineNum = 11;BA.debugLine="Private event_module_name As Object";
_event_module_name = new Object();
 //BA.debugLineNum = 13;BA.debugLine="Private last_error As String";
_last_error = "";
 //BA.debugLineNum = 14;BA.debugLine="Private Astreams As AsyncStreams";
_astreams = new anywheresoftware.b4a.randomaccessfile.AsyncStreams();
 //BA.debugLineNum = 16;BA.debugLine="Private responded_event_method_name As String";
_responded_event_method_name = "";
 //BA.debugLineNum = 17;BA.debugLine="Private responded_event_module As Object";
_responded_event_module = new Object();
 //BA.debugLineNum = 18;BA.debugLine="End Sub";
return "";
}
public String  _connect() throws Exception{
 //BA.debugLineNum = 38;BA.debugLine="Public Sub Connect";
 //BA.debugLineNum = 39;BA.debugLine="TCPSocket.Connect(server_address, server_port, ti";
_tcpsocket.Connect(ba,_server_address,_server_port,_timeout);
 //BA.debugLineNum = 40;BA.debugLine="End Sub";
return "";
}
public String  _disconnect() throws Exception{
 //BA.debugLineNum = 42;BA.debugLine="Public Sub Disconnect";
 //BA.debugLineNum = 43;BA.debugLine="If TCPSocket.Connected Then TCPSocket.Close";
if (_tcpsocket.getConnected()) { 
_tcpsocket.Close();};
 //BA.debugLineNum = 44;BA.debugLine="End Sub";
return "";
}
public byte[]  _getarrayofbyteresponse() throws Exception{
 //BA.debugLineNum = 67;BA.debugLine="Public Sub GetArrayOfByteResponse As Byte()";
 //BA.debugLineNum = 68;BA.debugLine="Return response";
if (true) return _response;
 //BA.debugLineNum = 69;BA.debugLine="End Sub";
return null;
}
public String  _getlasterror() throws Exception{
 //BA.debugLineNum = 76;BA.debugLine="Public Sub GetLastError As String";
 //BA.debugLineNum = 77;BA.debugLine="Return last_error";
if (true) return _last_error;
 //BA.debugLineNum = 78;BA.debugLine="End Sub";
return "";
}
public String  _getstringresponse() throws Exception{
anywheresoftware.b4a.agraham.byteconverter.ByteConverter _cv = null;
 //BA.debugLineNum = 57;BA.debugLine="Public Sub GetStringResponse As String";
 //BA.debugLineNum = 58;BA.debugLine="Dim cv As ByteConverter";
_cv = new anywheresoftware.b4a.agraham.byteconverter.ByteConverter();
 //BA.debugLineNum = 59;BA.debugLine="Return cv.StringFromBytes(response, \"ASCII\")";
if (true) return _cv.StringFromBytes(_response,"ASCII");
 //BA.debugLineNum = 60;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba,String _s_address,int _s_port,int _s_timeout) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 21;BA.debugLine="Public Sub Initialize(s_address As String, s_port";
 //BA.debugLineNum = 22;BA.debugLine="server_address = s_address";
_server_address = _s_address;
 //BA.debugLineNum = 23;BA.debugLine="server_port = s_port";
_server_port = _s_port;
 //BA.debugLineNum = 24;BA.debugLine="timeout = s_timeout";
_timeout = _s_timeout;
 //BA.debugLineNum = 25;BA.debugLine="TCPSocket.Initialize(\"TCPSocket\")";
_tcpsocket.Initialize("TCPSocket");
 //BA.debugLineNum = 26;BA.debugLine="End Sub";
return "";
}
public boolean  _isconnected() throws Exception{
 //BA.debugLineNum = 46;BA.debugLine="Public Sub isConnected As Boolean";
 //BA.debugLineNum = 47;BA.debugLine="Return TCPSocket.Connected";
if (true) return _tcpsocket.getConnected();
 //BA.debugLineNum = 48;BA.debugLine="End Sub";
return false;
}
public String  _registerconnectedevent(Object _target_module_name,String _target_method_name) throws Exception{
 //BA.debugLineNum = 28;BA.debugLine="Public Sub RegisterConnectedEvent(target_module_na";
 //BA.debugLineNum = 29;BA.debugLine="event_method_name = target_method_name";
_event_method_name = _target_method_name;
 //BA.debugLineNum = 30;BA.debugLine="event_module_name = target_module_name";
_event_module_name = _target_module_name;
 //BA.debugLineNum = 31;BA.debugLine="End Sub";
return "";
}
public String  _registerresponsereadyevent(Object _target_module_name,String _target_method_name) throws Exception{
 //BA.debugLineNum = 33;BA.debugLine="Public Sub RegisterResponseReadyEvent(target_modul";
 //BA.debugLineNum = 34;BA.debugLine="responded_event_method_name = target_method_name";
_responded_event_method_name = _target_method_name;
 //BA.debugLineNum = 35;BA.debugLine="responded_event_module = target_module_name";
_responded_event_module = _target_module_name;
 //BA.debugLineNum = 36;BA.debugLine="End Sub";
return "";
}
public String  _sendmessagestring(String _mess) throws Exception{
 //BA.debugLineNum = 71;BA.debugLine="Public Sub SendMessageString(mess As String)";
 //BA.debugLineNum = 72;BA.debugLine="If Astreams.IsInitialized = False Then Return";
if (_astreams.IsInitialized()==__c.False) { 
if (true) return "";};
 //BA.debugLineNum = 73;BA.debugLine="Astreams.Write(mess.GetBytes(\"ASCII\"))";
_astreams.Write(_mess.getBytes("ASCII"));
 //BA.debugLineNum = 74;BA.debugLine="End Sub";
return "";
}
public String  _tcpsocket_connected(boolean _successful) throws Exception{
 //BA.debugLineNum = 50;BA.debugLine="Private Sub TCPSocket_Connected (Successful As Boo";
 //BA.debugLineNum = 51;BA.debugLine="If Successful Then";
if (_successful) { 
 //BA.debugLineNum = 52;BA.debugLine="Astreams.InitializePrefix(TCPSocket.InputStream,";
_astreams.InitializePrefix(ba,_tcpsocket.getInputStream(),__c.False,_tcpsocket.getOutputStream(),"AStreams");
 //BA.debugLineNum = 53;BA.debugLine="CallSub(event_module_name, event_method_name)";
__c.CallSubNew(ba,_event_module_name,_event_method_name);
 };
 //BA.debugLineNum = 55;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
