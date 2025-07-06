class Pattern57{
public static void main(String[] args){
int x=0,y=1,z=0;
for(int i=1;i<6;i++){
for(int j=1;j<=i;j++){
System.out.print(y+" ");
z=x+y;
x=y;
y=z;
 }                     
System.out.println();
}
}
}
