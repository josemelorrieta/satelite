
public class Satelite {
	public double meridiano;
	public double paralelo;
	public double distanciaTierra;
	
	public Satelite(double m,double p,double d) {
		this.meridiano=m;
		this.paralelo=p;
		this.distanciaTierra=d;
	}
	
	public Satelite() {
		this.meridiano=paralelo=distanciaTierra=0;
	}
	
	public void setPosicion(double m,double p,double d) {
		this.meridiano=m;
		this.paralelo=p;
		this.distanciaTierra=d;
	}
	
	public void printPosicion() {
		System.out.println("El satélite se encuentra en el paralelo " + this.paralelo + " meridiano " + this.meridiano + " a una distancia de la tierra de " + this.distanciaTierra + " Kilómetros");
	}
	
	public boolean enOrbita() {
		if(this.distanciaTierra<=50)
			return false;
		else
			return true;
	}
	
	public void variaAltura(double desplazamiento) {
		this.distanciaTierra = this.distanciaTierra + desplazamiento;
	}
	
	/** añadido desde mi casa xD **/
}
