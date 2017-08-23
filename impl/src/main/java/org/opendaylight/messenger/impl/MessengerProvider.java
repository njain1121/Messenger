/*
 * Copyright © 2016 you/me/whatever and others.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package org.opendaylight.messenger.impl;

import java.util.List;

import org.opendaylight.controller.md.sal.binding.api.DataBroker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MessengerProvider implements MessengerListener {

    private static final Logger LOG = LoggerFactory.getLogger(MessengerProvider.class);

    private final DataBroker dataBroker;

    public MessengerProvider(final DataBroker dataBroker) {
        this.dataBroker = dataBroker;
    }

    /**
     * Method called when the blueprint container is created.
     */
    public void init() {
        LOG.info("MessengerProvider Session Initiated");
    }
	
	/**
	* Method to read csv file and write objects to JSON and XML. 
	  This may need to be invoked at some event like OnMessengerConnection or as per needed.
	*/    
    public void readPeriodicElements(String csvFile){
      FileHelper helper = new FileHelper();      
	  List<PeriodicElement> listElem = helper.readFile(csvFile);
	  //Logging java object at Info level
	  LOG.info("Periodic Elements" + listElem);	
	  
	  //Writing object to JSON and XML files
	  String filePath = csvFile.substring(0, csvFile.lastIndexOf("/")) +"/PeriodicElement.json";
	  helper.writeToJson(listElem, filePath);
	  filePath = csvFile.substring(0, csvFile.lastIndexOf("/")) +"/PeriodicElement.xml";
	  helper.writetoXml(listElem, filePath);
    }

    /**
     * Method called when the blueprint container is destroyed.
     */
    public void close() {
        LOG.info("MessengerProvider Closed");
    }
}