class Pattern161{ 
public static void main(String[] args){
char y='A',z='0';
for(int i=1;i<=5;i++){
char x='A';
for( int j=5;j>=i;j--){
System.out.print(" ");
 }	
for(int k=3;k<=2*i+1;k++){
	
if(k==3){
	System.out.print(x);
    x++;
}else{
if(x>y){
z--;
System.out.print(z);

}else{
	
System.out.print(x);
z=x;
x++;

}
}
}
y++;
System.out.println();
}

}
}


