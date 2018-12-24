package chapter03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Chapter3_3_4 {
	
	//2.将接口作为参数进行传递
	public static String processFile(BufferedReaderProcessor b)throws IOException {
		
		try(BufferedReader br = new BufferedReader(new FileReader("src/xxx.txt"))) {
			
			return b.process(br);
		}
	}
	public static void main(String[] args) throws IOException {
		//3.传递lambda
		String str = processFile((BufferedReader br)->br.readLine());
		System.out.println(str);
		str = processFile((BufferedReader br)->br.readLine()+br.readLine());
		System.out.println(str);
	}

}
//1.定义一个接口函数
interface BufferedReaderProcessor {
	String process(BufferedReader br)throws IOException;
}
