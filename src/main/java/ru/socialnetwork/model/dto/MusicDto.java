package ru.socialnetwork.model.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import ru.socialnetwork.model.Users;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class MusicDto {

    @JsonProperty("id")
    private Long id;

    @JsonProperty("music")
    private String music;
    @JsonProperty("typeOfMusic")
    private String typeOfMusic;
    @JsonProperty("usersId")
    private Long usersId;
}



