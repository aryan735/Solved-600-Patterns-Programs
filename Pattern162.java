class Pattern162{ 
public static void main(String[] args){
char x='A',y='A',a='0',z='0';
for(int i=1;i<=5;i++){

for( int j=5;j>=i;j--){
System.out.print(" ");
 }	
for(int k=3;k<=2*i+1;k++){
	
if(k==3){
	System.out.print(x);
	a=x;
    x++;
	
}else{
if(a>=y){
z--;
System.out.print(z);

}else{
a++;	
System.out.print(a);
z=a;


}
}
}
y+=2;
System.out.println();
}

}
}


