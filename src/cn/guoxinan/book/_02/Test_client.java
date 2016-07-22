package cn.guoxinan.book._02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class Test_client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Socket socket;
			try {
				socket = new Socket("127.0.0.1",9998);
			
				InputStreamReader in=new InputStreamReader(socket.getInputStream());
				BufferedReader br=new BufferedReader(in);
				
				OutputStreamWriter ou=new OutputStreamWriter(socket.getOutputStream());
				BufferedWriter bw=new BufferedWriter(ou);
				PrintWriter pri=new PrintWriter(bw);
				System.out.println("client strat");
				BufferedReader reader;
				reader=new BufferedReader(new InputStreamReader(System.in));
				System.out.println("input your word");
				while(true){
					String str=reader.readLine();
					pri.println(str);
					pri.flush();
					if(str.equals("bye"))break;
					System.out.println(br.readLine());
				}
				
				socket.close();
			
			
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

}
