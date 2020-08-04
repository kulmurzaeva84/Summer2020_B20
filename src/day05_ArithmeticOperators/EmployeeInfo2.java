package day05_ArithmeticOperators;

public class EmployeeInfo2 {

        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Daniel";
            char gender = 'M';
            int age = 35;
            String companyName = "CapitalOne";
            String jobTitle = "SDET";
            boolean isFullTime = true;
            boolean isMarried = false;
            double salary = 120_000.50;
            String fullName= firstName+" "+lastName;  //"John Daniel"
            // a=10
            // b=20
            // c=a+b


            System.out.println("Employees Full Name is "+firstName+" "+lastName );
            System.out.println(fullName+"'s "+"gender is: "+gender);
            System.out.println(fullName+"'s "+"age is "+age+" years old");
            System.out.println(fullName+" works at: "+companyName);
            System.out.println(fullName+ "'s job title is: "+ jobTitle);
            System.out.println(fullName+"' salary is:  $"+salary);
            System.out.println(firstName+" "+lastName+" is full time employee: "+ isFullTime);
            System.out.println(firstName+" "+lastName+" is married: "+ isMarried);





        }
}
