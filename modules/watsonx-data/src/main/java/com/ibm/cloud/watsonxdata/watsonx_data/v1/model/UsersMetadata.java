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
 * Users metadata.
 */
public class UsersMetadata extends GenericModel {

  /**
   * Eligible permission to the resource.
   */
  public interface Permission {
    /** can_administer. */
    String CAN_ADMINISTER = "can_administer";
    /** can_manage. */
    String CAN_MANAGE = "can_manage";
    /** can_use. */
    String CAN_USE = "can_use";
  }

  protected String permission;
  @SerializedName("user_name")
  protected String userName;

  /**
   * Builder.
   */
  public static class Builder {
    private String permission;
    private String userName;

    /**
     * Instantiates a new Builder from an existing UsersMetadata instance.
     *
     * @param usersMetadata the instance to initialize the Builder with
     */
    private Builder(UsersMetadata usersMetadata) {
      this.permission = usersMetadata.permission;
      this.userName = usersMetadata.userName;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param permission the permission
     * @param userName the userName
     */
    public Builder(String permission, String userName) {
      this.permission = permission;
      this.userName = userName;
    }

    /**
     * Builds a UsersMetadata.
     *
     * @return the new UsersMetadata instance
     */
    public UsersMetadata build() {
      return new UsersMetadata(this);
    }

    /**
     * Set the permission.
     *
     * @param permission the permission
     * @return the UsersMetadata builder
     */
    public Builder permission(String permission) {
      this.permission = permission;
      return this;
    }

    /**
     * Set the userName.
     *
     * @param userName the userName
     * @return the UsersMetadata builder
     */
    public Builder userName(String userName) {
      this.userName = userName;
      return this;
    }
  }

  protected UsersMetadata() { }

  protected UsersMetadata(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.permission,
      "permission cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.userName,
      "userName cannot be null");
    permission = builder.permission;
    userName = builder.userName;
  }

  /**
   * New builder.
   *
   * @return a UsersMetadata builder
   */
  public Builder newBuilder() {
    return new Builder(this);
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
}

