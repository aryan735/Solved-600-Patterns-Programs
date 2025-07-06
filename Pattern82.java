class Pattern82{ 
public static void main(String[] args){
int x=1,y=0;
for(int i=5;i>=1;i--){

for(int j=1;j<=i;j++){
 System.out.print(y+" ");

 } 
 x=x+y;
 y=x-y;
 x=x-y;
System.out.println();
}
}
}