class Pattern274{
public static void main(String[] args){
	char x='*',y='#';
for(int i =5;i>=1;i--){
for(int j=1;j<=5;j++){
if(j>=i){
if(j%2==1){
System.out.print(y);
}else{
System.out.print(x);
}
 }else{
 System.out.print(" ");
}
}

System.out.println();
}
}
}