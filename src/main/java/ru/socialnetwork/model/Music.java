package ru.socialnetwork.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

@Entity
@Table(name = "music")
public class Music {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @Column(name = "music")
    private String music;
    @Column(name = "type_of_music")
    private String typeOfMusic;

    @ManyToOne
    @JoinColumn(name = "users_id", referencedColumnName = "id")
    private Users usersId;
}
