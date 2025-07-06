class Pattern307{

public static void main(String[] args){
char a='A';
for(int i=1;i<=5;i++){

for(int j=5;j>=i;j--){
System.out.print(" ");
}
for(int j=1;j<=i;j++){
if(i%2==1){
System.out.print(a+" ");

}else{

System.out.print(i+" ");

}}
a++;
System.out.println();}}

}