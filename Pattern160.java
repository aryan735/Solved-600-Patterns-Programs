class Pattern160{ 
public static void main(String[] args){
char x='A',y='A',z='0';
for(int i=1;i<=5;i++){
for( int j=5;j>=i;j--){
System.out.print(" ");
 }	
for(int k=3;k<=2*i+1;k++){
	
if(k==3){
	System.out.print(x);
	y=x;
	x++;
}else{
if(y<='A'){
z++;
System.out.print(z);

}else{
	y--;
System.out.print(y);

z=y;
}
}
}

System.out.println();
}

}
}


