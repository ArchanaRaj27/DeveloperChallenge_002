package database;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import io.swagger.model.*;

public class DatabaseFactory {
    private static final String DATABASE = "appychat";
    ConnectionString connString = new ConnectionString(
            //"mongodb+srv://appychat-user:appychat-pwd@cluster0.uuw1e.mongodb.net/appychat?retryWrites=true&w=majority"
            "mongodb://localhost:27017/?readPreference=primary&appname=MongoDB%20Compass%20Community&ssl=false"
    );
    MongoClientSettings settings = MongoClientSettings.builder()
            .applyConnectionString(connString)
            .retryWrites(true)
            .build();
    public MongoDatabase getDatabase(){
        MongoClient mongoClient = MongoClients.create();
        return mongoClient.getDatabase(DATABASE);
    }
}
