class Pattern18{
public static void main(String[] args){
int a=1,b=0;
for(int i=1;i<6;i++){
for(int j =1;j<6;j++){
a=a-b;
b=b+a;
a=b-a;
System.out.print(a+" ");
}System.out.println();
}

}}