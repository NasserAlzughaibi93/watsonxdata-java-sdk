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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The getUsersGroups options.
 */
public class GetUsersGroupsOptions extends GenericModel {

  protected String cookie;
  protected String authInstanceId;

  /**
   * Builder.
   */
  public static class Builder {
    private String cookie;
    private String authInstanceId;

    /**
     * Instantiates a new Builder from an existing GetUsersGroupsOptions instance.
     *
     * @param getUsersGroupsOptions the instance to initialize the Builder with
     */
    private Builder(GetUsersGroupsOptions getUsersGroupsOptions) {
      this.cookie = getUsersGroupsOptions.cookie;
      this.authInstanceId = getUsersGroupsOptions.authInstanceId;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a GetUsersGroupsOptions.
     *
     * @return the new GetUsersGroupsOptions instance
     */
    public GetUsersGroupsOptions build() {
      return new GetUsersGroupsOptions(this);
    }

    /**
     * Set the cookie.
     *
     * @param cookie the cookie
     * @return the GetUsersGroupsOptions builder
     */
    public Builder cookie(String cookie) {
      this.cookie = cookie;
      return this;
    }

    /**
     * Set the authInstanceId.
     *
     * @param authInstanceId the authInstanceId
     * @return the GetUsersGroupsOptions builder
     */
    public Builder authInstanceId(String authInstanceId) {
      this.authInstanceId = authInstanceId;
      return this;
    }
  }

  protected GetUsersGroupsOptions() { }

  protected GetUsersGroupsOptions(Builder builder) {
    cookie = builder.cookie;
    authInstanceId = builder.authInstanceId;
  }

  /**
   * New builder.
   *
   * @return a GetUsersGroupsOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the cookie.
   *
   * IBM Lakehouse console cookie.
   *
   * @return the cookie
   */
  public String cookie() {
    return cookie;
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

