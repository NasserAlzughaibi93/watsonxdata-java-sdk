/*
 * (C) Copyright IBM Corp. 2024.
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

package com.ibm.cloud.watsonxdata.watsonx_data.v2.model;

import java.util.Map;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The updateSparkEngine options.
 */
public class UpdateSparkEngineOptions extends GenericModel {

  protected String engineId;
  protected Map<String, Object> body;
  protected String authInstanceId;

  /**
   * Builder.
   */
  public static class Builder {
    private String engineId;
    private Map<String, Object> body;
    private String authInstanceId;

    /**
     * Instantiates a new Builder from an existing UpdateSparkEngineOptions instance.
     *
     * @param updateSparkEngineOptions the instance to initialize the Builder with
     */
    private Builder(UpdateSparkEngineOptions updateSparkEngineOptions) {
      this.engineId = updateSparkEngineOptions.engineId;
      this.body = updateSparkEngineOptions.body;
      this.authInstanceId = updateSparkEngineOptions.authInstanceId;
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
     * @param body the body
     */
    public Builder(String engineId, Map<String, Object> body) {
      this.engineId = engineId;
      this.body = body;
    }

    /**
     * Builds a UpdateSparkEngineOptions.
     *
     * @return the new UpdateSparkEngineOptions instance
     */
    public UpdateSparkEngineOptions build() {
      return new UpdateSparkEngineOptions(this);
    }

    /**
     * Set the engineId.
     *
     * @param engineId the engineId
     * @return the UpdateSparkEngineOptions builder
     */
    public Builder engineId(String engineId) {
      this.engineId = engineId;
      return this;
    }

    /**
     * Set the body.
     *
     * @param body the body
     * @return the UpdateSparkEngineOptions builder
     */
    public Builder body(Map<String, Object> body) {
      this.body = body;
      return this;
    }

    /**
     * Set the authInstanceId.
     *
     * @param authInstanceId the authInstanceId
     * @return the UpdateSparkEngineOptions builder
     */
    public Builder authInstanceId(String authInstanceId) {
      this.authInstanceId = authInstanceId;
      return this;
    }
  }

  protected UpdateSparkEngineOptions() { }

  protected UpdateSparkEngineOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.engineId,
      "engineId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.body,
      "body cannot be null");
    engineId = builder.engineId;
    body = builder.body;
    authInstanceId = builder.authInstanceId;
  }

  /**
   * New builder.
   *
   * @return a UpdateSparkEngineOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the engineId.
   *
   * engine id.
   *
   * @return the engineId
   */
  public String engineId() {
    return engineId;
  }

  /**
   * Gets the body.
   *
   * Update Engine Body.
   *
   * @return the body
   */
  public Map<String, Object> body() {
    return body;
  }

  /**
   * Gets the authInstanceId.
   *
   * CRN.
   *
   * @return the authInstanceId
   */
  public String authInstanceId() {
    return authInstanceId;
  }
}
