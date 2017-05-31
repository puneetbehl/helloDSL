import org.codehaus.groovy.control.CompilerConfiguration
import org.codehaus.groovy.control.customizers.ImportCustomizer

def binding = new Binding([
	robot: new Robot()
])

CompilerConfiguration config = new CompilerConfiguration()

def icz = new ImportCustomizer()
icz.addStaticImport('Direction', 'LEFT')
icz.addStaticImport('Direction', 'RIGHT')

config.addCompilationCustomizers(icz)


def shell = new GroovyShell(this.class.classLoader, binding, config)

shell.evaluate(new File('instruction.groovy'))