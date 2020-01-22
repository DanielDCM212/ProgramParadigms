object Solution {   
    def doDraw(k: Int, t: Int): List[String] = {
        if (t==0) {
            (1 to k).map(x => "_"*(k-x)+"1"*(2*x-1)+"_"*(k-x)).toList
        } else {
            doDraw(k/2, t-1).map(x => "-"*(k/2)+x+"-"*(k/2)) ++ doDraw(k/2, t-1).map(x=>x+"-"+x)
        }
    }
    
    def drawTriangles(N:Int) = {
      doDraw(32, N).foreach(println)
    }
    
    def main(args: Array[String]) {
        drawTriangles(readInt())
    }
}

