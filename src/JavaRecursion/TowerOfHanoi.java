package JavaRecursion;

public class TowerOfHanoi {
	// TOWER OF HANOI:
	
	public static void towerOfHanoi(int n, char from, char to, char aux) {
		    if(n==0) return;
		   
		    towerOfHanoi(n-1,  from, aux, to);
			System.out.println("MOVE "+ n + " from " + from + " to " + to );
		    towerOfHanoi(n-1,  aux, to , from);
			
			
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		towerOfHanoi(2, 'A',  'B',  'C');
	}

}
