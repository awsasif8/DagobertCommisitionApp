package com.hcl.dagobert.comm.app.controller;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class ConvertFile {

	public static void main(String[] args) {
	
		List<String> linesLis = new ArrayList<String>();
		SimpleDateFormat srcFormat=new SimpleDateFormat("dd-MM-yyyy");
		SimpleDateFormat dstFormat=new SimpleDateFormat("yyyy-MM-dd");
		try {
			BufferedReader br=new BufferedReader(new FileReader("ProductHandlingCodesIncludingAmounts.csv"));
			FileWriter writer=new FileWriter("phci.csv");
			String line=null;
			while((line=br.readLine())!=null)
			{
				linesLis.add(line);
				String[] values=line.split(";");
				
				StringBuffer sb=new StringBuffer();
				for(int i=0;i<values.length;i++)
				{
					if(i!=0)
						sb.append(",");
					String actValue=values[i];
					if(i==3)
					{
						try {
						actValue=	dstFormat.format(srcFormat.parse(actValue));
						} catch (ParseException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					
					sb.append(actValue);
				}
				
				sb.append("\r\n");
				System.out.println(sb.toString());
				System.out.println(line);
				writer.write(sb.toString());
				
			}
			
			writer.close();
			br.close();
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
}
