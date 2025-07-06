class Pattern20{
public static void main(String[] args){
int a=0,b=1,c=0;
for(int i=1;i<6;i++){
for(int j =1;j<6;j++){
if(i%2==1){
a=a-b;
b=b+a;
a=b-a;
System.out.print(a+" ");

}else{
System.out.print(c+" ");
}
}

System.out.println();
a=0;b=1;
}

}}