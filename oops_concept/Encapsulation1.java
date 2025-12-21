package oops_concept;

public class Encapsulation1 {

        private String name;
        private int age;

        public  Encapsulation1(String name , int age)
        {
            this.name = name;
            this.age = age;
        }

        public String getName()
         {
        return name;
        }


        public void setName(String name) {
        this.name = name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }
    // Method to display student info
    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }



    public static void main(String[] args) {
        System.out.println(" ");

         Encapsulation1 s1 = new Encapsulation1("Nikhil", 20);  // Creating object

        s1.displayInfo();  // Show initial details

        s1.setName("Reddy");   // Change name using setter
        s1.setAge(21);         // Change age using setter

        System.out.println("Updated Info:");
        s1.displayInfo();
    }







        
    }
    

