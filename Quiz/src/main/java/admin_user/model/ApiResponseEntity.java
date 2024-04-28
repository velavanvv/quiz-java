package admin_user.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ApiResponseEntity {

    @JsonProperty("success")
    boolean success;

    public ApiResponseEntity(boolean success) {
        this.success = success;
    }

}
