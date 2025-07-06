public class Pattern540{
public static void main(String[] args){

for(int i=1;i<=3;i++){


for(int j=3;j>=i;j--){
System.out.print("  ");

}

for(int j=1;j<=i*2;j++){
if(j==1||j==i*2){
System.out.print("* ");
}else{
System.out.print("  ");

}
}
System.out.println();


for(int k=3;k>=i;k--){
System.out.print("  ");

}



for(int k=1;k<=i*2;k++){
if(k==1||k==i*2){
System.out.print("* ");
}else{
System.out.print("  ");

}

}

System.out.println();
}}}