package basedemployee;


    public class BasePlusComissionedEmployee extends CommissionedEmployee {


        public double basedSalary;


        public BasePlusComissionedEmployee(String firstName, String lastName, String socialSercurityNumber, double basedSalary, double grossSales, double commissionRate) {

            super(firstName, lastName, socialSercurityNumber, grossSales, commissionRate);

            this.basedSalary = basedSalary;

        }


        double grossSales() {

            return grossSales();

        }


        double commissionRate() {

            return commissionRate();

        }


        public double earningMethod() {

            return basedSalary + (super.earningMethod());

        }


        public double getBasedSalary() {

            return basedSalary;

        }


        public void setBasedSalary(double basedSalary) {

            this.basedSalary = basedSalary;

        }


        @Override

        public String toString() {

            return "BasePlusCommissionedEmployee{" +

                    "base=" + basedSalary +

                    ", gross=" + grossSales +

                    ", commission=" + commissionRate +

                    '}';
        }

        @Override
        public double GetPaymentAmount(){

            return super.GetPaymentAmount() + basedSalary;
        }


    }
