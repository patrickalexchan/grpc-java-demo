import com.tiket.banktransfer.grpc.UniqueCodeServiceGrpc.UniqueCodeServiceBlockingStub;
import com.tiket.banktransfer.grpc.UniqueCodeServiceGrpc;
import com.tiket.banktransfer.grpc.Uniquecode.HealthCheckRequest;
import com.tiket.banktransfer.grpc.Uniquecode.HealthCheckResponse;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class GrpcClient {

	public static void main(String[] args) {

		final ManagedChannel channel = ManagedChannelBuilder.forTarget("localhost:9090")
				.usePlaintext()
				.build();

		UniqueCodeServiceBlockingStub client = UniqueCodeServiceGrpc.newBlockingStub(channel);

		HealthCheckRequest request = HealthCheckRequest.newBuilder().build();

		HealthCheckResponse resp = client.healthCheck(request);

		System.out.println(resp.getAllFields());
	}
}
