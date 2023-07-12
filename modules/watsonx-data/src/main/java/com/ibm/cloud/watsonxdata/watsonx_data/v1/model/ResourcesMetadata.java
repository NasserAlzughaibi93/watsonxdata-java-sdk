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
 * Resource.
 */
public class ResourcesMetadata extends GenericModel {

  /**
   * Resource type.
   */
  public interface ResourceType {
    /** engine. */
    String ENGINE = "engine";
    /** catalog. */
    String CATALOG = "catalog";
    /** bucket. */
    String BUCKET = "bucket";
    /** database. */
    String DATABASE = "database";
  }

  protected String action;
  @SerializedName("resource_name")
  protected String resourceName;
  @SerializedName("resource_type")
  protected String resourceType;

  /**
   * Builder.
   */
  public static class Builder {
    private String action;
    private String resourceName;
    private String resourceType;

    /**
     * Instantiates a new Builder from an existing ResourcesMetadata instance.
     *
     * @param resourcesMetadata the instance to initialize the Builder with
     */
    private Builder(ResourcesMetadata resourcesMetadata) {
      this.action = resourcesMetadata.action;
      this.resourceName = resourcesMetadata.resourceName;
      this.resourceType = resourcesMetadata.resourceType;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param action the action
     * @param resourceName the resourceName
     * @param resourceType the resourceType
     */
    public Builder(String action, String resourceName, String resourceType) {
      this.action = action;
      this.resourceName = resourceName;
      this.resourceType = resourceType;
    }

    /**
     * Builds a ResourcesMetadata.
     *
     * @return the new ResourcesMetadata instance
     */
    public ResourcesMetadata build() {
      return new ResourcesMetadata(this);
    }

    /**
     * Set the action.
     *
     * @param action the action
     * @return the ResourcesMetadata builder
     */
    public Builder action(String action) {
      this.action = action;
      return this;
    }

    /**
     * Set the resourceName.
     *
     * @param resourceName the resourceName
     * @return the ResourcesMetadata builder
     */
    public Builder resourceName(String resourceName) {
      this.resourceName = resourceName;
      return this;
    }

    /**
     * Set the resourceType.
     *
     * @param resourceType the resourceType
     * @return the ResourcesMetadata builder
     */
    public Builder resourceType(String resourceType) {
      this.resourceType = resourceType;
      return this;
    }
  }

  protected ResourcesMetadata() { }

  protected ResourcesMetadata(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.action,
      "action cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.resourceName,
      "resourceName cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.resourceType,
      "resourceType cannot be null");
    action = builder.action;
    resourceName = builder.resourceName;
    resourceType = builder.resourceType;
  }

  /**
   * New builder.
   *
   * @return a ResourcesMetadata builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the action.
   *
   * resource action to be evaluated.
   *
   * @return the action
   */
  public String action() {
    return action;
  }

  /**
   * Gets the resourceName.
   *
   * Resource name.
   *
   * @return the resourceName
   */
  public String resourceName() {
    return resourceName;
  }

  /**
   * Gets the resourceType.
   *
   * Resource type.
   *
   * @return the resourceType
   */
  public String resourceType() {
    return resourceType;
  }
}

