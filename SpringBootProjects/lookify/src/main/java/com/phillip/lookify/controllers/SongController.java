package com.phillip.lookify.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.phillip.lookify.models.Song;
import com.phillip.lookify.services.SongService;

@Controller

public class SongController {

	private final SongService songServ;
	
	public SongController(SongService songServ) {
		this.songServ = songServ;
	}
	
	@RequestMapping(value="/")
	public String index(Model model) {
		
		return "/lookify/home.jsp";
	}
	@GetMapping("/dashboard")
	public String dashboard(Model model) {
		List<Song> songs = songServ.allSongs();
		model.addAttribute("songs", songs);
		return "/lookify/dashboard.jsp";
	}
	
	@GetMapping("/song/delete/{id}")
	public String delete(@PathVariable("id") Long id) {
		songServ.deleteSong(id);
		return "redirect:/dashboard";
	}
	@GetMapping("/song/new")
	public String createSong(@ModelAttribute("song")Song song) {
		return "/lookify/newsong.jsp";
	}
	@PostMapping("/song/new")
	public String create(@Valid @ModelAttribute("song")Song song, BindingResult result, RedirectAttributes redirectAttributes) {
        if (result.hasErrors()) {
        	redirectAttributes.addFlashAttribute("error");
        	return "redirect:/song/new";
        } else {
            songServ.createSong(song);
            return "redirect:/dashboard";
        }
	}
	@GetMapping("/search")
	public String searchResult( Model model, @RequestParam(value="artist")String artist){
		List<Song> songs=songServ.findByArtist(artist);
		model.addAttribute("songs", songs);
		model.addAttribute("artist", artist);
		return "lookify/songsByArtist.jsp";
	}
	
	@GetMapping("/song/show/{id}")
	public String showSong(@PathVariable("id")Long id, Model model) {
		Song thisSong= songServ.findSong(id);
		model.addAttribute("song", thisSong);
		return "/lookify/showSong.jsp";
	}
	
	@GetMapping("song/topten")
	public String topTen(Model model) {
		List<Song> top = songServ.topTen();
		model.addAttribute("songs", top);
		return "/lookify/top10.jsp";
	}
}
