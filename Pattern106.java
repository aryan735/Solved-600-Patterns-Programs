class Pattern106{ 
public static void main(String[] args){
	int num=1,sum=0;
for(int i=1;i<=5;i++){
for( int j=5;j>=i;j--){
System.out.print(" ");
 }
for(int k=1;k<=i;k++){
	sum+=num;
	System.out.print(sum);
	
} 

System.out.println();
}
}
}