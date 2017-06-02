
public class OrganizadoresF {
	GeradorDeVetores vetores;
	
	public OrganizadoresF(GeradorDeVetores _vetores){
		vetores = _vetores;
	}
	
	public void printaVetor(){
		System.out.println(" ");
		System.out.println("Valores do Vetor: "+vetores);
	}
	
	public void printarQuickSort(){
		//QuickSort
		long tempoInicialQuickSort = System.currentTimeMillis();
		OrganizadorQuickSort.OrganizarVetor(vetores.getVetor());
		long tempoFinalQuickSort = System.currentTimeMillis() - tempoInicialQuickSort;
				
		System.out.println("==================================================================================================== ");
		System.out.println(" ");
		System.out.println("QuickSort: "+vetores);
		System.out.println(" ");
		System.out.println("Tempo do QuickSort: " + tempoFinalQuickSort);
		System.out.println("Trocas do QuickSort: "+ OrganizadorQuickSort.getNumerodeTrocas());
		System.out.println("Comparações do QuickSort: "+ OrganizadorQuickSort.getNumerodeComparacoes());
	}
	
	public void printarSelect(){
		long tempoInicialSelectionS = System.currentTimeMillis();
        OrganizadorSelectionSort.doSelectionSort(vetores.getVetor());
        long tempoFinalSelectionS = System.currentTimeMillis() - tempoInicialSelectionS;
        
        System.out.println("==================================================================================================== ");
        System.out.println(" ");
        System.out.println("SelectionSort: "+vetores);
        System.out.println(" ");
        System.out.println("Tempo do SelectionSort: " + tempoFinalSelectionS);
        System.out.println("Trocas do SelectionSort: "+ OrganizadorSelectionSort.getNumerodeTrocas());
        System.out.println("Comparações do SelectionSort: "+ OrganizadorSelectionSort.getNumerodeComparacoes());
	}
	
}
