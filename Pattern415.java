class Pattern415
{
public static void main(String[] args){
String name="SUMIT";
int x=0;
for(int i=0;i<=4;i++){
	
for(int j=0;j<=i;j++){
System.out.print(" ");
}
for(int k=4;k>=i;k--){
System.out.print(name.charAt(x));
x++;
}
x=0;
System.out.println();
}}
}