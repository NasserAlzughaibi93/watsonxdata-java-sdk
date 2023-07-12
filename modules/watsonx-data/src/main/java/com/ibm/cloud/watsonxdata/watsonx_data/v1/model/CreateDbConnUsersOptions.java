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
 * The createDbConnUsers options.
 */
public class CreateDbConnUsersOptions extends GenericModel {

  protected String databaseId;
  protected List<BucketDbConnGroupsMetadata> groups;
  protected List<BucketDbConnUsersMetadata> users;
  protected String lhInstanceId;
  protected String authInstanceId;

  /**
   * Builder.
   */
  public static class Builder {
    private String databaseId;
    private List<BucketDbConnGroupsMetadata> groups;
    private List<BucketDbConnUsersMetadata> users;
    private String lhInstanceId;
    private String authInstanceId;

    /**
     * Instantiates a new Builder from an existing CreateDbConnUsersOptions instance.
     *
     * @param createDbConnUsersOptions the instance to initialize the Builder with
     */
    private Builder(CreateDbConnUsersOptions createDbConnUsersOptions) {
      this.databaseId = createDbConnUsersOptions.databaseId;
      this.groups = createDbConnUsersOptions.groups;
      this.users = createDbConnUsersOptions.users;
      this.lhInstanceId = createDbConnUsersOptions.lhInstanceId;
      this.authInstanceId = createDbConnUsersOptions.authInstanceId;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param databaseId the databaseId
     */
    public Builder(String databaseId) {
      this.databaseId = databaseId;
    }

    /**
     * Builds a CreateDbConnUsersOptions.
     *
     * @return the new CreateDbConnUsersOptions instance
     */
    public CreateDbConnUsersOptions build() {
      return new CreateDbConnUsersOptions(this);
    }

    /**
     * Adds an groups to groups.
     *
     * @param groups the new groups
     * @return the CreateDbConnUsersOptions builder
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
     * @return the CreateDbConnUsersOptions builder
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
     * Set the databaseId.
     *
     * @param databaseId the databaseId
     * @return the CreateDbConnUsersOptions builder
     */
    public Builder databaseId(String databaseId) {
      this.databaseId = databaseId;
      return this;
    }

    /**
     * Set the groups.
     * Existing groups will be replaced.
     *
     * @param groups the groups
     * @return the CreateDbConnUsersOptions builder
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
     * @return the CreateDbConnUsersOptions builder
     */
    public Builder users(List<BucketDbConnUsersMetadata> users) {
      this.users = users;
      return this;
    }

    /**
     * Set the lhInstanceId.
     *
     * @param lhInstanceId the lhInstanceId
     * @return the CreateDbConnUsersOptions builder
     */
    public Builder lhInstanceId(String lhInstanceId) {
      this.lhInstanceId = lhInstanceId;
      return this;
    }

    /**
     * Set the authInstanceId.
     *
     * @param authInstanceId the authInstanceId
     * @return the CreateDbConnUsersOptions builder
     */
    public Builder authInstanceId(String authInstanceId) {
      this.authInstanceId = authInstanceId;
      return this;
    }
  }

  protected CreateDbConnUsersOptions() { }

  protected CreateDbConnUsersOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.databaseId,
      "databaseId cannot be null");
    databaseId = builder.databaseId;
    groups = builder.groups;
    users = builder.users;
    lhInstanceId = builder.lhInstanceId;
    authInstanceId = builder.authInstanceId;
  }

  /**
   * New builder.
   *
   * @return a CreateDbConnUsersOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the databaseId.
   *
   * The db connection id.
   *
   * @return the databaseId
   */
  public String databaseId() {
    return databaseId;
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

