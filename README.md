# Messenger
 OpenDaylight application using the archetype, for the Boron-SR2 Release.

build archetype cmd ->

mvn org.apache.maven.plugins:maven-archetype-plugin:3.0.0:generate -DarchetypeGroupId=org.opendaylight.controller -DarchetypeArtifactId=opendaylight-startup-archetype -DarchetypeRepository=http://nexus.opendaylight.org/content/repositories/opendaylight.release/ -DarchetypeCatalog=http://nexus.opendaylight.org/content/repositories/opendaylight.release/archetype-catalog.xml -DarchetypeVersion=1.2.2-Boron-SR2

build  messenger cmd ->

mvn clean install -DskipTests

New Files ->
\impl\src\main\java\org\opendaylight\messenger\impl\FileHelper.java 

description : Utility functions to read csv, writeJSON, writeXML files

\impl\src\main\java\org\opendaylight\messenger\impl\PeriodicElement.java

description : Data model as per input csv file

\impl\src\main\java\org\opendaylight\messenger\impl\PeriodicElements.java

description : Encapsulation list of csv objects

\impl\src\main\resources\Periodic Table of Elements.csv

description : Input csv file

\impl\src\test\java\TestFilehelper.java

description : Unit test cases

\impl\src\test\resources\Periodic Table of Elements.csv

description : Input csv file for unit test

Changed Files ->
\impl\pom.xml 

changes : Added dependencies for build 

\impl\src\main\java\org\opendaylight\messenger\impl\MessengerProvider.java

changes : Added function to read periodic elements

Generated JSON and XML sample files ->

\impl\src\test\resources\PeriodicElement.json

\impl\src\test\resources\PeriodicElement.xml

Copy of used .m2/settings.xml is also added for reference.
