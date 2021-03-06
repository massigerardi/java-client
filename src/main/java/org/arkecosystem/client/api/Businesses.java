package org.arkecosystem.client.api;

import com.google.gson.internal.LinkedTreeMap;
import java.io.IOException;
import java.util.Map;
import org.arkecosystem.client.http.Client;

public class Businesses {
    private Client client;

    public Businesses(Client client) {
        this.client = client;
    }

    public LinkedTreeMap<String, Object> all() throws IOException {
        return this.client.get("businesses");
    }

    public LinkedTreeMap<String, Object> show(String id) throws IOException {
        return this.client.get("businesses/" + id);
    }

    public LinkedTreeMap<String, Object> showBridgechains(String id) throws IOException {
        return this.client.get("businesses/" + id + "/bridgechains");
    }

    public LinkedTreeMap<String, Object> showBridgechain(String businessId, String bridgechainId)
            throws IOException {
        return this.client.get("businesses/" + businessId + "/bridgechains" + bridgechainId);
    }

    public LinkedTreeMap<String, Object> search(Map<String, Object> parameters) throws IOException {
        return this.client.post("businesses/search", parameters);
    }
}
