
public class OrganizadorSelectionSort {
static long trocas = 0;
static long comparacoes = 0;
	
	public static int[] doSelectionSort(int[] arr){
		
        for (int i = 0; i < arr.length - 1; i++){
            int index = i;
            for (int j = i + 1; j < arr.length; j++)
                if (arr[j] < arr[index])
                    index = j;
            		comparacoes++;
      
            int smallerNumber = arr[index]; 
            arr[index] = arr[i];
            arr[i] = smallerNumber;
            trocas++;
        }
        return arr;
    }

	public static long getNumerodeTrocas(){
		return  trocas;
	}
	
	public static long getNumerodeComparacoes(){
		return  comparacoes;
	}
}
