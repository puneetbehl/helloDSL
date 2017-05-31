show = { println it }
square_root = { Math.sqrt(it) }

def please(action) {
  [the: { what ->
    [of: { number -> action(what(number)) }]
  }]
}



//please show the square_root of 100

