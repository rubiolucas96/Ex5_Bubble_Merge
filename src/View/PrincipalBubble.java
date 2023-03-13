package View;
import br.edu.fateczl.ordenação.OrdenacaoControllerBubble;
public class PrincipalBubble {
	public static void main(String[] args) {
		int[] vetor = {69,68,32,36,91,19,28,44,88,73,37,99,1};
		OrdenacaoControllerBubble oCont = new OrdenacaoControllerBubble();
		vetor = oCont.bubbleSort(vetor);
		
		System.out.println("");
		System.out.println("=======================================");
		for (int valor : vetor) {
			System.out.print(valor+" ");
		}
		System.out.println("");
		System.out.println("=======================================");
		// TODO Auto-generated method stub

	}
}
