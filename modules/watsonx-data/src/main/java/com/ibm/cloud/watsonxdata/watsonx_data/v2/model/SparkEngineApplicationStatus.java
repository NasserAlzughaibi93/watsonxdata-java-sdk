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

import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Engine Application Status.
 */
public class SparkEngineApplicationStatus extends GenericModel {

  /**
   * Engine Type.
   */
  public interface Type {
    /** iae. */
    String IAE = "iae";
    /** emr. */
    String EMR = "emr";
  }

  @SerializedName("application_details")
  protected SparkApplicationDetails applicationDetails;
  @SerializedName("application_id")
  protected String applicationId;
  @SerializedName("auto_termination_time")
  protected String autoTerminationTime;
  @SerializedName("creation_time")
  protected String creationTime;
  @SerializedName("deploy_mode")
  protected String deployMode;
  @SerializedName("end_time")
  protected String endTime;
  @SerializedName("failed_time")
  protected String failedTime;
  @SerializedName("finish_time")
  protected String finishTime;
  protected String id;
  @SerializedName("job_endpoint")
  protected String jobEndpoint;
  @SerializedName("return_code")
  protected String returnCode;
  protected SparkEngineApplicationStatusRuntime runtime;
  @SerializedName("service_instance_id")
  protected String serviceInstanceId;
  @SerializedName("spark_application_id")
  protected String sparkApplicationId;
  @SerializedName("spark_application_name")
  protected String sparkApplicationName;
  @SerializedName("spark_version")
  protected String sparkVersion;
  @SerializedName("start_time")
  protected String startTime;
  protected String state;
  @SerializedName("state_details")
  protected List<SparkEngineApplicationStatusStateDetailsItems> stateDetails;
  @SerializedName("submission_time")
  protected String submissionTime;
  @SerializedName("template_id")
  protected String templateId;
  protected String type;
  protected List<SparkVolumeDetails> volumes;
  @SerializedName("wxd_application_ui_endpoint")
  protected String wxdApplicationUiEndpoint;

  protected SparkEngineApplicationStatus() { }

  /**
   * Gets the applicationDetails.
   *
   * Application details.
   *
   * @return the applicationDetails
   */
  public SparkApplicationDetails getApplicationDetails() {
    return applicationDetails;
  }

  /**
   * Gets the applicationId.
   *
   * Application ID.
   *
   * @return the applicationId
   */
  public String getApplicationId() {
    return applicationId;
  }

  /**
   * Gets the autoTerminationTime.
   *
   * Auto Termination Time.
   *
   * @return the autoTerminationTime
   */
  public String getAutoTerminationTime() {
    return autoTerminationTime;
  }

  /**
   * Gets the creationTime.
   *
   * Creation time.
   *
   * @return the creationTime
   */
  public String getCreationTime() {
    return creationTime;
  }

  /**
   * Gets the deployMode.
   *
   * Deployment mode.
   *
   * @return the deployMode
   */
  public String getDeployMode() {
    return deployMode;
  }

  /**
   * Gets the endTime.
   *
   * End Time.
   *
   * @return the endTime
   */
  public String getEndTime() {
    return endTime;
  }

  /**
   * Gets the failedTime.
   *
   * Failed time.
   *
   * @return the failedTime
   */
  public String getFailedTime() {
    return failedTime;
  }

  /**
   * Gets the finishTime.
   *
   * Finish time.
   *
   * @return the finishTime
   */
  public String getFinishTime() {
    return finishTime;
  }

  /**
   * Gets the id.
   *
   * Application ID.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the jobEndpoint.
   *
   * Job endpoint.
   *
   * @return the jobEndpoint
   */
  public String getJobEndpoint() {
    return jobEndpoint;
  }

  /**
   * Gets the returnCode.
   *
   * Return code.
   *
   * @return the returnCode
   */
  public String getReturnCode() {
    return returnCode;
  }

  /**
   * Gets the runtime.
   *
   * application run time.
   *
   * @return the runtime
   */
  public SparkEngineApplicationStatusRuntime getRuntime() {
    return runtime;
  }

  /**
   * Gets the serviceInstanceId.
   *
   * Service Instance ID for POST.
   *
   * @return the serviceInstanceId
   */
  public String getServiceInstanceId() {
    return serviceInstanceId;
  }

  /**
   * Gets the sparkApplicationId.
   *
   * Spark application ID.
   *
   * @return the sparkApplicationId
   */
  public String getSparkApplicationId() {
    return sparkApplicationId;
  }

  /**
   * Gets the sparkApplicationName.
   *
   * Spark application name.
   *
   * @return the sparkApplicationName
   */
  public String getSparkApplicationName() {
    return sparkApplicationName;
  }

  /**
   * Gets the sparkVersion.
   *
   * Spark Version.
   *
   * @return the sparkVersion
   */
  public String getSparkVersion() {
    return sparkVersion;
  }

  /**
   * Gets the startTime.
   *
   * Start time.
   *
   * @return the startTime
   */
  public String getStartTime() {
    return startTime;
  }

  /**
   * Gets the state.
   *
   * Application state.
   *
   * @return the state
   */
  public String getState() {
    return state;
  }

  /**
   * Gets the stateDetails.
   *
   * Application state details.
   *
   * @return the stateDetails
   */
  public List<SparkEngineApplicationStatusStateDetailsItems> getStateDetails() {
    return stateDetails;
  }

  /**
   * Gets the submissionTime.
   *
   * Application submission time.
   *
   * @return the submissionTime
   */
  public String getSubmissionTime() {
    return submissionTime;
  }

  /**
   * Gets the templateId.
   *
   * Template ID.
   *
   * @return the templateId
   */
  public String getTemplateId() {
    return templateId;
  }

  /**
   * Gets the type.
   *
   * Engine Type.
   *
   * @return the type
   */
  public String getType() {
    return type;
  }

  /**
   * Gets the volumes.
   *
   * Spark application volumes to mount.
   *
   * @return the volumes
   */
  public List<SparkVolumeDetails> getVolumes() {
    return volumes;
  }

  /**
   * Gets the wxdApplicationUiEndpoint.
   *
   * Wxd history_server endpoint.
   *
   * @return the wxdApplicationUiEndpoint
   */
  public String getWxdApplicationUiEndpoint() {
    return wxdApplicationUiEndpoint;
  }
}

