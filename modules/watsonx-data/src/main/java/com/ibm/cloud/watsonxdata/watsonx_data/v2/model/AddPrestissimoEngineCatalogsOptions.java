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
 * The addPrestissimoEngineCatalogs options.
 */
public class AddPrestissimoEngineCatalogsOptions extends GenericModel {

  protected String engineId;
  protected String catalogNames;
  protected String authInstanceId;

  /**
   * Builder.
   */
  public static class Builder {
    private String engineId;
    private String catalogNames;
    private String authInstanceId;

    /**
     * Instantiates a new Builder from an existing AddPrestissimoEngineCatalogsOptions instance.
     *
     * @param addPrestissimoEngineCatalogsOptions the instance to initialize the Builder with
     */
    private Builder(AddPrestissimoEngineCatalogsOptions addPrestissimoEngineCatalogsOptions) {
      this.engineId = addPrestissimoEngineCatalogsOptions.engineId;
      this.catalogNames = addPrestissimoEngineCatalogsOptions.catalogNames;
      this.authInstanceId = addPrestissimoEngineCatalogsOptions.authInstanceId;
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
     * Builds a AddPrestissimoEngineCatalogsOptions.
     *
     * @return the new AddPrestissimoEngineCatalogsOptions instance
     */
    public AddPrestissimoEngineCatalogsOptions build() {
      return new AddPrestissimoEngineCatalogsOptions(this);
    }

    /**
     * Set the engineId.
     *
     * @param engineId the engineId
     * @return the AddPrestissimoEngineCatalogsOptions builder
     */
    public Builder engineId(String engineId) {
      this.engineId = engineId;
      return this;
    }

    /**
     * Set the catalogNames.
     *
     * @param catalogNames the catalogNames
     * @return the AddPrestissimoEngineCatalogsOptions builder
     */
    public Builder catalogNames(String catalogNames) {
      this.catalogNames = catalogNames;
      return this;
    }

    /**
     * Set the authInstanceId.
     *
     * @param authInstanceId the authInstanceId
     * @return the AddPrestissimoEngineCatalogsOptions builder
     */
    public Builder authInstanceId(String authInstanceId) {
      this.authInstanceId = authInstanceId;
      return this;
    }
  }

  protected AddPrestissimoEngineCatalogsOptions() { }

  protected AddPrestissimoEngineCatalogsOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.engineId,
      "engineId cannot be empty");
    engineId = builder.engineId;
    catalogNames = builder.catalogNames;
    authInstanceId = builder.authInstanceId;
  }

  /**
   * New builder.
   *
   * @return a AddPrestissimoEngineCatalogsOptions builder
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
   * Gets the catalogNames.
   *
   * catalog names.
   *
   * @return the catalogNames
   */
  public String catalogNames() {
    return catalogNames;
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

