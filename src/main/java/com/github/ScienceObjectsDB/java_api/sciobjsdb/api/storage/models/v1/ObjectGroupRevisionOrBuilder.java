// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sciobjsdb/api/storage/models/v1/object_models.proto

package com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.models.v1;

public interface ObjectGroupRevisionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:sciobjsdb.api.storage.models.v1.ObjectGroupRevision)
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
   * <code>string name = 2 [json_name = "name"];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
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
   * <code>string dataset_id = 4 [json_name = "datasetId"];</code>
   * @return The datasetId.
   */
  java.lang.String getDatasetId();
  /**
   * <code>string dataset_id = 4 [json_name = "datasetId"];</code>
   * @return The bytes for datasetId.
   */
  com.google.protobuf.ByteString
      getDatasetIdBytes();

  /**
   * <code>string project_id = 5 [json_name = "projectId"];</code>
   * @return The projectId.
   */
  java.lang.String getProjectId();
  /**
   * <code>string project_id = 5 [json_name = "projectId"];</code>
   * @return The bytes for projectId.
   */
  com.google.protobuf.ByteString
      getProjectIdBytes();

  /**
   * <code>repeated .sciobjsdb.api.storage.models.v1.Label labels = 6 [json_name = "labels"];</code>
   */
  java.util.List<com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.models.v1.Label> 
      getLabelsList();
  /**
   * <code>repeated .sciobjsdb.api.storage.models.v1.Label labels = 6 [json_name = "labels"];</code>
   */
  com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.models.v1.Label getLabels(int index);
  /**
   * <code>repeated .sciobjsdb.api.storage.models.v1.Label labels = 6 [json_name = "labels"];</code>
   */
  int getLabelsCount();
  /**
   * <code>repeated .sciobjsdb.api.storage.models.v1.Label labels = 6 [json_name = "labels"];</code>
   */
  java.util.List<? extends com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.models.v1.LabelOrBuilder> 
      getLabelsOrBuilderList();
  /**
   * <code>repeated .sciobjsdb.api.storage.models.v1.Label labels = 6 [json_name = "labels"];</code>
   */
  com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.models.v1.LabelOrBuilder getLabelsOrBuilder(
      int index);

  /**
   * <code>repeated .sciobjsdb.api.storage.models.v1.Annotation annotations = 7 [json_name = "annotations"];</code>
   */
  java.util.List<com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.models.v1.Annotation> 
      getAnnotationsList();
  /**
   * <code>repeated .sciobjsdb.api.storage.models.v1.Annotation annotations = 7 [json_name = "annotations"];</code>
   */
  com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.models.v1.Annotation getAnnotations(int index);
  /**
   * <code>repeated .sciobjsdb.api.storage.models.v1.Annotation annotations = 7 [json_name = "annotations"];</code>
   */
  int getAnnotationsCount();
  /**
   * <code>repeated .sciobjsdb.api.storage.models.v1.Annotation annotations = 7 [json_name = "annotations"];</code>
   */
  java.util.List<? extends com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.models.v1.AnnotationOrBuilder> 
      getAnnotationsOrBuilderList();
  /**
   * <code>repeated .sciobjsdb.api.storage.models.v1.Annotation annotations = 7 [json_name = "annotations"];</code>
   */
  com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.models.v1.AnnotationOrBuilder getAnnotationsOrBuilder(
      int index);

  /**
   * <code>.sciobjsdb.api.storage.models.v1.Status status = 8 [json_name = "status"];</code>
   * @return The enum numeric value on the wire for status.
   */
  int getStatusValue();
  /**
   * <code>.sciobjsdb.api.storage.models.v1.Status status = 8 [json_name = "status"];</code>
   * @return The status.
   */
  com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.models.v1.Status getStatus();

  /**
   * <code>repeated .sciobjsdb.api.storage.models.v1.Object objects = 9 [json_name = "objects"];</code>
   */
  java.util.List<com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.models.v1.Object> 
      getObjectsList();
  /**
   * <code>repeated .sciobjsdb.api.storage.models.v1.Object objects = 9 [json_name = "objects"];</code>
   */
  com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.models.v1.Object getObjects(int index);
  /**
   * <code>repeated .sciobjsdb.api.storage.models.v1.Object objects = 9 [json_name = "objects"];</code>
   */
  int getObjectsCount();
  /**
   * <code>repeated .sciobjsdb.api.storage.models.v1.Object objects = 9 [json_name = "objects"];</code>
   */
  java.util.List<? extends com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.models.v1.ObjectOrBuilder> 
      getObjectsOrBuilderList();
  /**
   * <code>repeated .sciobjsdb.api.storage.models.v1.Object objects = 9 [json_name = "objects"];</code>
   */
  com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.models.v1.ObjectOrBuilder getObjectsOrBuilder(
      int index);

  /**
   * <code>repeated .sciobjsdb.api.storage.models.v1.Object metadata_objects = 10 [json_name = "metadataObjects"];</code>
   */
  java.util.List<com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.models.v1.Object> 
      getMetadataObjectsList();
  /**
   * <code>repeated .sciobjsdb.api.storage.models.v1.Object metadata_objects = 10 [json_name = "metadataObjects"];</code>
   */
  com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.models.v1.Object getMetadataObjects(int index);
  /**
   * <code>repeated .sciobjsdb.api.storage.models.v1.Object metadata_objects = 10 [json_name = "metadataObjects"];</code>
   */
  int getMetadataObjectsCount();
  /**
   * <code>repeated .sciobjsdb.api.storage.models.v1.Object metadata_objects = 10 [json_name = "metadataObjects"];</code>
   */
  java.util.List<? extends com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.models.v1.ObjectOrBuilder> 
      getMetadataObjectsOrBuilderList();
  /**
   * <code>repeated .sciobjsdb.api.storage.models.v1.Object metadata_objects = 10 [json_name = "metadataObjects"];</code>
   */
  com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.models.v1.ObjectOrBuilder getMetadataObjectsOrBuilder(
      int index);

  /**
   * <code>.google.protobuf.Timestamp generated = 11 [json_name = "generated"];</code>
   * @return Whether the generated field is set.
   */
  boolean hasGenerated();
  /**
   * <code>.google.protobuf.Timestamp generated = 11 [json_name = "generated"];</code>
   * @return The generated.
   */
  com.google.protobuf.Timestamp getGenerated();
  /**
   * <code>.google.protobuf.Timestamp generated = 11 [json_name = "generated"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getGeneratedOrBuilder();

  /**
   * <code>.google.protobuf.Timestamp created = 12 [json_name = "created"];</code>
   * @return Whether the created field is set.
   */
  boolean hasCreated();
  /**
   * <code>.google.protobuf.Timestamp created = 12 [json_name = "created"];</code>
   * @return The created.
   */
  com.google.protobuf.Timestamp getCreated();
  /**
   * <code>.google.protobuf.Timestamp created = 12 [json_name = "created"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreatedOrBuilder();

  /**
   * <code>.sciobjsdb.api.storage.models.v1.ObjectGroupStats stats = 13 [json_name = "stats"];</code>
   * @return Whether the stats field is set.
   */
  boolean hasStats();
  /**
   * <code>.sciobjsdb.api.storage.models.v1.ObjectGroupStats stats = 13 [json_name = "stats"];</code>
   * @return The stats.
   */
  com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.models.v1.ObjectGroupStats getStats();
  /**
   * <code>.sciobjsdb.api.storage.models.v1.ObjectGroupStats stats = 13 [json_name = "stats"];</code>
   */
  com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.models.v1.ObjectGroupStatsOrBuilder getStatsOrBuilder();

  /**
   * <pre>
   * Expected external path; Can be used when downloading data; Should be a relative path
   * </pre>
   *
   * <code>.sciobjsdb.api.storage.models.v1.Subpath subpath = 15 [json_name = "subpath"];</code>
   * @return Whether the subpath field is set.
   */
  boolean hasSubpath();
  /**
   * <pre>
   * Expected external path; Can be used when downloading data; Should be a relative path
   * </pre>
   *
   * <code>.sciobjsdb.api.storage.models.v1.Subpath subpath = 15 [json_name = "subpath"];</code>
   * @return The subpath.
   */
  com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.models.v1.Subpath getSubpath();
  /**
   * <pre>
   * Expected external path; Can be used when downloading data; Should be a relative path
   * </pre>
   *
   * <code>.sciobjsdb.api.storage.models.v1.Subpath subpath = 15 [json_name = "subpath"];</code>
   */
  com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.models.v1.SubpathOrBuilder getSubpathOrBuilder();

  /**
   * <code>string object_group_id = 16 [json_name = "objectGroupId"];</code>
   * @return The objectGroupId.
   */
  java.lang.String getObjectGroupId();
  /**
   * <code>string object_group_id = 16 [json_name = "objectGroupId"];</code>
   * @return The bytes for objectGroupId.
   */
  com.google.protobuf.ByteString
      getObjectGroupIdBytes();

  /**
   * <pre>
   *Number in the history, will be assigned after the ObjectGroupRevision has been finalized
   * </pre>
   *
   * <code>int64 revision_number = 17 [json_name = "revisionNumber"];</code>
   * @return The revisionNumber.
   */
  long getRevisionNumber();
}
