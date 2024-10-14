public class SalesRep extends employee {
    double salesMade;
    public SalesRep(String firstName, String lastName, int registration, int age, int daysWorked, int vacationDaysTaken,
    double salary, int yearWorked, String UserName, String passWord, double salesMade) {
super(firstName, lastName, registration, age, daysWorked, vacationDaysTaken, salary, yearWorked, UserName,
        passWord);
this.salesMade = salesMade;
}
    public int calculateComission(){
        
        return (int)(0.1*salesMade);
    }
  
    public void profileVisit(){
        System.out.println("Opened Profile of --> "+ firstName);
        System.out.println("Full Name --> " +firstName+" "+lastName);
        System.out.println("Registration number --> " + registration);
        System.out.println("Age --> " + age);
        System.out.println("Sales made --> "+salesMade);
        System.out.println("Total Commision Earned --> "+ calculateComission());
        System.out.println("Profile Closed");
    }
    
}
