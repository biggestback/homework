public class Main {
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

    }
}
