package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class main_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,32);
if (RapidSub.canDelegate("activity_create")) return main.remoteMe.runUserSub(false, "main","activity_create", _firsttime);
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 32;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 34;BA.debugLine="Activity.LoadLayout(\"PSTCPLayout\")";
Debug.ShouldStop(2);
main.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(BA.ObjectToString("PSTCPLayout")),main.mostCurrent.activityBA);
 BA.debugLineNum = 35;BA.debugLine="EResponse.Enabled = False";
Debug.ShouldStop(4);
main.mostCurrent._eresponse.runMethod(true,"setEnabled",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 36;BA.debugLine="EResponse.TextColor = Colors.Green";
Debug.ShouldStop(8);
main.mostCurrent._eresponse.runMethod(true,"setTextColor",main.mostCurrent.__c.getField(false,"Colors").getField(true,"Green"));
 BA.debugLineNum = 37;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,43);
if (RapidSub.canDelegate("activity_pause")) return main.remoteMe.runUserSub(false, "main","activity_pause", _userclosed);
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 43;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(1024);
 BA.debugLineNum = 45;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,39);
if (RapidSub.canDelegate("activity_resume")) return main.remoteMe.runUserSub(false, "main","activity_resume");
 BA.debugLineNum = 39;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(64);
 BA.debugLineNum = 41;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _bsend_click() throws Exception{
try {
		Debug.PushSubsStack("BSend_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,55);
if (RapidSub.canDelegate("bsend_click")) return main.remoteMe.runUserSub(false, "main","bsend_click");
RemoteObject _s_address = RemoteObject.createImmutable("");
RemoteObject _s_port = RemoteObject.createImmutable(0);
 BA.debugLineNum = 55;BA.debugLine="Sub BSend_Click";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 56;BA.debugLine="Dim s_address As String = EAddress.Text";
Debug.ShouldStop(8388608);
_s_address = main.mostCurrent._eaddress.runMethod(true,"getText");Debug.locals.put("s_address", _s_address);Debug.locals.put("s_address", _s_address);
 BA.debugLineNum = 57;BA.debugLine="Dim s_port As Int = EPort.Text";
Debug.ShouldStop(16777216);
_s_port = BA.numberCast(int.class, main.mostCurrent._eport.runMethod(true,"getText"));Debug.locals.put("s_port", _s_port);Debug.locals.put("s_port", _s_port);
 BA.debugLineNum = 59;BA.debugLine="Client.Initialize(s_address, s_port, 5000)";
Debug.ShouldStop(67108864);
main.mostCurrent._client.runClassMethod (b4a.example.tcpclient.class, "_initialize",main.processBA,(Object)(_s_address),(Object)(_s_port),(Object)(BA.numberCast(int.class, 5000)));
 BA.debugLineNum = 60;BA.debugLine="Client.RegisterConnectedEvent(Me, \"Client_Connected\")";
Debug.ShouldStop(134217728);
main.mostCurrent._client.runClassMethod (b4a.example.tcpclient.class, "_registerconnectedevent",(Object)(main.getObject()),(Object)(BA.ObjectToString("Client_Connected")));
 BA.debugLineNum = 61;BA.debugLine="Client.RegisterResponseReadyEvent(Me, \"Client_ResponseReady\")";
Debug.ShouldStop(268435456);
main.mostCurrent._client.runClassMethod (b4a.example.tcpclient.class, "_registerresponsereadyevent",(Object)(main.getObject()),(Object)(BA.ObjectToString("Client_ResponseReady")));
 BA.debugLineNum = 63;BA.debugLine="Client.Connect";
Debug.ShouldStop(1073741824);
main.mostCurrent._client.runClassMethod (b4a.example.tcpclient.class, "_connect");
 BA.debugLineNum = 64;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _client_connected() throws Exception{
try {
		Debug.PushSubsStack("Client_Connected (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,47);
if (RapidSub.canDelegate("client_connected")) return main.remoteMe.runUserSub(false, "main","client_connected");
 BA.debugLineNum = 47;BA.debugLine="Sub Client_Connected";
Debug.ShouldStop(16384);
 BA.debugLineNum = 48;BA.debugLine="Client.SendMessageString(EMessage.Text)";
Debug.ShouldStop(32768);
main.mostCurrent._client.runClassMethod (b4a.example.tcpclient.class, "_sendmessagestring",(Object)(main.mostCurrent._emessage.runMethod(true,"getText")));
 BA.debugLineNum = 49;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _client_responseready() throws Exception{
try {
		Debug.PushSubsStack("Client_ResponseReady (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,51);
if (RapidSub.canDelegate("client_responseready")) return main.remoteMe.runUserSub(false, "main","client_responseready");
 BA.debugLineNum = 51;BA.debugLine="Sub Client_ResponseReady";
Debug.ShouldStop(262144);
 BA.debugLineNum = 52;BA.debugLine="EResponse.Text = Client.GetStringResponse";
Debug.ShouldStop(524288);
main.mostCurrent._eresponse.runMethodAndSync(true,"setText",(main.mostCurrent._client.runClassMethod (b4a.example.tcpclient.class, "_getstringresponse")));
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

public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        main_subs_0._process_globals();
main.myClass = BA.getDeviceClass ("b4a.example.main");
tcpclient.myClass = BA.getDeviceClass ("b4a.example.tcpclient");
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 21;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 24;BA.debugLine="Private EMessage As EditText";
main.mostCurrent._emessage = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 25;BA.debugLine="Private EResponse As EditText";
main.mostCurrent._eresponse = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 26;BA.debugLine="Private EAddress As EditText";
main.mostCurrent._eaddress = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 27;BA.debugLine="Private EPort As EditText";
main.mostCurrent._eport = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 29;BA.debugLine="Private Client As TcpClient";
main.mostCurrent._client = RemoteObject.createNew ("b4a.example.tcpclient");
 //BA.debugLineNum = 30;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 15;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 19;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}