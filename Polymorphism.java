class Polymorphism1{

    void add(int x,int y){
       System.out.println("int Opration"+"  "+(x+y));
    }
   
    void add(double x,double y){
       System.out.println("double Opration"+"  "+(x+y));
    }

     void add(String x,String y){
       System.out.println("String Opration"+"  "+(x+" "+y));
    }
   
     void add(int[] a){
       System.out.println("Arr Opration");
       int sum=0,i;
       for(i=0;i<a.length;i++){
          sum+=a[i];
         }
       System.out.println("sum= "+ sum);
    }
}
class Polymorphism extends Polymorphism1{
    
     public static void main(String[] args){
      
         Polymorphism obj= new Polymorphism();

         obj.add(3.87,3.87);
     }

}