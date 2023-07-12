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
 * The deleteQuery options.
 */
public class DeleteQueryOptions extends GenericModel {

  protected String queryName;
  protected String authInstanceId;

  /**
   * Builder.
   */
  public static class Builder {
    private String queryName;
    private String authInstanceId;

    /**
     * Instantiates a new Builder from an existing DeleteQueryOptions instance.
     *
     * @param deleteQueryOptions the instance to initialize the Builder with
     */
    private Builder(DeleteQueryOptions deleteQueryOptions) {
      this.queryName = deleteQueryOptions.queryName;
      this.authInstanceId = deleteQueryOptions.authInstanceId;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param queryName the queryName
     */
    public Builder(String queryName) {
      this.queryName = queryName;
    }

    /**
     * Builds a DeleteQueryOptions.
     *
     * @return the new DeleteQueryOptions instance
     */
    public DeleteQueryOptions build() {
      return new DeleteQueryOptions(this);
    }

    /**
     * Set the queryName.
     *
     * @param queryName the queryName
     * @return the DeleteQueryOptions builder
     */
    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }

    /**
     * Set the authInstanceId.
     *
     * @param authInstanceId the authInstanceId
     * @return the DeleteQueryOptions builder
     */
    public Builder authInstanceId(String authInstanceId) {
      this.authInstanceId = authInstanceId;
      return this;
    }
  }

  protected DeleteQueryOptions() { }

  protected DeleteQueryOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.queryName,
      "queryName cannot be empty");
    queryName = builder.queryName;
    authInstanceId = builder.authInstanceId;
  }

  /**
   * New builder.
   *
   * @return a DeleteQueryOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the queryName.
   *
   * Query name.
   *
   * @return the queryName
   */
  public String queryName() {
    return queryName;
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

