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
 * The createBucketUsers options.
 */
public class CreateBucketUsersOptions extends GenericModel {

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
     * Instantiates a new Builder from an existing CreateBucketUsersOptions instance.
     *
     * @param createBucketUsersOptions the instance to initialize the Builder with
     */
    private Builder(CreateBucketUsersOptions createBucketUsersOptions) {
      this.bucketId = createBucketUsersOptions.bucketId;
      this.groups = createBucketUsersOptions.groups;
      this.users = createBucketUsersOptions.users;
      this.lhInstanceId = createBucketUsersOptions.lhInstanceId;
      this.authInstanceId = createBucketUsersOptions.authInstanceId;
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
     * Builds a CreateBucketUsersOptions.
     *
     * @return the new CreateBucketUsersOptions instance
     */
    public CreateBucketUsersOptions build() {
      return new CreateBucketUsersOptions(this);
    }

    /**
     * Adds an groups to groups.
     *
     * @param groups the new groups
     * @return the CreateBucketUsersOptions builder
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
     * @return the CreateBucketUsersOptions builder
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
     * @return the CreateBucketUsersOptions builder
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
     * @return the CreateBucketUsersOptions builder
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
     * @return the CreateBucketUsersOptions builder
     */
    public Builder users(List<BucketDbConnUsersMetadata> users) {
      this.users = users;
      return this;
    }

    /**
     * Set the lhInstanceId.
     *
     * @param lhInstanceId the lhInstanceId
     * @return the CreateBucketUsersOptions builder
     */
    public Builder lhInstanceId(String lhInstanceId) {
      this.lhInstanceId = lhInstanceId;
      return this;
    }

    /**
     * Set the authInstanceId.
     *
     * @param authInstanceId the authInstanceId
     * @return the CreateBucketUsersOptions builder
     */
    public Builder authInstanceId(String authInstanceId) {
      this.authInstanceId = authInstanceId;
      return this;
    }
  }

  protected CreateBucketUsersOptions() { }

  protected CreateBucketUsersOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.bucketId,
      "bucketId cannot be null");
    bucketId = builder.bucketId;
    groups = builder.groups;
    users = builder.users;
    lhInstanceId = builder.lhInstanceId;
    authInstanceId = builder.authInstanceId;
  }

  /**
   * New builder.
   *
   * @return a CreateBucketUsersOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the bucketId.
   *
   * The bucket id.
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

