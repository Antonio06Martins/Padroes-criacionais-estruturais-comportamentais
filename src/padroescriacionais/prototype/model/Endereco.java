package padroescriacionais.prototype.model;

public record Endereco(String rua, Integer numero) implements Cloneable {

	/*
	Usando o record removemos tudo o que esta comentado a baixo
	 */
//	private final String rua;
//	private final Integer numero;
//
//	public Endereco(String rua, Integer numero) {
//		super();
//		this.rua = rua;
//		this.numero = numero;
//	}
//
//	public String getRua() {
//		return rua;
//	}
//
//	public Integer getNumero() {
//		return numero;
//	}

	@Override
	public String toString() {
		return "Endereco [rua=" + rua + ", numero=" + numero + "]";
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public static class Builder {
		private String rua;
		private Integer numero;

		private Builder(String rua, Integer numero) {
			this.rua = rua;
			this.numero = numero;
		}

		public Builder comEndereco(String rua) {
			this.rua = rua;
			return this;
		}

		public Builder ComNumero(Integer numero) {
			this.numero = numero;
			return this;
		}

		public Endereco agora() {
			return new Endereco(rua, numero);
		}
	}
}
