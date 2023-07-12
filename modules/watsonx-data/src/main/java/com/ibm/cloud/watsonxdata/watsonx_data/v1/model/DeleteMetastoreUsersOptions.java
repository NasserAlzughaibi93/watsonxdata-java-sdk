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
 * The deleteMetastoreUsers options.
 */
public class DeleteMetastoreUsersOptions extends GenericModel {

  protected String metastoreName;
  protected List<String> groups;
  protected List<String> users;
  protected String lhInstanceId;
  protected String authInstanceId;

  /**
   * Builder.
   */
  public static class Builder {
    private String metastoreName;
    private List<String> groups;
    private List<String> users;
    private String lhInstanceId;
    private String authInstanceId;

    /**
     * Instantiates a new Builder from an existing DeleteMetastoreUsersOptions instance.
     *
     * @param deleteMetastoreUsersOptions the instance to initialize the Builder with
     */
    private Builder(DeleteMetastoreUsersOptions deleteMetastoreUsersOptions) {
      this.metastoreName = deleteMetastoreUsersOptions.metastoreName;
      this.groups = deleteMetastoreUsersOptions.groups;
      this.users = deleteMetastoreUsersOptions.users;
      this.lhInstanceId = deleteMetastoreUsersOptions.lhInstanceId;
      this.authInstanceId = deleteMetastoreUsersOptions.authInstanceId;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param metastoreName the metastoreName
     */
    public Builder(String metastoreName) {
      this.metastoreName = metastoreName;
    }

    /**
     * Builds a DeleteMetastoreUsersOptions.
     *
     * @return the new DeleteMetastoreUsersOptions instance
     */
    public DeleteMetastoreUsersOptions build() {
      return new DeleteMetastoreUsersOptions(this);
    }

    /**
     * Adds an groups to groups.
     *
     * @param groups the new groups
     * @return the DeleteMetastoreUsersOptions builder
     */
    public Builder addGroups(String groups) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(groups,
        "groups cannot be null");
      if (this.groups == null) {
        this.groups = new ArrayList<String>();
      }
      this.groups.add(groups);
      return this;
    }

    /**
     * Adds an users to users.
     *
     * @param users the new users
     * @return the DeleteMetastoreUsersOptions builder
     */
    public Builder addUsers(String users) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(users,
        "users cannot be null");
      if (this.users == null) {
        this.users = new ArrayList<String>();
      }
      this.users.add(users);
      return this;
    }

    /**
     * Set the metastoreName.
     *
     * @param metastoreName the metastoreName
     * @return the DeleteMetastoreUsersOptions builder
     */
    public Builder metastoreName(String metastoreName) {
      this.metastoreName = metastoreName;
      return this;
    }

    /**
     * Set the groups.
     * Existing groups will be replaced.
     *
     * @param groups the groups
     * @return the DeleteMetastoreUsersOptions builder
     */
    public Builder groups(List<String> groups) {
      this.groups = groups;
      return this;
    }

    /**
     * Set the users.
     * Existing users will be replaced.
     *
     * @param users the users
     * @return the DeleteMetastoreUsersOptions builder
     */
    public Builder users(List<String> users) {
      this.users = users;
      return this;
    }

    /**
     * Set the lhInstanceId.
     *
     * @param lhInstanceId the lhInstanceId
     * @return the DeleteMetastoreUsersOptions builder
     */
    public Builder lhInstanceId(String lhInstanceId) {
      this.lhInstanceId = lhInstanceId;
      return this;
    }

    /**
     * Set the authInstanceId.
     *
     * @param authInstanceId the authInstanceId
     * @return the DeleteMetastoreUsersOptions builder
     */
    public Builder authInstanceId(String authInstanceId) {
      this.authInstanceId = authInstanceId;
      return this;
    }
  }

  protected DeleteMetastoreUsersOptions() { }

  protected DeleteMetastoreUsersOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.metastoreName,
      "metastoreName cannot be empty");
    metastoreName = builder.metastoreName;
    groups = builder.groups;
    users = builder.users;
    lhInstanceId = builder.lhInstanceId;
    authInstanceId = builder.authInstanceId;
  }

  /**
   * New builder.
   *
   * @return a DeleteMetastoreUsersOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the metastoreName.
   *
   * Metastore name for DELETE.
   *
   * @return the metastoreName
   */
  public String metastoreName() {
    return metastoreName;
  }

  /**
   * Gets the groups.
   *
   * The group ids array to be deleted.
   *
   * @return the groups
   */
  public List<String> groups() {
    return groups;
  }

  /**
   * Gets the users.
   *
   * The user names array to be deleted.
   *
   * @return the users
   */
  public List<String> users() {
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

