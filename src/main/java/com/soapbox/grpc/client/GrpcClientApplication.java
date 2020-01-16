package com.soapbox.grpc.client;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GrpcClientApplication {

    private static ManagedChannel grpcConnection;
    private static HelloServiceGrpc.HelloServiceBlockingStub stub;

    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            try {
                grpcConnection = ManagedChannelBuilder.forTarget("localhost:6666")
                        .usePlaintext()
                        .build();

                HelloRequest request = HelloRequest.newBuilder()
                        .setFirstName("Test" + i)
                        .setLastName("Test" + i)
                        .build();

                stub = HelloServiceGrpc.newBlockingStub(grpcConnection);

                HelloResponse response = stub.hello(request);
                System.out.println(response.getGreeting());

                Thread.sleep(1000l);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
