package packages;
 
public class Main1 {
 Main1(){
      System.out.println("deafult"); 
 }
 Main1(int a){
      System.out.println("deafult1"); 
 }
 Main1(int a,int b){
     System.out.println("deafult1"); 
}
 Main1(int a,double b){
     System.out.println("deafult1"); 
}
 Main1(double a){
      System.out.println("deafult2"); 
 }
 public static void main(String[] args) {
     Main1 m=new Main1(2);
     System.out.println("Try programiz.pro");
 }
}