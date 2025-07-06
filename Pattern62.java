class Pattern62{ 
public static void main(String[] args){

for(int i=1;i<6;i++){
	int x=1,y=0;
for(int j=1;j<=i;j++){
	System.out.print(y+" ");
	y=y+x;
	x=y-x;
	y=y-x;
	
 } 

System.out.println();
}
}
}