class Pattern294{

public static void main(String[] args){

for(int i=1;i<=5;i++){
char a='A';
for(int j=1;j<=i;j++){
if(i%2==1){
System.out.print(j+" ");

}else{

System.out.print(a+" ");
a++;
}}
a++;
System.out.println();}}

}