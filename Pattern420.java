class Pattern420
{
public static void main(String[] args){
String name="SUMIT";
int x=4;
for(int i=0;i<=4;i++){
	
for(int j=4;j>=i;j--){
System.out.print(" ");
}
for(int k=0;k<=i;k++){
System.out.print(name.charAt(x));
x--;
}
x=4;
System.out.println();
}}
}