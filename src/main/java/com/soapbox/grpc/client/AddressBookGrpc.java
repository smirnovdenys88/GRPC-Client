package com.soapbox.grpc.client;

import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.4.0)",
    comments = "Source: addressbook.proto")
public final class AddressBookGrpc {

  private AddressBookGrpc() {}

  public static final String SERVICE_NAME = "AddressBook";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.grpc.soapbox.grpc.client.google.proto.Book,
      com.grpc.soapbox.grpc.client.google.proto.Address> METHOD_GET_ADDRESS_BY_BOOK =
      io.grpc.MethodDescriptor.<com.grpc.soapbox.grpc.client.google.proto.Book, com.grpc.soapbox.grpc.client.google.proto.Address>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "AddressBook", "getAddressByBook"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.grpc.soapbox.grpc.client.google.proto.Book.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.grpc.soapbox.grpc.client.google.proto.Address.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.grpc.soapbox.grpc.client.google.proto.User,
      com.grpc.soapbox.grpc.client.google.proto.Books> METHOD_GET_BOOKS_BY_USER =
      io.grpc.MethodDescriptor.<com.grpc.soapbox.grpc.client.google.proto.User, com.grpc.soapbox.grpc.client.google.proto.Books>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "AddressBook", "getBooksByUser"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.grpc.soapbox.grpc.client.google.proto.User.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.grpc.soapbox.grpc.client.google.proto.Books.getDefaultInstance()))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AddressBookStub newStub(io.grpc.Channel channel) {
    return new AddressBookStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AddressBookBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new AddressBookBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AddressBookFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new AddressBookFutureStub(channel);
  }

  /**
   */
  public static abstract class AddressBookImplBase implements io.grpc.BindableService {

    /**
     */
    public void getAddressByBook(com.grpc.soapbox.grpc.client.google.proto.Book request,
        io.grpc.stub.StreamObserver<com.grpc.soapbox.grpc.client.google.proto.Address> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_ADDRESS_BY_BOOK, responseObserver);
    }

    /**
     */
    public void getBooksByUser(com.grpc.soapbox.grpc.client.google.proto.User request,
        io.grpc.stub.StreamObserver<com.grpc.soapbox.grpc.client.google.proto.Books> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_BOOKS_BY_USER, responseObserver);
    }

    @Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_GET_ADDRESS_BY_BOOK,
            asyncUnaryCall(
              new MethodHandlers<
                com.grpc.soapbox.grpc.client.google.proto.Book,
                com.grpc.soapbox.grpc.client.google.proto.Address>(
                  this, METHODID_GET_ADDRESS_BY_BOOK)))
          .addMethod(
            METHOD_GET_BOOKS_BY_USER,
            asyncUnaryCall(
              new MethodHandlers<
                com.grpc.soapbox.grpc.client.google.proto.User,
                com.grpc.soapbox.grpc.client.google.proto.Books>(
                  this, METHODID_GET_BOOKS_BY_USER)))
          .build();
    }
  }

  /**
   */
  public static final class AddressBookStub extends io.grpc.stub.AbstractStub<AddressBookStub> {
    private AddressBookStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AddressBookStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected AddressBookStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AddressBookStub(channel, callOptions);
    }

    /**
     */
    public void getAddressByBook(com.grpc.soapbox.grpc.client.google.proto.Book request,
        io.grpc.stub.StreamObserver<com.grpc.soapbox.grpc.client.google.proto.Address> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_ADDRESS_BY_BOOK, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getBooksByUser(com.grpc.soapbox.grpc.client.google.proto.User request,
        io.grpc.stub.StreamObserver<com.grpc.soapbox.grpc.client.google.proto.Books> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_BOOKS_BY_USER, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class AddressBookBlockingStub extends io.grpc.stub.AbstractStub<AddressBookBlockingStub> {
    private AddressBookBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AddressBookBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected AddressBookBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AddressBookBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.grpc.soapbox.grpc.client.google.proto.Address getAddressByBook(com.grpc.soapbox.grpc.client.google.proto.Book request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_ADDRESS_BY_BOOK, getCallOptions(), request);
    }

    /**
     */
    public com.grpc.soapbox.grpc.client.google.proto.Books getBooksByUser(com.grpc.soapbox.grpc.client.google.proto.User request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_BOOKS_BY_USER, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class AddressBookFutureStub extends io.grpc.stub.AbstractStub<AddressBookFutureStub> {
    private AddressBookFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AddressBookFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected AddressBookFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AddressBookFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.grpc.soapbox.grpc.client.google.proto.Address> getAddressByBook(
        com.grpc.soapbox.grpc.client.google.proto.Book request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_ADDRESS_BY_BOOK, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.grpc.soapbox.grpc.client.google.proto.Books> getBooksByUser(
        com.grpc.soapbox.grpc.client.google.proto.User request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_BOOKS_BY_USER, getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_ADDRESS_BY_BOOK = 0;
  private static final int METHODID_GET_BOOKS_BY_USER = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AddressBookImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AddressBookImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @Override
    @SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_ADDRESS_BY_BOOK:
          serviceImpl.getAddressByBook((com.grpc.soapbox.grpc.client.google.proto.Book) request,
              (io.grpc.stub.StreamObserver<com.grpc.soapbox.grpc.client.google.proto.Address>) responseObserver);
          break;
        case METHODID_GET_BOOKS_BY_USER:
          serviceImpl.getBooksByUser((com.grpc.soapbox.grpc.client.google.proto.User) request,
              (io.grpc.stub.StreamObserver<com.grpc.soapbox.grpc.client.google.proto.Books>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @Override
    @SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static final class AddressBookDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.grpc.soapbox.grpc.client.google.proto.AddressBookClass.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (AddressBookGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AddressBookDescriptorSupplier())
              .addMethod(METHOD_GET_ADDRESS_BY_BOOK)
              .addMethod(METHOD_GET_BOOKS_BY_USER)
              .build();
        }
      }
    }
    return result;
  }
}
