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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The createSparkEngineScale options.
 */
public class CreateSparkEngineScaleOptions extends GenericModel {

  protected String engineId;
  protected Long numberOfNodes;
  protected String authInstanceId;

  /**
   * Builder.
   */
  public static class Builder {
    private String engineId;
    private Long numberOfNodes;
    private String authInstanceId;

    /**
     * Instantiates a new Builder from an existing CreateSparkEngineScaleOptions instance.
     *
     * @param createSparkEngineScaleOptions the instance to initialize the Builder with
     */
    private Builder(CreateSparkEngineScaleOptions createSparkEngineScaleOptions) {
      this.engineId = createSparkEngineScaleOptions.engineId;
      this.numberOfNodes = createSparkEngineScaleOptions.numberOfNodes;
      this.authInstanceId = createSparkEngineScaleOptions.authInstanceId;
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
     * Builds a CreateSparkEngineScaleOptions.
     *
     * @return the new CreateSparkEngineScaleOptions instance
     */
    public CreateSparkEngineScaleOptions build() {
      return new CreateSparkEngineScaleOptions(this);
    }

    /**
     * Set the engineId.
     *
     * @param engineId the engineId
     * @return the CreateSparkEngineScaleOptions builder
     */
    public Builder engineId(String engineId) {
      this.engineId = engineId;
      return this;
    }

    /**
     * Set the numberOfNodes.
     *
     * @param numberOfNodes the numberOfNodes
     * @return the CreateSparkEngineScaleOptions builder
     */
    public Builder numberOfNodes(long numberOfNodes) {
      this.numberOfNodes = numberOfNodes;
      return this;
    }

    /**
     * Set the authInstanceId.
     *
     * @param authInstanceId the authInstanceId
     * @return the CreateSparkEngineScaleOptions builder
     */
    public Builder authInstanceId(String authInstanceId) {
      this.authInstanceId = authInstanceId;
      return this;
    }
  }

  protected CreateSparkEngineScaleOptions() { }

  protected CreateSparkEngineScaleOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.engineId,
      "engineId cannot be empty");
    engineId = builder.engineId;
    numberOfNodes = builder.numberOfNodes;
    authInstanceId = builder.authInstanceId;
  }

  /**
   * New builder.
   *
   * @return a CreateSparkEngineScaleOptions builder
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
   * Gets the numberOfNodes.
   *
   * Node count.
   *
   * @return the numberOfNodes
   */
  public Long numberOfNodes() {
    return numberOfNodes;
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
