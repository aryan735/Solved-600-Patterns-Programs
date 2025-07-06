class Pattern58{
//Fabonacci 
public static void main(String[] args){

for(int i=1;i<6;i++){
	int x=1,y=0,z=0;
for(int j=1;j<=i;j++){
	System.out.print(y+" ");
	z=x+y;
     x=y;
     y=z;

 } 
 
System.out.println();
}
}
}
