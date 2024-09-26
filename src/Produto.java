import java.time.LocalDate;

public class Produto {
	
	//Atributos da classe Produto
	String nome;
	double precoCusto;
	double precoVenda;
	LocalDate dataFabricacao;
	LocalDate dataValidade;
	
	//Construtor que utiliza para inicializar os atributos
	public Produto(String nome, double precoCusto, double precoVenda, LocalDate dataFabricacao, LocalDate dataValidade) {
		this.nome = nome;
		this.precoCusto = precoCusto;
		this.precoVenda = precoVenda;
		this.dataFabricacao = dataFabricacao;
		this.dataValidade = dataValidade;
	}
	
	//Construtor que aceita data de validade como 1 mês após a data de fabricação
	public Produto(String nome, double precoCusto, double precoVenda, LocalDate dataFabricacao) {
        this.nome = nome;
        this.precoCusto = precoCusto;
        this.precoVenda = precoVenda;
        this.dataFabricacao = dataFabricacao;
        this.dataValidade = dataFabricacao.plusMonths(1);
	}
	
	// Construtor que aceita apenas nome e preço de custo
	public Produto(String nome, double preocCusto) {
		this.nome = nome;
        this.precoCusto = precoCusto;
        this.precoVenda = precoCusto * 1.10;
        this.dataFabricacao = LocalDate.now(); 
        this.dataValidade = dataFabricacao.plusMonths(1);
	}
	
	//Getters para acessar os atributos
	public String getNome() {
		return nome;
	}
	
	public double getPrecoCusto() {
		return precoCusto;
	}
	
	public double getPrecoVenda() {
		return precoVenda;
	}
	
	public LocalDate getDataFabricacao() {
		return dataFabricacao;
	}
	
	public LocalDate getDataValidade() {
		return dataValidade;
	}
	
	public void exibirInformacoes() {
		System.out.println("Nome: " + nome);
		System.out.println("Preço de Custo: " + precoCusto);
		System.out.println("Preço de Venda: " + precoVenda);
		System.out.println("Data de fabricação: " + dataFabricacao);
		System.out.println("Data de validade: " + dataValidade);
	}
	
	
}
