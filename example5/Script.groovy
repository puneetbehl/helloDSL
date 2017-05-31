import org.codehaus.groovy.control.CompilerConfiguration
import org.codehaus.groovy.control.customizers.ImportCustomizer

CompilerConfiguration config = new CompilerConfiguration()
config.scriptBaseClass = 'ConferenceBaseScript'

def icz = new ImportCustomizer()
icz.addStaticImport('Level', 'INTERMEDIATE')
icz.addStaticImport('Level', 'BEGINER')

config.addCompilationCustomizers(icz)

new GroovyShell(this.class.classLoader, config).evaluate(
	new File('CFP.groovy').text + new File('conference.dsl').text
)
