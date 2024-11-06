package imutabilidade.exemplo1;

public class Usuario {

	//Keyword final
	private final String nome;
	private final Endereco endereco;
	
	public Usuario(String nome, Endereco endereco) {
		this.nome = nome;
		this.endereco = endereco;
	}
	
	//Método de leitura somente
	public String getNome() {
		return this.nome;
	}
	
	public Endereco getEndereco() {
		return this.endereco;
	}
}
