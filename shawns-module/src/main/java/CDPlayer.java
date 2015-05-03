import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by shawnritchie on 13/04/15.
 */
public class CDPlayer implements MediaPlayer {
    private CompactDisc cd;

    @Autowired
    public CDPlayer(CompactDisc cd) {
            this.cd = cd;
    }

    public void play() {
        cd.play();
    }

}
