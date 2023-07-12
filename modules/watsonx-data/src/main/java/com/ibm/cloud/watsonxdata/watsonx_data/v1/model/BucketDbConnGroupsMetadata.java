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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * BucketDbConnGroupsMetadata.
 */
public class BucketDbConnGroupsMetadata extends GenericModel {

  /**
   * Eligible permission to the resource.
   */
  public interface Permission {
    /** can_administer. */
    String CAN_ADMINISTER = "can_administer";
    /** can_write. */
    String CAN_WRITE = "can_write";
    /** can_read. */
    String CAN_READ = "can_read";
  }

  @SerializedName("group_id")
  protected String groupId;
  protected String permission;

  /**
   * Builder.
   */
  public static class Builder {
    private String groupId;
    private String permission;

    /**
     * Instantiates a new Builder from an existing BucketDbConnGroupsMetadata instance.
     *
     * @param bucketDbConnGroupsMetadata the instance to initialize the Builder with
     */
    private Builder(BucketDbConnGroupsMetadata bucketDbConnGroupsMetadata) {
      this.groupId = bucketDbConnGroupsMetadata.groupId;
      this.permission = bucketDbConnGroupsMetadata.permission;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param groupId the groupId
     * @param permission the permission
     */
    public Builder(String groupId, String permission) {
      this.groupId = groupId;
      this.permission = permission;
    }

    /**
     * Builds a BucketDbConnGroupsMetadata.
     *
     * @return the new BucketDbConnGroupsMetadata instance
     */
    public BucketDbConnGroupsMetadata build() {
      return new BucketDbConnGroupsMetadata(this);
    }

    /**
     * Set the groupId.
     *
     * @param groupId the groupId
     * @return the BucketDbConnGroupsMetadata builder
     */
    public Builder groupId(String groupId) {
      this.groupId = groupId;
      return this;
    }

    /**
     * Set the permission.
     *
     * @param permission the permission
     * @return the BucketDbConnGroupsMetadata builder
     */
    public Builder permission(String permission) {
      this.permission = permission;
      return this;
    }
  }

  protected BucketDbConnGroupsMetadata() { }

  protected BucketDbConnGroupsMetadata(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.groupId,
      "groupId cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.permission,
      "permission cannot be null");
    groupId = builder.groupId;
    permission = builder.permission;
  }

  /**
   * New builder.
   *
   * @return a BucketDbConnGroupsMetadata builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the groupId.
   *
   * The group id.
   *
   * @return the groupId
   */
  public String groupId() {
    return groupId;
  }

  /**
   * Gets the permission.
   *
   * Eligible permission to the resource.
   *
   * @return the permission
   */
  public String permission() {
    return permission;
  }
}

