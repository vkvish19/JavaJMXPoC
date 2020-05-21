# JavaJMXPoC
A simple POC project to learn and understand the working of Java JMX, along with MBeans and JConsole.



### CONNECTING FROM THE CLIENT SIDE
---
- Start the application.

- Start Jconsole (located in the bin folder of the JDK installation directory of your machine)

- Connection -> new Connection -> select the local Java process of this tutorial -> Connect ->Insecure SSl connection warning -> Continue with insecure connection

- After connection is established, click on the top right MBeans tab of the View pane

- List of registered MBeans will appear in left column

- Click com.vkvish19.javajmx -> basic -> sport

- Under sport, there will be two rows, one each for attributes and operations



### MANAGING THE MBEAN
---
The basics of MBean management are simple:

Attributes can read or written

Methods can be invoked and arguments can be supplied to them or values returned from them

Let's see what that means for the Sport MBean in practice:

attribute: type a new value for the attribute playerName – for example “Messi” and click Refresh button

The Following log will appear in the Eclipse console:

##### Set playerName value to: Messi

operations: type a value for the String argument of method playSport() – for example “Barcelona” and click on the method button. A window alert for successful invocation will appear

The following log will appear in the eclipse console:

##### Messi playing sport for club: Barcelona
