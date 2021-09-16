package ru.socialnetwork.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.socialnetwork.mapper.SocialNetworkMapper;
import ru.socialnetwork.model.Music;
import ru.socialnetwork.model.dto.MusicDto;
import ru.socialnetwork.repository.MusicRepository;
import ru.socialnetwork.service.MusicService;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class MusicServiceImpl implements MusicService {

private final MusicRepository musicRepository;
private final SocialNetworkMapper<Music, MusicDto> mapper;

@Transactional
    @Override
    public MusicDto create(MusicDto musicDto) {
        return mapper.toDTO(musicRepository.save(mapper.toModel(musicDto)));
    }
@Transactional
    @Override
    public MusicDto update(MusicDto musicDto, Long aLong) {
        musicDto.setId(aLong);
        return mapper.toDTO(musicRepository.save(mapper.toModel(musicDto)));
    }

    @Transactional(readOnly = true)
    @Override
    public List<MusicDto> findAll() {

        return musicRepository.findAll().stream()
                .map(mapper::toDTO)
                .collect(Collectors.toList());
    }
@Transactional
    @Override
    public MusicDto delete(Long aLong) {
        musicRepository.deleteById(aLong);
        return MusicDto.builder()
                .id(aLong)
                .build();
    }
}
