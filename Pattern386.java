class Pattern386{
public static void main(String[] args){
int x=4,y=2;
int a=4;
for(int i =1;i<8;i++){
for(int j=1;j<=4;j++){
if(j==x){
System.out.print("*");

}else if(i>a&&j==y){
	System.out.print("*");
	y++;
	a++;
}else{
System.out.print(" ");

}

}

x--;


System.out.println();
}
}

}