public class Pattern479{
public static void main(String[] args){
int y=2;int z=3;int a=4;
for(int i=3;i>=1;i--){
	int x=1,z1=z;
for(int j=2*i;j>=1;j--){
if(j<a){

System.out.print(z1);
z1--;
}else{

System.out.print(x);x++;
}
}
a--;
z--;

System.out.println();
}
a=2; z=2;
for(int i=2;i<=3;i++){
	int x=1,z1=z;
for(int j=1;j<=2*i;j++){
if(j>a){

System.out.print(z1);
z1--;
}else{

System.out.print(x);x++;
}
}
a++;
z++;

System.out.println();
}


}
}
