class Pattern269{
public static void main(String[] args){
int x=5;char y='*';	
for(int i =5;i>=1;i--){

for(int j=1;j<=i;j++){
if(i%2==1){
System.out.print(x+" ");

}else{
System.out.print(y+" ");
}
}
x--;
System.out.println();
}
}
}