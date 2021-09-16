package ru.socialnetwork.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.socialnetwork.model.DataOfUsers;
import ru.socialnetwork.model.Music;

@Repository
public interface MusicRepository extends JpaRepository<Music, Long> {


}
