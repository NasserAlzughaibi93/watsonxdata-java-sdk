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
 * AMS policy version result.
 */
public class PolicyVersionResultSchema extends GenericModel {

  @SerializedName("catalog_policies")
  protected List<CatalogPolicies> catalogPolicies;
  @SerializedName("data_policies")
  protected List<DataPolicies> dataPolicies;
  @SerializedName("database_policies")
  protected List<DbConnPolicies> databasePolicies;
  @SerializedName("engine_policies")
  protected List<EnginePolicies> enginePolicies;
  @SerializedName("bucket_policies")
  protected List<BucketPolicies> bucketPolicies;

  protected PolicyVersionResultSchema() { }

  /**
   * Gets the catalogPolicies.
   *
   * The catalog policy version list.
   *
   * @return the catalogPolicies
   */
  public List<CatalogPolicies> getCatalogPolicies() {
    return catalogPolicies;
  }

  /**
   * Gets the dataPolicies.
   *
   * The data policy version list.
   *
   * @return the dataPolicies
   */
  public List<DataPolicies> getDataPolicies() {
    return dataPolicies;
  }

  /**
   * Gets the databasePolicies.
   *
   * The Db connection policy version list.
   *
   * @return the databasePolicies
   */
  public List<DbConnPolicies> getDatabasePolicies() {
    return databasePolicies;
  }

  /**
   * Gets the enginePolicies.
   *
   * The engine policy version list.
   *
   * @return the enginePolicies
   */
  public List<EnginePolicies> getEnginePolicies() {
    return enginePolicies;
  }

  /**
   * Gets the bucketPolicies.
   *
   * The bucket policy version list.
   *
   * @return the bucketPolicies
   */
  public List<BucketPolicies> getBucketPolicies() {
    return bucketPolicies;
  }
}

