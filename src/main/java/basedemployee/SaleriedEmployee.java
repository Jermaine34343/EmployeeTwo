package basedemployee;

public class SaleriedEmployee extends Employee {



        private double weeklySalary;



        public SaleriedEmployee(String firstName, String lastName, String socialSecurityNumber, double weeklySalary){

            super(firstName, lastName, socialSecurityNumber);

            this.weeklySalary = weeklySalary;



        }







        @Override

        public double earningMethod(){

            return this.weeklySalary;

        }



        public double getWeeklySalary() {

            return weeklySalary;

        }



        public void setWeeklySalary(double weeklySalary) {

            this.weeklySalary = weeklySalary;

        }


        @Override
        public String toString() {

            return "SaleriedEmployee{" +

                    "weekly=" + weeklySalary +

                    '}';

        }

    }
