class Pattern4{
public static void main(String[] args){
	
for(int i = 5;i>=1;i--){
	int x=i;
for(int j = 1; j<=5;j++){
if(j==1){
	
	System.out.print(i+" ");
}
else{
	x+=5;
	System.out.print(x+" ");
}

}
System.out.println();
}
}
}