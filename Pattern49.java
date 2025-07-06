class Pattern49{
//Pattern49 //Tough one
public static void main(String[] args){
int y=6,x=1,temp=7,sub=0,A=0, d=4;;
for(int i =1;i<6;i++){
sub=i;
for(int j=1;j<=i;j++){
if(j==i){
System.out.print(x+" ");
x++;
}else if(j==i-1){
	sub+=temp;
	System.out.print(sub+"   ");
       temp-=2;
}
else if(j==i-2){
	A=7+i;
	System.out.print(A+"   ");

}
else if(j==i-3){
	System.out.print(A+d+"   ");
	d-=2;
}else{
	System.out.print(A+i-1+"   ");
}
}
System.out.println();
}}
}

