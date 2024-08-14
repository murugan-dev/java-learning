class EncapulationDemo{

      private int age=23;
      private String name="name";

      public int getAge(){
              return age;
      }

      public String getName(){
              return name;
     }

}

class Encapulation{

   public static void main(String[] args){

          EncapulationDemo Obj = new EncapulationDemo();
          System.out.println(Obj.getName());
          System.out.println(Obj.getAge());          

}

}