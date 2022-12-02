import java.util.Scanner
import scala.collection.mutable.ListBuffer
object sublist {
	var l1 = new ListBuffer[Int]()
	var l2 = new ListBuffer[Int]()
	var c=0
	var c2=0
	val scanner=new java.util.Scanner(System.in)
	println("Introduzca tamano de la lista")
	var n1 = scanner.nextInt()
	println("Introduzca datos")
	while (n1>c){
	 var n = scanner.nextInt()
	 l1.append(n)
	 c=c+1
	}
	println(l1.toList)
	println("Introduzca tamano de la lista")
	var n2 = scanner.nextInt()
	println("Introduzca datos")
	while (n2>c2){
	 var n3 = scanner.nextInt()
	 l2.append(n3)
	 c2=c2+1
	}
	println(l2.toList)
	var l3=l1.intersect(l2)
	if(l3.length==l2.length){
	 println("VERDAD")
	}
	else{ 
	 println("FALSO")
	}
	
	
}    