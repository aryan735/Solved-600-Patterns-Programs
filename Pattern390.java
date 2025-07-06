class Pattern390{
public static void main(String[] args){
int x=4,y=2;
int a=4;
char b='D',c='B';
for(int i =1;i<8;i++){
for(int j=1;j<=4;j++){
if(j==x){
System.out.print(b);
b--;

}else if(i>a&&j==y){
	System.out.print(c);
	y++;
	a++;
	
	c++;
}else{
System.out.print(" ");

}

}

x--;


System.out.println();
}
}

}