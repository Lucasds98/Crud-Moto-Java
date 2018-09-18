
public class CadastroMoto {

		private String nome;
		private String marca;
		private String cor;
		private String ano;
		
		public CadastroMoto(String nome, String marca, String cor, String ano) {
			this.nome = nome;
			this.marca = marca;
			this.ano = ano;
			this.cor = cor;
		}
		public CadastroMoto() {
			
		}




		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getMarca() {
			return marca;
		}
		public void setMarca(String marca) {
			this.marca = marca;
		}
		public String getCor() {
			return cor;
		}
		public void setCor(String cor) {
			this.cor = cor;
		}
		public String getAno() {
			return ano;
		}
		public void setAno(String ano) {
			this.ano = ano;
		}


		@Override
		public String toString() {
			return "CadastroMoto [nome=" + nome + ", marca=" + marca + ", cor=" + cor + ", ano=" + ano + "]";
		}


		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((ano == null) ? 0 : ano.hashCode());
			result = prime * result + ((cor == null) ? 0 : cor.hashCode());
			result = prime * result + ((marca == null) ? 0 : marca.hashCode());
			result = prime * result + ((nome == null) ? 0 : nome.hashCode());
			return result;
		}


		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			CadastroMoto other = (CadastroMoto) obj;
			if (ano == null) {
				if (other.ano != null)
					return false;
			} else if (!ano.equals(other.ano))
				return false;
			if (cor == null) {
				if (other.cor != null)
					return false;
			} else if (!cor.equals(other.cor))
				return false;
			if (marca == null) {
				if (other.marca != null)
					return false;
			} else if (!marca.equals(other.marca))
				return false;
			if (nome == null) {
				if (other.nome != null)
					return false;
			} else if (!nome.equals(other.nome))
				return false;
			return true;
		}
		
		
		
}