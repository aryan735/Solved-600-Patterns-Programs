class Pattern50{
//Pattern50 //Toughest one
public static void main(String[] args){
int y=5,x, v=3;;
for(int i =1;i<6;i++){
x=i;
for(int j=1;j<=i;j++){
if(j==i){
System.out.print(y+"  ");
y--;
}
else if(j==i-1){
	System.out.print(2*j+y+"  ");
	
}
else if(j==i-2){
	System.out.print(9+y+"  ");
	
}else if(j==i-3){
          int f=(i+j);
	System.out.print(f*2+v+"  ");
v=0;	
}else{
System.out.print(i*3+"  ");}
}
System.out.println();
}}
}