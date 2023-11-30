package Model;

public class Seleccion {

	private String país;
	private int ranking;
	private String rutaBandera;
	private Jugador[] listaJugadores;

	public Seleccion(Jugador[] listaJugadores) {
		this.listaJugadores = listaJugadores;
	}

	public Jugador[] getListaJugadores() {
		return this.listaJugadores;
	}

	public void setListaJugadores(Jugador[] listaJugadores) {
		this.listaJugadores = listaJugadores;
	}

}