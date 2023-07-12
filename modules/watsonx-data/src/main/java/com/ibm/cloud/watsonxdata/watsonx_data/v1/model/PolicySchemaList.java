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

import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * AMS schema List.
 */
public class PolicySchemaList extends GenericModel {

  @SerializedName("catalog_policies")
  protected List<GetCatalogUsersSchema> catalogPolicies;
  @SerializedName("data_policies")
  protected List<PolicySchema> dataPolicies;
  @SerializedName("engine_policies")
  protected List<GetEngineUsersSchema> enginePolicies;

  protected PolicySchemaList() { }

  /**
   * Gets the catalogPolicies.
   *
   * catalog policies definition.
   *
   * @return the catalogPolicies
   */
  public List<GetCatalogUsersSchema> getCatalogPolicies() {
    return catalogPolicies;
  }

  /**
   * Gets the dataPolicies.
   *
   * data policies definition.
   *
   * @return the dataPolicies
   */
  public List<PolicySchema> getDataPolicies() {
    return dataPolicies;
  }

  /**
   * Gets the enginePolicies.
   *
   * engine policies definition.
   *
   * @return the enginePolicies
   */
  public List<GetEngineUsersSchema> getEnginePolicies() {
    return enginePolicies;
  }
}

