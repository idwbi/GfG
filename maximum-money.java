import java.util.*;
import java.lang.*;
import java.io.*;
//5 10 => 30
//2 12 => 12
class GFG {
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
		int T = s.nextInt();
		while (T-- > 0) {
		    int n = s.nextInt();
		    int m = s.nextInt();
		    int ans = 0;
		    if (n % 2 == 0) ans = (n / 2) * m;
		    else ans = ((n + 1) / 2) * m;
		    System.out.println(ans);
		}
	}
}