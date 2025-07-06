class Pattern201{
public static void main(String[] args){
int x=1,y=1;
for(int i=1;i<6;i++){

for(int j=1;j<6;j++){
if(y>7){
	x=x+2;
	y=1;
	
}

	System.out.print(x+" ");
	x++;
	y++;


} 
System.out.println();
}
}
}