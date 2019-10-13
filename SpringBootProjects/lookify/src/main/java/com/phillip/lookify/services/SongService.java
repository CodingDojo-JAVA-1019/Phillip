package com.phillip.lookify.services;


import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.phillip.lookify.models.Song;
import com.phillip.lookify.repositories.SongRepository;

@Service
public class SongService {
	private final SongRepository songRepo;

	public SongService(SongRepository songRepo) {
		this.songRepo = songRepo;	
	}
	
	public List<Song> allSongs(){
		return songRepo.findAll();
	}

	public Song createSong(Song song) {
		return songRepo.save(song);
	}
	
	public Song findSong(Long id) {
		Optional<Song> optSong = songRepo.findById(id);
		if(optSong.isPresent()) {
			return optSong.get();
		}else {
			return null;
		}
	}
	public void deleteSong(Long id) {
		Optional<Song> optSong = songRepo.findById(id);
		if(optSong.isPresent()) {
			Song thisSong = optSong.get();
			songRepo.delete(thisSong);
		}
	}
	public List<Song> findByArtist(String artist){
		return songRepo.findByArtistContaining(artist);
	}
	
	public List<Song> topTen(){
		return songRepo.findTop10ByOrderByRatingDesc();
	}
	
}
