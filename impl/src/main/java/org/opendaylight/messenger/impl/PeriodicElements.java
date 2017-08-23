/*
 * Copyright © 2016 you/me/whatever and others.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package org.opendaylight.messenger.impl;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="periodicElements")
public class PeriodicElements {

	@XmlElement(name = "periodicElement")
    private List<PeriodicElement> periodicElement = null;
 
    public List<PeriodicElement> getPeriodicElement() {
    	if(this.periodicElement ==null){
    		return new ArrayList<PeriodicElement>();
    	}else{
           return periodicElement;
    	}
    }
 
    public void setPeriodicElements(List<PeriodicElement> pElement) {
        this.periodicElement = pElement;
    }

	@Override
	public String toString() {
		return "PeriodicElements [periodicElement=" + periodicElement + "]";
	}
    
    
}
