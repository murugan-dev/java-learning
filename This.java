class This
{
  String name;
  int age;
  This(){
      this("Murrugan",24);
  }
  This(String name,int age){
     
      this.name =name;
      this.age = age;
      System.out.println(name+"  "+ age);
       }
  void getHike(){
    System.out.println("Get Hike");
      }

  public static void main(String[] args){
        This obj = new This();                 
        } 

}

