package org.arkecosystem.client.api;

import com.google.gson.internal.LinkedTreeMap;
import org.arkecosystem.client.Connection;
import org.arkecosystem.client.MockHelper;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class BlockchainTest {

    @Test
    void all() throws IOException {
        Connection connection = MockHelper.connection();
        LinkedTreeMap<String, Object> actual = connection.api().blockchain.all();
        assertTrue((boolean) actual.get("success"));
    }
}