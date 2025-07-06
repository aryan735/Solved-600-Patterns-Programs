public class Pattern476{
public static void main(String[] args){

for(int i=1;i<=4;i++){
	for(int k=4;k>=i;k--){
		System.out.print(" ");
	}
for(int j=3;j<=2*i+1;j++){
System.out.print("*");
}
for(int l=3;l>=i;l--){
	System.out.print("  ");
}
for(int j=3;j<=2*i+1;j++){
System.out.print("*");
}
System.out.println();
}


}
}
