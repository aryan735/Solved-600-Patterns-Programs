public class Pattern539{
public static void main(String[] args){

for(int i=1;i<=3;i++){


for(int j=3;j>=i;j--){
System.out.print("  ");

}

for(int j=3;j<=i*2+1;j++){
System.out.print("* ");

}
System.out.println();


for(int k=3;k>=i;k--){
System.out.print("  ");

}



for(int k=3;k<=i*2+1;k++){
System.out.print("* ");

}

System.out.println();
}}}