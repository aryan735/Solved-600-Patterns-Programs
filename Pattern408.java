class Pattern408{
public static void main(String[] args){

for(int i =1;i<5;i++){
char x='A';
	for(int k=5;k>=i;k--){
		
		System.out.print(" ");
	}				
for(int j=3;j<=i*2+1;j++){
if(j==3||j==i){
	System.out.print(x);
x++;

}else{
	System.out.print(x);
x++;
}

}

System.out.println();
}
for(int i =3;i>=1;i--){
char x='A';
	for(int k=5;k>=i;k--){
		
		System.out.print(" ");
	}				
for(int j=3;j<=i*2+1;j++){
if(j==3||j==i){
	System.out.print(x);

x++;
}else{
	System.out.print(x);
x++;
}

}
x++;
System.out.println();
}
}

}