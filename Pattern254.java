class Pattern254{
public static void main(String[] args){
	int x=1;
for(int i=1;i<=4;i++){
int y=x,z=0;
for(int j=1;j<=i;j++){
if(i%2==1){
System.out.print(y+"#"+" ");
z=y;
y++;
}else{
System.out.print(y+"#"+" ");	
	z=y;
y--;
}

} 
if(z==6){
	x=z+4;
}else{
x=z+2;	
}


System.out.println();
}
}
}