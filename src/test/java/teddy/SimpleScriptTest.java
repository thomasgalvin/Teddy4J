package teddy;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import org.junit.Test;

public class SimpleScriptTest {

    public SimpleScriptTest() {
    }

    @Test
    public void testSimpleScript() throws Exception {
        ScriptEngineManager factory = new ScriptEngineManager();
        ScriptEngine engine = factory.getEngineByName( "JavaScript" );
        engine.eval( "print('Hello, World')" );
    }

}
