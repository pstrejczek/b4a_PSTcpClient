package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class tcpclient extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.tcpclient");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            if (BA.isShellModeRuntimeCheck(ba)) {
			    ba.raiseEvent2(null, true, "CREATE", true, "b4a.example.tcpclient",
                    ba);
                return;
		    }
        }
        ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
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
public String _responded_event_method_name = "";
public Object _responded_event_module = null;
public b4a.example.main _main = null;
public String  _initialize(b4a.example.tcpclient __ref,anywheresoftware.b4a.BA _ba,String _s_address,int _s_port,int _s_timeout) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="tcpclient";
RDebugUtils.currentLine=393216;
 //BA.debugLineNum = 393216;BA.debugLine="Public Sub Initialize(s_address As String, s_port As Int, s_timeout As Int)";
RDebugUtils.currentLine=393217;
 //BA.debugLineNum = 393217;BA.debugLine="server_address = s_address";
__ref._server_address = _s_address;
RDebugUtils.currentLine=393218;
 //BA.debugLineNum = 393218;BA.debugLine="server_port = s_port";
__ref._server_port = _s_port;
RDebugUtils.currentLine=393219;
 //BA.debugLineNum = 393219;BA.debugLine="timeout = s_timeout";
__ref._timeout = _s_timeout;
RDebugUtils.currentLine=393220;
 //BA.debugLineNum = 393220;BA.debugLine="TCPSocket.Initialize(\"TCPSocket\")";
__ref._tcpsocket.Initialize("TCPSocket");
RDebugUtils.currentLine=393221;
 //BA.debugLineNum = 393221;BA.debugLine="End Sub";
