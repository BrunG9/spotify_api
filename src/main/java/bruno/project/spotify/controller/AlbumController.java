package bruno.project.spotify.controller;

import bruno.project.spotify.client.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("spotify/api/")
public class AlbumController {

    private final AuthSpotifyClient authSpotifyClient;
    private final AlbumSpotifyClient albumSpotifyClient;

    public AlbumController(AuthSpotifyClient authSpotifyClient, AlbumSpotifyClient albumSpotifyClient) {
        this.authSpotifyClient = authSpotifyClient;
        this.albumSpotifyClient = albumSpotifyClient;
    }

    @GetMapping("/albums")
    public ResponseEntity<List<Album>> albumsNewRelease(){
        var request = new LoginRequest(
                "client_credentials",
                "df89c026d0a04249bc65a6ddaea321ba",
                "e0858085186749a28f6af15eff6c96be"
        );
        var token = authSpotifyClient.login(request).getAccessToken();

        var response = albumSpotifyClient.getReleases("Bearer " + token);

        return ResponseEntity.ok(response.getAlbums().getItems());
    }

}
