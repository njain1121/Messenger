/*
 * Copyright © 2016 you/me/whatever and others.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package org.opendaylight.messenger.impl;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class FileHelper {
	
	//private static final java.util.logging.Logger LOG = LoggerFactory.getLogger(FileHelper.class);
	
	public List<PeriodicElement> readFile(String csvFile){

	        BufferedReader br = null;
	        String line = "";
	        Pattern pattern = Pattern.compile(",");
	        List<PeriodicElement> elemList = new ArrayList<PeriodicElement>();

	        try {
	            br = new BufferedReader(new FileReader(csvFile));
	            br.readLine();
	            while ((line = br.readLine()) != null) {   
	                    String[] elementDetails = pattern.split(line); 
	                    if(elementDetails.length>0){
	                    	Integer atomicNo;
	                    	Integer period;
	                    	Integer group;
	                    	Double ionicRadius;
	                    	
	                    	//Handle for null non-string values
	                    	if(elementDetails[0]==null || ((String)(elementDetails[0])).isEmpty()){
	                    		atomicNo = null;
	                    	}else{
	                    		atomicNo = Integer.parseInt(elementDetails[0]);
	                    	}
	                    	
	                    	if(elementDetails[4]==null || ((String)(elementDetails[4])).isEmpty()){
	                    		period = null;
	                    	}else{
	                    		period = Integer.valueOf(elementDetails[4]);
	                    	}
	                    	
	                    	if(elementDetails[5]==null || ((String)(elementDetails[5])).isEmpty()){
	                    		group = null;
	                    	}else{
	                    		group = Integer.valueOf(elementDetails[5]);
	                    	}
	                    	
	                    	if(elementDetails[9]==null || ((String)(elementDetails[9])).isEmpty()){
	                    		ionicRadius = null;
	                    	}else{
	                    		ionicRadius = Double.valueOf(elementDetails[9]);
	                    	}
	                    	
	                    	PeriodicElement element = new PeriodicElement(atomicNo,(String)elementDetails[1], (String)elementDetails[2],
	                    			(String)elementDetails[3], period,group,	                    			
	                    			(String)elementDetails[6],
	                    			(String)elementDetails[7],
	                    			elementDetails[8],
	                    			ionicRadius);
	                    	/*,
	                    	 * 
	                    	 * To do 
	                    	 * Add support for remaining fields in similar fashion
	                    			Double.valueOf(elementDetails[10]),Double.valueOf(elementDetails[11]),
	                    			Double.valueOf(elementDetails[12]),	Double.valueOf(elementDetails[13]),Double.valueOf(elementDetails[14]),Double.valueOf(elementDetails[15]), 
	                    			Integer.valueOf(elementDetails[16]),(String)elementDetails[17], (String)elementDetails[18],
	                    			Double.valueOf(elementDetails[19]), (String)elementDetails[20],
	                    			Integer.valueOf(elementDetails[21]), Integer.valueOf(elementDetails[22]));  */
	                    	
	                    	//Add items to the final list
	                    	elemList.add(element);
	                    }

	            }

	        } catch (FileNotFoundException e) {
	            e.printStackTrace();	            
	        } catch (IOException e) {
	            e.printStackTrace();
	        } finally {
	            if (br != null) {
	                try {
	                    br.close();
	                } catch (IOException e) {
	                    e.printStackTrace();
	                }
	            }
	        }
	        // Use logger
	        //System.out.println("list:" +elemList);
	        return elemList;
	}
	
	public void writeToJson(List<PeriodicElement> elements, String filePath){
		try{
			PeriodicElements pElements = new PeriodicElements();
			pElements.setPeriodicElements(elements);
			Gson gson = new GsonBuilder().setPrettyPrinting().create();
			String jsonList = gson.toJson(pElements);
			Files.write(Paths.get(filePath), jsonList.getBytes(), StandardOpenOption.CREATE);
		}catch(Exception e){
			/*
			 * Use logger to log exception error level
			 */
			System.out.println("exception occured in writing json file :" + e);
			}
	}
	
	public void writetoXml(List<PeriodicElement> elements, String filePath){	
		try{
		
        PeriodicElements pElements = new PeriodicElements();
        pElements.setPeriodicElements(elements);
			
			JAXBContext jc = JAXBContext.newInstance(PeriodicElements.class);
			 Marshaller marshaller = jc.createMarshaller();
		     marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		     marshaller.marshal(pElements, new File(filePath));
		  
		}catch(Exception e){
			/*
			 * Use logger to log exception error level
			 */
			System.out.println("exception occured in writing xml file:" + e);
		  }
	   	
	}
	
	

}
