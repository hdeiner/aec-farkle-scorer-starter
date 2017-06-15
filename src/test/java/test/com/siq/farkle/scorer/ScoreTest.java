package test.com.siq.farkle.scorer;

import com.siq.farkle.scorer.Score;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class ScoreTest {

    @Test
    public void canRecognizeStraight() {
        Score score = new Score("246135");
        assertThat(score.calculate(), is(1200));
    }


}
