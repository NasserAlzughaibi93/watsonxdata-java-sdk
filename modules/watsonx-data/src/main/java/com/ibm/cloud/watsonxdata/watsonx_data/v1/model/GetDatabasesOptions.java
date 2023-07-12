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
 * The getDatabases options.
 */
public class GetDatabasesOptions extends GenericModel {

  protected String accept;
  protected String authInstanceId;

  /**
   * Builder.
   */
  public static class Builder {
    private String accept;
    private String authInstanceId;

    /**
     * Instantiates a new Builder from an existing GetDatabasesOptions instance.
     *
     * @param getDatabasesOptions the instance to initialize the Builder with
     */
    private Builder(GetDatabasesOptions getDatabasesOptions) {
      this.accept = getDatabasesOptions.accept;
      this.authInstanceId = getDatabasesOptions.authInstanceId;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a GetDatabasesOptions.
     *
     * @return the new GetDatabasesOptions instance
     */
    public GetDatabasesOptions build() {
      return new GetDatabasesOptions(this);
    }

    /**
     * Set the accept.
     *
     * @param accept the accept
     * @return the GetDatabasesOptions builder
     */
    public Builder accept(String accept) {
      this.accept = accept;
      return this;
    }

    /**
     * Set the authInstanceId.
     *
     * @param authInstanceId the authInstanceId
     * @return the GetDatabasesOptions builder
     */
    public Builder authInstanceId(String authInstanceId) {
      this.authInstanceId = authInstanceId;
      return this;
    }
  }

  protected GetDatabasesOptions() { }

  protected GetDatabasesOptions(Builder builder) {
    accept = builder.accept;
    authInstanceId = builder.authInstanceId;
  }

  /**
   * New builder.
   *
   * @return a GetDatabasesOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the accept.
   *
   * The type of the response:  or *_/_*.
   *
   * @return the accept
   */
  public String accept() {
    return accept;
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

