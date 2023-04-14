package object;

public class Tenant {
	//Propriedades
	private String name;
	private String email;
	private int room;
	
	//construtor
	public Tenant(String name, String email, int room) {
		super();
		this.name = name;
		this.email = email;
		this.room = room;
	}
	
	//GET: metodo para visualizar propriedades privadas de um objeto
	public String getName() {
		return name;
	}
	
	//GET: metodo para alterar o valor de propriedades privadas de um objeto
	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getRoom() {
		return room;
	}

	public void setRoom(int room) {
		this.room = room;
	}
	
	//toString: Permite modificar a escrita de um objeto para uma forma desejavel
	public String toString () {
		return "#" + room + ": " + name + ", " + email;		
	}
}
