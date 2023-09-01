import java.util.*;

 class BinomialCoefficient 
 {
  // method
   public static int factorial(int n){
     int fact=1;
     for(int i=1;i<=n;i++){
       fact*=i;
     }
     return fact;
   }

  //  method
   public static int binoCoeff(int n ,int k){ 
    //Ex-1 :- n!= 5!= 120, k!= 3!=6, n-k= 5-3= 2!= 2, 120/(6*2)=10
    //Ex-2 :- n!= 7!= 5040, k!=4!=24, 7-4=3!= 6, 5040/(24*6)= 5040/144 =35
     int fact_n=factorial(n);
     int fact_k=factorial(k);
     int fact_nmk=factorial(n-k);
     
     int binCo=fact_n/(fact_k*fact_nmk); //formula to find bino-Coefficient
     return binCo;
   }
  
  //  main method
   public static void main(String args[])
   { 
     System.out.println("Factorial="+factorial(5));
     
     System.out.println("BinoCoeff="+binoCoeff(7,3));
     
   }
 }
