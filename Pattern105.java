class Pattern105{ 
public static void main(String[] args){
	int num=1;
for(int i=1;i<=5;i++){
for( int j=5;j>=i;j--){
System.out.print(" ");
 }
for(int k=1;k<=i;k++){
	 int mul=1;
   for(int l=1;l<=2;l++){
	  
        mul*=num;
   }
	System.out.print(mul);
	num++;
     
	
} 

System.out.println();
}
}
}