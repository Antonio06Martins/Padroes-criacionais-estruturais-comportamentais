package padroescriacionais.prototype;

import padroescriacionais.prototype.model.Endereco;
import padroescriacionais.prototype.model.Usuario;

public class ClientProtoType {

	public static void main(String[] args) throws CloneNotSupportedException {
		Usuario usuario = new Usuario("Original Para Clonar", 25, new Endereco("Rua A", 1000));
		System.out.println(usuario);

		Usuario cloneUsuario = usuario.cloneBuilder().comNome("Clonado").agora();
		System.out.println(cloneUsuario);

		Usuario usuarioNovoApartirDoClone = cloneUsuario.cloneBuilder()
				.comNome("Clonado e Alterado")
				.comIdade(100)
				.comEndereco(new Endereco("Rua B", 500))
				.agora();
		System.out.println(usuarioNovoApartirDoClone);
	}
}