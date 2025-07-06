class Pattern255{
public static void main(String[] args){
	int x=1,y=0,z=0;
for(int i=1;i<=5;i++){

for(int j=5;j>=i;j--){
if(i%2==1){
System.out.print(x);
y=x;
x++;
}else{
System.out.print(x);
z=x;
x--;
}

} 
if(i%2==1){
	y--;
x=y;
}else{
	x=z;
}


System.out.println();
}
}
}