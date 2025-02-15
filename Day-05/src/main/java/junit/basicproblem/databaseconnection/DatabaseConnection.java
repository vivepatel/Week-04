package junit.basicproblem.databaseconnection;



public class DatabaseConnection {

    private boolean isConnected;

    public void connect() {
        isConnected = true;
        System.out.println("Database connected.");
    }

    public void disconnect() {
        isConnected = false;
        System.out.println("Database disconnected.");
    }

    public boolean isConnected() {
        return isConnected;
    }

    public static void main(String[] args) {
        DatabaseConnection dbConnection = new DatabaseConnection();
        dbConnection.connect();
        System.out.println("Is connected: " + dbConnection.isConnected());
        dbConnection.disconnect();
        System.out.println("Is connected: " + dbConnection.isConnected());
    }
}