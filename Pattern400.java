class Pattern400{
public static void main(String[] args){

for(int i =1;i<6;i++){
	for(int k=5;k>=i;k--){
		
		System.out.print(" ");
	}				
for(int j=1;j<=i;j++){
if(j==1||j==i){
	System.out.print(j+" ");


}else{
	System.out.print(j+" ");
}

}
System.out.println();
}
int x=2;
for(int i =4;i>=1;i--){
int y=x;
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