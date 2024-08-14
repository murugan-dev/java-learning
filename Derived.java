class Inheritance
{
  String name;
  int age;
  Inheritance(){}
  Inheritance(String name,int age){
      this.name =name;
      this.age = age;
       }
  void getHike(){
    System.out.println("Get Hike");
      }
}
class Derived extends Inheritance{

    Derived(){}  
    Derived(String name,int age){
        super(name,age);
      }

   public static void main(String[] args){
        Derived obj = new Derived("Murugan",23); 
        System.out.println(obj.name+" "+obj.age);
                
        }   
}
