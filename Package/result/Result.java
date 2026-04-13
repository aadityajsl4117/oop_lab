package result;
import student.Student;

public class Result extends Student {
   public Result(String name,int marks)
    {
        super(name,marks);
    }
    
public void grade() {
    if (marks >= 90){
        System.out.println("grade A");
    }
    else if (marks >=75){
        System.out.println("grade B");
}
    else {
        System.out.println("grade c");
}
}
}
   




