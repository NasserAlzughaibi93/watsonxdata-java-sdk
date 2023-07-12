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

import java.util.ArrayList;
import java.util.List;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The updateEngine options.
 */
public class UpdateEngineOptions extends GenericModel {

  protected String engineId;
  protected String accept;
  protected NodeDescription coordinator;
  protected String description;
  protected String engineDisplayName;
  protected List<String> tags;
  protected NodeDescription worker;
  protected String authInstanceId;

  /**
   * Builder.
   */
  public static class Builder {
    private String engineId;
    private String accept;
    private NodeDescription coordinator;
    private String description;
    private String engineDisplayName;
    private List<String> tags;
    private NodeDescription worker;
    private String authInstanceId;

    /**
     * Instantiates a new Builder from an existing UpdateEngineOptions instance.
     *
     * @param updateEngineOptions the instance to initialize the Builder with
     */
    private Builder(UpdateEngineOptions updateEngineOptions) {
      this.engineId = updateEngineOptions.engineId;
      this.accept = updateEngineOptions.accept;
      this.coordinator = updateEngineOptions.coordinator;
      this.description = updateEngineOptions.description;
      this.engineDisplayName = updateEngineOptions.engineDisplayName;
      this.tags = updateEngineOptions.tags;
      this.worker = updateEngineOptions.worker;
      this.authInstanceId = updateEngineOptions.authInstanceId;
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
     * Builds a UpdateEngineOptions.
     *
     * @return the new UpdateEngineOptions instance
     */
    public UpdateEngineOptions build() {
      return new UpdateEngineOptions(this);
    }

    /**
     * Adds an tags to tags.
     *
     * @param tags the new tags
     * @return the UpdateEngineOptions builder
     */
    public Builder addTags(String tags) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(tags,
        "tags cannot be null");
      if (this.tags == null) {
        this.tags = new ArrayList<String>();
      }
      this.tags.add(tags);
      return this;
    }

    /**
     * Set the engineId.
     *
     * @param engineId the engineId
     * @return the UpdateEngineOptions builder
     */
    public Builder engineId(String engineId) {
      this.engineId = engineId;
      return this;
    }

    /**
     * Set the accept.
     *
     * @param accept the accept
     * @return the UpdateEngineOptions builder
     */
    public Builder accept(String accept) {
      this.accept = accept;
      return this;
    }

    /**
     * Set the coordinator.
     *
     * @param coordinator the coordinator
     * @return the UpdateEngineOptions builder
     */
    public Builder coordinator(NodeDescription coordinator) {
      this.coordinator = coordinator;
      return this;
    }

    /**
     * Set the description.
     *
     * @param description the description
     * @return the UpdateEngineOptions builder
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    /**
     * Set the engineDisplayName.
     *
     * @param engineDisplayName the engineDisplayName
     * @return the UpdateEngineOptions builder
     */
    public Builder engineDisplayName(String engineDisplayName) {
      this.engineDisplayName = engineDisplayName;
      return this;
    }

    /**
     * Set the tags.
     * Existing tags will be replaced.
     *
     * @param tags the tags
     * @return the UpdateEngineOptions builder
     */
    public Builder tags(List<String> tags) {
      this.tags = tags;
      return this;
    }

    /**
     * Set the worker.
     *
     * @param worker the worker
     * @return the UpdateEngineOptions builder
     */
    public Builder worker(NodeDescription worker) {
      this.worker = worker;
      return this;
    }

    /**
     * Set the authInstanceId.
     *
     * @param authInstanceId the authInstanceId
     * @return the UpdateEngineOptions builder
     */
    public Builder authInstanceId(String authInstanceId) {
      this.authInstanceId = authInstanceId;
      return this;
    }
  }

  protected UpdateEngineOptions() { }

  protected UpdateEngineOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.engineId,
      "engineId cannot be null");
    engineId = builder.engineId;
    accept = builder.accept;
    coordinator = builder.coordinator;
    description = builder.description;
    engineDisplayName = builder.engineDisplayName;
    tags = builder.tags;
    worker = builder.worker;
    authInstanceId = builder.authInstanceId;
  }

  /**
   * New builder.
   *
   * @return a UpdateEngineOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
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
   * Gets the description.
   *
   * Modified description.
   *
   * @return the description
   */
  public String description() {
    return description;
  }

  /**
   * Gets the engineDisplayName.
   *
   * Engine display name.
   *
   * @return the engineDisplayName
   */
  public String engineDisplayName() {
    return engineDisplayName;
  }

  /**
   * Gets the tags.
   *
   * Tags.
   *
   * @return the tags
   */
  public List<String> tags() {
    return tags;
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
   * Instance ID.
   *
   * @return the authInstanceId
   */
  public String authInstanceId() {
    return authInstanceId;
  }
}

