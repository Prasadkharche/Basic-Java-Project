package Array;

    public class Student {
        String firstName;
           String lastName;
           int registration;
           float grade;
           int year;
           public Student(String firstName, String lastName, float grade, int year)
           {
            this.firstName = firstName;
            this.lastName = lastName;
            this.grade = grade;
            this.year = year;
           }
     
           public Student(String lastName, int registration)
           {
           
            this.lastName = lastName;
            this.registration = registration;
            
           }
           public Student( int year, String lastName)
           {
           
            this.lastName = lastName;
            this.year = year;
           }
         
           public void printFullName()
           {
             System.out.println(firstName + " " +lastName);
           }
           public void isApproved()
           {
                  if(grade>60){
                    System.out.println(true);
                  }else{
                    System.out.println(false);
                  }
           }
           public void changeYearIfApproved()
           {
            if(grade >= 60)
            {
                year = year +1;
             System.out.println("Result Passed" + " " + year);
            }
           }
    }

