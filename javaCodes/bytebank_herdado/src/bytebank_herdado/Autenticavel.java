package bytebank_herdado;

// Interfaces são classes especiais compostas apenas por métodos abstratos e atributos
//na forma de constantes estáticas (a partir do java 8)
// Para criar uma interface basta usar a palavra reservada interface no lugar onde
//ficaria a palavra reservada class numa classe comum
public abstract interface Autenticavel {
	
	public abstract void setSenha(int senha);

	public abstract void setLogin(String login);

	public abstract boolean autentica(int senha);

}
