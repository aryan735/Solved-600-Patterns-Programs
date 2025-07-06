class Pattern402{
public static void main(String[] args){
char x='A';
for(int i =1;i<6;i++){
	for(int k=5;k>=i;k--){
		
		System.out.print(" ");
	}				
for(int j=1;j<=i;j++){
if(j==1||j==i){
	System.out.print(x+" ");


}else{
	System.out.print(x+" ");
}

}
x++;
System.out.println();
}
x-=2;
for(int i =4;i>=1;i--){

	for(int k=5;k>=i;k--){
		
		System.out.print(" ");
	}				
for(int j=1;j<=i;j++){
if(j==1||j==i){
	System.out.print(x+" ");


}else{
	System.out.print(x+" ");

}

}
x--;
System.out.println();
}
}

}