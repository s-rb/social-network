package ru.skillbox.socialnetworkimpl.sn.api.responses;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResponsePlatformApi<T> {
    private String error;
    private Long timestamp;
    private Integer total;
    private Integer offset;
    private Integer perPage;
    private T data;
    private String error_description;

    public ResponsePlatformApi (String error, int total, int offset, int perPage, T data) {
        this.error = error;
        this.total = total;
        this.offset = offset;
        this.perPage = perPage;
        this.data = data;
        timestamp = new Date().getTime();
    }

}
