class Pattern271{
public static void main(String[] args){
	
for(int i =5;i>=1;i--){
char y='*';
for(int j=1;j<=i;j++){
if(j%2==1){
System.out.print(j+" ");
}else{
System.out.print(y+" ");

}
}

System.out.println();
}
}
}