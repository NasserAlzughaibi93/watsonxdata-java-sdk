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
 * The getSalIntegrationEnrichmentGlobalSettings options.
 */
public class GetSalIntegrationEnrichmentGlobalSettingsOptions extends GenericModel {

  protected String authInstanceId;

  /**
   * Builder.
   */
  public static class Builder {
    private String authInstanceId;

    /**
     * Instantiates a new Builder from an existing GetSalIntegrationEnrichmentGlobalSettingsOptions instance.
     *
     * @param getSalIntegrationEnrichmentGlobalSettingsOptions the instance to initialize the Builder with
     */
    private Builder(GetSalIntegrationEnrichmentGlobalSettingsOptions getSalIntegrationEnrichmentGlobalSettingsOptions) {
      this.authInstanceId = getSalIntegrationEnrichmentGlobalSettingsOptions.authInstanceId;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a GetSalIntegrationEnrichmentGlobalSettingsOptions.
     *
     * @return the new GetSalIntegrationEnrichmentGlobalSettingsOptions instance
     */
    public GetSalIntegrationEnrichmentGlobalSettingsOptions build() {
      return new GetSalIntegrationEnrichmentGlobalSettingsOptions(this);
    }

    /**
     * Set the authInstanceId.
     *
     * @param authInstanceId the authInstanceId
     * @return the GetSalIntegrationEnrichmentGlobalSettingsOptions builder
     */
    public Builder authInstanceId(String authInstanceId) {
      this.authInstanceId = authInstanceId;
      return this;
    }
  }

  protected GetSalIntegrationEnrichmentGlobalSettingsOptions() { }

  protected GetSalIntegrationEnrichmentGlobalSettingsOptions(Builder builder) {
    authInstanceId = builder.authInstanceId;
  }

  /**
   * New builder.
   *
   * @return a GetSalIntegrationEnrichmentGlobalSettingsOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the authInstanceId.
   *
   * watsonx.data instance ID.
   *
   * @return the authInstanceId
   */
  public String authInstanceId() {
    return authInstanceId;
  }
}

