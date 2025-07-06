class Pattern86{ 
public static void main(String[] args){
int x=1,y=0,a=0,b=0;
for(int i=5;i>=1;i--){
for(int j=1;j<=i;j++){
if(j==1){
 System.out.print(x+" ");
  x=x+y;
 y=x-y;
 x=x-y;
 a=x;
 b=y;
}else{

 System.out.print(a+" ");
 a=a+b;
 b=a-b;
 a=a-b;
}
 } 

System.out.println();
}
}
}