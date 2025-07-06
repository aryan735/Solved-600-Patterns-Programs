class Pattern391{
public static void main(String[] args){
int x=5,y=5;

for(int i =1;i<6;i++){
for(int j=1;j<=9;j++){
if(j==x||j==y){
	System.out.print("*");

}else{
	System.out.print(" ");
}

}
x--;
y++;
System.out.println();
}
int x1=2,y1=8;

for(int i =4;i>=1;i--){
for(int j=1;j<=8;j++){
if(j==x1||j==y1){
	System.out.print("*");

}else{
	System.out.print(" ");
}

}
x1++;
y1--;
System.out.println();
}
}

}