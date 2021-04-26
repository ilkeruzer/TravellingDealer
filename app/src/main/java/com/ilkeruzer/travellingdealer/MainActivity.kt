package com.ilkeruzer.travellingdealer

import Node
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //--- ADD NODES ---

        //Factory
        var node = Node(Pair(3,7))

        //Customers
        node.appendToEnd(Pair(1,10))
        node.appendToEnd(Pair(1,4))
        node.appendToEnd(Pair(2,1))
        node.appendToEnd(Pair(5,2))
        node.appendToEnd(Pair(6,5))
        node.appendToEnd(Pair(8,4))
        node.appendToEnd(Pair(9,2))
        node.appendToEnd(Pair(8,9))




        //Print Nodes ---- First element Factory the rest are customers
        node.printNodes()

        //Print Sum of Nodes
        Log.e("note" , node.sumOfNodes().toString())




        //Delete Specific Node
        node.deleteSpecificNode(node , Pair(2,1))

        //Print Nodes after deleted specific Node
        node.printNodes()

        //Print Sum of Nodes after deleted specific Node
        Log.e("note" , node.sumOfNodes().toString())




        //Delete All Nodes
        node.deleteNode(node)

        //Print Nodes after deleted all Nodes
        node.printNodes()

        //Print Sum of Nodes after deleted all Nodes
        Log.e("note" , node.sumOfNodes().toString())
    }
}