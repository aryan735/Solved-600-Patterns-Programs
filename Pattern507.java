public class Pattern507{
public static void main(String[] args){

int x=3;
for(int i=1;i<=4;i++){

for(int k=4;k>=i;k--){
System.out.print(" ");
}
for(int j=3;j<=2*i+1;j++){
if(j==x){
System.out.print("*");
}else{
	System.out.print(" ");

}
}
x++;
System.out.println();
}


for(int i=4;i>=1;i--){
for(int k=4;k>=i;k--){
System.out.print(" ");
}
for(int j=3;j<=2*i+1;j++){

System.out.print("*");


}

System.out.println();
}
}}