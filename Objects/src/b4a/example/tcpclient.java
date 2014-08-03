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
RDebugUtils.currentLine=589824;
 //BA.debugLineNum = 589824;BA.debugLine="Public Sub Initialize(s_address As String, s_port As Int, s_timeout As Int)";
RDebugUtils.currentLine=589825;
 //BA.debugLineNum = 589825;BA.debugLine="server_address = s_address";
__ref._server_address = _s_address;
RDebugUtils.currentLine=589826;
 //BA.debugLineNum = 589826;BA.debugLine="server_port = s_port";
__ref._server_port = _s_port;
RDebugUtils.currentLine=589827;
 //BA.debugLineNum = 589827;BA.debugLine="timeout = s_timeout";
__ref._timeout = _s_timeout;
RDebugUtils.currentLine=589828;
 //BA.debugLineNum = 589828;BA.debugLine="TCPSocket.Initialize(\"TCPSocket\")";
__ref._tcpsocket.Initialize("TCPSocket");
RDebugUtils.currentLine=589829;
 //BA.debugLineNum = 589829;BA.debugLine="End Sub";
return "";
}
public String  _registerconnectedevent(b4a.example.tcpclient __ref,Object _target_module_name,String _target_method_name) throws Exception{
__ref = this;
RDebugUtils.currentModule="tcpclient";
RDebugUtils.currentLine=655360;
 //BA.debugLineNum = 655360;BA.debugLine="Public Sub RegisterConnectedEvent(target_module_name As Object, target_method_name As String)";
RDebugUtils.currentLine=655361;
 //BA.debugLineNum = 655361;BA.debugLine="event_method_name = target_method_name";
__ref._event_method_name = _target_method_name;
RDebugUtils.currentLine=655362;
 //BA.debugLineNum = 655362;BA.debugLine="event_module_name = target_module_name";
__ref._event_module_name = _target_module_name;
RDebugUtils.currentLine=655363;
 //BA.debugLineNum = 655363;BA.debugLine="End Sub";
return "";
}
public String  _registerresponsereadyevent(b4a.example.tcpclient __ref,Object _target_module_name,String _target_method_name) throws Exception{
__ref = this;
RDebugUtils.currentModule="tcpclient";
RDebugUtils.currentLine=720896;
 //BA.debugLineNum = 720896;BA.debugLine="Public Sub RegisterResponseReadyEvent(target_module_name As Object, target_method_name As String)";
RDebugUtils.currentLine=720897;
 //BA.debugLineNum = 720897;BA.debugLine="responded_event_method_name = target_method_name";
__ref._responded_event_method_name = _target_method_name;
RDebugUtils.currentLine=720898;
 //BA.debugLineNum = 720898;BA.debugLine="responded_event_module = target_module_name";
__ref._responded_event_module = _target_module_name;
RDebugUtils.currentLine=720899;
 //BA.debugLineNum = 720899;BA.debugLine="End Sub";
return "";
}
public String  _connect(b4a.example.tcpclient __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="tcpclient";
RDebugUtils.currentLine=786432;
 //BA.debugLineNum = 786432;BA.debugLine="Public Sub Connect";
RDebugUtils.currentLine=786433;
 //BA.debugLineNum = 786433;BA.debugLine="TCPSocket.Connect(server_address, server_port, timeout)";
__ref._tcpsocket.Connect(ba,__ref._server_address,__ref._server_port,__ref._timeout);
RDebugUtils.currentLine=786434;
 //BA.debugLineNum = 786434;BA.debugLine="End Sub";
return "";
}
public String  _sendmessagestring(b4a.example.tcpclient __ref,String _mess) throws Exception{
__ref = this;
RDebugUtils.currentModule="tcpclient";
RDebugUtils.currentLine=1179648;
 //BA.debugLineNum = 1179648;BA.debugLine="Public Sub SendMessageString(mess As String)";
RDebugUtils.currentLine=1179649;
 //BA.debugLineNum = 1179649;BA.debugLine="SendMessageByteArray(mess.GetBytes(\"UTF8\"))";
__ref._sendmessagebytearray(null,_mess.getBytes("UTF8"));
RDebugUtils.currentLine=1179650;
 //BA.debugLineNum = 1179650;BA.debugLine="End Sub";
return "";
}
public String  _getstringresponse(b4a.example.tcpclient __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="tcpclient";
anywheresoftware.b4a.agraham.byteconverter.ByteConverter _cv = null;
RDebugUtils.currentLine=1048576;
 //BA.debugLineNum = 1048576;BA.debugLine="Public Sub GetStringResponse As String";
RDebugUtils.currentLine=1048577;
 //BA.debugLineNum = 1048577;BA.debugLine="Dim cv As ByteConverter";
_cv = new anywheresoftware.b4a.agraham.byteconverter.ByteConverter();
RDebugUtils.currentLine=1048578;
 //BA.debugLineNum = 1048578;BA.debugLine="Return cv.StringFromBytes(response, \"UTF8\")";
if (true) return _cv.StringFromBytes(__ref._response,"UTF8");
RDebugUtils.currentLine=1048579;
 //BA.debugLineNum = 1048579;BA.debugLine="End Sub";
return "";
}
public String  _disconnect(b4a.example.tcpclient __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="tcpclient";
RDebugUtils.currentLine=851968;
 //BA.debugLineNum = 851968;BA.debugLine="Public Sub Disconnect";
RDebugUtils.currentLine=851969;
 //BA.debugLineNum = 851969;BA.debugLine="If TCPSocket.Connected Then TCPSocket.Close";
if (__ref._tcpsocket.getConnected()) { 
__ref._tcpsocket.Close();};
RDebugUtils.currentLine=851970;
 //BA.debugLineNum = 851970;BA.debugLine="End Sub";
return "";
}
public byte[]  _getarrayofbyteresponse(b4a.example.tcpclient __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="tcpclient";
RDebugUtils.currentLine=1114112;
 //BA.debugLineNum = 1114112;BA.debugLine="Public Sub GetArrayOfByteResponse As Byte()";
RDebugUtils.currentLine=1114113;
 //BA.debugLineNum = 1114113;BA.debugLine="Return response";
if (true) return __ref._response;
RDebugUtils.currentLine=1114114;
 //BA.debugLineNum = 1114114;BA.debugLine="End Sub";
return null;
}
public String  _getlasterror(b4a.example.tcpclient __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="tcpclient";
RDebugUtils.currentLine=1310720;
 //BA.debugLineNum = 1310720;BA.debugLine="Public Sub GetLastError As String";
RDebugUtils.currentLine=1310721;
 //BA.debugLineNum = 1310721;BA.debugLine="Return last_error";
if (true) return __ref._last_error;
RDebugUtils.currentLine=1310722;
 //BA.debugLineNum = 1310722;BA.debugLine="End Sub";
return "";
}
public boolean  _isconnected(b4a.example.tcpclient __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="tcpclient";
RDebugUtils.currentLine=917504;
 //BA.debugLineNum = 917504;BA.debugLine="Public Sub isConnected As Boolean";
RDebugUtils.currentLine=917505;
 //BA.debugLineNum = 917505;BA.debugLine="Return TCPSocket.Connected";
if (true) return __ref._tcpsocket.getConnected();
RDebugUtils.currentLine=917506;
 //BA.debugLineNum = 917506;BA.debugLine="End Sub";
return false;
}
public String  _sendmessagebytearray(b4a.example.tcpclient __ref,byte[] _mess) throws Exception{
__ref = this;
RDebugUtils.currentModule="tcpclient";
anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper _os = null;
anywheresoftware.b4a.objects.streams.File.InputStreamWrapper _in_s = null;
byte[] _buffer = null;
long _start = 0L;
RDebugUtils.currentLine=1245184;
 //BA.debugLineNum = 1245184;BA.debugLine="Public Sub SendMessageByteArray(mess() As Byte)";
RDebugUtils.currentLine=1245185;
 //BA.debugLineNum = 1245185;BA.debugLine="Dim os As OutputStream";
_os = new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper();
RDebugUtils.currentLine=1245186;
 //BA.debugLineNum = 1245186;BA.debugLine="Dim in_s As InputStream";
_in_s = new anywheresoftware.b4a.objects.streams.File.InputStreamWrapper();
RDebugUtils.currentLine=1245187;
 //BA.debugLineNum = 1245187;BA.debugLine="Dim buffer(1024) As Byte";
_buffer = new byte[(int) (1024)];
;
RDebugUtils.currentLine=1245189;
 //BA.debugLineNum = 1245189;BA.debugLine="os = TCPSocket.OutputStream";
_os.setObject((java.io.OutputStream)(__ref._tcpsocket.getOutputStream()));
RDebugUtils.currentLine=1245190;
 //BA.debugLineNum = 1245190;BA.debugLine="os.WriteBytes(mess, 0, mess.Length)";
_os.WriteBytes(_mess,(int) (0),_mess.length);
RDebugUtils.currentLine=1245192;
 //BA.debugLineNum = 1245192;BA.debugLine="in_s = TCPSocket.InputStream";
_in_s.setObject((java.io.InputStream)(__ref._tcpsocket.getInputStream()));
RDebugUtils.currentLine=1245195;
 //BA.debugLineNum = 1245195;BA.debugLine="Dim start As Long = DateTime.now";
_start = __c.DateTime.getNow();
RDebugUtils.currentLine=1245196;
 //BA.debugLineNum = 1245196;BA.debugLine="Do Until (DateTime.now>start+timeout OR in_s.BytesAvailable > 0)";
while (!((__c.DateTime.getNow()>_start+__ref._timeout || _in_s.BytesAvailable()>0))) {
RDebugUtils.currentLine=1245197;
 //BA.debugLineNum = 1245197;BA.debugLine="DoEvents";
__c.DoEvents();
 }
;
RDebugUtils.currentLine=1245200;
 //BA.debugLineNum = 1245200;BA.debugLine="If in_s.BytesAvailable > 0 Then";
if (_in_s.BytesAvailable()>0) { 
RDebugUtils.currentLine=1245201;
 //BA.debugLineNum = 1245201;BA.debugLine="in_s.ReadBytes(buffer, 0, in_s.BytesAvailable)";
_in_s.ReadBytes(_buffer,(int) (0),_in_s.BytesAvailable());
RDebugUtils.currentLine=1245202;
 //BA.debugLineNum = 1245202;BA.debugLine="response = buffer";
__ref._response = _buffer;
RDebugUtils.currentLine=1245203;
 //BA.debugLineNum = 1245203;BA.debugLine="CallSub(responded_event_module, responded_event_method_name)";
__c.CallSubNew(getActivityBA(),__ref._responded_event_module,__ref._responded_event_method_name);
 }else {
RDebugUtils.currentLine=1245205;
 //BA.debugLineNum = 1245205;BA.debugLine="last_error = \"No response from server\"";
__ref._last_error = "No response from server";
 };
RDebugUtils.currentLine=1245207;
 //BA.debugLineNum = 1245207;BA.debugLine="End Sub";
return "";
}
public String  _tcpsocket_connected(b4a.example.tcpclient __ref,boolean _successful) throws Exception{
__ref = this;
RDebugUtils.currentModule="tcpclient";
RDebugUtils.currentLine=983040;
 //BA.debugLineNum = 983040;BA.debugLine="Private Sub TCPSocket_Connected (Successful As Boolean)";
RDebugUtils.currentLine=983041;
 //BA.debugLineNum = 983041;BA.debugLine="If Successful Then";
if (_successful) { 
RDebugUtils.currentLine=983042;
 //BA.debugLineNum = 983042;BA.debugLine="CallSub(event_module_name, event_method_name)";
__c.CallSubNew(getActivityBA(),__ref._event_module_name,__ref._event_method_name);
 };
RDebugUtils.currentLine=983044;
 //BA.debugLineNum = 983044;BA.debugLine="End Sub";
return "";
}
}