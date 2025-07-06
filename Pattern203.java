class Pattern203{
public static void main(String[] args){
int x=1,y=0,z=0;
for(int i=1;i<6;i++){
y=x;
for(int j=2;j<=i;j++){	
	System.out.print(z+" ");
} 
for(int k=5;k>=i;k--){
System.out.print(y+" ");
	y++;
}
x+=2;
System.out.println();
}
}
}