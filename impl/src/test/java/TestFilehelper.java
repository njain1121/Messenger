/*
 * Copyright © 2016 you/me/whatever and others.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package test.java;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import org.junit.Test;
import org.opendaylight.messenger.impl.FileHelper;
import org.opendaylight.messenger.impl.PeriodicElement;
import org.opendaylight.messenger.impl.PeriodicElements;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

public class TestFilehelper {

	@Test
	public void TestReadFile(){		
		FileHelper helper = new FileHelper();
		String csvFile = "./src/test/resources/Periodic Table of Elements.csv";
		List<PeriodicElement> listElem = helper.readFile(csvFile);
		assertNotNull(listElem);
		assertEquals(new Integer("1"), listElem.get(0).getAtomicNumber());
		assertEquals(118, listElem.size());
	}
	
	@Test
	public void TestReadIncorrectFile() throws Exception{		
		FileHelper helper = new FileHelper();
		String csvFile = "./src/test/resources/Invalid.csv";
		List<PeriodicElement> listElem = helper.readFile(csvFile);
		assertNotNull(listElem);
		assertEquals(0, listElem.size());
	}
	
	@Test
	public void TestWriteJsonFile() throws Exception{		
		FileHelper helper = new FileHelper();
		
		List<PeriodicElement> listElem = new ArrayList<PeriodicElement>();
		PeriodicElement element = new PeriodicElement();
		element.setAtomicNumber(1);
		element.setElement("Helium");
		listElem.add(element);
		String filePath ="./src/test/resources/PeriodicElement.json";
		helper.writeToJson(listElem, filePath);
		File file = new File("./src/test/resources/PeriodicElement.json");
		Gson gson = new Gson();
		JsonReader reader = new JsonReader(new FileReader(file));		
		PeriodicElements obj = gson.fromJson(reader, PeriodicElements.class) ;
		assertNotNull(obj);
		assertEquals(1,obj.getPeriodicElement().size());
		assertEquals(new Integer(1),obj.getPeriodicElement().get(0).getAtomicNumber());
		
	}
	
	@Test
	public void TestWriteXmlFile() throws Exception{		
		FileHelper helper = new FileHelper();
		List<PeriodicElement> listElem = new ArrayList<PeriodicElement>();
		PeriodicElement element = new PeriodicElement();
		element.setAtomicNumber(1);
		element.setElement("Helium");
		listElem.add(element);		
		String filePath ="./src/test/resources/PeriodicElement.xml";
		helper.writetoXml(listElem, filePath);
		JAXBContext jc = JAXBContext.newInstance(PeriodicElements.class);
		Unmarshaller unmarshaller = jc.createUnmarshaller();
		File file = new File("./src/test/resources/PeriodicElement.xml");
		PeriodicElements obj = (PeriodicElements) unmarshaller.unmarshal(file); 
		assertNotNull(obj);
		assertEquals(1, obj.getPeriodicElement().size());
		assertEquals("Helium", obj.getPeriodicElement().get(0).getElement());
	}
}


