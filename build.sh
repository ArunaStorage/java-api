protoc --plugin=protoc-gen-grpc-java \
  --grpc-java_out=. --proto_path=API API/api/*/*.proto