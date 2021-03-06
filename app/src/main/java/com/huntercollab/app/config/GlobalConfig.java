/*

    Contains all the configuration variables.

 */

package com.huntercollab.app.config;

//@author: Hugh Leow & Edwin Quintuna
//@brief: Base URL is initialized here so it will be the same for ALL ASYNC HTTP requests
public class GlobalConfig {

    public static final String HOST = "13.58.204.157";
    //public static final String HOST = "10.0.2.2";
    public static final int PORT = 5000;
    public static final int RMS_PORT = 8484;
    public static final String BASE_API_URL = "http://" + HOST + ":" + PORT;

}
