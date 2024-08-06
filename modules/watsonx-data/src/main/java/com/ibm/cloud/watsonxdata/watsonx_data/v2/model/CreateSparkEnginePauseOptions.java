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
 * The createSparkEnginePause options.
 */
public class CreateSparkEnginePauseOptions extends GenericModel {

  protected String engineId;
  protected String authInstanceId;

  /**
   * Builder.
   */
  public static class Builder {
    private String engineId;
    private String authInstanceId;

    /**
     * Instantiates a new Builder from an existing CreateSparkEnginePauseOptions instance.
     *
     * @param createSparkEnginePauseOptions the instance to initialize the Builder with
     */
    private Builder(CreateSparkEnginePauseOptions createSparkEnginePauseOptions) {
      this.engineId = createSparkEnginePauseOptions.engineId;
      this.authInstanceId = createSparkEnginePauseOptions.authInstanceId;
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
     * Builds a CreateSparkEnginePauseOptions.
     *
     * @return the new CreateSparkEnginePauseOptions instance
     */
    public CreateSparkEnginePauseOptions build() {
      return new CreateSparkEnginePauseOptions(this);
    }

    /**
     * Set the engineId.
     *
     * @param engineId the engineId
     * @return the CreateSparkEnginePauseOptions builder
     */
    public Builder engineId(String engineId) {
      this.engineId = engineId;
      return this;
    }

    /**
     * Set the authInstanceId.
     *
     * @param authInstanceId the authInstanceId
     * @return the CreateSparkEnginePauseOptions builder
     */
    public Builder authInstanceId(String authInstanceId) {
      this.authInstanceId = authInstanceId;
      return this;
    }
  }

  protected CreateSparkEnginePauseOptions() { }

  protected CreateSparkEnginePauseOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.engineId,
      "engineId cannot be empty");
    engineId = builder.engineId;
    authInstanceId = builder.authInstanceId;
  }

  /**
   * New builder.
   *
   * @return a CreateSparkEnginePauseOptions builder
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

