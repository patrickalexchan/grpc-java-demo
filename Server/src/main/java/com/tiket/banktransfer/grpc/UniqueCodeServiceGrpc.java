package com.tiket.banktransfer.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: uniquecode.proto")
public final class UniqueCodeServiceGrpc {

  private UniqueCodeServiceGrpc() {}

  public static final String SERVICE_NAME = "uniquecode.UniqueCodeService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.tiket.banktransfer.grpc.Uniquecode.HealthCheckRequest,
      com.tiket.banktransfer.grpc.Uniquecode.HealthCheckResponse> getHealthCheckMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "HealthCheck",
      requestType = com.tiket.banktransfer.grpc.Uniquecode.HealthCheckRequest.class,
      responseType = com.tiket.banktransfer.grpc.Uniquecode.HealthCheckResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tiket.banktransfer.grpc.Uniquecode.HealthCheckRequest,
      com.tiket.banktransfer.grpc.Uniquecode.HealthCheckResponse> getHealthCheckMethod() {
    io.grpc.MethodDescriptor<com.tiket.banktransfer.grpc.Uniquecode.HealthCheckRequest, com.tiket.banktransfer.grpc.Uniquecode.HealthCheckResponse> getHealthCheckMethod;
    if ((getHealthCheckMethod = UniqueCodeServiceGrpc.getHealthCheckMethod) == null) {
      synchronized (UniqueCodeServiceGrpc.class) {
        if ((getHealthCheckMethod = UniqueCodeServiceGrpc.getHealthCheckMethod) == null) {
          UniqueCodeServiceGrpc.getHealthCheckMethod = getHealthCheckMethod = 
              io.grpc.MethodDescriptor.<com.tiket.banktransfer.grpc.Uniquecode.HealthCheckRequest, com.tiket.banktransfer.grpc.Uniquecode.HealthCheckResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "uniquecode.UniqueCodeService", "HealthCheck"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tiket.banktransfer.grpc.Uniquecode.HealthCheckRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tiket.banktransfer.grpc.Uniquecode.HealthCheckResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new UniqueCodeServiceMethodDescriptorSupplier("HealthCheck"))
                  .build();
          }
        }
     }
     return getHealthCheckMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static UniqueCodeServiceStub newStub(io.grpc.Channel channel) {
    return new UniqueCodeServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static UniqueCodeServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new UniqueCodeServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static UniqueCodeServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new UniqueCodeServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class UniqueCodeServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void healthCheck(com.tiket.banktransfer.grpc.Uniquecode.HealthCheckRequest request,
        io.grpc.stub.StreamObserver<com.tiket.banktransfer.grpc.Uniquecode.HealthCheckResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getHealthCheckMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getHealthCheckMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tiket.banktransfer.grpc.Uniquecode.HealthCheckRequest,
                com.tiket.banktransfer.grpc.Uniquecode.HealthCheckResponse>(
                  this, METHODID_HEALTH_CHECK)))
          .build();
    }
  }

  /**
   */
  public static final class UniqueCodeServiceStub extends io.grpc.stub.AbstractStub<UniqueCodeServiceStub> {
    private UniqueCodeServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UniqueCodeServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UniqueCodeServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UniqueCodeServiceStub(channel, callOptions);
    }

    /**
     */
    public void healthCheck(com.tiket.banktransfer.grpc.Uniquecode.HealthCheckRequest request,
        io.grpc.stub.StreamObserver<com.tiket.banktransfer.grpc.Uniquecode.HealthCheckResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getHealthCheckMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class UniqueCodeServiceBlockingStub extends io.grpc.stub.AbstractStub<UniqueCodeServiceBlockingStub> {
    private UniqueCodeServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UniqueCodeServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UniqueCodeServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UniqueCodeServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.tiket.banktransfer.grpc.Uniquecode.HealthCheckResponse healthCheck(com.tiket.banktransfer.grpc.Uniquecode.HealthCheckRequest request) {
      return blockingUnaryCall(
          getChannel(), getHealthCheckMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class UniqueCodeServiceFutureStub extends io.grpc.stub.AbstractStub<UniqueCodeServiceFutureStub> {
    private UniqueCodeServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UniqueCodeServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UniqueCodeServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UniqueCodeServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tiket.banktransfer.grpc.Uniquecode.HealthCheckResponse> healthCheck(
        com.tiket.banktransfer.grpc.Uniquecode.HealthCheckRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getHealthCheckMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_HEALTH_CHECK = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final UniqueCodeServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(UniqueCodeServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_HEALTH_CHECK:
          serviceImpl.healthCheck((com.tiket.banktransfer.grpc.Uniquecode.HealthCheckRequest) request,
              (io.grpc.stub.StreamObserver<com.tiket.banktransfer.grpc.Uniquecode.HealthCheckResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class UniqueCodeServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    UniqueCodeServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.tiket.banktransfer.grpc.Uniquecode.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("UniqueCodeService");
    }
  }

  private static final class UniqueCodeServiceFileDescriptorSupplier
      extends UniqueCodeServiceBaseDescriptorSupplier {
    UniqueCodeServiceFileDescriptorSupplier() {}
  }

  private static final class UniqueCodeServiceMethodDescriptorSupplier
      extends UniqueCodeServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    UniqueCodeServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (UniqueCodeServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new UniqueCodeServiceFileDescriptorSupplier())
              .addMethod(getHealthCheckMethod())
              .build();
        }
      }
    }
    return result;
  }
}
