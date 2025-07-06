public class Pattern443{
public static void main(String[] args){
int x=3,y=1,a=1;
for(int i=5;i>=2;i--){

for(int j=1;j<=i;j++){
if(j>x){
System.out.print(a);
a++;
}else{
System.out.print(" ");
}
}
x--; 
System.out.println();
}
for(int i=3;i<=5;i++){

for(int j=1;j<=i;j++){
if(j>y){
System.out.print(a);
a++;
}else{
System.out.print(" ");
}
}
y++;
System.out.println();
}

}
}