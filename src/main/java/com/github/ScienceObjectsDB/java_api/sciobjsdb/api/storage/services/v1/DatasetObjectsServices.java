// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sciobjsdb/api/storage/services/v1/dataset_object_service.proto

package com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1;

public final class DatasetObjectsServices {
  private DatasetObjectsServices() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n>sciobjsdb/api/storage/services/v1/data" +
      "set_object_service.proto\022!sciobjsdb.api." +
      "storage.services.v1\032Esciobjsdb/api/stora" +
      "ge/services/v1/dataset_object_service_mo" +
      "dels.proto\032\034google/api/annotations.proto" +
      "2\226\014\n\025DatasetObjectsService\022\265\001\n\021CreateObj" +
      "ectGroup\022;.sciobjsdb.api.storage.service" +
      "s.v1.CreateObjectGroupRequest\032<.sciobjsd" +
      "b.api.storage.services.v1.CreateObjectGr" +
      "oupResponse\"%\202\323\344\223\002\037\"\032/api/v1/objectgroup" +
      "/create:\001*\022\311\001\n\026CreateObjectGroupBatch\022@." +
      "sciobjsdb.api.storage.services.v1.Create" +
      "ObjectGroupBatchRequest\032A.sciobjsdb.api." +
      "storage.services.v1.CreateObjectGroupBat" +
      "chResponse\"*\202\323\344\223\002$\"\037/api/v1/objectgroupb" +
      "atch/create:\001*\022\251\001\n\016GetObjectGroup\0228.scio" +
      "bjsdb.api.storage.services.v1.GetObjectG" +
      "roupRequest\0329.sciobjsdb.api.storage.serv" +
      "ices.v1.GetObjectGroupResponse\"\"\202\323\344\223\002\034\"\027" +
      "/api/v1/objectgroup/get:\001*\022\311\001\n\026GetObject" +
      "GroupRevision\022@.sciobjsdb.api.storage.se" +
      "rvices.v1.GetObjectGroupRevisionRequest\032" +
      "A.sciobjsdb.api.storage.services.v1.GetO" +
      "bjectGroupRevisionResponse\"*\202\323\344\223\002$\"\037/api" +
      "/v1/objectgrouprevision/get:\001*\022\265\001\n\021Updat" +
      "eObjectGroup\022;.sciobjsdb.api.storage.ser" +
      "vices.v1.UpdateObjectGroupRequest\032<.scio" +
      "bjsdb.api.storage.services.v1.UpdateObje" +
      "ctGroupResponse\"%\202\323\344\223\002\037\"\032/api/v1/objectg" +
      "roup/update:\001*\022\263\001\n\022FinishObjectUpload\022<." +
      "sciobjsdb.api.storage.services.v1.Finish" +
      "ObjectUploadRequest\032=.sciobjsdb.api.stor" +
      "age.services.v1.FinishObjectUploadRespon" +
      "se\" \202\323\344\223\002\032\"\025/api/v1/object/finish:\001*\022\337\001\n" +
      "\037FinishObjectGroupRevisionUpload\022I.sciob" +
      "jsdb.api.storage.services.v1.FinishObjec" +
      "tGroupRevisionUploadRequest\032J.sciobjsdb." +
      "api.storage.services.v1.FinishObjectGrou" +
      "pRevisionUploadResponse\"%\202\323\344\223\002\037\"\032/api/v1" +
      "/objectgroup/finish:\001*\022\260\001\n\021DeleteObjectG" +
      "roup\022;.sciobjsdb.api.storage.services.v1" +
      ".DeleteObjectGroupRequest\032<.sciobjsdb.ap" +
      "i.storage.services.v1.DeleteObjectGroupR" +
      "esponse\" \202\323\344\223\002\032*\030/api/v1/objectgroup/{id" +
      "}B\250\001\nFcom.github.ScienceObjectsDB.java_a" +
      "pi.sciobjsdb.api.storage.services.v1B\026Da" +
      "tasetObjectsServicesP\001ZDgithub.com/Scien" +
      "ceObjectsDB/go-api/sciobjsdb/api/storage" +
      "/services/v1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.DatasetObjectsServiceModels.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.DatasetObjectsServiceModels.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
