public class Pattern478{
public static void main(String[] args){
int x=1,y=2;
for(int i=3;i>=1;i--){
	int x1=x;
for(int j=2*i+1;j>=3;j--){
System.out.print(x1);x1++;
}

x++;
System.out.println();
}
for(int i=2;i<=3;i++){
	int y1=y;
for(int j=3;j<=2*i+1;j++){
System.out.print(y1);y1++;
}

y--;
System.out.println();
}


}
}
