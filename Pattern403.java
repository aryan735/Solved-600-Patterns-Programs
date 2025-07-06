class Pattern403{
public static void main(String[] args){

for(int i =1;i<6;i++){
char x='A';
	for(int k=5;k>=i;k--){
		
		System.out.print(" ");
	}				
for(int j=1;j<=i;j++){
if(j==1||j==i){
	System.out.print(x+" ");
x++;

}else{
	System.out.print(x+" ");
	x++;
}

}
System.out.println();
}
char x='B';
for(int i =4;i>=1;i--){
char y=x;
	for(int k=5;k>=i;k--){
		
		System.out.print(" ");
	}				
for(int j=1;j<=i;j++){
if(j==1||j==i){
	System.out.print(y+" ");
y++;

}else{
	System.out.print(y+" ");
	y++;
}

}
x++;
System.out.println();
}
}

}