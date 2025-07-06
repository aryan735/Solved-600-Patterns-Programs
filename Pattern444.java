public class Pattern444{
public static void main(String[] args){
	int x=1;
for(int i =1;i<=3;i++){
for(int j=1;j<=i;j++){
if(i==3){
System.out.print(x+" ");
x++;
}else{
System.out.print("* ");
}
}
System.out.println();
}
for(int i =2;i>=1;i--){
for(int j=1;j<=i;j++){
System.out.print("* ");

}
System.out.println();
}
}
}