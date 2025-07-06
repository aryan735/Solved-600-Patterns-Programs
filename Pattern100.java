class Pattern100{ 
public static void main(String[] args){
	int x=1,y=0;
for(int i=1;i<=5;i++){
	y=x;
for( int j=5;j>=i;j--){
System.out.print(" ");
 }
for(int k=1;k<=i;k++){

	System.out.print(y);
     y--;
	
} 
	x++;
		
System.out.println();
}
}
}