package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class tcpclient_subs_0 {


public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private TCPSocket As Socket";
tcpclient._tcpsocket = RemoteObject.createNew ("anywheresoftware.b4a.objects.SocketWrapper");__ref.setFieldClass("b4a.example.tcpclient","_tcpsocket",tcpclient._tcpsocket);
 //BA.debugLineNum = 4;BA.debugLine="Private server_address As String";
tcpclient._server_address = RemoteObject.createImmutable("");__ref.setFieldClass("b4a.example.tcpclient","_server_address",tcpclient._server_address);
 //BA.debugLineNum = 5;BA.debugLine="Private server_port As Int";
tcpclient._server_port = RemoteObject.createImmutable(0);__ref.setFieldClass("b4a.example.tcpclient","_server_port",tcpclient._server_port);
 //BA.debugLineNum = 6;BA.debugLine="Private timeout As Int";
tcpclient._timeout = RemoteObject.createImmutable(0);__ref.setFieldClass("b4a.example.tcpclient","_timeout",tcpclient._timeout);
 //BA.debugLineNum = 8;BA.debugLine="Private response() As Byte";
tcpclient._response = RemoteObject.createNewArray ("byte", new int[] {0}, new Object[]{});__ref.setFieldClass("b4a.example.tcpclient","_response",tcpclient._response);
 //BA.debugLineNum = 10;BA.debugLine="Private event_method_name As String";
tcpclient._event_method_name = RemoteObject.createImmutable("");__ref.setFieldClass("b4a.example.tcpclient","_event_method_name",tcpclient._event_method_name);
 //BA.debugLineNum = 11;BA.debugLine="Private event_module_name As Object";
tcpclient._event_module_name = RemoteObject.createNew ("Object");__ref.setFieldClass("b4a.example.tcpclient","_event_module_name",tcpclient._event_module_name);
 //BA.debugLineNum = 13;BA.debugLine="Private last_error As String";
tcpclient._last_error = RemoteObject.createImmutable("");__ref.setFieldClass("b4a.example.tcpclient","_last_error",tcpclient._last_error);
 //BA.debugLineNum = 15;BA.debugLine="Private responded_event_method_name As String";
tcpclient._responded_event_method_name = RemoteObject.createImmutable("");__ref.setFieldClass("b4a.example.tcpclient","_responded_event_method_name",tcpclient._responded_event_method_name);
 //BA.debugLineNum = 16;BA.debugLine="Private responded_event_module As Object";
tcpclient._responded_event_module = RemoteObject.createNew ("Object");__ref.setFieldClass("b4a.example.tcpclient","_responded_event_module",tcpclient._responded_event_module);
 //BA.debugLineNum = 17;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _connect(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Connect (tcpclient) ","tcpclient",1,__ref.getField(false, "ba"),__ref,37);
if (RapidSub.canDelegate("connect")) return __ref.runUserSub(false, "tcpclient","connect", __ref);
 BA.debugLineNum = 37;BA.debugLine="Public Sub Connect";
Debug.ShouldStop(16);
 BA.debugLineNum = 38;BA.debugLine="TCPSocket.Connect(server_address, server_port, timeout)";
Debug.ShouldStop(32);
__ref.getFieldClass("b4a.example.tcpclient", false,"_tcpsocket").runVoidMethod ("Connect",__ref.getField(false, "ba"),(Object)(__ref.getFieldClass("b4a.example.tcpclient", true,"_server_address")),(Object)(__ref.getFieldClass("b4a.example.tcpclient", true,"_server_port")),(Object)(__ref.getFieldClass("b4a.example.tcpclient", true,"_timeout")));
 BA.debugLineNum = 39;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _disconnect(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Disconnect (tcpclient) ","tcpclient",1,__ref.getField(false, "ba"),__ref,41);
if (RapidSub.canDelegate("disconnect")) return __ref.runUserSub(false, "tcpclient","disconnect", __ref);
 BA.debugLineNum = 41;BA.debugLine="Public Sub Disconnect";
Debug.ShouldStop(256);
 BA.debugLineNum = 42;BA.debugLine="If TCPSocket.Connected Then TCPSocket.Close";
Debug.ShouldStop(512);
if (__ref.getFieldClass("b4a.example.tcpclient", false,"_tcpsocket").runMethod(true,"getConnected").<Boolean>get().booleanValue()) { 
__ref.getFieldClass("b4a.example.tcpclient", false,"_tcpsocket").runVoidMethod ("Close");};
 BA.debugLineNum = 43;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getarrayofbyteresponse(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetArrayOfByteResponse (tcpclient) ","tcpclient",1,__ref.getField(false, "ba"),__ref,60);
if (RapidSub.canDelegate("getarrayofbyteresponse")) return __ref.runUserSub(false, "tcpclient","getarrayofbyteresponse", __ref);
 BA.debugLineNum = 60;BA.debugLine="Public Sub GetArrayOfByteResponse As Byte()";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 61;BA.debugLine="Return response";
Debug.ShouldStop(268435456);
if (true) return __ref.getFieldClass("b4a.example.tcpclient", false,"_response");
 BA.debugLineNum = 62;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getlasterror(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetLastError (tcpclient) ","tcpclient",1,__ref.getField(false, "ba"),__ref,93);
if (RapidSub.canDelegate("getlasterror")) return __ref.runUserSub(false, "tcpclient","getlasterror", __ref);
 BA.debugLineNum = 93;BA.debugLine="Public Sub GetLastError As String";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 94;BA.debugLine="Return last_error";
Debug.ShouldStop(536870912);
if (true) return __ref.getFieldClass("b4a.example.tcpclient", true,"_last_error");
 BA.debugLineNum = 95;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getstringresponse(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetStringResponse (tcpclient) ","tcpclient",1,__ref.getField(false, "ba"),__ref,55);
if (RapidSub.canDelegate("getstringresponse")) return __ref.runUserSub(false, "tcpclient","getstringresponse", __ref);
RemoteObject _cv = RemoteObject.declareNull("anywheresoftware.b4a.agraham.byteconverter.ByteConverter");
 BA.debugLineNum = 55;BA.debugLine="Public Sub GetStringResponse As String";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 56;BA.debugLine="Dim cv As ByteConverter";
Debug.ShouldStop(8388608);
_cv = RemoteObject.createNew ("anywheresoftware.b4a.agraham.byteconverter.ByteConverter");Debug.locals.put("cv", _cv);
 BA.debugLineNum = 57;BA.debugLine="Return cv.StringFromBytes(response, \"UTF8\")";
Debug.ShouldStop(16777216);
if (true) return _cv.runMethod(true,"StringFromBytes",(Object)(__ref.getFieldClass("b4a.example.tcpclient", false,"_response")),(Object)(BA.ObjectToString("UTF8")));
 BA.debugLineNum = 58;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _s_address,RemoteObject _s_port,RemoteObject _s_timeout) throws Exception{
try {
		Debug.PushSubsStack("Initialize (tcpclient) ","tcpclient",1,__ref.getField(false, "ba"),__ref,20);
if (RapidSub.canDelegate("initialize")) return __ref.runUserSub(false, "tcpclient","initialize", __ref, _ba, _s_address, _s_port, _s_timeout);
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("s_address", _s_address);
Debug.locals.put("s_port", _s_port);
Debug.locals.put("s_timeout", _s_timeout);
 BA.debugLineNum = 20;BA.debugLine="Public Sub Initialize(s_address As String, s_port As Int, s_timeout As Int)";
Debug.ShouldStop(524288);
 BA.debugLineNum = 21;BA.debugLine="server_address = s_address";
Debug.ShouldStop(1048576);
__ref.setFieldClass("b4a.example.tcpclient", "_server_address",_s_address);
 BA.debugLineNum = 22;BA.debugLine="server_port = s_port";
Debug.ShouldStop(2097152);
__ref.setFieldClass("b4a.example.tcpclient", "_server_port",_s_port);
 BA.debugLineNum = 23;BA.debugLine="timeout = s_timeout";
Debug.ShouldStop(4194304);
__ref.setFieldClass("b4a.example.tcpclient", "_timeout",_s_timeout);
 BA.debugLineNum = 24;BA.debugLine="TCPSocket.Initialize(\"TCPSocket\")";
Debug.ShouldStop(8388608);
__ref.getFieldClass("b4a.example.tcpclient", false,"_tcpsocket").runVoidMethod ("Initialize",(Object)(BA.ObjectToString("TCPSocket")));
 BA.debugLineNum = 25;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _isconnected(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("isConnected (tcpclient) ","tcpclient",1,__ref.getField(false, "ba"),__ref,45);
if (RapidSub.canDelegate("isconnected")) return __ref.runUserSub(false, "tcpclient","isconnected", __ref);
 BA.debugLineNum = 45;BA.debugLine="Public Sub isConnected As Boolean";
Debug.ShouldStop(4096);
 BA.debugLineNum = 46;BA.debugLine="Return TCPSocket.Connected";
Debug.ShouldStop(8192);
if (true) return __ref.getFieldClass("b4a.example.tcpclient", false,"_tcpsocket").runMethod(true,"getConnected");
 BA.debugLineNum = 47;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _registerconnectedevent(RemoteObject __ref,RemoteObject _target_module_name,RemoteObject _target_method_name) throws Exception{
try {
		Debug.PushSubsStack("RegisterConnectedEvent (tcpclient) ","tcpclient",1,__ref.getField(false, "ba"),__ref,27);
if (RapidSub.canDelegate("registerconnectedevent")) return __ref.runUserSub(false, "tcpclient","registerconnectedevent", __ref, _target_module_name, _target_method_name);
Debug.locals.put("target_module_name", _target_module_name);
Debug.locals.put("target_method_name", _target_method_name);
 BA.debugLineNum = 27;BA.debugLine="Public Sub RegisterConnectedEvent(target_module_name As Object, target_method_name As String)";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 28;BA.debugLine="event_method_name = target_method_name";
Debug.ShouldStop(134217728);
__ref.setFieldClass("b4a.example.tcpclient", "_event_method_name",_target_method_name);
 BA.debugLineNum = 29;BA.debugLine="event_module_name = target_module_name";
Debug.ShouldStop(268435456);
__ref.setFieldClass("b4a.example.tcpclient", "_event_module_name",_target_module_name);
 BA.debugLineNum = 30;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _registerresponsereadyevent(RemoteObject __ref,RemoteObject _target_module_name,RemoteObject _target_method_name) throws Exception{
try {
		Debug.PushSubsStack("RegisterResponseReadyEvent (tcpclient) ","tcpclient",1,__ref.getField(false, "ba"),__ref,32);
if (RapidSub.canDelegate("registerresponsereadyevent")) return __ref.runUserSub(false, "tcpclient","registerresponsereadyevent", __ref, _target_module_name, _target_method_name);
Debug.locals.put("target_module_name", _target_module_name);
Debug.locals.put("target_method_name", _target_method_name);
 BA.debugLineNum = 32;BA.debugLine="Public Sub RegisterResponseReadyEvent(target_module_name As Object, target_method_name As String)";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 33;BA.debugLine="responded_event_method_name = target_method_name";
Debug.ShouldStop(1);
__ref.setFieldClass("b4a.example.tcpclient", "_responded_event_method_name",_target_method_name);
 BA.debugLineNum = 34;BA.debugLine="responded_event_module = target_module_name";
Debug.ShouldStop(2);
__ref.setFieldClass("b4a.example.tcpclient", "_responded_event_module",_target_module_name);
 BA.debugLineNum = 35;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _sendmessagebytearray(RemoteObject __ref,RemoteObject _mess) throws Exception{
try {
		Debug.PushSubsStack("SendMessageByteArray (tcpclient) ","tcpclient",1,__ref.getField(false, "ba"),__ref,68);
if (RapidSub.canDelegate("sendmessagebytearray")) return __ref.runUserSub(false, "tcpclient","sendmessagebytearray", __ref, _mess);
RemoteObject _os = RemoteObject.declareNull("anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper");
RemoteObject _in_s = RemoteObject.declareNull("anywheresoftware.b4a.objects.streams.File.InputStreamWrapper");
RemoteObject _buffer = null;
RemoteObject _start = RemoteObject.createImmutable(0L);
Debug.locals.put("mess", _mess);
 BA.debugLineNum = 68;BA.debugLine="Public Sub SendMessageByteArray(mess() As Byte)";
Debug.ShouldStop(8);
 BA.debugLineNum = 69;BA.debugLine="Dim os As OutputStream";
Debug.ShouldStop(16);
_os = RemoteObject.createNew ("anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper");Debug.locals.put("os", _os);
 BA.debugLineNum = 70;BA.debugLine="Dim in_s As InputStream";
Debug.ShouldStop(32);
_in_s = RemoteObject.createNew ("anywheresoftware.b4a.objects.streams.File.InputStreamWrapper");Debug.locals.put("in_s", _in_s);
 BA.debugLineNum = 71;BA.debugLine="Dim buffer(1024) As Byte";
Debug.ShouldStop(64);
_buffer = RemoteObject.createNewArray ("byte", new int[] {1024}, new Object[]{});Debug.locals.put("buffer", _buffer);
 BA.debugLineNum = 73;BA.debugLine="os = TCPSocket.OutputStream";
Debug.ShouldStop(256);
_os.setObject(__ref.getFieldClass("b4a.example.tcpclient", false,"_tcpsocket").runMethod(false,"getOutputStream"));
 BA.debugLineNum = 74;BA.debugLine="os.WriteBytes(mess, 0, mess.Length)";
Debug.ShouldStop(512);
_os.runVoidMethod ("WriteBytes",(Object)(_mess),(Object)(BA.numberCast(int.class, 0)),(Object)(_mess.getField(true,"length")));
 BA.debugLineNum = 76;BA.debugLine="in_s = TCPSocket.InputStream";
Debug.ShouldStop(2048);
_in_s.setObject(__ref.getFieldClass("b4a.example.tcpclient", false,"_tcpsocket").runMethod(false,"getInputStream"));
 BA.debugLineNum = 79;BA.debugLine="Dim start As Long = DateTime.now";
Debug.ShouldStop(16384);
_start = tcpclient.__c.getField(false,"DateTime").runMethod(true,"getNow");Debug.locals.put("start", _start);Debug.locals.put("start", _start);
 BA.debugLineNum = 80;BA.debugLine="Do Until (DateTime.now>start+timeout OR in_s.BytesAvailable > 0)";
Debug.ShouldStop(32768);
while (!((RemoteObject.solveBoolean(">",tcpclient.__c.getField(false,"DateTime").runMethod(true,"getNow"),BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {_start,__ref.getFieldClass("b4a.example.tcpclient", true,"_timeout")}, "+",1, 2))) || RemoteObject.solveBoolean(">",_in_s.runMethod(true,"BytesAvailable"),BA.numberCast(double.class, 0))))) {
 BA.debugLineNum = 81;BA.debugLine="DoEvents";
Debug.ShouldStop(65536);
tcpclient.__c.runVoidMethodAndSync ("DoEvents");
 }
;
 BA.debugLineNum = 84;BA.debugLine="If in_s.BytesAvailable > 0 Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean(">",_in_s.runMethod(true,"BytesAvailable"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 85;BA.debugLine="in_s.ReadBytes(buffer, 0, in_s.BytesAvailable)";
Debug.ShouldStop(1048576);
_in_s.runVoidMethod ("ReadBytes",(Object)(_buffer),(Object)(BA.numberCast(int.class, 0)),(Object)(_in_s.runMethod(true,"BytesAvailable")));
 BA.debugLineNum = 86;BA.debugLine="response = buffer";
Debug.ShouldStop(2097152);
__ref.setFieldClass("b4a.example.tcpclient", "_response",_buffer);
 BA.debugLineNum = 87;BA.debugLine="CallSub(responded_event_module, responded_event_method_name)";
Debug.ShouldStop(4194304);
tcpclient.__c.runMethodAndSync(false,"CallSubNew",__ref.runMethod(false,"getActivityBA"),(Object)(__ref.getFieldClass("b4a.example.tcpclient", false,"_responded_event_module")),(Object)(__ref.getFieldClass("b4a.example.tcpclient", true,"_responded_event_method_name")));
 }else {
 BA.debugLineNum = 89;BA.debugLine="last_error = \"No response from server\"";
Debug.ShouldStop(16777216);
__ref.setFieldClass("b4a.example.tcpclient", "_last_error",BA.ObjectToString("No response from server"));
 };
 BA.debugLineNum = 91;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _sendmessagestring(RemoteObject __ref,RemoteObject _mess) throws Exception{
try {
		Debug.PushSubsStack("SendMessageString (tcpclient) ","tcpclient",1,__ref.getField(false, "ba"),__ref,64);
if (RapidSub.canDelegate("sendmessagestring")) return __ref.runUserSub(false, "tcpclient","sendmessagestring", __ref, _mess);
Debug.locals.put("mess", _mess);
 BA.debugLineNum = 64;BA.debugLine="Public Sub SendMessageString(mess As String)";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 65;BA.debugLine="SendMessageByteArray(mess.GetBytes(\"UTF8\"))";
Debug.ShouldStop(1);
__ref.runClassMethod (b4a.example.tcpclient.class, "_sendmessagebytearray",(Object)(_mess.runMethod(false,"getBytes",(Object)(BA.ObjectToString("UTF8")))));
 BA.debugLineNum = 66;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _tcpsocket_connected(RemoteObject __ref,RemoteObject _successful) throws Exception{
try {
		Debug.PushSubsStack("TCPSocket_Connected (tcpclient) ","tcpclient",1,__ref.getField(false, "ba"),__ref,49);
if (RapidSub.canDelegate("tcpsocket_connected")) return __ref.runUserSub(false, "tcpclient","tcpsocket_connected", __ref, _successful);
Debug.locals.put("Successful", _successful);
 BA.debugLineNum = 49;BA.debugLine="Private Sub TCPSocket_Connected (Successful As Boolean)";
Debug.ShouldStop(65536);
 BA.debugLineNum = 50;BA.debugLine="If Successful Then";
Debug.ShouldStop(131072);
if (_successful.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 51;BA.debugLine="CallSub(event_module_name, event_method_name)";
Debug.ShouldStop(262144);
tcpclient.__c.runMethodAndSync(false,"CallSubNew",__ref.runMethod(false,"getActivityBA"),(Object)(__ref.getFieldClass("b4a.example.tcpclient", false,"_event_module_name")),(Object)(__ref.getFieldClass("b4a.example.tcpclient", true,"_event_method_name")));
 };
 BA.debugLineNum = 53;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
}