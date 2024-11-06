package imutabilidade.exemplo1;

public class ImutabilidadeExemplo1 {

	public static void main(String[] args) {
		
		Endereco endereco = new Endereco("Rua 1", "90112-56");
		Usuario usuario = new Usuario("João", endereco);
		System.out.println(usuario.getNome());
		System.out.println(usuario.getEndereco().getRua());
		
		//Quebra da imutabilidade
		usuario.getEndereco().setRua("Rua 2");
		System.out.println(usuario.getEndereco().getRua());
	}
}
