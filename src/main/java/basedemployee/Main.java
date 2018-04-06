package basedemployee;

public class Main {

        public static void main(String[] args) {

            HourlyEmployee employeeOne = new HourlyEmployee("Wipler","CoCo","789546543",7.25,8);
            System.out.println(employeeOne);

            SaleriedEmployee employeeTwo = new SaleriedEmployee("Jockel","Mobby","987654345",9087);
            System.out.println(employeeTwo);

            CommissionedEmployee employeeThree = new CommissionedEmployee("Bob","William","7895435678",876,0.46);
            System.out.println(employeeThree);


            BasePlusComissionedEmployee employeeFour = new BasePlusComissionedEmployee("John","Wackol","768987534",900,8000,0.70);
            System.out.println(employeeFour);


            Employee[] employees = new Employee[] {employeeOne, employeeTwo, employeeThree, employeeFour};



            for(Employee employee : employees ){

                System.out.println(employee.earningMethod());

            }



        }

    }
