// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protoc-gen-openapiv2/options/openapiv2.proto

// Protobuf Java Version: 3.25.3
package com.grpc.gateway.protoc_gen_openapiv2.options;

public interface SwaggerOrBuilder extends
    // @@protoc_insertion_point(interface_extends:grpc.gateway.protoc_gen_openapiv2.options.Swagger)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Specifies the OpenAPI Specification version being used. It can be
   * used by the OpenAPI UI and other clients to interpret the API listing. The
   * value MUST be "2.0".
   * </pre>
   *
   * <code>string swagger = 1 [json_name = "swagger"];</code>
   * @return The swagger.
   */
  java.lang.String getSwagger();
  /**
   * <pre>
   * Specifies the OpenAPI Specification version being used. It can be
   * used by the OpenAPI UI and other clients to interpret the API listing. The
   * value MUST be "2.0".
   * </pre>
   *
   * <code>string swagger = 1 [json_name = "swagger"];</code>
   * @return The bytes for swagger.
   */
  com.google.protobuf.ByteString
      getSwaggerBytes();

  /**
   * <pre>
   * Provides metadata about the API. The metadata can be used by the
   * clients if needed.
   * </pre>
   *
   * <code>.grpc.gateway.protoc_gen_openapiv2.options.Info info = 2 [json_name = "info"];</code>
   * @return Whether the info field is set.
   */
  boolean hasInfo();
  /**
   * <pre>
   * Provides metadata about the API. The metadata can be used by the
   * clients if needed.
   * </pre>
   *
   * <code>.grpc.gateway.protoc_gen_openapiv2.options.Info info = 2 [json_name = "info"];</code>
   * @return The info.
   */
  com.grpc.gateway.protoc_gen_openapiv2.options.Info getInfo();
  /**
   * <pre>
   * Provides metadata about the API. The metadata can be used by the
   * clients if needed.
   * </pre>
   *
   * <code>.grpc.gateway.protoc_gen_openapiv2.options.Info info = 2 [json_name = "info"];</code>
   */
  com.grpc.gateway.protoc_gen_openapiv2.options.InfoOrBuilder getInfoOrBuilder();

  /**
   * <pre>
   * The host (name or ip) serving the API. This MUST be the host only and does
   * not include the scheme nor sub-paths. It MAY include a port. If the host is
   * not included, the host serving the documentation is to be used (including
   * the port). The host does not support path templating.
   * </pre>
   *
   * <code>string host = 3 [json_name = "host"];</code>
   * @return The host.
   */
  java.lang.String getHost();
  /**
   * <pre>
   * The host (name or ip) serving the API. This MUST be the host only and does
   * not include the scheme nor sub-paths. It MAY include a port. If the host is
   * not included, the host serving the documentation is to be used (including
   * the port). The host does not support path templating.
   * </pre>
   *
   * <code>string host = 3 [json_name = "host"];</code>
   * @return The bytes for host.
   */
  com.google.protobuf.ByteString
      getHostBytes();

  /**
   * <pre>
   * The base path on which the API is served, which is relative to the host. If
   * it is not included, the API is served directly under the host. The value
   * MUST start with a leading slash (/). The basePath does not support path
   * templating.
   * Note that using `base_path` does not change the endpoint paths that are
   * generated in the resulting OpenAPI file. If you wish to use `base_path`
   * with relatively generated OpenAPI paths, the `base_path` prefix must be
   * manually removed from your `google.api.http` paths and your code changed to
   * serve the API from the `base_path`.
   * </pre>
   *
   * <code>string base_path = 4 [json_name = "basePath"];</code>
   * @return The basePath.
   */
  java.lang.String getBasePath();
  /**
   * <pre>
   * The base path on which the API is served, which is relative to the host. If
   * it is not included, the API is served directly under the host. The value
   * MUST start with a leading slash (/). The basePath does not support path
   * templating.
   * Note that using `base_path` does not change the endpoint paths that are
   * generated in the resulting OpenAPI file. If you wish to use `base_path`
   * with relatively generated OpenAPI paths, the `base_path` prefix must be
   * manually removed from your `google.api.http` paths and your code changed to
   * serve the API from the `base_path`.
   * </pre>
   *
   * <code>string base_path = 4 [json_name = "basePath"];</code>
   * @return The bytes for basePath.
   */
  com.google.protobuf.ByteString
      getBasePathBytes();

  /**
   * <pre>
   * The transfer protocol of the API. Values MUST be from the list: "http",
   * "https", "ws", "wss". If the schemes is not included, the default scheme to
   * be used is the one used to access the OpenAPI definition itself.
   * </pre>
   *
   * <code>repeated .grpc.gateway.protoc_gen_openapiv2.options.Scheme schemes = 5 [json_name = "schemes"];</code>
   * @return A list containing the schemes.
   */
  java.util.List<com.grpc.gateway.protoc_gen_openapiv2.options.Scheme> getSchemesList();
  /**
   * <pre>
   * The transfer protocol of the API. Values MUST be from the list: "http",
   * "https", "ws", "wss". If the schemes is not included, the default scheme to
   * be used is the one used to access the OpenAPI definition itself.
   * </pre>
   *
   * <code>repeated .grpc.gateway.protoc_gen_openapiv2.options.Scheme schemes = 5 [json_name = "schemes"];</code>
   * @return The count of schemes.
   */
  int getSchemesCount();
  /**
   * <pre>
   * The transfer protocol of the API. Values MUST be from the list: "http",
   * "https", "ws", "wss". If the schemes is not included, the default scheme to
   * be used is the one used to access the OpenAPI definition itself.
   * </pre>
   *
   * <code>repeated .grpc.gateway.protoc_gen_openapiv2.options.Scheme schemes = 5 [json_name = "schemes"];</code>
   * @param index The index of the element to return.
   * @return The schemes at the given index.
   */
  com.grpc.gateway.protoc_gen_openapiv2.options.Scheme getSchemes(int index);
  /**
   * <pre>
   * The transfer protocol of the API. Values MUST be from the list: "http",
   * "https", "ws", "wss". If the schemes is not included, the default scheme to
   * be used is the one used to access the OpenAPI definition itself.
   * </pre>
   *
   * <code>repeated .grpc.gateway.protoc_gen_openapiv2.options.Scheme schemes = 5 [json_name = "schemes"];</code>
   * @return A list containing the enum numeric values on the wire for schemes.
   */
  java.util.List<java.lang.Integer>
  getSchemesValueList();
  /**
   * <pre>
   * The transfer protocol of the API. Values MUST be from the list: "http",
   * "https", "ws", "wss". If the schemes is not included, the default scheme to
   * be used is the one used to access the OpenAPI definition itself.
   * </pre>
   *
   * <code>repeated .grpc.gateway.protoc_gen_openapiv2.options.Scheme schemes = 5 [json_name = "schemes"];</code>
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of schemes at the given index.
   */
  int getSchemesValue(int index);

  /**
   * <pre>
   * A list of MIME types the APIs can consume. This is global to all APIs but
   * can be overridden on specific API calls. Value MUST be as described under
   * Mime Types.
   * </pre>
   *
   * <code>repeated string consumes = 6 [json_name = "consumes"];</code>
   * @return A list containing the consumes.
   */
  java.util.List<java.lang.String>
      getConsumesList();
  /**
   * <pre>
   * A list of MIME types the APIs can consume. This is global to all APIs but
   * can be overridden on specific API calls. Value MUST be as described under
   * Mime Types.
   * </pre>
   *
   * <code>repeated string consumes = 6 [json_name = "consumes"];</code>
   * @return The count of consumes.
   */
  int getConsumesCount();
  /**
   * <pre>
   * A list of MIME types the APIs can consume. This is global to all APIs but
   * can be overridden on specific API calls. Value MUST be as described under
   * Mime Types.
   * </pre>
   *
   * <code>repeated string consumes = 6 [json_name = "consumes"];</code>
   * @param index The index of the element to return.
   * @return The consumes at the given index.
   */
  java.lang.String getConsumes(int index);
  /**
   * <pre>
   * A list of MIME types the APIs can consume. This is global to all APIs but
   * can be overridden on specific API calls. Value MUST be as described under
   * Mime Types.
   * </pre>
   *
   * <code>repeated string consumes = 6 [json_name = "consumes"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the consumes at the given index.
   */
  com.google.protobuf.ByteString
      getConsumesBytes(int index);

  /**
   * <pre>
   * A list of MIME types the APIs can produce. This is global to all APIs but
   * can be overridden on specific API calls. Value MUST be as described under
   * Mime Types.
   * </pre>
   *
   * <code>repeated string produces = 7 [json_name = "produces"];</code>
   * @return A list containing the produces.
   */
  java.util.List<java.lang.String>
      getProducesList();
  /**
   * <pre>
   * A list of MIME types the APIs can produce. This is global to all APIs but
   * can be overridden on specific API calls. Value MUST be as described under
   * Mime Types.
   * </pre>
   *
   * <code>repeated string produces = 7 [json_name = "produces"];</code>
   * @return The count of produces.
   */
  int getProducesCount();
  /**
   * <pre>
   * A list of MIME types the APIs can produce. This is global to all APIs but
   * can be overridden on specific API calls. Value MUST be as described under
   * Mime Types.
   * </pre>
   *
   * <code>repeated string produces = 7 [json_name = "produces"];</code>
   * @param index The index of the element to return.
   * @return The produces at the given index.
   */
  java.lang.String getProduces(int index);
  /**
   * <pre>
   * A list of MIME types the APIs can produce. This is global to all APIs but
   * can be overridden on specific API calls. Value MUST be as described under
   * Mime Types.
   * </pre>
   *
   * <code>repeated string produces = 7 [json_name = "produces"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the produces at the given index.
   */
  com.google.protobuf.ByteString
      getProducesBytes(int index);

  /**
   * <pre>
   * An object to hold responses that can be used across operations. This
   * property does not define global responses for all operations.
   * </pre>
   *
   * <code>map&lt;string, .grpc.gateway.protoc_gen_openapiv2.options.Response&gt; responses = 10 [json_name = "responses"];</code>
   */
  int getResponsesCount();
  /**
   * <pre>
   * An object to hold responses that can be used across operations. This
   * property does not define global responses for all operations.
   * </pre>
   *
   * <code>map&lt;string, .grpc.gateway.protoc_gen_openapiv2.options.Response&gt; responses = 10 [json_name = "responses"];</code>
   */
  boolean containsResponses(
      java.lang.String key);
  /**
   * Use {@link #getResponsesMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, com.grpc.gateway.protoc_gen_openapiv2.options.Response>
  getResponses();
  /**
   * <pre>
   * An object to hold responses that can be used across operations. This
   * property does not define global responses for all operations.
   * </pre>
   *
   * <code>map&lt;string, .grpc.gateway.protoc_gen_openapiv2.options.Response&gt; responses = 10 [json_name = "responses"];</code>
   */
  java.util.Map<java.lang.String, com.grpc.gateway.protoc_gen_openapiv2.options.Response>
  getResponsesMap();
  /**
   * <pre>
   * An object to hold responses that can be used across operations. This
   * property does not define global responses for all operations.
   * </pre>
   *
   * <code>map&lt;string, .grpc.gateway.protoc_gen_openapiv2.options.Response&gt; responses = 10 [json_name = "responses"];</code>
   */
  /* nullable */
