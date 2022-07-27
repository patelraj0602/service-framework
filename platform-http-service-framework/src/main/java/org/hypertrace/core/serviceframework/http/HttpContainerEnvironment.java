package org.hypertrace.core.serviceframework.http;

import com.typesafe.config.Config;
import org.hypertrace.core.grpcutils.client.GrpcChannelRegistry;
import org.hypertrace.core.serviceframework.spi.PlatformServiceLifecycle;

public interface HttpContainerEnvironment {
  GrpcChannelRegistry getChannelRegistry();

  Config getConfig(String serviceName);

  PlatformServiceLifecycle getLifecycle();
}
