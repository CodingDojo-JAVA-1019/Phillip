package com.phillip.lookify.repositories;

import java.util.List;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.phillip.lookify.models.Song;

@Repository
public interface SongRepository extends CrudRepository<Song, Long>{

	List<Song> findAll();
	Long countByArtistContaining(String search);
	List<Song> findByArtistContaining(String search);
	Long deleteByIdIs(Long Id);
	List<Song> findTop10ByOrderByRatingDesc();
	
	
	
}
