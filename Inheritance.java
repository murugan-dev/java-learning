class Inheritance{
  String name = "Murugan";
  Inheritance(){
   System.out.println("this is defalut Constructor");
}
}
class Derived extends Inheritance{
    //super();
    public static void main(String[] args){
        Derived obj = new Derived(); 
        System.out.println(obj.name);
}
   
}