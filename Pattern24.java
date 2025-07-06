class Pattern24{
public static void main(String[] args){
//24th pattern
int a=1,b=0;
for(int i=1;i<6;i++){
for(int j =1;j<6;j++){
a=a+b;
b=a-b;
a=a-b;
System.out.print(a+" ");
}
a=1;b=0;
System.out.println();

}

}}