package OgrenciBilgiSistemi;

public class Main {
    public static void main(String[] args) {
        
        Course mat = new Course("Matematik", "MAT101", "MAT");
        Course fizik = new Course("Fizik", "FZK101", "FZK");
        Course kimya = new Course("Kimya", "KMY101", "KMY");
        
        Teacher t1 = new Teacher("Mahmut", "90550123470", "MAT");
        Teacher t2 = new Teacher("Zeynep", "90550856201", "FZK");
        Teacher t3 = new Teacher("Hatice", "90550056212", "KMY");
        
        mat.addTeacher(t1);
        fizik.addTeacher(t2);
        kimya.addTeacher(t3);

        
       Student s1 = new Student("Berke ", "1205", 4, mat, fizik, kimya);
        s1.addBulkExamNote(20, 50, 50, 50, 50, 80);
        s1.isPass();

        Student s2 = new Student("Necmi", "1200", 2, mat, fizik, kimya);
        s2.addBulkExamNote(30, 60, 50, 45, 55, 80);
        s2.isPass();
        
         Student s3 = new Student("Beyza ", "1207", 1, mat, fizik, kimya);
        s3.addBulkExamNote(30, 70, 50,35, 50, 60);
        s3.isPass();
        
        
    }
    
}
