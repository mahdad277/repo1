package org.example;

import io.milvus.v2.client.ConnectConfig;
import io.milvus.v2.client.MilvusClientV2;

public class TestMilvusConnection {
    public static void main(String[] args) {
        // Build connection parameters for local Milvus
        MilvusClientV2 client = new MilvusClientV2(ConnectConfig.builder()
                .uri("https://in03-a6d314869a5e4ff.serverless.gcp-us-west1.cloud.zilliz.com")
                .token("")
                .build());

            // Get server version
        String version = client.getServerVersion();
        System.out.println("✅ Connected to Milvus. Server version: " + version);
    }
}
