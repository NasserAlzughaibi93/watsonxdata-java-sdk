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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * External engine details.
 */
public class NetezzaEngineDetails extends GenericModel {

  @SerializedName("connection_string")
  protected String connectionString;
  @SerializedName("metastore_host")
  protected String metastoreHost;

  protected NetezzaEngineDetails() { }

  /**
   * Gets the connectionString.
   *
   * External engine connection string.
   *
   * @return the connectionString
   */
  public String getConnectionString() {
    return connectionString;
  }

  /**
   * Gets the metastoreHost.
   *
   * Metastore host.
   *
   * @return the metastoreHost
   */
  public String getMetastoreHost() {
    return metastoreHost;
  }
}

