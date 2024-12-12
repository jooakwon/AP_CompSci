/* 
    Lecture note example - Methods
*/

class LectureMethod{
    public static void main(String args[]) {
        
        
        greeting("John");
        greeting("Jayden");
        greeting("Jimthy the 2nd");
        
        double num = raise(6000, 6);
        System.out.println(num);
        num = raise(num+ 6000, 6);
        num = raise(num+ 6000, 6);
        num = raise(num+ 6000, 6);
        num = raise(num+ 6000, 6);
        num = raise(num+ 6000, 6);
        num = raise(num+ 6000, 6);
        num = raise(num+ 6000, 6);
        num = raise(num+ 6000, 6);
        num = raise(num+ 6000, 6);
        num = raise(num+ 6000, 6);
        System.out.println(num);
    }
    public static double raise(double salary, int percent){
        double amount = salary + (salary * (percent/100.0));
        return amount;
    }
    public static void greeting(String name){
        System.out.println("Hello " + name);
        
    }
    public static String printAnimal(){
        System.out.println(" /\\_/\\");
        System.out.println("( o.o )");
        System.out.println(" > ^ <");
        
    }
}