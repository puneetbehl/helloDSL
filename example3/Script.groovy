println new GroovyShell().evaluate(
	new File('process.groovy').text + new File('candidates.dsl').text
)
