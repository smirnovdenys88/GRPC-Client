package com.soapbox.grpc.client;

import com.grpc.soapbox.grpc.client.google.proto.Address;
import com.grpc.soapbox.grpc.client.google.proto.Book;
import com.grpc.soapbox.grpc.client.google.proto.Books;
import com.grpc.soapbox.grpc.client.google.proto.User;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.concurrent.TimeUnit;

public class GrpcClientApplication {
    private static final Logger LOG = LogManager.getLogger(GrpcClientApplication.class);

    private static ManagedChannel managedChannel;
    private static AddressBookGrpc.AddressBookBlockingStub stub;

    public static void main(String[] args) {
        LOG.info("Start client grpc");
        managedChannel = ManagedChannelBuilder
                        .forTarget("localhost:9633")
                        .usePlaintext()
                        .build();

        stub = AddressBookGrpc.newBlockingStub(managedChannel);
        long deadlineMs = 2000;

        for (int i = 0; i <= 2; i++) {
            try {
                Book book = Book.newBuilder()
                        .setNameBook("Some kind book " + i)
                        .setBookType(Book.BookType.HOME)
                        .setAuthor("Some kind author " + i)
                        .build();

                Address address = stub
                        .withDeadlineAfter(deadlineMs, TimeUnit.MILLISECONDS)
                        .getAddressByBook(book);

                System.out.printf("\nBook: %s \nAddress: %s\n", book, address);

                Thread.sleep(1000l);
            } catch (InterruptedException e) {
            } catch (Exception e){
                System.out.println(e);
            }
        }


        LOG.info("Get books by user");

        User user = User.newBuilder()
                .setUserName("Jon Snow")
                .build();

        Books books = stub.getBooksByUser(user);

        LOG.info("Books: " + books.toString());

        managedChannel.shutdown();
        LOG.info("Stop client grpc");
    }
}
