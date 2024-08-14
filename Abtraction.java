abstract class person{

   person(){
     System.out.println("default");
   }

   void  getHike(){
      System.out.println( "Get Hike method");
   }

}
class Abtraction extends person{

   public static void main(String[] args){
     Abtraction obj = new Abtraction();
     obj.getHike();
   }
}