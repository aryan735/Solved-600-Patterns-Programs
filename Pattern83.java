class Pattern83{ 
public static void main(String[] args){

for(int i=5;i>=1;i--){
int x=1,y=0;
for(int j=1;j<=i;j++){
if(j==1){
 System.out.print(x+" ");
}else{
 x=x+y;
 y=x-y;
 x=x-y;
 System.out.print(x+" ");

}
 } 

System.out.println();
}
}
}