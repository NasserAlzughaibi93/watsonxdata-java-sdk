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
 * The updateEngineUsers options.
 */
public class UpdateEngineUsersOptions extends GenericModel {

  protected String engineId;
  protected List<EngineGroupsMetadata> groups;
  protected List<EngineUsersMetadata> users;
  protected String lhInstanceId;
  protected String authInstanceId;

  /**
   * Builder.
   */
  public static class Builder {
    private String engineId;
    private List<EngineGroupsMetadata> groups;
    private List<EngineUsersMetadata> users;
    private String lhInstanceId;
    private String authInstanceId;

    /**
     * Instantiates a new Builder from an existing UpdateEngineUsersOptions instance.
     *
     * @param updateEngineUsersOptions the instance to initialize the Builder with
     */
    private Builder(UpdateEngineUsersOptions updateEngineUsersOptions) {
      this.engineId = updateEngineUsersOptions.engineId;
      this.groups = updateEngineUsersOptions.groups;
      this.users = updateEngineUsersOptions.users;
      this.lhInstanceId = updateEngineUsersOptions.lhInstanceId;
      this.authInstanceId = updateEngineUsersOptions.authInstanceId;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param engineId the engineId
     */
    public Builder(String engineId) {
      this.engineId = engineId;
    }

    /**
     * Builds a UpdateEngineUsersOptions.
     *
     * @return the new UpdateEngineUsersOptions instance
     */
    public UpdateEngineUsersOptions build() {
      return new UpdateEngineUsersOptions(this);
    }

    /**
     * Adds an groups to groups.
     *
     * @param groups the new groups
     * @return the UpdateEngineUsersOptions builder
     */
    public Builder addGroups(EngineGroupsMetadata groups) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(groups,
        "groups cannot be null");
      if (this.groups == null) {
        this.groups = new ArrayList<EngineGroupsMetadata>();
      }
      this.groups.add(groups);
      return this;
    }

    /**
     * Adds an users to users.
     *
     * @param users the new users
     * @return the UpdateEngineUsersOptions builder
     */
    public Builder addUsers(EngineUsersMetadata users) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(users,
        "users cannot be null");
      if (this.users == null) {
        this.users = new ArrayList<EngineUsersMetadata>();
      }
      this.users.add(users);
      return this;
    }

    /**
     * Set the engineId.
     *
     * @param engineId the engineId
     * @return the UpdateEngineUsersOptions builder
     */
    public Builder engineId(String engineId) {
      this.engineId = engineId;
      return this;
    }

    /**
     * Set the groups.
     * Existing groups will be replaced.
     *
     * @param groups the groups
     * @return the UpdateEngineUsersOptions builder
     */
    public Builder groups(List<EngineGroupsMetadata> groups) {
      this.groups = groups;
      return this;
    }

    /**
     * Set the users.
     * Existing users will be replaced.
     *
     * @param users the users
     * @return the UpdateEngineUsersOptions builder
     */
    public Builder users(List<EngineUsersMetadata> users) {
      this.users = users;
      return this;
    }

    /**
     * Set the lhInstanceId.
     *
     * @param lhInstanceId the lhInstanceId
     * @return the UpdateEngineUsersOptions builder
     */
    public Builder lhInstanceId(String lhInstanceId) {
      this.lhInstanceId = lhInstanceId;
      return this;
    }

    /**
     * Set the authInstanceId.
     *
     * @param authInstanceId the authInstanceId
     * @return the UpdateEngineUsersOptions builder
     */
    public Builder authInstanceId(String authInstanceId) {
      this.authInstanceId = authInstanceId;
      return this;
    }
  }

  protected UpdateEngineUsersOptions() { }

  protected UpdateEngineUsersOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.engineId,
      "engineId cannot be empty");
    engineId = builder.engineId;
    groups = builder.groups;
    users = builder.users;
    lhInstanceId = builder.lhInstanceId;
    authInstanceId = builder.authInstanceId;
  }

  /**
   * New builder.
   *
   * @return a UpdateEngineUsersOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the engineId.
   *
   * Engine ID for PATCH.
   *
   * @return the engineId
   */
  public String engineId() {
    return engineId;
  }

  /**
   * Gets the groups.
   *
   * The group list.
   *
   * @return the groups
   */
  public List<EngineGroupsMetadata> groups() {
    return groups;
  }

  /**
   * Gets the users.
   *
   * The user list.
   *
   * @return the users
   */
  public List<EngineUsersMetadata> users() {
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

