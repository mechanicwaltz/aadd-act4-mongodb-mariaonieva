package org.example;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
// probando que arranque mongoDB
      String URL = "mongodb://localhost:27017";
    try(MongoClient client = MongoClients.create(URL)) {
        System.out.println("hola funcionando");

        MongoDatabase database = client.getDatabase("dama");
        System.out.println("hola database " +  database.getName());
    }

        }
    }
