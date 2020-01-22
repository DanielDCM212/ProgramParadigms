import math.pow

object Solution {

    def sierp(b:Array[Array[Char]], x:Int, y:Int, h:Int, w:Int, n:Int):Array[Array[Char]] = n match {
        case 0 => 
            for(i <- 0 until h) {
                b(x+i)(y+w/2) = '1'
                for(j <- 0 until i+1) {
                    b(x+i)(y+w/2-j) = '1'
                    b(x+i)(y+w/2+j) = '1'
                }
            }
            return b
        case _ => 
            sierp(sierp(sierp(b, x, y+w/4+1, h/2, w/2, n-1), x+h/2, y+0, h/2, w/2, n-1), x+h/2, y+w/2+1, h/2, w/2, n-1)
    }
    
    def drawTriangles(N:Int) = {
        sierp(List.fill(32)(List.fill(63)('_').toArray).toArray, 0, 0, 32, 63, N)
        .foreach(x => println(x.mkString("")))
    }

    def main(args: Array[String]) {
        drawTriangles(readInt())
    }
}
