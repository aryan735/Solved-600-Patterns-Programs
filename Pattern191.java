class Pattern191{
public static void main(String[] args){
int x=5,y=0;
for(int i=1;i<6;i++){
y=x;
for(int j=1;j<=i;j++)
{
System.out.print(y+" ");
y++;
}
int z=5;
for(int k=4;k>=i;k--)
{
System.out.print(z+" ");

}

x--;
System.out.println();
}
}
}