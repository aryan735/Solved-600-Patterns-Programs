class Pattern55{
public static void main(String[] args){
int x=1;
for(int i=1;i<6;i++){
for(int j=1;j<=i;j++){
   int mul=1;
  for(int k=1;k<=2;k++){
  mul*=x;
  }
  System.out.print(mul+" ");
  x++;
  }
                         
System.out.println();
}
}
}
