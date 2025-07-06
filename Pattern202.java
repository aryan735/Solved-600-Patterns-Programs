class Pattern202{
public static void main(String[] args){
int x=1;
char y='a';
for(int i=1;i<5;i++){

for(int j=1;j<5;j++){
if(x<=9){
	System.out.print(x+" ");
	x++;
	
}else{
System.out.print(y+" ");
	y++;
}
if(y>'f'){
	System.out.print(x+" ");
	return;
}
	
	
} 
System.out.println();
}
}
}