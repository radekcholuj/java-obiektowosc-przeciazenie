public class StudentProgram {
    public static void main(String[] args) {


        char[] name1 = {'R', 'a', 'd', 'e', 'k'};
        char[] name2 = {'J', 'a', 'n'};
        char[] name3 = {'G', 'u', 's', 't', 'a', 'w'};
        char[] name4 = {'T', 'o', 'm', 'e', 'k'};
        char[] name5 = {'G', 'u', 's', 't', 'a', 'w'};

        char[] surname1 = {'R', 'a', 'd', 'e', 'c', 'k', 'i'};
        char[] surname2 = {'J', 'a', 'n', 'y'};
        char[] surname3 = {'W', 'i', 'e', 'l', 'k', 'i'};
        char[] surname4 = {'T', 'o', 'm'};
        char[] surname5 = {'O', 'l', 'e'};

        char[] emeil1 = {'R', 'a', 'd', 'e', 'c', 'k', 'i', '@', 'w', 'p', '.', 'p', 'l'};
        char[] emeil2 = {'J', 'a', 'n', 'y', '@', 'w', 'p', '.', 'p', 'l'};
        char[] emeil3 = {'W', 'i', 'e', 'l', 'k', 'i', '@', 'w', 'p', '.', 'p', 'l'};


        Student s1 = new Student(name1, surname1, 23, emeil1, 35987);
        Student s2 = new Student(name2, surname2, 24, emeil2, 156475);
        Student s3 = new Student(name3, surname3, 18, emeil3, 547894);
        Student s4 = new Student(name4, surname4, 19, emeil3, 547894);
        Student s5 = new Student(name5, surname5, 20, emeil3, 547894);

        s1.displayLong();
        s2.displayLong();
        s3.displayLong();
        s4.displayShort();
        s5.displayShort();
    }
}
