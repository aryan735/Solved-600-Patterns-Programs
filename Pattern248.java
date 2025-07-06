class Pattern248{
public static void main(String[] args){
int x=1,y=1,z=0,b=1,d=0,a=0;
for(int i=1;i<=5;i++){
for(int j=3;j<=2*i+1;j++){
if(j==3){
System.out.print(x);
z=x;
x+=y;
d+=b;
b++;

}else{

if(z>=d){
 a--;
 System.out.print(a);
}else{
z++;
System.out.print(z);
 a=z;
}
}
} 

y++;
System.out.println();
}
}
}