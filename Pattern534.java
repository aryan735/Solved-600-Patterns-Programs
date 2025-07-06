public class Pattern534{
public static void main(String[] args){

for(int i=3;i>=1;i--){

for(int j=8;j>=2*i;j--){
System.out.print("  ");

}


for(int j=1;j<=2*i;j++){
System.out.print("* ");

}




System.out.println();

for(int j=8;j>=2*i;j--){
System.out.print("  ");

}
for(int k=1;k<=2*i;k++){
System.out.print("* ");

}

System.out.println();
}
}}