candidatesAndScores = [:]

def candidates(String[] names) {
	names?.each {name-> 
		candidatesAndScores[name] = 0
	}
}

def getReportWinner() {
	def max = -1
	def winner = ''
	candidatesAndScores.each {name, score-> 
		if(score > max) {
			max = score
			winner = name
		}
	}
	"winner is $winner with score $max"
}


def methodMissing(String name, args) {
	candidatesAndScores[name] = args[0]
}
