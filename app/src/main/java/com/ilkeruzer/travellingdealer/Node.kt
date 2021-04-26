import android.util.Log
import kotlin.math.absoluteValue

class Node(var data: Pair<Int,Int>) {

    var following: Node? = null
    var length : Int = 0

    fun appendToEnd(data: Pair<Int,Int>) {
        val end = Node(data)
        var n: Node? = this
        while (n!!.following != null) {
            n = n.following
        }
        n.following = end
        length++
    }

    fun printNodes() {
        var result = ""
        var n = this
        while (n.following != null){
            result += n.data.toString()
            if(n.following != null){
                result += " --> "
            }
            n = n.following!!
        }
        //son değer
        result += n.data.toString()
        Log.e("Loodos" , result)
    }


    fun length(h: Node?): Int {
        return length
    }

    fun sumOfNodes(): Int {
        var result = 0
        var firstNode =  this
        var secondNode = firstNode.following
        while (firstNode.following != null){

            //gidişin dönüşü olduğu için 2 ile çarptık
            result += findDistanceBetweenNodes(firstNode , firstNode.following!!) * 2

            firstNode.following = firstNode.following!!.following

        }

        firstNode.following = secondNode

        return result
    }

    //Belirli bir Node'u siler
    fun deleteSpecificNode(head: Node, data: Pair<Int,Int>): Node? {

        val n: Node = head

        if(n.data == data) {
            return head.following
        }

        var current = head
        while (current.following != null){
            if(current.following!!.data == data){
                current.following = current.following!!.following
                return current
            }
            current = current.following!!
        }

        return head
    }

    //Bütün Nodeları siler
    fun deleteNode(head: Node){

        var holder : Node? = head
        while (holder != null){
            var following = holder.following
            holder.following = null
            holder = following
        }

    }

    fun findDistanceBetweenNodes(node1 : Node , node2 : Node) : Int{

        //positive x value
        var x = (node1.data.first - node2.data.first).absoluteValue

        //positive y value
        var y = (node1.data.second - node2.data.second).absoluteValue

        return x+y

    }
}