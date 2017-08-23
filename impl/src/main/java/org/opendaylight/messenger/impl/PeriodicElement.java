/*
 * Copyright © 2016 you/me/whatever and others.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package org.opendaylight.messenger.impl;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="periodicElement")
public class PeriodicElement {
	

	
Integer atomicNumber;
	
	String element;
	
	String symbol;
	
	String atomicWeight;
	
	Integer period;
	
	Integer group;
	
	String phase;
	
	String mostStableCrystal;
	
	String type;
	
	Double ionicRadius;
	
	Double atomicRadius;
	
	Double electroNegativity;
	
	Double firstIonizedPotential;
	
	Double density;
	
	Double meltingPoint;
	
	Double boilingPoint;
	
	Integer isotopes;
	
	String discoverer;
	
	String yearOfDispatch;
	
	Double heatCapacity;
	
	String electronConfig;
	
	Integer displayRow;
	
	Integer displayColumn;
	
	public PeriodicElement(){
		
	}
	
	public PeriodicElement(Integer atomicNumber, String element, String symbol,
			String atomicWeight, Integer period, Integer group, String phase,
			String mostStableCrystal, String type, Double ionicRadius,
			Double atomicRadius, Double electroNegativity,
			Double firstIonizedPotential, Double density, Double meltingPoint,
			Double boilingPoint, Integer isotopes, String discoverer,
			String yearOfDispatch, Double heatCapacity, String electronConfig,
			Integer displayRow, Integer displayColumn) {
		super();
		this.atomicNumber = atomicNumber;
		this.element = element;
		this.symbol = symbol;
		this.atomicWeight = atomicWeight;
		this.period = period;
		this.group = group;
		this.phase = phase;
		this.mostStableCrystal = mostStableCrystal;
		this.type = type;
		this.ionicRadius = ionicRadius;
		this.atomicRadius = atomicRadius;
		this.electroNegativity = electroNegativity;
		this.firstIonizedPotential = firstIonizedPotential;
		this.density = density;
		this.meltingPoint = meltingPoint;
		this.boilingPoint = boilingPoint;
		this.isotopes = isotopes;
		this.discoverer = discoverer;
		this.yearOfDispatch = yearOfDispatch;
		this.heatCapacity = heatCapacity;
		this.electronConfig = electronConfig;
		this.displayRow = displayRow;
		this.displayColumn = displayColumn;
	}

	
	//For test purpose only for quick testing of two fields
	public PeriodicElement(Integer atomicNumber, String element,String symbol,
			String atomicWeight, Integer period, Integer group, String phase,
			String mostStableCrystal, String type, Double ionicRadius ){
		super();
		this.atomicNumber=atomicNumber;
		this.element = element;
		this.symbol = symbol;
		this.atomicWeight = atomicWeight;
		this.period = period;
		this.group = group;
		this.phase = phase;
		this.mostStableCrystal = mostStableCrystal;
		this.type = type;
		this.ionicRadius = ionicRadius;		
	}
	
	
	public String getPhase() {
		return phase;
	}

	public void setPhase(String phase) {
		this.phase = phase;
	}

	public Integer getAtomicNumber() {
		return atomicNumber;
	}
	public void setAtomicNumber(Integer atomicNumber) {
		this.atomicNumber = atomicNumber;
	}
	public String getElement() {
		return element;
	}
	public void setElement(String element) {
		this.element = element;
	}
	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	public String getAtomicWeight() {
		return atomicWeight;
	}
	public void setAtomicWeight(String atomicWeight) {
		this.atomicWeight = atomicWeight;
	}
	
	

	public Integer getPeriod() {
		return period;
	}

	public void setPeriod(Integer period) {
		this.period = period;
	}

	public Integer getGroup() {
		return group;
	}

	public void setGroup(Integer group) {
		this.group = group;
	}

	public String getMostStableCrystal() {
		return mostStableCrystal;
	}

	public void setMostStableCrystal(String mostStableCrystal) {
		this.mostStableCrystal = mostStableCrystal;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Double getIonicRadius() {
		return ionicRadius;
	}

	public void setIonicRadius(Double ionicRadius) {
		this.ionicRadius = ionicRadius;
	}

	public Double getAtomicRadius() {
		return atomicRadius;
	}

	public void setAtomicRadius(Double atomicRadius) {
		this.atomicRadius = atomicRadius;
	}

	public Double getElectroNegativity() {
		return electroNegativity;
	}

	public void setElectroNegativity(Double electroNegativity) {
		this.electroNegativity = electroNegativity;
	}

	public Double getFirstIonizedPotential() {
		return firstIonizedPotential;
	}

	public void setFirstIonizedPotential(Double firstIonizedPotential) {
		this.firstIonizedPotential = firstIonizedPotential;
	}

	public Double getDensity() {
		return density;
	}

	public void setDensity(Double density) {
		this.density = density;
	}

	public Double getMeltingPoint() {
		return meltingPoint;
	}

	public void setMeltingPoint(Double meltingPoint) {
		this.meltingPoint = meltingPoint;
	}

	public Double getBoilingPoint() {
		return boilingPoint;
	}

	public void setBoilingPoint(Double boilingPoint) {
		this.boilingPoint = boilingPoint;
	}

	public Integer getIsotopes() {
		return isotopes;
	}

	public void setIsotopes(Integer isotopes) {
		this.isotopes = isotopes;
	}

	public String getDiscoverer() {
		return discoverer;
	}

	public void setDiscoverer(String discoverer) {
		this.discoverer = discoverer;
	}

	public String getYearOfDispatch() {
		return yearOfDispatch;
	}

	public void setYearOfDispatch(String yearOfDispatch) {
		this.yearOfDispatch = yearOfDispatch;
	}

	public Double getHeatCapacity() {
		return heatCapacity;
	}

	public void setHeatCapacity(Double heatCapacity) {
		this.heatCapacity = heatCapacity;
	}

	public String getElectronConfig() {
		return electronConfig;
	}

	public void setElectronConfig(String electronConfig) {
		this.electronConfig = electronConfig;
	}

	public Integer getDisplayRow() {
		return displayRow;
	}

	public void setDisplayRow(Integer displayRow) {
		this.displayRow = displayRow;
	}

	public Integer getDisplayColumn() {
		return displayColumn;
	}

	public void setDisplayColumn(Integer displayColumn) {
		this.displayColumn = displayColumn;
	}

	@Override
	public String toString() {
		return "PeriodicElement [atomicNumber=" + atomicNumber + ", element="
				+ element + ", symbol=" + symbol + ", atomicWeight="
				+ atomicWeight + ", period=" + period + ", group=" + group
				+ ", mostStableCrystal=" + mostStableCrystal + ", type=" + type
				+ ", ionicRadius=" + ionicRadius + ", atomicRadius="
				+ atomicRadius + ", electroNegativity=" + electroNegativity
				+ ", firstIonizedPotential=" + firstIonizedPotential
				+ ", density=" + density + ", meltingPoint=" + meltingPoint
				+ ", boilingPoint=" + boilingPoint + ", isotopes=" + isotopes
				+ ", discoverer=" + discoverer + ", yearOfDispatch="
				+ yearOfDispatch + ", heatCapacity=" + heatCapacity
				+ ", electronConfig=" + electronConfig + ", displayRow="
				+ displayRow + ", displayColumn=" + displayColumn + "]";
	}

}
