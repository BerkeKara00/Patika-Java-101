
package OgrenciBilgiSistemi;

public class Course {
    
    Teacher courseTeacher;
    String name;
    String code;
    String prefix;
    int note ; 
    int notefinal;

    public Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note=0;
        this.notefinal =0;
    }
    
    
   public  void addTeacher(Teacher t){
                if (t.branch.equals(prefix)) {
                    this.courseTeacher = t;
                    printTeacher();
       }else {
                    System.out.println(t.name +" bu dersi veremez !");
                }
    }
   
   public void printTeacher(){
       if (courseTeacher != null) {
           System.out.println(this.name +" dersinin akademisyeni : " + courseTeacher.name);
                  }
       else {
           System.out.println(this.name +" dersine akademisyen eklenmemiştir !");
       }
   }
    
    
    
    
    
    
    
    
    
    
}

