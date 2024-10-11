package Array;

public class schoolSystem {
        public static void main(String [] args)
        {
            Student student1 = new Student("Prasad","Kharche",75,2023);
            Student student2 = new Student("vinit","siwach",90,2023);
            Student student3 = new Student("Ghansit","singh",85,2023);
            Student student4 = new Student("akash","sharma",95,2023);

            // student1.printFullName();
            // student1.changeYearIfApproved();

            courses course1 = new courses("Maths","Prakash",2022);
            
            /*To add student to course */
            // course1.enroll(student1);
            // course1.enroll(student2);
            // course1.enroll(student3);
            // course1.enroll(student4);

            /*To Remove student from course */
            // course1.unEnroll(student1);
            // course1.unEnroll(student2);
            // course1.unEnroll(student3);
            // course1.unEnroll(student4);

            //creating Arary and then pushing it.
            Student[] StudentArray = {student1, student2,student3,student4};
            course1.enroll(StudentArray);

            //checking for best student with best grade
            // course1.bestGrade();

            //checking individually
            // course1.checkEligible(student3,course1.averageGrade());

            //checking whole list at once
            // course1.eligibleInList();

        }
}
