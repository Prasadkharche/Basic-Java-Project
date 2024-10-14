//import java.util.HashMap;

public class SalesManager extends SalesRep {
    double salesbyteam;
    
    public SalesManager(String firstName, String lastName, int registration, int age, int daysWorked,
            int vacationDaysTaken, double salary, int yearWorked, String UserName, String passWord, double salesMade,
            double salesbyteam) {
        super(firstName, lastName, registration, age, daysWorked, vacationDaysTaken, salary, yearWorked, UserName,
                passWord, salesMade);
        this.salesbyteam = salesbyteam;
    }
    //HashMap <int, SalesRep> salesTeam = new HashMap<>();
    @Override
    public void profileVisit() {
        // TODO Auto-generated method stub
        super.profileVisit();
    }
    public void calculateTotalComission(){
        System.out.println("Total comision by manager is " + (0.3*(salesbyteam+salesMade)));
    }
}
