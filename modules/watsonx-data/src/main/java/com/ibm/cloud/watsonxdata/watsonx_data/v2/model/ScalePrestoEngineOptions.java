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
 * The scalePrestoEngine options.
 */
public class ScalePrestoEngineOptions extends GenericModel {

  protected String engineId;
  protected NodeDescription coordinator;
  protected NodeDescription worker;
  protected String authInstanceId;

  /**
   * Builder.
   */
  public static class Builder {
    private String engineId;
    private NodeDescription coordinator;
    private NodeDescription worker;
    private String authInstanceId;

    /**
     * Instantiates a new Builder from an existing ScalePrestoEngineOptions instance.
     *
     * @param scalePrestoEngineOptions the instance to initialize the Builder with
     */
    private Builder(ScalePrestoEngineOptions scalePrestoEngineOptions) {
      this.engineId = scalePrestoEngineOptions.engineId;
      this.coordinator = scalePrestoEngineOptions.coordinator;
      this.worker = scalePrestoEngineOptions.worker;
      this.authInstanceId = scalePrestoEngineOptions.authInstanceId;
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
     * Builds a ScalePrestoEngineOptions.
     *
     * @return the new ScalePrestoEngineOptions instance
     */
    public ScalePrestoEngineOptions build() {
      return new ScalePrestoEngineOptions(this);
    }

    /**
     * Set the engineId.
     *
     * @param engineId the engineId
     * @return the ScalePrestoEngineOptions builder
     */
    public Builder engineId(String engineId) {
      this.engineId = engineId;
      return this;
    }

    /**
     * Set the coordinator.
     *
     * @param coordinator the coordinator
     * @return the ScalePrestoEngineOptions builder
     */
    public Builder coordinator(NodeDescription coordinator) {
      this.coordinator = coordinator;
      return this;
    }

    /**
     * Set the worker.
     *
     * @param worker the worker
     * @return the ScalePrestoEngineOptions builder
     */
    public Builder worker(NodeDescription worker) {
      this.worker = worker;
      return this;
    }

    /**
     * Set the authInstanceId.
     *
     * @param authInstanceId the authInstanceId
     * @return the ScalePrestoEngineOptions builder
     */
    public Builder authInstanceId(String authInstanceId) {
      this.authInstanceId = authInstanceId;
      return this;
    }
  }

  protected ScalePrestoEngineOptions() { }

  protected ScalePrestoEngineOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.engineId,
      "engineId cannot be empty");
    engineId = builder.engineId;
    coordinator = builder.coordinator;
    worker = builder.worker;
    authInstanceId = builder.authInstanceId;
  }

  /**
   * New builder.
   *
   * @return a ScalePrestoEngineOptions builder
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
   * Gets the coordinator.
   *
   * NodeDescription.
   *
   * @return the coordinator
   */
  public NodeDescription coordinator() {
    return coordinator;
  }

  /**
   * Gets the worker.
   *
   * NodeDescription.
   *
   * @return the worker
   */
  public NodeDescription worker() {
    return worker;
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

