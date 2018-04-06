package basedemployee;

public class CommissionedEmployee extends Employee {



    public double grossSales;

    public double commissionRate;



    public CommissionedEmployee(String firstName, String lastName, String socialSecurityNumber ,double grossSales, double commissionRate){

        super(firstName, lastName, socialSecurityNumber);

        this.grossSales = grossSales;

        this.commissionRate = commissionRate;

    }



    String firstName() {

        return "Bob";

    }



    String lastName() {

        return "Junior";

    }



    String socialSecurityNumber() {

        return "xxx-xx-2322";

    }

    @Override
    public double earningMethod(){

        return (grossSales * commissionRate);

    }

    @Override

    public String toString() {

        return "CommisionedEmployee{" +

                "grossSales=" + grossSales +

                ", commissionRate=" + commissionRate +

                '}';

    }

}