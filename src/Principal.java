import java.time.LocalDate;

public class Principal {
	public static void main (String[] args) {
		
		//Usando o construtor 1
		Produto produto1 = new Produto("Produto A", 50.0, 75.0, LocalDate.of(2024, 9, 1), LocalDate.of(2024, 10, 1));
        produto1.exibirInformacoes();
        
     // Usando o construtor 2
        Produto produto2 = new Produto("Produto B", 40.0, 60.0, LocalDate.of(2024, 9, 1));
        produto2.exibirInformacoes();
        
        // Usando o construtor 3
        Produto produto3 = new Produto("Produto C", 30.0);
        produto3.exibirInformacoes();
	}

}
