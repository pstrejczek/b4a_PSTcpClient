Type=Class
Version=7
ModulesStructureVersion=1
B4A=true
@EndOfDesignText@
'Class module
Sub Class_Globals
	Private TCPSocket As Socket
	Private server_address As String
	Private server_port As Int
	Private timeout As Int
	
	Private response() As Byte
	
	Private event_method_name As String
	Private event_module_name As Object
	
	Private last_error As String
	Private Astreams As AsyncStreams
	
	Private responded_event_method_name As String
	Private responded_event_module As Object
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize(s_address As String, s_port As Int, s_timeout As Int)
	server_address = s_address
	server_port = s_port
	timeout = s_timeout
	TCPSocket.Initialize("TCPSocket")
End Sub

Public Sub RegisterConnectedEvent(target_module_name As Object, target_method_name As String)
	event_method_name = target_method_name
	event_module_name = target_module_name
End Sub

Public Sub RegisterResponseReadyEvent(target_module_name As Object, target_method_name As String)
	responded_event_method_name = target_method_name
	responded_event_module = target_module_name
End Sub

Public Sub Connect
	TCPSocket.Connect(server_address, server_port, timeout)
End Sub

Public Sub Disconnect
	If TCPSocket.Connected Then TCPSocket.Close
End Sub

Public Sub isConnected As Boolean
	Return TCPSocket.Connected 
End Sub

Private Sub TCPSocket_Connected (Successful As Boolean)
	If Successful Then
		Astreams.InitializePrefix(TCPSocket.InputStream, False, TCPSocket.OutputStream, "AStreams")
		CallSub(event_module_name, event_method_name)
	End If
End Sub

Public Sub GetStringResponse As String
	Dim cv As ByteConverter
	Return cv.StringFromBytes(response, "ASCII")
End Sub

Sub AStreams_NewData (Buffer() As Byte)
	response = Buffer
	CallSub(responded_event_module, responded_event_method_name)
End Sub

Public Sub GetArrayOfByteResponse As Byte()
	Return response
End Sub

Public Sub SendMessageString(mess As String) 
	If Astreams.IsInitialized = False Then Return
	Astreams.Write(mess.GetBytes("ASCII"))
End Sub

Public Sub GetLastError As String
	Return last_error
End Sub

