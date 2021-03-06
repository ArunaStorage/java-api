// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sciobjsdb/api/storage/models/v1/dataset.proto

package com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.models.v1;

public interface DatasetOrBuilder extends
    // @@protoc_insertion_point(interface_extends:sciobjsdb.api.storage.models.v1.Dataset)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string id = 1 [json_name = "id"];</code>
   * @return The id.
   */
  java.lang.String getId();
  /**
   * <code>string id = 1 [json_name = "id"];</code>
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <pre>
   * Name of the dataset
   * </pre>
   *
   * <code>string name = 2 [json_name = "name"];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Name of the dataset
   * </pre>
   *
   * <code>string name = 2 [json_name = "name"];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>string description = 3 [json_name = "description"];</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <code>string description = 3 [json_name = "description"];</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <pre>
   * When the datasets was created
   * </pre>
   *
   * <code>.google.protobuf.Timestamp created = 4 [json_name = "created"];</code>
   * @return Whether the created field is set.
   */
  boolean hasCreated();
  /**
   * <pre>
   * When the datasets was created
   * </pre>
   *
   * <code>.google.protobuf.Timestamp created = 4 [json_name = "created"];</code>
   * @return The created.
   */
  com.google.protobuf.Timestamp getCreated();
  /**
   * <pre>
   * When the datasets was created
   * </pre>
   *
   * <code>.google.protobuf.Timestamp created = 4 [json_name = "created"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreatedOrBuilder();

  /**
   * <code>repeated .sciobjsdb.api.storage.models.v1.Label labels = 5 [json_name = "labels"];</code>
   */
  java.util.List<com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.models.v1.Label> 
      getLabelsList();
  /**
   * <code>repeated .sciobjsdb.api.storage.models.v1.Label labels = 5 [json_name = "labels"];</code>
   */
  com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.models.v1.Label getLabels(int index);
  /**
   * <code>repeated .sciobjsdb.api.storage.models.v1.Label labels = 5 [json_name = "labels"];</code>
   */
  int getLabelsCount();
  /**
   * <code>repeated .sciobjsdb.api.storage.models.v1.Label labels = 5 [json_name = "labels"];</code>
   */
  java.util.List<? extends com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.models.v1.LabelOrBuilder> 
      getLabelsOrBuilderList();
  /**
   * <code>repeated .sciobjsdb.api.storage.models.v1.Label labels = 5 [json_name = "labels"];</code>
   */
  com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.models.v1.LabelOrBuilder getLabelsOrBuilder(
      int index);

  /**
   * <code>repeated .sciobjsdb.api.storage.models.v1.Annotation annotations = 6 [json_name = "annotations"];</code>
   */
  java.util.List<com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.models.v1.Annotation> 
      getAnnotationsList();
  /**
   * <code>repeated .sciobjsdb.api.storage.models.v1.Annotation annotations = 6 [json_name = "annotations"];</code>
   */
  com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.models.v1.Annotation getAnnotations(int index);
  /**
   * <code>repeated .sciobjsdb.api.storage.models.v1.Annotation annotations = 6 [json_name = "annotations"];</code>
   */
  int getAnnotationsCount();
  /**
   * <code>repeated .sciobjsdb.api.storage.models.v1.Annotation annotations = 6 [json_name = "annotations"];</code>
   */
  java.util.List<? extends com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.models.v1.AnnotationOrBuilder> 
      getAnnotationsOrBuilderList();
  /**
   * <code>repeated .sciobjsdb.api.storage.models.v1.Annotation annotations = 6 [json_name = "annotations"];</code>
   */
  com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.models.v1.AnnotationOrBuilder getAnnotationsOrBuilder(
      int index);

  /**
   * <code>string project_id = 7 [json_name = "projectId"];</code>
   * @return The projectId.
   */
  java.lang.String getProjectId();
  /**
   * <code>string project_id = 7 [json_name = "projectId"];</code>
   * @return The bytes for projectId.
   */
  com.google.protobuf.ByteString
      getProjectIdBytes();

  /**
   * <pre>
   *Indicates if the dataset if publicly available
   * </pre>
   *
   * <code>bool is_public = 8 [json_name = "isPublic"];</code>
   * @return The isPublic.
   */
  boolean getIsPublic();

  /**
   * <code>.sciobjsdb.api.storage.models.v1.Status status = 9 [json_name = "status"];</code>
   * @return The enum numeric value on the wire for status.
   */
  int getStatusValue();
  /**
   * <code>.sciobjsdb.api.storage.models.v1.Status status = 9 [json_name = "status"];</code>
   * @return The status.
   */
  com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.models.v1.Status getStatus();

  /**
   * <code>string bucket = 10 [json_name = "bucket"];</code>
   * @return The bucket.
   */
  java.lang.String getBucket();
  /**
   * <code>string bucket = 10 [json_name = "bucket"];</code>
   * @return The bytes for bucket.
   */
  com.google.protobuf.ByteString
      getBucketBytes();

  /**
   * <code>.sciobjsdb.api.storage.models.v1.DatasetStats stats = 11 [json_name = "stats"];</code>
   * @return Whether the stats field is set.
   */
  boolean hasStats();
  /**
   * <code>.sciobjsdb.api.storage.models.v1.DatasetStats stats = 11 [json_name = "stats"];</code>
   * @return The stats.
   */
  com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.models.v1.DatasetStats getStats();
  /**
   * <code>.sciobjsdb.api.storage.models.v1.DatasetStats stats = 11 [json_name = "stats"];</code>
   */
  com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.models.v1.DatasetStatsOrBuilder getStatsOrBuilder();

  /**
   * <code>repeated .sciobjsdb.api.storage.models.v1.Object metadata_objects = 12 [json_name = "metadataObjects"];</code>
   */
  java.util.List<com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.models.v1.Object> 
      getMetadataObjectsList();
  /**
   * <code>repeated .sciobjsdb.api.storage.models.v1.Object metadata_objects = 12 [json_name = "metadataObjects"];</code>
   */
  com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.models.v1.Object getMetadataObjects(int index);
  /**
   * <code>repeated .sciobjsdb.api.storage.models.v1.Object metadata_objects = 12 [json_name = "metadataObjects"];</code>
   */
  int getMetadataObjectsCount();
  /**
   * <code>repeated .sciobjsdb.api.storage.models.v1.Object metadata_objects = 12 [json_name = "metadataObjects"];</code>
   */
  java.util.List<? extends com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.models.v1.ObjectOrBuilder> 
      getMetadataObjectsOrBuilderList();
  /**
   * <code>repeated .sciobjsdb.api.storage.models.v1.Object metadata_objects = 12 [json_name = "metadataObjects"];</code>
   */
  com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.models.v1.ObjectOrBuilder getMetadataObjectsOrBuilder(
      int index);
}
