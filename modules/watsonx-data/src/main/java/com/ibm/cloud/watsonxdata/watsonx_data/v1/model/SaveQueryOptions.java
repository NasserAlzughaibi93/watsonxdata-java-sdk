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
 * The saveQuery options.
 */
public class SaveQueryOptions extends GenericModel {

  protected String queryName;
  protected String createdBy;
  protected String description;
  protected String queryString;
  protected String createdOn;
  protected String engineId;
  protected String authInstanceId;

  /**
   * Builder.
   */
  public static class Builder {
    private String queryName;
    private String createdBy;
    private String description;
    private String queryString;
    private String createdOn;
    private String engineId;
    private String authInstanceId;

    /**
     * Instantiates a new Builder from an existing SaveQueryOptions instance.
     *
     * @param saveQueryOptions the instance to initialize the Builder with
     */
    private Builder(SaveQueryOptions saveQueryOptions) {
      this.queryName = saveQueryOptions.queryName;
      this.createdBy = saveQueryOptions.createdBy;
      this.description = saveQueryOptions.description;
      this.queryString = saveQueryOptions.queryString;
      this.createdOn = saveQueryOptions.createdOn;
      this.engineId = saveQueryOptions.engineId;
      this.authInstanceId = saveQueryOptions.authInstanceId;
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
     * @param createdBy the createdBy
     * @param description the description
     * @param queryString the queryString
     */
    public Builder(String queryName, String createdBy, String description, String queryString) {
      this.queryName = queryName;
      this.createdBy = createdBy;
      this.description = description;
      this.queryString = queryString;
    }

    /**
     * Builds a SaveQueryOptions.
     *
     * @return the new SaveQueryOptions instance
     */
    public SaveQueryOptions build() {
      return new SaveQueryOptions(this);
    }

    /**
     * Set the queryName.
     *
     * @param queryName the queryName
     * @return the SaveQueryOptions builder
     */
    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }

    /**
     * Set the createdBy.
     *
     * @param createdBy the createdBy
     * @return the SaveQueryOptions builder
     */
    public Builder createdBy(String createdBy) {
      this.createdBy = createdBy;
      return this;
    }

    /**
     * Set the description.
     *
     * @param description the description
     * @return the SaveQueryOptions builder
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    /**
     * Set the queryString.
     *
     * @param queryString the queryString
     * @return the SaveQueryOptions builder
     */
    public Builder queryString(String queryString) {
      this.queryString = queryString;
      return this;
    }

    /**
     * Set the createdOn.
     *
     * @param createdOn the createdOn
     * @return the SaveQueryOptions builder
     */
    public Builder createdOn(String createdOn) {
      this.createdOn = createdOn;
      return this;
    }

    /**
     * Set the engineId.
     *
     * @param engineId the engineId
     * @return the SaveQueryOptions builder
     */
    public Builder engineId(String engineId) {
      this.engineId = engineId;
      return this;
    }

    /**
     * Set the authInstanceId.
     *
     * @param authInstanceId the authInstanceId
     * @return the SaveQueryOptions builder
     */
    public Builder authInstanceId(String authInstanceId) {
      this.authInstanceId = authInstanceId;
      return this;
    }
  }

  protected SaveQueryOptions() { }

  protected SaveQueryOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.queryName,
      "queryName cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.createdBy,
      "createdBy cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.description,
      "description cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.queryString,
      "queryString cannot be null");
    queryName = builder.queryName;
    createdBy = builder.createdBy;
    description = builder.description;
    queryString = builder.queryString;
    createdOn = builder.createdOn;
    engineId = builder.engineId;
    authInstanceId = builder.authInstanceId;
  }

  /**
   * New builder.
   *
   * @return a SaveQueryOptions builder
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
   * Gets the createdBy.
   *
   * Created by.
   *
   * @return the createdBy
   */
  public String createdBy() {
    return createdBy;
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
   * Gets the createdOn.
   *
   * Created on.
   *
   * @return the createdOn
   */
  public String createdOn() {
    return createdOn;
  }

  /**
   * Gets the engineId.
   *
   * Engine ID.
   *
   * @return the engineId
   */
  public String engineId() {
    return engineId;
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

