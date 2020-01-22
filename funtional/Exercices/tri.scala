object Solution {
    def drawTriangles(k: Int, t: Int): List[String] = {
        if (t==0) {
            (1 to k).map(x => "_"*(k-x)+"1"*(2*x-1)+"_"*(k-x)).toList
        } else {
            drawTriangles(k/2, t-1).map(x => "_"*(k/2)+x+"_"*(k/2)) ++ drawTriangles(k/2, t-1).map(x=>x+"_"+x)
        }
    }

    def main(args: Array[String]) {
        var i = readInt()
        drawTriangles(32,i) map println
    }
}

