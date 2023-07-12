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
 * The updateQuery options.
 */
public class UpdateQueryOptions extends GenericModel {

  protected String queryName;
  protected String queryString;
  protected String description;
  protected String newQueryName;
  protected String authInstanceId;

  /**
   * Builder.
   */
  public static class Builder {
    private String queryName;
    private String queryString;
    private String description;
    private String newQueryName;
    private String authInstanceId;

    /**
     * Instantiates a new Builder from an existing UpdateQueryOptions instance.
     *
     * @param updateQueryOptions the instance to initialize the Builder with
     */
    private Builder(UpdateQueryOptions updateQueryOptions) {
      this.queryName = updateQueryOptions.queryName;
      this.queryString = updateQueryOptions.queryString;
      this.description = updateQueryOptions.description;
      this.newQueryName = updateQueryOptions.newQueryName;
      this.authInstanceId = updateQueryOptions.authInstanceId;
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
     * @param queryString the queryString
     * @param description the description
     * @param newQueryName the newQueryName
     */
    public Builder(String queryName, String queryString, String description, String newQueryName) {
      this.queryName = queryName;
      this.queryString = queryString;
      this.description = description;
      this.newQueryName = newQueryName;
    }

    /**
     * Builds a UpdateQueryOptions.
     *
     * @return the new UpdateQueryOptions instance
     */
    public UpdateQueryOptions build() {
      return new UpdateQueryOptions(this);
    }

    /**
     * Set the queryName.
     *
     * @param queryName the queryName
     * @return the UpdateQueryOptions builder
     */
    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }

    /**
     * Set the queryString.
     *
     * @param queryString the queryString
     * @return the UpdateQueryOptions builder
     */
    public Builder queryString(String queryString) {
      this.queryString = queryString;
      return this;
    }

    /**
     * Set the description.
     *
     * @param description the description
     * @return the UpdateQueryOptions builder
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    /**
     * Set the newQueryName.
     *
     * @param newQueryName the newQueryName
     * @return the UpdateQueryOptions builder
     */
    public Builder newQueryName(String newQueryName) {
      this.newQueryName = newQueryName;
      return this;
    }

    /**
     * Set the authInstanceId.
     *
     * @param authInstanceId the authInstanceId
     * @return the UpdateQueryOptions builder
     */
    public Builder authInstanceId(String authInstanceId) {
      this.authInstanceId = authInstanceId;
      return this;
    }
  }

  protected UpdateQueryOptions() { }

  protected UpdateQueryOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.queryName,
      "queryName cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.queryString,
      "queryString cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.description,
      "description cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.newQueryName,
      "newQueryName cannot be null");
    queryName = builder.queryName;
    queryString = builder.queryString;
    description = builder.description;
    newQueryName = builder.newQueryName;
    authInstanceId = builder.authInstanceId;
  }

  /**
   * New builder.
   *
   * @return a UpdateQueryOptions builder
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
   * Gets the queryString.
   *
   * Query string.
   *
   * @return the queryString
   */
  public String queryString() {
    return queryString;
  }

  /**
   * Gets the description.
   *
   * Description.
   *
   * @return the description
   */
  public String description() {
    return description;
  }

  /**
   * Gets the newQueryName.
   *
   * New query name.
   *
   * @return the newQueryName
   */
  public String newQueryName() {
    return newQueryName;
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

