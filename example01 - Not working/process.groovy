@Grab('com.google.guava:guava:r09')
import com.google.common.base.*

def split(string) {
  [on: { sep ->
    [trimming: { trimChar ->
      Splitter.on(sep).trimResults(CharMatcher.is(trimChar as char)).split(string).iterator().toList()
    }]
  }]
}


split "_a ,_b_ ,c__" on ',' trimming '_\'