import java.util.*;
import java.io.*;
public class Solution {
public static int findMin(int X, int Y) {
int ans = 0;
while (Y > X) {
ans++;
if (Y % 2 == 1)
Y++;
else
Y /= 2;
}
return ans + X - Y;
}
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int x = s.nextInt();
int y=s.nextInt();
System.out.println(findMin(x,y));
}
}