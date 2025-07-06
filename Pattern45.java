class Pattern45{
//Pattern45
public static void main(String[] args){
int x=1,y=2,temp=0;
for (int i= 1; i<6;i++){

for(int j=1;j<=i;j++){
if(j==1){
System.out.print(x+" ");
temp=x;
x+=y;
}else{
temp+=2;
System.out.print(temp+" ");
}
}
y=y+2;
System.out.println();
}}}