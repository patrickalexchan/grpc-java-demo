package uniquecode;

import com.tiket.banktransfer.grpc.UniqueCodeServiceGrpc.UniqueCodeServiceImplBase;
import com.tiket.banktransfer.grpc.Uniquecode.HealthCheckRequest;
import com.tiket.banktransfer.grpc.Uniquecode.HealthCheckResponse;
import io.grpc.stub.StreamObserver;

public class UniqueCodeService extends UniqueCodeServiceImplBase {

  @Override
  public void healthCheck(HealthCheckRequest request,
      StreamObserver<HealthCheckResponse> responseObserver) {

    System.out.println("Inside HealthCheck");

    HealthCheckResponse.Builder response = HealthCheckResponse.newBuilder();

    response.setStatus("OK");

    responseObserver.onNext(response.build());
    responseObserver.onCompleted();
  }
}
