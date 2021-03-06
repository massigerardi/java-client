package org.arkecosystem.client.api;

import com.google.gson.internal.LinkedTreeMap;
import java.io.IOException;
import org.arkecosystem.client.http.Client;

public class Blockchain {

    private Client client;

    public Blockchain(Client client) {
        this.client = client;
    }

    public LinkedTreeMap<String, Object> all() throws IOException {
        return this.client.get("blockchain");
    }
}
