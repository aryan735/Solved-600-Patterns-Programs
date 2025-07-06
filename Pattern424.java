class Pattern424
{
public static void main(String[] args){
String name="SUMIT";

for(int i=0;i<=4;i++){
for(int k=0;k<=4;k++){
if(k==2){
System.out.print(name.charAt(i));

}else if(i==2){
	System.out.print(name.charAt(k));
}else{
		System.out.print(" ");
}
}

System.out.println();
}}
}

