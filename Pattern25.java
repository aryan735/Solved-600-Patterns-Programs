class Pattern25{
public static void main(String[] args){
//25th pattern
int a=0,b=1;
for(int i=1;i<6;i++){
for(int j =1;j<6;j++){
a=a+b;
b=a-b;
a=a-b;
System.out.print(a+" ");
}
a=0;b=1;
System.out.println();

}

}}