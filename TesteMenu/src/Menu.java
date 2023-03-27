
public class Menu {
	
	String[] texto;
	String[] saida;
	int n = 0;
	int tituloCal;

	public Menu(String[] texto) {
		this.texto = texto;
		saida = new String[this.texto.length + 3];
		
		this.saida[0] = "******************************";
		this.saida[2] = "******************************";
		this.saida[saida.length -1] = "******************************";
		
		tituloCal = (28 - this.texto[0].length())/2;
		
		for(int i = 0; i < tituloCal;i++)
		{
			this.texto[0] = " " + this.texto[0] + " ";
		}
		if(this.texto[0].length()%2 != 0)this.texto[0] = this.texto[0] + " ";
		this.texto[0] = "*" + this.texto[0] + "*";
		this.saida[1] = this.texto[0];
		
		for(int j = 1; j < this.texto.length; j++)
		{
			this.texto[j] = "*  " + (j) +" - " + this.texto[j];
			n = 29 - this.texto[j].length();
			for(int i = 0; i < n; i++)
			{
				this.texto[j] = this.texto[j] + " ";
			}
			this.texto[j] = this.texto[j] + "*";
			this.saida[j+2] = texto[j];
		}
		

	}
	
	public void plot()
	{
		for(int i = 0; i < this.saida.length; i++)
		{
			System.out.println(saida[i]);
		}
		
	}

}
