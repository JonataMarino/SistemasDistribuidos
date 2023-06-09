package org.example.model;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.io.Serializable;
import java.util.Random;

@Document
public class GeraId implements Serializable {
    Random random = new Random();
    int geraId = random.nextInt(10000)+ 1;
    private String id = String.valueOf(geraId);

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
