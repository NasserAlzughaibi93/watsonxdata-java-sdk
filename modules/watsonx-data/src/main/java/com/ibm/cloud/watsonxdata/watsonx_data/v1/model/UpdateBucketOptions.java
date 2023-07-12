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
 * The updateBucket options.
 */
public class UpdateBucketOptions extends GenericModel {

  protected String bucketId;
  protected String accessKey;
  protected String bucketDisplayName;
  protected String description;
  protected String secretKey;
  protected List<String> tags;
  protected String authInstanceId;

  /**
   * Builder.
   */
  public static class Builder {
    private String bucketId;
    private String accessKey;
    private String bucketDisplayName;
    private String description;
    private String secretKey;
    private List<String> tags;
    private String authInstanceId;

    /**
     * Instantiates a new Builder from an existing UpdateBucketOptions instance.
     *
     * @param updateBucketOptions the instance to initialize the Builder with
     */
    private Builder(UpdateBucketOptions updateBucketOptions) {
      this.bucketId = updateBucketOptions.bucketId;
      this.accessKey = updateBucketOptions.accessKey;
      this.bucketDisplayName = updateBucketOptions.bucketDisplayName;
      this.description = updateBucketOptions.description;
      this.secretKey = updateBucketOptions.secretKey;
      this.tags = updateBucketOptions.tags;
      this.authInstanceId = updateBucketOptions.authInstanceId;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param bucketId the bucketId
     */
    public Builder(String bucketId) {
      this.bucketId = bucketId;
    }

    /**
     * Builds a UpdateBucketOptions.
     *
     * @return the new UpdateBucketOptions instance
     */
    public UpdateBucketOptions build() {
      return new UpdateBucketOptions(this);
    }

    /**
     * Adds an tags to tags.
     *
     * @param tags the new tags
     * @return the UpdateBucketOptions builder
     */
    public Builder addTags(String tags) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(tags,
        "tags cannot be null");
      if (this.tags == null) {
        this.tags = new ArrayList<String>();
      }
      this.tags.add(tags);
      return this;
    }

    /**
     * Set the bucketId.
     *
     * @param bucketId the bucketId
     * @return the UpdateBucketOptions builder
     */
    public Builder bucketId(String bucketId) {
      this.bucketId = bucketId;
      return this;
    }

    /**
     * Set the accessKey.
     *
     * @param accessKey the accessKey
     * @return the UpdateBucketOptions builder
     */
    public Builder accessKey(String accessKey) {
      this.accessKey = accessKey;
      return this;
    }

    /**
     * Set the bucketDisplayName.
     *
     * @param bucketDisplayName the bucketDisplayName
     * @return the UpdateBucketOptions builder
     */
    public Builder bucketDisplayName(String bucketDisplayName) {
      this.bucketDisplayName = bucketDisplayName;
      return this;
    }

    /**
     * Set the description.
     *
     * @param description the description
     * @return the UpdateBucketOptions builder
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    /**
     * Set the secretKey.
     *
     * @param secretKey the secretKey
     * @return the UpdateBucketOptions builder
     */
    public Builder secretKey(String secretKey) {
      this.secretKey = secretKey;
      return this;
    }

    /**
     * Set the tags.
     * Existing tags will be replaced.
     *
     * @param tags the tags
     * @return the UpdateBucketOptions builder
     */
    public Builder tags(List<String> tags) {
      this.tags = tags;
      return this;
    }

    /**
     * Set the authInstanceId.
     *
     * @param authInstanceId the authInstanceId
     * @return the UpdateBucketOptions builder
     */
    public Builder authInstanceId(String authInstanceId) {
      this.authInstanceId = authInstanceId;
      return this;
    }
  }

  protected UpdateBucketOptions() { }

  protected UpdateBucketOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.bucketId,
      "bucketId cannot be null");
    bucketId = builder.bucketId;
    accessKey = builder.accessKey;
    bucketDisplayName = builder.bucketDisplayName;
    description = builder.description;
    secretKey = builder.secretKey;
    tags = builder.tags;
    authInstanceId = builder.authInstanceId;
  }

  /**
   * New builder.
   *
   * @return a UpdateBucketOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the bucketId.
   *
   * Bucket ID auto generated during bucket registration.
   *
   * @return the bucketId
   */
  public String bucketId() {
    return bucketId;
  }

  /**
   * Gets the accessKey.
   *
   * Access key ID, encrypted during bucket registration.
   *
   * @return the accessKey
   */
  public String accessKey() {
    return accessKey;
  }

  /**
   * Gets the bucketDisplayName.
   *
   * Bucket display name.
   *
   * @return the bucketDisplayName
   */
  public String bucketDisplayName() {
    return bucketDisplayName;
  }

  /**
   * Gets the description.
   *
   * Modified description.
   *
   * @return the description
   */
  public String description() {
    return description;
  }

  /**
   * Gets the secretKey.
   *
   * Secret access key, encrypted during bucket registration.
   *
   * @return the secretKey
   */
  public String secretKey() {
    return secretKey;
  }

  /**
   * Gets the tags.
   *
   * Tags.
   *
   * @return the tags
   */
  public List<String> tags() {
    return tags;
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

