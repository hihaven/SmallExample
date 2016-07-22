package cn.guoxinan.book._02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Test_Server {
	public static void main(String[] args){
		ServerSocket serversocket;
		System.out.println("server start0");
		try {
			serversocket = new ServerSocket(9998);
		
		Socket socket = serversocket.accept();
		System.out.println("server start");
		InputStreamReader in=new InputStreamReader(socket.getInputStream());
		BufferedReader br=new BufferedReader(in);
		
		OutputStreamWriter ow=new OutputStreamWriter(socket.getOutputStream());
		BufferedWriter bw=new BufferedWriter(ow);
		PrintWriter pri=new PrintWriter(bw);
		String str;
		System.out.println("server has begin");
		while((str=br.readLine())!=null){
			System.out.println(str);
			pri.print("the client call:");
			pri.println(str);
			pri.flush();
			if(str.equals("bye")){
				break;
			}
			
		}
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
