class Pattern284{
public static void main(String[] args){

for(int i =5;i>=1;i--){
char y='*';
for(int j=5;j>=1;j--){
if(j<=i){
if(j%2==1){
System.out.print(j);

}else{
System.out.print(y);

}}else{
System.out.print(" ");

}
}

System.out.println();
}
}
}