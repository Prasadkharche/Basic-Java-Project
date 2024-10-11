public class employee {
   
        String firstName;
        String lastName;
        int registration;
        int age;
        int daysWorked;
        int vacationDaysTaken;
        double salary;
        int yearWorked;

        

        public employee(String firstName, String lastName, int registration, int age, int daysWorked,
                int vacationDaysTaken, double salary, int yearWorked) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.registration = registration;
            this.age = age;
            this.daysWorked = daysWorked;
            this.vacationDaysTaken = vacationDaysTaken;
            this.salary = salary;
            this.yearWorked = yearWorked;
        }

        public int timeToRetirement(){
            return Math.min(60-age,40-yearWorked);
        }
        public int vacationTimeLeft(){
            return (daysWorked/360)*(30-vacationDaysTaken);
        }
        public int calculateBonus(){
            return (int) (2.2*salary);
        }
}