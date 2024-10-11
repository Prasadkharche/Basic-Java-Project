package Array;

import java.util.ArrayList;
public class courses {
    String courseName;
    String professorName;
    int year;
    
    //here we only had declare the array list to make this
    //list come into picture we need to initialize it. we can initialize it in constructor.
    public static ArrayList<Student> studentList;

    public courses(String courseName, String professorName, int year){
        courseName = this.courseName;
        professorName = this.professorName;
        year = this.year;
        //here we are initializing the list, as constructor will be 
        //executed every time.
        studentList = new ArrayList<>();
    }
   
    public void enroll(Student addStudent){
        studentList.add(addStudent);
        System.out.println(addStudent.firstName);
    }
     public void unEnroll(Student removeStudent){
        if(studentList.contains(removeStudent)){
            studentList.remove(removeStudent);
        }
     }
 
     public int countStudents(){
         return studentList.size();
     }
     
     public void bestGrade(){
        float bestGrade = Integer.MIN_VALUE;
        String bestStudent = ""; 
        for(Student check :studentList){
            if(check.grade>bestGrade){
                bestGrade=check.grade;
                bestStudent=check.firstName;
            }
        } 
        System.out.println("Best Grade " + bestGrade);
        System.out.println("Best Student" + bestStudent);
     }

     public void enroll(Student[] students){
        for(Student std :students){
            studentList.add(std);
        }
        for(Student st: studentList)
        System.out.println(st.firstName + " " + st.lastName + " >Enrolled< ");
     }

     //--------------------------Task 3--------------------------
     public float averageGrade(){
        float studentAverage =0.0f;
        for(Student stavg : studentList){
            studentAverage = stavg.grade + studentAverage;
        }
        return studentAverage/studentList.size();
     }

     //individual check by passing only one student at a time.
     public void checkEligible(Student stEl, float avggg){
        System.out.println("Object grade" + stEl.grade);
        System.out.println("average grade" + avggg);
        if(stEl.grade>=avggg){
            
            System.out.println("Eligible");
        }else{
            System.out.println("Not Eligible");
        } 
     }

     //To check eligible student from the array list
     public void eligibleInList(){
        for(Student studentEligibleInList : studentList){
            if(studentEligibleInList.grade > averageGrade()){
                System.out.println( studentEligibleInList.firstName + " Eligible " );
            }else{
                System.out.println( studentEligibleInList.firstName +" Not Eligible " );
            }

        }
     }

    
}
 
