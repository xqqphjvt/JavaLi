

public class Main extends Player{
	
	private String nome = "Guilherme";
	private int[] numeros;
	public static final int VIDA_MAXIMA = 100;
	
	//M�todo construtor.
	public Main(int n1, int n2) {
		super(n1, n2);
		numeros = new int [1000];
	}
	
	public String getNome() {
		return nome;
	}
	
	public static void main(String[] args) {
		Main m = new Main(100, 200);
		System.out.println(Main.VIDA_MAXIMA);
	}
		
}