package basedemployee;

    public class HourlyEmployee extends Employee {

        private double wage;

        private double hour;


        public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, double wage, double hour) {

            super(firstName, lastName, socialSecurityNumber);

            this.wage = wage;

            this.hour = hour;

        }


        String firstName() {

            return "Will";

        }

        String lastName() {

            return "Smith";

        }

        String socialSecurityNumber() {

            return "890745679";

        }

        public double getWage() {

            return wage;

        }


        public void setWage(double wage) {

            this.wage = wage;

        }


        public double getHour() {

            return hour;

        }


        public void setHour(double hour) {

            this.hour = hour;

        }


        @Override

        public String toString() {

            return "HourlyEmployees{" +

                    "wage=" + wage +

                    ", hour=" + hour +

                    '}';

        }

        public double earningMethod() {

            return this.hour * this.wage;

        }

        @Override
        public double GetPaymentAmount() {
            return earningMethod();
        }
    }

