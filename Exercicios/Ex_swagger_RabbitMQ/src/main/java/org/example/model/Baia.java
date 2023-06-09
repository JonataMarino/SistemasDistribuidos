package org.example.model;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Document
public class Baia implements Serializable {

    private String id;
    private String LocalBaia;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLocalBaia() {
        return LocalBaia;
    }

    public void setLocalBaia(String localBaia) {
        LocalBaia = localBaia;
    }
}
