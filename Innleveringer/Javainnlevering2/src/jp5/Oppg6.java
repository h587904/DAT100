package jp5;

public class Oppg6 {

	public static void main(String[] args) {
		//int[] test1 = {67,42,89};
		//int[] test2 = {15,4,55};
		//skrivUt(test1);
		//System.out.println(tilStreng(test1));
		//System.out.println(whileloopSummer(test1));
		//System.out.println(forloopSummer(test1));
		//System.out.println(enhancedforloopSummer(test1));
		//System.out.println(finnesTall(test1, 67));
		//reverser(test1);
		//System.out.println(erSortert(test1));
		//System.out.println(Arrays.toString(settSammen(test1,test2)));
	}
	
	//A
	public static void skrivUt(int[] tabell) {
		for (int element : tabell) {
			System.out.println(element);
		}
	}

	//B
	public static String tilStreng (int[] tabell) {
		String stringTabell = "";
		for(int i = 0; i < tabell.length; i++) {
			stringTabell += Integer.toString(tabell[i]);
			if (i+1 != tabell.length) {
				stringTabell += ",";
			}
		}
		
		stringTabell = "[" + stringTabell + "]";
		return stringTabell;
	}
	
	//C
	public static int forloopSummer (int[] tabell) {
		int sum = 0;
		for (int i = 0; i < tabell.length; i++) {
			sum += tabell[i];
		}
		
		return sum;
	}
	
	public static int whileloopSummer (int[] tabell) {
		int sum = 0;
		int i = 0;
		
		while (i < tabell.length) {
			sum += tabell[i];
			i++;
		}
		
		return sum;
	}
	
	public static int enhancedforloopSummer (int[] tabell) {
		int sum = 0;
		for (int element : tabell) sum += element;
		return sum;
	}
	
	//D
	public static boolean finnesTall (int[] tabell, int tall) {
		boolean finnes = false;
		for (int element : tabell) {
			if(element == tall) {
				finnes = true;
				break;
			}
		}
		
		return finnes;
	}
	
	
	//E
	public static int posisjonTall (int[] tabell, int tall) {
		int index = -1;
		for (int i = 0; i < tabell.length; i++) {
			if (tabell[i] == tall) {
				index = i;
			}
		}
		return index;
	}
	
	
	//F
	public static int[] reverser(int[] tabell) {

        int nyttArray[] = new int[tabell.length]; 

        int arrLength = tabell.length;

        for (int i = 0; i < tabell.length; i++) {
        	nyttArray[i] = tabell[arrLength-1];
        	arrLength--;
        }
        
        return nyttArray;
	}
	
	//G
	public static boolean erSortert (int[] tabell) {
		boolean sortert = true;

		for (int i = 0; i < tabell.length - 1; i++) {
		    if (tabell[i] > tabell[i+1]) {
		        sortert = false;
		        break;
		    }
		}
		
		return sortert;
	}
	
	//H
	public static int[] settSammen(int[] tabell1,int[] tabell2) {
		int kombinertArray[] = new int[tabell1.length + tabell2.length]; 
		int index = 0;
		
		for(int i = 0; i < tabell1.length; i++) {
			kombinertArray[index] = tabell1[i];
			index++;
		}
		
		for(int i = 0; i < tabell2.length; i++) {
			kombinertArray[index] = tabell2[i];
			index++;
		}
		
		return kombinertArray;
	}
}
