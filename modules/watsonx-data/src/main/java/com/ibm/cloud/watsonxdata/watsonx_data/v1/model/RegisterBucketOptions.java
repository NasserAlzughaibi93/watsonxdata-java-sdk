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

import java.util.ArrayList;
import java.util.List;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The registerBucket options.
 */
public class RegisterBucketOptions extends GenericModel {

  /**
   * Table type.
   */
  public interface TableType {
    /** iceberg. */
    String ICEBERG = "iceberg";
    /** hive-hadoop2. */
    String HIVE_HADOOP2 = "hive-hadoop2";
  }

  /**
   * Bucket Type.
   */
  public interface BucketType {
    /** aws_s3. */
    String AWS_S3 = "aws_s3";
    /** minio. */
    String MINIO = "minio";
    /** ibm_cos. */
    String IBM_COS = "ibm_cos";
  }

  /**
   * Managed by.
   */
  public interface ManagedBy {
    /** ibm. */
    String IBM = "ibm";
    /** customer. */
    String CUSTOMER = "customer";
  }

  protected BucketDetails bucketDetails;
  protected String description;
  protected String tableType;
  protected String bucketType;
  protected String catalogName;
  protected String managedBy;
  protected String bucketDisplayName;
  protected List<String> bucketTags;
  protected List<String> catalogTags;
  protected String thriftUri;
  protected String authInstanceId;

  /**
   * Builder.
   */
  public static class Builder {
    private BucketDetails bucketDetails;
    private String description;
    private String tableType;
    private String bucketType;
    private String catalogName;
    private String managedBy;
    private String bucketDisplayName;
    private List<String> bucketTags;
    private List<String> catalogTags;
    private String thriftUri;
    private String authInstanceId;

    /**
     * Instantiates a new Builder from an existing RegisterBucketOptions instance.
     *
     * @param registerBucketOptions the instance to initialize the Builder with
     */
    private Builder(RegisterBucketOptions registerBucketOptions) {
      this.bucketDetails = registerBucketOptions.bucketDetails;
      this.description = registerBucketOptions.description;
      this.tableType = registerBucketOptions.tableType;
      this.bucketType = registerBucketOptions.bucketType;
      this.catalogName = registerBucketOptions.catalogName;
      this.managedBy = registerBucketOptions.managedBy;
      this.bucketDisplayName = registerBucketOptions.bucketDisplayName;
      this.bucketTags = registerBucketOptions.bucketTags;
      this.catalogTags = registerBucketOptions.catalogTags;
      this.thriftUri = registerBucketOptions.thriftUri;
      this.authInstanceId = registerBucketOptions.authInstanceId;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param bucketDetails the bucketDetails
     * @param description the description
     * @param tableType the tableType
     * @param bucketType the bucketType
     * @param catalogName the catalogName
     * @param managedBy the managedBy
     */
    public Builder(BucketDetails bucketDetails, String description, String tableType, String bucketType, String catalogName, String managedBy) {
      this.bucketDetails = bucketDetails;
      this.description = description;
      this.tableType = tableType;
      this.bucketType = bucketType;
      this.catalogName = catalogName;
      this.managedBy = managedBy;
    }

    /**
     * Builds a RegisterBucketOptions.
     *
     * @return the new RegisterBucketOptions instance
     */
    public RegisterBucketOptions build() {
      return new RegisterBucketOptions(this);
    }

    /**
     * Adds an bucketTags to bucketTags.
     *
     * @param bucketTags the new bucketTags
     * @return the RegisterBucketOptions builder
     */
    public Builder addBucketTags(String bucketTags) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(bucketTags,
        "bucketTags cannot be null");
      if (this.bucketTags == null) {
        this.bucketTags = new ArrayList<String>();
      }
      this.bucketTags.add(bucketTags);
      return this;
    }

    /**
     * Adds an catalogTags to catalogTags.
     *
     * @param catalogTags the new catalogTags
     * @return the RegisterBucketOptions builder
     */
    public Builder addCatalogTags(String catalogTags) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(catalogTags,
        "catalogTags cannot be null");
      if (this.catalogTags == null) {
        this.catalogTags = new ArrayList<String>();
      }
      this.catalogTags.add(catalogTags);
      return this;
    }

    /**
     * Set the bucketDetails.
     *
     * @param bucketDetails the bucketDetails
     * @return the RegisterBucketOptions builder
     */
    public Builder bucketDetails(BucketDetails bucketDetails) {
      this.bucketDetails = bucketDetails;
      return this;
    }

    /**
     * Set the description.
     *
     * @param description the description
     * @return the RegisterBucketOptions builder
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    /**
     * Set the tableType.
     *
     * @param tableType the tableType
     * @return the RegisterBucketOptions builder
     */
    public Builder tableType(String tableType) {
      this.tableType = tableType;
      return this;
    }

