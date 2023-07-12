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
 * The updateBucketUsers options.
 */
public class UpdateBucketUsersOptions extends GenericModel {

  protected String bucketId;
  protected List<BucketDbConnGroupsMetadata> groups;
  protected List<BucketDbConnUsersMetadata> users;
  protected String lhInstanceId;
  protected String authInstanceId;

  /**
   * Builder.
   */
  public static class Builder {
    private String bucketId;
    private List<BucketDbConnGroupsMetadata> groups;
    private List<BucketDbConnUsersMetadata> users;
    private String lhInstanceId;
    private String authInstanceId;

    /**
     * Instantiates a new Builder from an existing UpdateBucketUsersOptions instance.
     *
     * @param updateBucketUsersOptions the instance to initialize the Builder with
     */
    private Builder(UpdateBucketUsersOptions updateBucketUsersOptions) {
      this.bucketId = updateBucketUsersOptions.bucketId;
      this.groups = updateBucketUsersOptions.groups;
      this.users = updateBucketUsersOptions.users;
      this.lhInstanceId = updateBucketUsersOptions.lhInstanceId;
      this.authInstanceId = updateBucketUsersOptions.authInstanceId;
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
     * Builds a UpdateBucketUsersOptions.
     *
     * @return the new UpdateBucketUsersOptions instance
     */
    public UpdateBucketUsersOptions build() {
      return new UpdateBucketUsersOptions(this);
    }

    /**
     * Adds an groups to groups.
     *
     * @param groups the new groups
     * @return the UpdateBucketUsersOptions builder
     */
    public Builder addGroups(BucketDbConnGroupsMetadata groups) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(groups,
        "groups cannot be null");
      if (this.groups == null) {
        this.groups = new ArrayList<BucketDbConnGroupsMetadata>();
      }
      this.groups.add(groups);
      return this;
    }

    /**
     * Adds an users to users.
     *
     * @param users the new users
     * @return the UpdateBucketUsersOptions builder
     */
    public Builder addUsers(BucketDbConnUsersMetadata users) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(users,
        "users cannot be null");
      if (this.users == null) {
        this.users = new ArrayList<BucketDbConnUsersMetadata>();
      }
      this.users.add(users);
      return this;
    }

    /**
     * Set the bucketId.
     *
     * @param bucketId the bucketId
     * @return the UpdateBucketUsersOptions builder
     */
    public Builder bucketId(String bucketId) {
      this.bucketId = bucketId;
      return this;
    }

    /**
     * Set the groups.
     * Existing groups will be replaced.
     *
     * @param groups the groups
     * @return the UpdateBucketUsersOptions builder
     */
    public Builder groups(List<BucketDbConnGroupsMetadata> groups) {
      this.groups = groups;
      return this;
    }

    /**
     * Set the users.
     * Existing users will be replaced.
     *
     * @param users the users
     * @return the UpdateBucketUsersOptions builder
     */
    public Builder users(List<BucketDbConnUsersMetadata> users) {
      this.users = users;
      return this;
    }

    /**
     * Set the lhInstanceId.
     *
     * @param lhInstanceId the lhInstanceId
     * @return the UpdateBucketUsersOptions builder
     */
    public Builder lhInstanceId(String lhInstanceId) {
      this.lhInstanceId = lhInstanceId;
      return this;
    }

    /**
     * Set the authInstanceId.
     *
     * @param authInstanceId the authInstanceId
     * @return the UpdateBucketUsersOptions builder
     */
    public Builder authInstanceId(String authInstanceId) {
      this.authInstanceId = authInstanceId;
      return this;
    }
  }

  protected UpdateBucketUsersOptions() { }

  protected UpdateBucketUsersOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.bucketId,
      "bucketId cannot be empty");
    bucketId = builder.bucketId;
    groups = builder.groups;
    users = builder.users;
    lhInstanceId = builder.lhInstanceId;
    authInstanceId = builder.authInstanceId;
  }

  /**
   * New builder.
   *
   * @return a UpdateBucketUsersOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the bucketId.
   *
   * Bucket ID for PATCH.
   *
   * @return the bucketId
   */
  public String bucketId() {
    return bucketId;
  }

  /**
   * Gets the groups.
   *
   * The group list.
   *
   * @return the groups
   */
  public List<BucketDbConnGroupsMetadata> groups() {
    return groups;
  }

  /**
   * Gets the users.
   *
   * The user list.
   *
   * @return the users
   */
  public List<BucketDbConnUsersMetadata> users() {
    return users;
  }

  /**
   * Gets the lhInstanceId.
   *
   * Lake House Instance ID.
   *
   * @return the lhInstanceId
   */
  public String lhInstanceId() {
    return lhInstanceId;
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

