class Pattern59{ 
public static void main(String[] args){
int x=1,y=0;
for(int i=1;i<6;i++){
	y=y+x;
	x=y-x;
	y=y-x;
for(int j=1;j<=i;j++){
	System.out.print(y+" ");


 } 
 
System.out.println();
}
}
}
