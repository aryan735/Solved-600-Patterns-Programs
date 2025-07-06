class Pattern418
{
public static void main(String[] args){
String name="SoftEthics";
int x=0;
for(int i=0;i<=4;i++){
	
for(int j=0;j<=i;j++){
if(x>9){
	x=0;
	System.out.print(name.charAt(x)+" ");
	x++;
}else{
System.out.print(name.charAt(x)+" ");
x++;}
}

System.out.println();
}}
}