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
 * The evaluate options.
 */
public class EvaluateOptions extends GenericModel {

  protected List<ResourcesMetadata> resources;
  protected String lhInstanceId;
  protected String authInstanceId;

  /**
   * Builder.
   */
  public static class Builder {
    private List<ResourcesMetadata> resources;
    private String lhInstanceId;
    private String authInstanceId;

    /**
     * Instantiates a new Builder from an existing EvaluateOptions instance.
     *
     * @param evaluateOptions the instance to initialize the Builder with
     */
    private Builder(EvaluateOptions evaluateOptions) {
      this.resources = evaluateOptions.resources;
      this.lhInstanceId = evaluateOptions.lhInstanceId;
      this.authInstanceId = evaluateOptions.authInstanceId;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a EvaluateOptions.
     *
     * @return the new EvaluateOptions instance
     */
    public EvaluateOptions build() {
      return new EvaluateOptions(this);
    }

    /**
     * Adds an resources to resources.
     *
     * @param resources the new resources
     * @return the EvaluateOptions builder
     */
    public Builder addResources(ResourcesMetadata resources) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(resources,
        "resources cannot be null");
      if (this.resources == null) {
        this.resources = new ArrayList<ResourcesMetadata>();
      }
      this.resources.add(resources);
      return this;
    }

    /**
     * Set the resources.
     * Existing resources will be replaced.
     *
     * @param resources the resources
     * @return the EvaluateOptions builder
     */
    public Builder resources(List<ResourcesMetadata> resources) {
      this.resources = resources;
      return this;
    }

    /**
     * Set the lhInstanceId.
     *
     * @param lhInstanceId the lhInstanceId
     * @return the EvaluateOptions builder
     */
    public Builder lhInstanceId(String lhInstanceId) {
      this.lhInstanceId = lhInstanceId;
      return this;
    }

    /**
     * Set the authInstanceId.
     *
     * @param authInstanceId the authInstanceId
     * @return the EvaluateOptions builder
     */
    public Builder authInstanceId(String authInstanceId) {
      this.authInstanceId = authInstanceId;
      return this;
    }
  }

  protected EvaluateOptions() { }

  protected EvaluateOptions(Builder builder) {
    resources = builder.resources;
    lhInstanceId = builder.lhInstanceId;
    authInstanceId = builder.authInstanceId;
  }

  /**
   * New builder.
   *
   * @return a EvaluateOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the resources.
   *
   * resource list.
   *
   * @return the resources
   */
  public List<ResourcesMetadata> resources() {
    return resources;
  }

  /**
   * Gets the lhInstanceId.
   *
   * Lake House Instance ID.
   *
   * @return the lhInstanceId
   */
  public String lhInstanceId() {
    return lhInstanceId;
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

