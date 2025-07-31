public class LessonsTwoThreeMain {

    public static void main(String[] args) {
        PersonExercise student1 = new PersonExercise("Amy", 16);
        student1.netincome = 50000;

        PersonExercise student2 = new PersonExercise("Jasmine", 22);
        student2.netincome = 100000;

        PersonExercise student3 = new PersonExercise("Steven", 17);
        student3.netincome = 30000;

        PersonExercise student4 = new PersonExercise("Jennifer", 20);
        student4.netincome = 70000;

        PersonExercise student5 = new PersonExercise("Valerie", 19);
        student5.netincome = 150000;


        student1.adult();
        student2.monthlynetincome();
        student3.sayname();
        student4.adult();
        student5.monthlynetincome();
        
        Student s1 = new Student("Bob", 10, 80);
        Teacher t1 = new Teacher("Ms. Freeman", 40, true);

        PTconference(t1, s1);
    }

    public static void PTconference(Teacher t, Student s) {
        if (t.amiable) {
            if (s.grade >= 80) {
                System.out.println(t.name + " says: " + s.name + " is a great student!");
            } 
        } else {
            if (s.grade <= 79) {
                System.out.println(t.name + " says: " + s.name + " a terrible student.");
            } 
        }
    }

    static class Teacher extends PersonExercise {
        boolean amiable;
    
        public Teacher(String name, int age, boolean amiable) {
            super(name, age);
            this.amiable = amiable;
        }
    }
    
    static class Student extends PersonExercise {
        int grade;
    
        public Student(String name, int age, int grade) {
            super(name, age);
            this.grade = grade;
        }
    }
    
    class Parent extends PersonExercise {
        public Parent(String name, int age) {
            super(name, age);
        }
    }

}




