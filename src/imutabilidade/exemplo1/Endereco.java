package imutabilidade.exemplo1;

public class Endereco {

	private String rua;
	private final String cep;
	
	public Endereco(String rua, String cep) {
		this.rua = rua;
		this.cep = cep;
	}

	public String getRua() {
		return rua;
	}

	public String getCep() {
		return cep;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}
	
	
}
