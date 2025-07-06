class Pattern54{
public static void main(String[] args){
int x=1,y=0,a=0;
for(int i=1;i<6;i++){
for(int j=1;j<=i;j++){
if(i<2){
System.out.print(x+" ");
}else if(j==1&&i>1){

System.out.print(x+" ");
a=x;
x+=y;
}else{
	
	
	a++;
	System.out.print(a+" ");
}

}
y++;                          
System.out.println();
}
}
}
