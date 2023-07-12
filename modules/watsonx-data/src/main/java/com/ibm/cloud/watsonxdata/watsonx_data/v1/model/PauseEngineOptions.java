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
 * The pauseEngine options.
 */
public class PauseEngineOptions extends GenericModel {

  protected String engineId;
  protected String createdBy;
  protected String authInstanceId;

  /**
   * Builder.
   */
  public static class Builder {
    private String engineId;
    private String createdBy;
    private String authInstanceId;

    /**
     * Instantiates a new Builder from an existing PauseEngineOptions instance.
     *
     * @param pauseEngineOptions the instance to initialize the Builder with
     */
    private Builder(PauseEngineOptions pauseEngineOptions) {
      this.engineId = pauseEngineOptions.engineId;
      this.createdBy = pauseEngineOptions.createdBy;
      this.authInstanceId = pauseEngineOptions.authInstanceId;
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
     * Builds a PauseEngineOptions.
     *
     * @return the new PauseEngineOptions instance
     */
    public PauseEngineOptions build() {
      return new PauseEngineOptions(this);
    }

    /**
     * Set the engineId.
     *
     * @param engineId the engineId
     * @return the PauseEngineOptions builder
     */
    public Builder engineId(String engineId) {
      this.engineId = engineId;
      return this;
    }

    /**
     * Set the createdBy.
     *
     * @param createdBy the createdBy
     * @return the PauseEngineOptions builder
     */
    public Builder createdBy(String createdBy) {
      this.createdBy = createdBy;
      return this;
    }

    /**
     * Set the authInstanceId.
     *
     * @param authInstanceId the authInstanceId
     * @return the PauseEngineOptions builder
     */
    public Builder authInstanceId(String authInstanceId) {
      this.authInstanceId = authInstanceId;
      return this;
    }
  }

  protected PauseEngineOptions() { }

  protected PauseEngineOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.engineId,
      "engineId cannot be null");
    engineId = builder.engineId;
    createdBy = builder.createdBy;
    authInstanceId = builder.authInstanceId;
  }

  /**
   * New builder.
   *
   * @return a PauseEngineOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the engineId.
   *
   * Engine ID to be paused.
   *
   * @return the engineId
   */
  public String engineId() {
    return engineId;
  }

  /**
   * Gets the createdBy.
   *
   * Created by - Logged in username.
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

