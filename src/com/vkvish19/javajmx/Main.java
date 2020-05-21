package com.vkvish19.javajmx;

import java.lang.management.ManagementFactory;

import javax.management.InstanceAlreadyExistsException;
import javax.management.MBeanRegistrationException;
import javax.management.MBeanServer;
import javax.management.MalformedObjectNameException;
import javax.management.NotCompliantMBeanException;
import javax.management.ObjectName;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Java JMX PoC application started.");
        try
        {
            ObjectName objectName = new ObjectName("com.vkvish19.javajmx:type=basic,name=sport");
            MBeanServer server = ManagementFactory.getPlatformMBeanServer();
            server.registerMBean(new Sport(), objectName);
        }
        catch(MalformedObjectNameException | NotCompliantMBeanException | InstanceAlreadyExistsException | MBeanRegistrationException e)
        {
            e.printStackTrace();
        }
        
        // infinite loop so that program does not terminate
        while(true) {}
    
    }
}
