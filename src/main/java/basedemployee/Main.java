package basedemployee;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Iterator;

public class Main {

        public static void main(String[] args) {

            HourlyEmployee employeeOne = new HourlyEmployee("Wipler","CoCo","789546543",7.25,9);
           // System.out.println(employeeOne);

            SaleriedEmployee employeeTwo = new SaleriedEmployee("Jockel","Mobby","987654345",9087);
           // System.out.println(employeeTwo);

            CommissionedEmployee employeeThree = new CommissionedEmployee("Bob","William","7895435678",876,0.46);
           // System.out.println(employeeThree);


            BasePlusComissionedEmployee employeeFour = new BasePlusComissionedEmployee("John","Wackol","768987534",900,8000,0.70);
           // System.out.println(employeeFour);
           // Employee[] employees = new Employee[] {employeeOne, employeeTwo, employeeThree, employeeFour};



          //  for(Employee employee : employees ){
            //    System.out.println("===============================================================================");
              //  System.out.println("Employee has " + employee.earningMethod() + " Hr owes " + employee.GetPaymentAmount() );
                //Invoice inv = new Invoice("8764345678", "RAM", 8, 34);

            //}

            ArrayList<Employee> employee = new ArrayList<Employee>();
            employee.add(employeeOne);
            employee.add(employeeTwo);
            employee.add(employeeThree);
            employee.add(employeeFour);


            Iterator<Employee> mmo = employee.iterator();
            while (mmo.hasNext()){
                Employee result = mmo.next();
                System.out.println(result);
            }


        }

    }