    /**
     * Set the bucketType.
     *
     * @param bucketType the bucketType
     * @return the RegisterBucketOptions builder
     */
    public Builder bucketType(String bucketType) {
      this.bucketType = bucketType;
      return this;
    }

    /**
     * Set the catalogName.
     *
     * @param catalogName the catalogName
     * @return the RegisterBucketOptions builder
     */
    public Builder catalogName(String catalogName) {
      this.catalogName = catalogName;
      return this;
    }

    /**
     * Set the managedBy.
     *
     * @param managedBy the managedBy
     * @return the RegisterBucketOptions builder
     */
    public Builder managedBy(String managedBy) {
      this.managedBy = managedBy;
      return this;
    }

    /**
     * Set the bucketDisplayName.
     *
     * @param bucketDisplayName the bucketDisplayName
     * @return the RegisterBucketOptions builder
     */
    public Builder bucketDisplayName(String bucketDisplayName) {
      this.bucketDisplayName = bucketDisplayName;
      return this;
    }

    /**
     * Set the bucketTags.
     * Existing bucketTags will be replaced.
     *
     * @param bucketTags the bucketTags
     * @return the RegisterBucketOptions builder
     */
    public Builder bucketTags(List<String> bucketTags) {
      this.bucketTags = bucketTags;
      return this;
    }

    /**
     * Set the catalogTags.
     * Existing catalogTags will be replaced.
     *
     * @param catalogTags the catalogTags
     * @return the RegisterBucketOptions builder
     */
    public Builder catalogTags(List<String> catalogTags) {
      this.catalogTags = catalogTags;
      return this;
    }

    /**
     * Set the thriftUri.
     *
     * @param thriftUri the thriftUri
     * @return the RegisterBucketOptions builder
     */
    public Builder thriftUri(String thriftUri) {
      this.thriftUri = thriftUri;
      return this;
    }

    /**
     * Set the authInstanceId.
     *
     * @param authInstanceId the authInstanceId
     * @return the RegisterBucketOptions builder
     */
    public Builder authInstanceId(String authInstanceId) {
      this.authInstanceId = authInstanceId;
      return this;
    }
  }

  protected RegisterBucketOptions() { }

  protected RegisterBucketOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.bucketDetails,
      "bucketDetails cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.description,
      "description cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.tableType,
      "tableType cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.bucketType,
      "bucketType cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.catalogName,
      "catalogName cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.managedBy,
      "managedBy cannot be null");
    bucketDetails = builder.bucketDetails;
    description = builder.description;
    tableType = builder.tableType;
    bucketType = builder.bucketType;
    catalogName = builder.catalogName;
    managedBy = builder.managedBy;
    bucketDisplayName = builder.bucketDisplayName;
    bucketTags = builder.bucketTags;
    catalogTags = builder.catalogTags;
    thriftUri = builder.thriftUri;
    authInstanceId = builder.authInstanceId;
  }

  /**
   * New builder.
   *
   * @return a RegisterBucketOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the bucketDetails.
   *
   * Bucket Details.
   *
   * @return the bucketDetails
   */
  public BucketDetails bucketDetails() {
    return bucketDetails;
  }

  /**
   * Gets the description.
   *
   * Bucket description.
   *
   * @return the description
   */
  public String description() {
    return description;
  }

  /**
   * Gets the tableType.
   *
   * Table type.
   *
   * @return the tableType
   */
  public String tableType() {
    return tableType;
  }

  /**
   * Gets the bucketType.
   *
   * Bucket Type.
   *
   * @return the bucketType
   */
  public String bucketType() {
    return bucketType;
  }

  /**
   * Gets the catalogName.
   *
   * Catalog name for the new catalog to be created with bucket.
   *
   * @return the catalogName
   */
  public String catalogName() {
    return catalogName;
  }

  /**
   * Gets the managedBy.
   *
   * Managed by.
   *
   * @return the managedBy
   */
  public String managedBy() {
    return managedBy;
  }

  /**
   * Gets the bucketDisplayName.
   *
   * Bucket Display name.
   *
   * @return the bucketDisplayName
   */
  public String bucketDisplayName() {
    return bucketDisplayName;
  }

  /**
   * Gets the bucketTags.
   *
   * tags.
   *
   * @return the bucketTags
   */
  public List<String> bucketTags() {
    return bucketTags;
  }

  /**
   * Gets the catalogTags.
   *
   * Catalog tags.
   *
   * @return the catalogTags
   */
  public List<String> catalogTags() {
    return catalogTags;
  }

  /**
   * Gets the thriftUri.
   *
   * Thrift URI.
   *
   * @return the thriftUri
   */
  public String thriftUri() {
    return thriftUri;
  }

  /**
   * Gets the authInstanceId.
   *
   * Instance ID.
   *
   * @return the authInstanceId
   */
  public String authInstanceId() {
    return authInstanceId;
  }
}

