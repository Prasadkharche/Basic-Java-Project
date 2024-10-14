public class employee implements UserInterface{
   
        String firstName;
        String lastName;
        int registration;
        int age;
        int daysWorked;
        int vacationDaysTaken;
        double salary;
        int yearWorked;
        private String UserName;
        private String passWord;

        

        public employee(String firstName, String lastName, int registration, int age, int daysWorked,
                int vacationDaysTaken, double salary, int yearWorked, String UserName,String passWord) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.registration = registration;
            this.age = age;
            this.daysWorked = daysWorked;
            this.vacationDaysTaken = vacationDaysTaken;
            this.salary = salary;
            this.yearWorked = yearWorked;
            this.UserName=UserName;
            this.passWord=passWord;
        }
        @Override
        public boolean login(String username,String password){
            return this.UserName.equals(username)&&this.passWord.equals(password);
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