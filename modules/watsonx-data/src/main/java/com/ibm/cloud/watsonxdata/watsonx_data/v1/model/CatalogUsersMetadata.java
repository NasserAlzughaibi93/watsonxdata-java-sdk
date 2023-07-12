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
 * CatalogUsersMetadata.
 */
public class CatalogUsersMetadata extends GenericModel {

  /**
   * Eligible permission to the resource.
   */
  public interface Permission {
    /** can_administer. */
    String CAN_ADMINISTER = "can_administer";
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
     * Instantiates a new Builder from an existing CatalogUsersMetadata instance.
     *
     * @param catalogUsersMetadata the instance to initialize the Builder with
     */
    private Builder(CatalogUsersMetadata catalogUsersMetadata) {
      this.permission = catalogUsersMetadata.permission;
      this.userName = catalogUsersMetadata.userName;
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
     * Builds a CatalogUsersMetadata.
     *
     * @return the new CatalogUsersMetadata instance
     */
    public CatalogUsersMetadata build() {
      return new CatalogUsersMetadata(this);
    }

    /**
     * Set the permission.
     *
     * @param permission the permission
     * @return the CatalogUsersMetadata builder
     */
    public Builder permission(String permission) {
      this.permission = permission;
      return this;
    }

    /**
     * Set the userName.
     *
     * @param userName the userName
     * @return the CatalogUsersMetadata builder
     */
    public Builder userName(String userName) {
      this.userName = userName;
      return this;
    }
  }

  protected CatalogUsersMetadata() { }

  protected CatalogUsersMetadata(Builder builder) {
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
   * @return a CatalogUsersMetadata builder
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

