package basedemployee;

public abstract class Employee implements IPayAble {

    private static int count = 0;

    protected String firstName;

    protected String lastName;

    protected String socialSecurityNumber;



    Employee(String firstName, String lastName, String socialSecurityNumber) {

        this.firstName = firstName;

        this.lastName = lastName;

        this.socialSecurityNumber = socialSecurityNumber;

        count++;



        System.out.printf("Constructed employee %s %s |  count=%d%n", firstName, lastName, count);



    }




    public String getFirstName() {

        return firstName;

    }



    public void setFirstName(String firstName) {

        this.firstName = firstName;

    }



    public String getLastName() {

        return lastName;

    }



    public void setLastName(String lastName) {

        this.lastName = lastName;

    }



    public String getSocialSecurityNumber() {

        return socialSecurityNumber;

    }



    public void setSocialSecurityNumber(String socialSecurityNumber) {

        this.socialSecurityNumber = socialSecurityNumber;

    }



    public abstract double earningMethod();

    public static int getCount() {

        return count;

    }


}
