public class Pattern523{
public static void main(String[] args){
int x=7,y=7,z=13;
for(int i=1;i<=7;i++){

for(int j=1;j<=13;j++){
if(i<4){
if(j<=i){
System.out.print("* ");
}else if(j>=x&&j<=y){
System.out.print("* ");
}else if(j>=z){
System.out.print("* ");

}else{
	System.out.print("  ");

}
}else{
 if(i>3){
	System.out.print("* ");
}else{
System.out.print("  ");

}
}
}
x--;y++;z--;
System.out.println();
}
}}