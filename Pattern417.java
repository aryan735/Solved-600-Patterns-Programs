class Pattern417
{
public static void main(String[] args){
String name="SoftEthics";
int x=9;
for(int i=0;i<=3;i++){
	
for(int j=0;j<=3;j++){
if(x<0){
	x=9;
	System.out.print(name.charAt(x)+" ");
	x--;
}else{
System.out.print(name.charAt(x)+" ");
x--;}
}

System.out.println();
}}
}