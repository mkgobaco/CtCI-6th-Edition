package Q4_01_Route_Between_Nodes;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import static org.junit.Assert.*;

@Slf4j
public class QuestionTest {

    @Test
    public void search() {
        Graph g = Question.createNewGraph();
        Node[] n = g.getNodes();
        Node start = n[3];
        Node end = n[5];
        Boolean result = Question.search(g, start, end);
        assertEquals(true, result);
        log.debug(String.valueOf(result));
    }
}