package ru.skillbox.socialnetworkimpl.sn.api.responses;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import ru.skillbox.socialnetworkimpl.sn.api.responses.util.CityResponse;
import ru.skillbox.socialnetworkimpl.sn.api.responses.util.CountryResponse;

@Data
@NoArgsConstructor
public class PersonResponse {

    @NonNull private int id;

    @JsonProperty("first_name")
    private String firstName;

    @JsonProperty("last_name")
    private String lastName;

    @JsonProperty("reg_date")
    @NonNull private long regDate;

    @JsonProperty("birth_date")
    private long birthDate;

    @NonNull private String email;
    private String phone;
    private String photo;
    private String about;
    private CityResponse city;
    private CountryResponse country;

    @JsonProperty("messages_permission")
    @NonNull private String messagesPermission;

    @JsonProperty("last_online_time")
    private long lastOnlineTime;

    @JsonProperty("is_blocked")
    @NonNull private boolean isBlocked;
}