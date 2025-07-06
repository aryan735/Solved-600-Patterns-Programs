class Pattern192{
public static void main(String[] args){
int x=1,y=0;
int z=0;
for(int i=1;i<6;i++){
y=x;
for(int j=5;j>=i;j--)
{
System.out.print(y+" ");
y++;
}
int a=z;
for(int k=2;k<=i;k++)
{
System.out.print(a+" ");
a--;
}
z++;
x++;
System.out.println();
}
}
}