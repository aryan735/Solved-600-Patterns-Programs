class Pattern256{
public static void main(String[] args){
	
for(int i=1;i<=5;i++){
int x=5,y=1;
for(int j=5;j>=i;j--){
if(i%2==1){
System.out.print(x);
x--;
}else{
System.out.print(y);
y++;
}

} 


System.out.println();
}
}
}