# payara_micro
Build a lightweight app to show how  deploy a service into Payara application server 

<h3>Brief Introduction to Payara Micro:</h3>
<p> Is a lightweight application server which its size is lee than 70MB, this application server is part of the <strong>MicroProfile</strong>
proyect which is looking for stablish a set of principles, APIs, and infraestructure tools to develop microservices in JAVA. 
This servlet container supports: EJB,JPA,JTA,Jax-RS, DI, Application Context,JCache,JSP,JSF,WebSocket,Bean Validation, Concurrency, etc.</p>

<h4>Steps to execute an Instance</h4>
<ul>
  <li>download the .jar file fron the official Payara Page</li>
  <li>run the following command<code>java -jar [fileName].jar</code></li>
</ul>

At this point you will have a payara instance listening request on <strong>localhost:8080</strong>

<h4>Run a payara instance and deploy a service</h4>
<ul>
  <li>run the following command<code>java -jar [fileName].jar --deploy [path-to-you-app-file].war</code></li>
</ul>

You can deploy as many services as you need/want into a single server instance running as many <code>--deploy</code> together,
specifying the path of the .war file for each <code>--deploy</code> option
