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
 * RemoveEngine properties.
 */
public class PrestoEnginePatchRemoveEngineProperties extends GenericModel {

  protected RemoveEnginePropertiesOaiGenConfiguration configuration;
  protected RemoveEnginePropertiesOaiGenJvm jvm;
  protected PrestoEnginePropertiesCatalog catalog;

  /**
   * Builder.
   */
  public static class Builder {
    private RemoveEnginePropertiesOaiGenConfiguration configuration;
    private RemoveEnginePropertiesOaiGenJvm jvm;
    private PrestoEnginePropertiesCatalog catalog;

    /**
     * Instantiates a new Builder from an existing PrestoEnginePatchRemoveEngineProperties instance.
     *
     * @param prestoEnginePatchRemoveEngineProperties the instance to initialize the Builder with
     */
    private Builder(PrestoEnginePatchRemoveEngineProperties prestoEnginePatchRemoveEngineProperties) {
      this.configuration = prestoEnginePatchRemoveEngineProperties.configuration;
      this.jvm = prestoEnginePatchRemoveEngineProperties.jvm;
      this.catalog = prestoEnginePatchRemoveEngineProperties.catalog;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a PrestoEnginePatchRemoveEngineProperties.
     *
     * @return the new PrestoEnginePatchRemoveEngineProperties instance
     */
    public PrestoEnginePatchRemoveEngineProperties build() {
      return new PrestoEnginePatchRemoveEngineProperties(this);
    }

    /**
     * Set the configuration.
     *
     * @param configuration the configuration
     * @return the PrestoEnginePatchRemoveEngineProperties builder
     */
    public Builder configuration(RemoveEnginePropertiesOaiGenConfiguration configuration) {
      this.configuration = configuration;
      return this;
    }

    /**
     * Set the jvm.
     *
     * @param jvm the jvm
     * @return the PrestoEnginePatchRemoveEngineProperties builder
     */
    public Builder jvm(RemoveEnginePropertiesOaiGenJvm jvm) {
      this.jvm = jvm;
      return this;
    }

    /**
     * Set the catalog.
     *
     * @param catalog the catalog
     * @return the PrestoEnginePatchRemoveEngineProperties builder
     */
    public Builder catalog(PrestoEnginePropertiesCatalog catalog) {
      this.catalog = catalog;
      return this;
    }
  }

  protected PrestoEnginePatchRemoveEngineProperties() { }

  protected PrestoEnginePatchRemoveEngineProperties(Builder builder) {
    configuration = builder.configuration;
    jvm = builder.jvm;
    catalog = builder.catalog;
  }

  /**
   * New builder.
   *
   * @return a PrestoEnginePatchRemoveEngineProperties builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the configuration.
   *
   * Configuration settings for removing engine properties.
   *
   * @return the configuration
   */
  public RemoveEnginePropertiesOaiGenConfiguration configuration() {
    return configuration;
  }

  /**
   * Gets the jvm.
   *
   * JVM properties.
   *
   * @return the jvm
   */
  public RemoveEnginePropertiesOaiGenJvm jvm() {
    return jvm;
  }

  /**
   * Gets the catalog.
   *
   * Catalog configuration settings.
   *
   * @return the catalog
   */
  public PrestoEnginePropertiesCatalog catalog() {
    return catalog;
  }
}

