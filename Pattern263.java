class Pattern263{
public static void main(String[] args){
int x=1;char y='*';	
for(int i =1;i<=5;i++){

for(int j=1;j<=i;j++){
if(i%2==1){
System.out.print(x+" ");
}else{
System.out.print(y+" ");
}
}
x+=2;
System.out.println();
}
}
}