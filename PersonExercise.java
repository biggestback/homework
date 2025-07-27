public class PersonExercise {

    String name;
    int age;
    double netincome;
    
    public PersonExercise(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // method 1 - check if person is adult
    public void adult() {
        if (age >= 18) {
            System.out.println(name + " is an adult.");
        } else {
            System.out.println(name + " is not an adult.");
        }
    }
    
    // method 2 - calculate monthly net income (w/ local variable)
    public void monthlynetincome() {
        double monthlyincome = netincome / 12;
        System.out.println(name + " makes $" + monthlyincome + " every month.");
    } 

    //method 3 - name (w/ local variable)
    public void sayname() {
        String introduction = "This person's name is " + name + ".";
        System.out.println(introduction);
    }


}
