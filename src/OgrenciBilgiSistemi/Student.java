
package OgrenciBilgiSistemi;

public class Student {
    
    String name;
    String stuNo;
    int classes;
    Course mat;
    Course fizik;
    Course kimya;
    double avarage;
    boolean isPass;

    public Student(String name, String stuNo, int classes, Course mat, Course fizik, Course kimya) {
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        calcAvarage();
        this.isPass = false;
    }

   public void addBulkExamNote(int mat ,int matFinal, int fizik ,int fizikFinal,int kimya,int kimyaFinal){
       if (mat >= 0 && mat<=100) {
           this.mat.note = mat;
       }
        if (fizik >= 0 && fizik<=100) {
           this.fizik.note = fizik;
       }
         if (kimya >= 0 && kimya<=100) {
           this.kimya.note = kimya;
       }
          if (matFinal >= 0 && matFinal<=100) {
           this.mat.notefinal = matFinal;
       }
           if (fizikFinal >= 0 && fizikFinal<=100) {
           this.fizik.notefinal = fizikFinal;
       }
            if (kimyaFinal >= 0 && kimyaFinal<=100) {
           this.kimya.notefinal = kimyaFinal;
       }
   }
   
   public void isPass() {
        if (this.mat.note == 0 ||this.mat.notefinal == 0 || this.fizik.note == 0 || this.fizik.notefinal == 0 ||this.kimya.note == 0  ||this.kimya.notefinal == 0) {
            System.out.println("Notlar tam olarak girilmemiş");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.avarage);
            if (this.isPass) {
                System.out.println("Sınıfı Geçti. ");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }
   
   public void calcAvarage(){
        this.avarage = ((this.mat.note*0.2 + this.mat.notefinal*0.8) + (this.fizik.note*0.3+ this.fizik.notefinal*0.7)+ (this.kimya.note*0.4+ this.kimya.notefinal*0.6)) /3;
   }
    
    
   public boolean isCheckPass(){
       calcAvarage();
       return this.avarage>55;
   }
    
     public void printNote(){
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik Notu : " + this.mat.note);
        System.out.println("Matematik Final Notu : " + this.mat.notefinal);
        System.out.println("Fizik Notu : " + this.fizik.note);
        System.out.println("Fizik Final Notu : " + this.fizik.notefinal);
        System.out.println("Kimya Notu : " + this.kimya.note);
        System.out.println("Kimya Final Notu : " + this.kimya.notefinal);
    }
    
    
    
    
    
    
    
    
    
    
}