return "";
}
public String  _registerconnectedevent(b4a.example.tcpclient __ref,Object _target_module_name,String _target_method_name) throws Exception{
__ref = this;
RDebugUtils.currentModule="tcpclient";
RDebugUtils.currentLine=2883584;
 //BA.debugLineNum = 2883584;BA.debugLine="Public Sub RegisterConnectedEvent(target_module_name As Object, target_method_name As String)";
RDebugUtils.currentLine=2883585;
 //BA.debugLineNum = 2883585;BA.debugLine="event_method_name = target_method_name";
__ref._event_method_name = _target_method_name;
RDebugUtils.currentLine=2883586;
 //BA.debugLineNum = 2883586;BA.debugLine="event_module_name = target_module_name";
__ref._event_module_name = _target_module_name;
RDebugUtils.currentLine=2883587;
 //BA.debugLineNum = 2883587;BA.debugLine="End Sub";
return "";
}
public String  _registerresponsereadyevent(b4a.example.tcpclient __ref,Object _target_module_name,String _target_method_name) throws Exception{
__ref = this;
RDebugUtils.currentModule="tcpclient";
RDebugUtils.currentLine=3342336;
 //BA.debugLineNum = 3342336;BA.debugLine="Public Sub RegisterResponseReadyEvent(target_module_name As Object, target_method_name As String)";
RDebugUtils.currentLine=3342337;
 //BA.debugLineNum = 3342337;BA.debugLine="responded_event_method_name = target_method_name";
__ref._responded_event_method_name = _target_method_name;
RDebugUtils.currentLine=3342338;
 //BA.debugLineNum = 3342338;BA.debugLine="responded_event_module = target_module_name";
__ref._responded_event_module = _target_module_name;
RDebugUtils.currentLine=3342339;
 //BA.debugLineNum = 3342339;BA.debugLine="End Sub";
return "";
}
public String  _connect(b4a.example.tcpclient __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="tcpclient";
RDebugUtils.currentLine=1048576;
 //BA.debugLineNum = 1048576;BA.debugLine="Public Sub Connect";
RDebugUtils.currentLine=1048577;
 //BA.debugLineNum = 1048577;BA.debugLine="TCPSocket.Connect(server_address, server_port, timeout)";
__ref._tcpsocket.Connect(ba,__ref._server_address,__ref._server_port,__ref._timeout);
RDebugUtils.currentLine=1048578;
 //BA.debugLineNum = 1048578;BA.debugLine="End Sub";
return "";
}
public String  _sendmessagestring(b4a.example.tcpclient __ref,String _mess) throws Exception{
__ref = this;
RDebugUtils.currentModule="tcpclient";
RDebugUtils.currentLine=3407872;
 //BA.debugLineNum = 3407872;BA.debugLine="Public Sub SendMessageString(mess As String)";
RDebugUtils.currentLine=3407873;
 //BA.debugLineNum = 3407873;BA.debugLine="SendMessageByteArray(mess.GetBytes(\"UTF8\"))";
__ref._sendmessagebytearray(null,_mess.getBytes("UTF8"));
RDebugUtils.currentLine=3407874;
 //BA.debugLineNum = 3407874;BA.debugLine="End Sub";
return "";
}
public String  _getstringresponse(b4a.example.tcpclient __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="tcpclient";
anywheresoftware.b4a.agraham.byteconverter.ByteConverter _cv = null;
RDebugUtils.currentLine=3670016;
 //BA.debugLineNum = 3670016;BA.debugLine="Public Sub GetStringResponse As String";
RDebugUtils.currentLine=3670017;
 //BA.debugLineNum = 3670017;BA.debugLine="Dim cv As ByteConverter";
_cv = new anywheresoftware.b4a.agraham.byteconverter.ByteConverter();
RDebugUtils.currentLine=3670018;
 //BA.debugLineNum = 3670018;BA.debugLine="Return cv.StringFromBytes(response, \"UTF8\")";
if (true) return _cv.StringFromBytes(__ref._response,"UTF8");
RDebugUtils.currentLine=3670019;
 //BA.debugLineNum = 3670019;BA.debugLine="End Sub";
return "";
}
public String  _disconnect(b4a.example.tcpclient __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="tcpclient";
RDebugUtils.currentLine=1900544;
 //BA.debugLineNum = 1900544;BA.debugLine="Public Sub Disconnect";
RDebugUtils.currentLine=1900545;
 //BA.debugLineNum = 1900545;BA.debugLine="If TCPSocket.Connected Then TCPSocket.Close";
if (__ref._tcpsocket.getConnected()) { 
__ref._tcpsocket.Close();};
RDebugUtils.currentLine=1900546;
 //BA.debugLineNum = 1900546;BA.debugLine="End Sub";
return "";
}
public byte[]  _getarrayofbyteresponse(b4a.example.tcpclient __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="tcpclient";
RDebugUtils.currentLine=4325376;
 //BA.debugLineNum = 4325376;BA.debugLine="Public Sub GetArrayOfByteResponse As Byte()";
RDebugUtils.currentLine=4325377;
 //BA.debugLineNum = 4325377;BA.debugLine="Return response";
if (true) return __ref._response;
RDebugUtils.currentLine=4325378;
 //BA.debugLineNum = 4325378;BA.debugLine="End Sub";
return null;
}
public boolean  _isconnected(b4a.example.tcpclient __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="tcpclient";
RDebugUtils.currentLine=1179648;
 //BA.debugLineNum = 1179648;BA.debugLine="Public Sub isConnected As Boolean";
RDebugUtils.currentLine=1179649;
 //BA.debugLineNum = 1179649;BA.debugLine="Return TCPSocket.Connected";
if (true) return __ref._tcpsocket.getConnected();
RDebugUtils.currentLine=1179650;
 //BA.debugLineNum = 1179650;BA.debugLine="End Sub";
return false;
}
public String  _sendmessagebytearray(b4a.example.tcpclient __ref,byte[] _mess) throws Exception{
__ref = this;
RDebugUtils.currentModule="tcpclient";
anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper _os = null;
anywheresoftware.b4a.objects.streams.File.InputStreamWrapper _in_s = null;
byte[] _buffer = null;
long _start = 0L;
RDebugUtils.currentLine=3473408;
 //BA.debugLineNum = 3473408;BA.debugLine="Public Sub SendMessageByteArray(mess() As Byte)";
RDebugUtils.currentLine=3473409;
 //BA.debugLineNum = 3473409;BA.debugLine="Dim os As OutputStream";
_os = new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper();
RDebugUtils.currentLine=3473410;
 //BA.debugLineNum = 3473410;BA.debugLine="Dim in_s As InputStream";
_in_s = new anywheresoftware.b4a.objects.streams.File.InputStreamWrapper();
RDebugUtils.currentLine=3473411;
 //BA.debugLineNum = 3473411;BA.debugLine="Dim buffer(1024) As Byte";
_buffer = new byte[(int) (1024)];
;
RDebugUtils.currentLine=3473413;
 //BA.debugLineNum = 3473413;BA.debugLine="os = TCPSocket.OutputStream";
_os.setObject((java.io.OutputStream)(__ref._tcpsocket.getOutputStream()));
RDebugUtils.currentLine=3473414;
 //BA.debugLineNum = 3473414;BA.debugLine="os.WriteBytes(mess, 0, mess.Length)";
_os.WriteBytes(_mess,(int) (0),_mess.length);
RDebugUtils.currentLine=3473416;
 //BA.debugLineNum = 3473416;BA.debugLine="in_s = TCPSocket.InputStream";
_in_s.setObject((java.io.InputStream)(__ref._tcpsocket.getInputStream()));
RDebugUtils.currentLine=3473419;
 //BA.debugLineNum = 3473419;BA.debugLine="Dim start As Long = DateTime.now";
_start = __c.DateTime.getNow();
RDebugUtils.currentLine=3473420;
 //BA.debugLineNum = 3473420;BA.debugLine="Do Until (DateTime.now>start+timeout OR in_s.BytesAvailable > 0)";
while (!((__c.DateTime.getNow()>_start+__ref._timeout || _in_s.BytesAvailable()>0))) {
RDebugUtils.currentLine=3473421;
 //BA.debugLineNum = 3473421;BA.debugLine="DoEvents";
__c.DoEvents();
 }
;
RDebugUtils.currentLine=3473424;
 //BA.debugLineNum = 3473424;BA.debugLine="If in_s.BytesAvailable > 0 Then";
if (_in_s.BytesAvailable()>0) { 
RDebugUtils.currentLine=3473425;
 //BA.debugLineNum = 3473425;BA.debugLine="in_s.ReadBytes(buffer, 0, in_s.BytesAvailable)";
_in_s.ReadBytes(_buffer,(int) (0),_in_s.BytesAvailable());
RDebugUtils.currentLine=3473426;
 //BA.debugLineNum = 3473426;BA.debugLine="response = buffer";
__ref._response = _buffer;
RDebugUtils.currentLine=3473427;
 //BA.debugLineNum = 3473427;BA.debugLine="CallSub(responded_event_module, responded_event_method_name)";
__c.CallSubNew(getActivityBA(),__ref._responded_event_module,__ref._responded_event_method_name);
 }else {
RDebugUtils.currentLine=3473429;
 //BA.debugLineNum = 3473429;BA.debugLine="last_error = \"No response from server\"";
__ref._last_error = "No response from server";
 };
RDebugUtils.currentLine=3473431;
 //BA.debugLineNum = 3473431;BA.debugLine="End Sub";
return "";
}
public String  _tcpsocket_connected(b4a.example.tcpclient __ref,boolean _successful) throws Exception{
__ref = this;
RDebugUtils.currentModule="tcpclient";
RDebugUtils.currentLine=786432;
 //BA.debugLineNum = 786432;BA.debugLine="Private Sub TCPSocket_Connected (Successful As Boolean)";
RDebugUtils.currentLine=786433;
 //BA.debugLineNum = 786433;BA.debugLine="If Successful Then";
if (_successful) { 
RDebugUtils.currentLine=786434;
 //BA.debugLineNum = 786434;BA.debugLine="CallSub(event_module_name, event_method_name)";
__c.CallSubNew(getActivityBA(),__ref._event_module_name,__ref._event_method_name);
 };
RDebugUtils.currentLine=786436;
 //BA.debugLineNum = 786436;BA.debugLine="End Sub";
return "";
}
}