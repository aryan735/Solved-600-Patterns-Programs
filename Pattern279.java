class Pattern279{
public static void main(String[] args){
int x=1;char y='*';	
for(int i =5;i>=1;i--){

for(int j=1;j<=5;j++){
if(j>=i){
if(j%2==1){
System.out.print(x);

}else{
System.out.print(y);
}

}else{
System.out.print(" ");
}
}
x++;
System.out.println();
}
}
}