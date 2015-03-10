Mission Arogya Internship Task

Setup guide - 1. First install Apache Tomcat http://apache.bytenet.in/tomcat/tomcat-8/v8.0.20/bin/apache-tomcat-8.0.20.exe on this path "C:\Tomcat 8.0". Installing in any other path will lead to malfunction of the servlet as the path is coded in Rainmeter skin. 2. Then install Rainmeter https://github.com/rainmeter/rainmeter/releases/download/v3.1.0.2290/Rainmeter-3.1.exe 3. Now copy "resdisplay" from "Tomcat servlet" to "webapps" directory in Tomcat installation directory. 4. Execute the "ResDisplay_0.5.rmskin" file to install the skin. 5. Execute the Tomcat GUI or commandline host application from "Tomcat 8.0\bin". 6. Execute the command "localhost:" followed by your port number. Then from the Manager app select resdisplay. Rainmeter is already running in backgound.

Note: There is a lag between update of values in Rainmenter skin and the web application. Its due to file write delay as the file is getting updated periodically.
