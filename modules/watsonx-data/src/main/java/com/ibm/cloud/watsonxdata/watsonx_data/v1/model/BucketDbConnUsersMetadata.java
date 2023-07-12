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
 * BucketDbConnUsersMetadata.
 */
public class BucketDbConnUsersMetadata extends GenericModel {

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

  @SerializedName("user_name")
  protected String userName;
  protected String permission;

  /**
   * Builder.
   */
  public static class Builder {
    private String userName;
    private String permission;

    /**
     * Instantiates a new Builder from an existing BucketDbConnUsersMetadata instance.
     *
     * @param bucketDbConnUsersMetadata the instance to initialize the Builder with
     */
    private Builder(BucketDbConnUsersMetadata bucketDbConnUsersMetadata) {
      this.userName = bucketDbConnUsersMetadata.userName;
      this.permission = bucketDbConnUsersMetadata.permission;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param userName the userName
     * @param permission the permission
     */
    public Builder(String userName, String permission) {
      this.userName = userName;
      this.permission = permission;
    }

    /**
     * Builds a BucketDbConnUsersMetadata.
     *
     * @return the new BucketDbConnUsersMetadata instance
     */
    public BucketDbConnUsersMetadata build() {
      return new BucketDbConnUsersMetadata(this);
    }

    /**
     * Set the userName.
     *
     * @param userName the userName
     * @return the BucketDbConnUsersMetadata builder
     */
    public Builder userName(String userName) {
      this.userName = userName;
      return this;
    }

    /**
     * Set the permission.
     *
     * @param permission the permission
     * @return the BucketDbConnUsersMetadata builder
     */
    public Builder permission(String permission) {
      this.permission = permission;
      return this;
    }
  }

  protected BucketDbConnUsersMetadata() { }

  protected BucketDbConnUsersMetadata(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.userName,
      "userName cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.permission,
      "permission cannot be null");
    userName = builder.userName;
    permission = builder.permission;
  }

  /**
   * New builder.
   *
   * @return a BucketDbConnUsersMetadata builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the userName.
   *
   * The user name.
   *
   * @return the userName
   */
  public String userName() {
    return userName;
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

