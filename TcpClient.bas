Type=Class
Version=3.82
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
		CallSub(event_module_name, event_method_name)
	End If
End Sub

Public Sub GetStringResponse As String
	Dim cv As ByteConverter
	Return cv.StringFromBytes(response, "UTF8")
End Sub

Public Sub GetArrayOfByteResponse As Byte()
	Return response
End Sub

Public Sub SendMessageString(mess As String) 
	SendMessageByteArray(mess.GetBytes("UTF8"))
End Sub

Public Sub SendMessageByteArray(mess() As Byte) 
	Dim os As OutputStream
	Dim in_s As InputStream
	Dim buffer(1024) As Byte
	
	os = TCPSocket.OutputStream
	os.WriteBytes(mess, 0, mess.Length)

	in_s = TCPSocket.InputStream

	' Wait for data to arrive in the buffer, if no data defined timeout is reached
	Dim start As Long = DateTime.now
	Do Until (DateTime.now>start+timeout OR in_s.BytesAvailable > 0)
     DoEvents
  	Loop
	
	If in_s.BytesAvailable > 0 Then
		in_s.ReadBytes(buffer, 0, in_s.BytesAvailable)
		response = buffer
		CallSub(responded_event_module, responded_event_method_name) 
	Else
		last_error = "No response from server"	
	End If
End Sub

Public Sub GetLastError As String
	Return last_error
End Sub

