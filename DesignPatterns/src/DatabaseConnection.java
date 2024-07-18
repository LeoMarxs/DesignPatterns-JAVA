public class DatabaseConnection {
    
    private static DatabaseConnection instance;

    private DatabaseConnection() {

    }


    public static synchronized DatabaseConnection getInstance() {
        if (instance == null) {
            instance = new DatabaseConnection();
        }
        return instance;
    }

    public void connect() {
        
        System.out.println("--------------------------------------------");
        System.out.println("Conectado ao banco de dados.");
        System.out.println("--------------------------------------------");
    }

 
    public void disconnect() {
        
        System.out.println("--------------------------------------------");
        System.out.println("Desconectado do banco de dados.");
        System.out.println("--------------------------------------------");
    }
}