class Pattern305{

public static void main(String[] args){
char a='E';
for(int i=5;i>=1;i--){

for(int j=5;j>=i;j--){
System.out.print(" ");
}
for(int j=1;j<=i;j++){
if(i%2==1){
System.out.print(i);

}else{

System.out.print(a);

}}
a--;
System.out.println();}}

}