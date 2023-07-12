/*
 * (C) Copyright IBM Corp. 2023.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package com.ibm.cloud.watsonxdata.watsonx_data.v1.model;

import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Bucket.
 */
public class Bucket extends GenericModel {

  /**
   * Managed by.
   */
  public interface ManagedBy {
    /** IBM. */
    String IBM = "IBM";
    /** Customer. */
    String CUSTOMER = "Customer";
  }

  /**
   * Mark bucket active or inactive.
   */
  public interface State {
    /** active. */
    String ACTIVE = "active";
    /** inactive. */
    String INACTIVE = "inactive";
  }

  /**
   * Bucket Type.
   */
  public interface BucketType {
    /** amazon_s3. */
    String AMAZON_S3 = "amazon_s3";
    /** aws_s3. */
    String AWS_S3 = "aws_s3";
    /** minio. */
    String MINIO = "minio";
    /** ibm_cos. */
    String IBM_COS = "ibm_cos";
  }

  @SerializedName("created_by")
  protected String createdBy;
  @SerializedName("created_on")
  protected String createdOn;
  protected String description;
  protected String endpoint;
  @SerializedName("managed_by")
  protected String managedBy;
  protected String state;
  protected List<String> tags;
  @SerializedName("associated_catalogs")
  protected List<String> associatedCatalogs;
  @SerializedName("bucket_display_name")
  protected String bucketDisplayName;
  @SerializedName("bucket_id")
  protected String bucketId;
  @SerializedName("bucket_name")
  protected String bucketName;
  @SerializedName("bucket_type")
  protected String bucketType;
  protected List<String> actions;

  protected Bucket() { }

  /**
   * Gets the createdBy.
   *
   * Username who created the bucket.
   *
   * @return the createdBy
   */
  public String getCreatedBy() {
    return createdBy;
  }

  /**
   * Gets the createdOn.
   *
   * Creation date.
   *
   * @return the createdOn
   */
  public String getCreatedOn() {
    return createdOn;
  }

  /**
   * Gets the description.
   *
   * Bucket Description.
   *
   * @return the description
   */
  public String getDescription() {
    return description;
  }

  /**
   * Gets the endpoint.
   *
   * Bucket endpoint.
   *
   * @return the endpoint
   */
  public String getEndpoint() {
    return endpoint;
  }

  /**
   * Gets the managedBy.
   *
   * Managed by.
   *
   * @return the managedBy
   */
  public String getManagedBy() {
    return managedBy;
  }

  /**
   * Gets the state.
   *
   * Mark bucket active or inactive.
   *
   * @return the state
   */
  public String getState() {
    return state;
  }

  /**
   * Gets the tags.
   *
   * Tags.
   *
   * @return the tags
   */
  public List<String> getTags() {
    return tags;
  }

  /**
   * Gets the associatedCatalogs.
   *
   * Associated catalogs.
   *
   * @return the associatedCatalogs
   */
  public List<String> getAssociatedCatalogs() {
    return associatedCatalogs;
  }

  /**
   * Gets the bucketDisplayName.
   *
   * Bucket Display Name.
   *
   * @return the bucketDisplayName
   */
  public String getBucketDisplayName() {
    return bucketDisplayName;
  }

  /**
   * Gets the bucketId.
   *
   * Bucket ID auto generated during bucket registration.
   *
   * @return the bucketId
   */
  public String getBucketId() {
    return bucketId;
  }

  /**
   * Gets the bucketName.
   *
   * Actual bucket name.
   *
   * @return the bucketName
   */
  public String getBucketName() {
    return bucketName;
  }

  /**
   * Gets the bucketType.
   *
   * Bucket Type.
   *
   * @return the bucketType
   */
  public String getBucketType() {
    return bucketType;
  }

  /**
   * Gets the actions.
   *
   * Actions.
   *
   * @return the actions
   */
  public List<String> getActions() {
    return actions;
  }
}

