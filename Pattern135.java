class Pattern135{ 
public static void main(String[] args){
	
for(int i=5;i>=1;i--){
int x=i;
for( int j=5;j>=i;j--){
System.out.print(" ");
 }	
for(int k=1;k<=i;k++){

System.out.print(x+" ");
x--;
} 

System.out.println();
}
}
}

