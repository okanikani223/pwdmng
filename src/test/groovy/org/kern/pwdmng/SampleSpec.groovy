import spock.lang.Specification

class SampleSpec extends Specification {
    def "#left 足す #right は #sum" (){
        expect:
        left + rifht == sum

        when:
        left | right || sum
        0    | 1     || 1
        1    | 1     || 2
        2    | 1     || 3
        3    | 1     || 4
        4    | 1     || 5
        5    | 1     || 6
        6    | 1     || 7
        7    | 1     || 8
        8    | 1     || 9
        9    | 1     || 10
    }
}