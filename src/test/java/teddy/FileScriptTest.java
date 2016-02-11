package teddy;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import javax.script.Bindings;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import org.junit.Test;

public class FileScriptTest {
    @Test
    public void testFileLoading() throws Exception{
        ScriptEngineManager factory = new ScriptEngineManager();
        ScriptEngine engine = factory.getEngineByName( "JavaScript" );

        InputStream stream = FileScriptTest.class.getClassLoader().getResourceAsStream( "teddy/Example.js" );
        Reader reader = new InputStreamReader( stream );

        Bindings bindings = engine.createBindings();

        engine.eval( reader, bindings );
    }
}
