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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Node details.
 */
public class EngineDetailsBody extends GenericModel {

  /**
   * Size config.
   */
  public interface SizeConfig {
    /** starter. */
    String STARTER = "starter";
    /** storage_optimized. */
    String STORAGE_OPTIMIZED = "storage_optimized";
    /** compute_optimized. */
    String COMPUTE_OPTIMIZED = "compute_optimized";
    /** small. */
    String SMALL = "small";
    /** medium. */
    String MEDIUM = "medium";
    /** large. */
    String LARGE = "large";
    /** custom. */
    String CUSTOM = "custom";
  }

  protected NodeDescriptionBody worker;
  protected NodeDescriptionBody coordinator;
  @SerializedName("size_config")
  protected String sizeConfig;

  /**
   * Builder.
   */
  public static class Builder {
    private NodeDescriptionBody worker;
    private NodeDescriptionBody coordinator;
    private String sizeConfig;

    /**
     * Instantiates a new Builder from an existing EngineDetailsBody instance.
     *
     * @param engineDetailsBody the instance to initialize the Builder with
     */
    private Builder(EngineDetailsBody engineDetailsBody) {
      this.worker = engineDetailsBody.worker;
      this.coordinator = engineDetailsBody.coordinator;
      this.sizeConfig = engineDetailsBody.sizeConfig;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a EngineDetailsBody.
     *
     * @return the new EngineDetailsBody instance
     */
    public EngineDetailsBody build() {
      return new EngineDetailsBody(this);
    }

    /**
     * Set the worker.
     *
     * @param worker the worker
     * @return the EngineDetailsBody builder
     */
    public Builder worker(NodeDescriptionBody worker) {
      this.worker = worker;
      return this;
    }

    /**
     * Set the coordinator.
     *
     * @param coordinator the coordinator
     * @return the EngineDetailsBody builder
     */
    public Builder coordinator(NodeDescriptionBody coordinator) {
      this.coordinator = coordinator;
      return this;
    }

    /**
     * Set the sizeConfig.
     *
     * @param sizeConfig the sizeConfig
     * @return the EngineDetailsBody builder
     */
    public Builder sizeConfig(String sizeConfig) {
      this.sizeConfig = sizeConfig;
      return this;
    }
  }

  protected EngineDetailsBody() { }

  protected EngineDetailsBody(Builder builder) {
    worker = builder.worker;
    coordinator = builder.coordinator;
    sizeConfig = builder.sizeConfig;
  }

  /**
   * New builder.
   *
   * @return a EngineDetailsBody builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the worker.
   *
   * Node details.
   *
   * @return the worker
   */
  public NodeDescriptionBody worker() {
    return worker;
  }

  /**
   * Gets the coordinator.
   *
   * Node details.
   *
   * @return the coordinator
   */
  public NodeDescriptionBody coordinator() {
    return coordinator;
  }

  /**
   * Gets the sizeConfig.
   *
   * Size config.
   *
   * @return the sizeConfig
   */
  public String sizeConfig() {
    return sizeConfig;
  }
}

