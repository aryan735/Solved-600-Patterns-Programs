class Pattern422
{
public static void main(String[] args){
String name="SoftEthics";
int x=0;
for(int i=0;i<=4;i++){
	for(int k=4;k>=i;k--){
	System.out.print(" ");
	}
for(int j=1;j<=2*i+1;j++){
if(x>9){
	x=0;
	System.out.print(name.charAt(x));
	x++;
}else{
System.out.print(name.charAt(x));
x++;}
}

System.out.println();
}}
}