com.grpc.gateway.protoc_gen_openapiv2.options.Response getResponsesOrDefault(
      java.lang.String key,
      /* nullable */
com.grpc.gateway.protoc_gen_openapiv2.options.Response defaultValue);
  /**
   * <pre>
   * An object to hold responses that can be used across operations. This
   * property does not define global responses for all operations.
   * </pre>
   *
   * <code>map&lt;string, .grpc.gateway.protoc_gen_openapiv2.options.Response&gt; responses = 10 [json_name = "responses"];</code>
   */
  com.grpc.gateway.protoc_gen_openapiv2.options.Response getResponsesOrThrow(
      java.lang.String key);

  /**
   * <pre>
   * Security scheme definitions that can be used across the specification.
   * </pre>
   *
   * <code>.grpc.gateway.protoc_gen_openapiv2.options.SecurityDefinitions security_definitions = 11 [json_name = "securityDefinitions"];</code>
   * @return Whether the securityDefinitions field is set.
   */
  boolean hasSecurityDefinitions();
  /**
   * <pre>
   * Security scheme definitions that can be used across the specification.
   * </pre>
   *
   * <code>.grpc.gateway.protoc_gen_openapiv2.options.SecurityDefinitions security_definitions = 11 [json_name = "securityDefinitions"];</code>
   * @return The securityDefinitions.
   */
  com.grpc.gateway.protoc_gen_openapiv2.options.SecurityDefinitions getSecurityDefinitions();
  /**
   * <pre>
   * Security scheme definitions that can be used across the specification.
   * </pre>
   *
   * <code>.grpc.gateway.protoc_gen_openapiv2.options.SecurityDefinitions security_definitions = 11 [json_name = "securityDefinitions"];</code>
   */
  com.grpc.gateway.protoc_gen_openapiv2.options.SecurityDefinitionsOrBuilder getSecurityDefinitionsOrBuilder();

  /**
   * <pre>
   * A declaration of which security schemes are applied for the API as a whole.
   * The list of values describes alternative security schemes that can be used
   * (that is, there is a logical OR between the security requirements).
   * Individual operations can override this definition.
   * </pre>
   *
   * <code>repeated .grpc.gateway.protoc_gen_openapiv2.options.SecurityRequirement security = 12 [json_name = "security"];</code>
   */
  java.util.List<com.grpc.gateway.protoc_gen_openapiv2.options.SecurityRequirement> 
      getSecurityList();
  /**
   * <pre>
   * A declaration of which security schemes are applied for the API as a whole.
   * The list of values describes alternative security schemes that can be used
   * (that is, there is a logical OR between the security requirements).
   * Individual operations can override this definition.
   * </pre>
   *
   * <code>repeated .grpc.gateway.protoc_gen_openapiv2.options.SecurityRequirement security = 12 [json_name = "security"];</code>
   */
  com.grpc.gateway.protoc_gen_openapiv2.options.SecurityRequirement getSecurity(int index);
  /**
   * <pre>
   * A declaration of which security schemes are applied for the API as a whole.
   * The list of values describes alternative security schemes that can be used
   * (that is, there is a logical OR between the security requirements).
   * Individual operations can override this definition.
   * </pre>
   *
   * <code>repeated .grpc.gateway.protoc_gen_openapiv2.options.SecurityRequirement security = 12 [json_name = "security"];</code>
   */
  int getSecurityCount();
  /**
   * <pre>
   * A declaration of which security schemes are applied for the API as a whole.
   * The list of values describes alternative security schemes that can be used
   * (that is, there is a logical OR between the security requirements).
   * Individual operations can override this definition.
   * </pre>
   *
   * <code>repeated .grpc.gateway.protoc_gen_openapiv2.options.SecurityRequirement security = 12 [json_name = "security"];</code>
   */
  java.util.List<? extends com.grpc.gateway.protoc_gen_openapiv2.options.SecurityRequirementOrBuilder> 
      getSecurityOrBuilderList();
  /**
   * <pre>
   * A declaration of which security schemes are applied for the API as a whole.
   * The list of values describes alternative security schemes that can be used
   * (that is, there is a logical OR between the security requirements).
   * Individual operations can override this definition.
   * </pre>
   *
   * <code>repeated .grpc.gateway.protoc_gen_openapiv2.options.SecurityRequirement security = 12 [json_name = "security"];</code>
   */
  com.grpc.gateway.protoc_gen_openapiv2.options.SecurityRequirementOrBuilder getSecurityOrBuilder(
      int index);

  /**
   * <pre>
   * Additional external documentation.
   * </pre>
   *
   * <code>.grpc.gateway.protoc_gen_openapiv2.options.ExternalDocumentation external_docs = 14 [json_name = "externalDocs"];</code>
   * @return Whether the externalDocs field is set.
   */
  boolean hasExternalDocs();
  /**
   * <pre>
   * Additional external documentation.
   * </pre>
   *
   * <code>.grpc.gateway.protoc_gen_openapiv2.options.ExternalDocumentation external_docs = 14 [json_name = "externalDocs"];</code>
   * @return The externalDocs.
   */
  com.grpc.gateway.protoc_gen_openapiv2.options.ExternalDocumentation getExternalDocs();
  /**
   * <pre>
   * Additional external documentation.
   * </pre>
   *
   * <code>.grpc.gateway.protoc_gen_openapiv2.options.ExternalDocumentation external_docs = 14 [json_name = "externalDocs"];</code>
   */
  com.grpc.gateway.protoc_gen_openapiv2.options.ExternalDocumentationOrBuilder getExternalDocsOrBuilder();

  /**
   * <code>map&lt;string, .google.protobuf.Value&gt; extensions = 15 [json_name = "extensions"];</code>
   */
  int getExtensionsCount();
  /**
   * <code>map&lt;string, .google.protobuf.Value&gt; extensions = 15 [json_name = "extensions"];</code>
   */
  boolean containsExtensions(
      java.lang.String key);
  /**
   * Use {@link #getExtensionsMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, com.google.protobuf.Value>
  getExtensions();
  /**
   * <code>map&lt;string, .google.protobuf.Value&gt; extensions = 15 [json_name = "extensions"];</code>
   */
  java.util.Map<java.lang.String, com.google.protobuf.Value>
  getExtensionsMap();
  /**
   * <code>map&lt;string, .google.protobuf.Value&gt; extensions = 15 [json_name = "extensions"];</code>
   */
  /* nullable */
com.google.protobuf.Value getExtensionsOrDefault(
      java.lang.String key,
      /* nullable */
com.google.protobuf.Value defaultValue);
  /**
   * <code>map&lt;string, .google.protobuf.Value&gt; extensions = 15 [json_name = "extensions"];</code>
   */
  com.google.protobuf.Value getExtensionsOrThrow(
      java.lang.String key);
}
