plugins {
  `java-library`
  id("org.hypertrace.publish-plugin")
}

dependencies {
  api(project(":platform-service-framework"))
  api("org.hypertrace.core.grpcutils:grpc-client-utils:0.12.8")
  api("com.typesafe:config:1.4.2")
  api("javax.servlet:javax.servlet-api:4.0.1")
  api("com.google.inject:guice:5.1.0")
  api(project(":service-framework-spi"))

  implementation(project(":platform-metrics"))
  implementation("org.slf4j:slf4j-api:1.7.36")
  implementation("com.google.inject.extensions:guice-servlet:5.1.0")
  implementation("com.google.guava:guava:31.1-jre")
  implementation("org.eclipse.jetty:jetty-servlet:9.4.53.v20231009")
  implementation("org.eclipse.jetty:jetty-server:9.4.53.v20231009")
  implementation("org.eclipse.jetty:jetty-servlets:9.4.53.v20231009")

  annotationProcessor("org.projectlombok:lombok:1.18.24")
  compileOnly("org.projectlombok:lombok:1.18.24")
}
