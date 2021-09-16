package ru.socialnetwork.mapper.impl;

import lombok.Builder;
import ru.socialnetwork.mapper.SocialNetworkMapper;
import ru.socialnetwork.model.Music;
import ru.socialnetwork.model.Users;
import ru.socialnetwork.model.dto.MusicDto;
@Builder

public class MusicMapper implements SocialNetworkMapper<Music, MusicDto> {
    @Override
    public MusicDto toDTO(Music music) {
        return MusicDto.builder()
                .music(music.getMusic())
                .id(music.getId())
                .typeOfMusic(music.getTypeOfMusic())
                .usersId(music.getUsersId().getId())
                .build();
    }

    @Override
    public Music toModel(MusicDto musicDto) {
        return Music.builder()
                .music(musicDto.getMusic())
                .typeOfMusic(musicDto.getTypeOfMusic())
                .id(musicDto.getId())
                .usersId(
                        Users.builder()
                                .id(musicDto.getUsersId())
                                .build())
                .build();


    }
}
