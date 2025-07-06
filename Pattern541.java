public class Pattern541{
public static void main(String[] args){
int x=1,y=3;
for(int i=1;i<=5;i++){

for(int j=1;j<=5;j++){
if(i<=3){
if(j>=x){
System.out.print("* ");

}else{
System.out.print("  ");
}

}else{
if(j>=y){
System.out.print("* ");

}else{
System.out.print("  ");
}

}
}
if(i<=3){
	x+=2;
}else{
	y-=2;
}

System.out.println();
}}}