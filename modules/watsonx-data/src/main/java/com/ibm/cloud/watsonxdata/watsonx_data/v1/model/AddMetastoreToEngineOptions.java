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
 * The addMetastoreToEngine options.
 */
public class AddMetastoreToEngineOptions extends GenericModel {

  protected String catalogName;
  protected String engineId;
  protected String accept;
  protected String createdBy;
  protected String authInstanceId;

  /**
   * Builder.
   */
  public static class Builder {
    private String catalogName;
    private String engineId;
    private String accept;
    private String createdBy;
    private String authInstanceId;

    /**
     * Instantiates a new Builder from an existing AddMetastoreToEngineOptions instance.
     *
     * @param addMetastoreToEngineOptions the instance to initialize the Builder with
     */
    private Builder(AddMetastoreToEngineOptions addMetastoreToEngineOptions) {
      this.catalogName = addMetastoreToEngineOptions.catalogName;
      this.engineId = addMetastoreToEngineOptions.engineId;
      this.accept = addMetastoreToEngineOptions.accept;
      this.createdBy = addMetastoreToEngineOptions.createdBy;
      this.authInstanceId = addMetastoreToEngineOptions.authInstanceId;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param catalogName the catalogName
     * @param engineId the engineId
     */
    public Builder(String catalogName, String engineId) {
      this.catalogName = catalogName;
      this.engineId = engineId;
    }

    /**
     * Builds a AddMetastoreToEngineOptions.
     *
     * @return the new AddMetastoreToEngineOptions instance
     */
    public AddMetastoreToEngineOptions build() {
      return new AddMetastoreToEngineOptions(this);
    }

    /**
     * Set the catalogName.
     *
     * @param catalogName the catalogName
     * @return the AddMetastoreToEngineOptions builder
     */
    public Builder catalogName(String catalogName) {
      this.catalogName = catalogName;
      return this;
    }

    /**
     * Set the engineId.
     *
     * @param engineId the engineId
     * @return the AddMetastoreToEngineOptions builder
     */
    public Builder engineId(String engineId) {
      this.engineId = engineId;
      return this;
    }

    /**
     * Set the accept.
     *
     * @param accept the accept
     * @return the AddMetastoreToEngineOptions builder
     */
    public Builder accept(String accept) {
      this.accept = accept;
      return this;
    }

    /**
     * Set the createdBy.
     *
     * @param createdBy the createdBy
     * @return the AddMetastoreToEngineOptions builder
     */
    public Builder createdBy(String createdBy) {
      this.createdBy = createdBy;
      return this;
    }

    /**
     * Set the authInstanceId.
     *
     * @param authInstanceId the authInstanceId
     * @return the AddMetastoreToEngineOptions builder
     */
    public Builder authInstanceId(String authInstanceId) {
      this.authInstanceId = authInstanceId;
      return this;
    }
  }

  protected AddMetastoreToEngineOptions() { }

  protected AddMetastoreToEngineOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.catalogName,
      "catalogName cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.engineId,
      "engineId cannot be null");
    catalogName = builder.catalogName;
    engineId = builder.engineId;
    accept = builder.accept;
    createdBy = builder.createdBy;
    authInstanceId = builder.authInstanceId;
  }

  /**
   * New builder.
   *
   * @return a AddMetastoreToEngineOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the catalogName.
   *
   * Catalog name.
   *
   * @return the catalogName
   */
  public String catalogName() {
    return catalogName;
  }

  /**
   * Gets the engineId.
   *
   * Engine name.
   *
   * @return the engineId
   */
  public String engineId() {
    return engineId;
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

