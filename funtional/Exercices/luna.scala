class animals {
    def description(specie: String, name: String, age: Int): Unit ={
      println("The "+specie+ " is called "+name+" and has "+age+" years old")
    }
    def alimentar (specie: String, name: String, age: Int): Unit ={

      if (specie == "Leon"){
        println("Feed in the feeder with seeds")
      }
      if (specie == "Eagle"){
        println("Feed by releasing the meat in the feeder")
      }

      if (specie == "Deer"){
        println("Feed with pine leaves and special proteins")
      }

      if (specie == "Hippopotamus"){
        println("Feed by releasing watermelons in their habitat")
      }

      if (specie == "Monkey"){
        println("Feed leaving a plate with food")
      }
    }

  }
class cuidados {
  def CheckMedico (specie: String, name: String, age: Int): Unit ={

    if (specie == "Leon"){
      println("Check every 3 weeks")
    }
    if (specie == "Eagle"){
      println("Check every 2 days")
    }

    if (specie == "Deer"){
      println("Weekly check")
    }

    if (specie == "Hippopotamus"){
      println("Check every 2 weeks")
    }

    if (specie == "Monkey"){
      println("Check every month")
    }
  }
  def liberacion(specie: String, name: String, age: Int){
    if (age >= 5){
      println("The animal have to be liberated")
    }else
      println("When the animal turns 5, it must be released in the wild to be replaced by another")
  }
}
class status {
  def descripcion(social: String, entretenimento: String, espacio: String, salud: String): Unit ={
    println("The animal has a "+social+" Social status, The animal has a "+entretenimento+" entertainment status, The animal has a "+espacio+" space status, The animal has a"+salud+"Healt status")
  }
  def recomendaciones(social: String, entretenimento: String, espacio: String, salud: String): Unit ={
    if (social == "Low"){
      println("The Social status has to be improve")
    }

    if (entretenimento == "Low"){
      println("The entertainment status has to be improve")
    }

    if (espacio == "Low"){
      println("The Space status has to be improve")
    }

    if (salud == "Low"){
      println("The Healt status has to be improve")
    }
  }
}
class costs{
  def total(specie: String, name: String,comida: Int, mantenimiento: Int, adquisicion: Int, liberacion: Int): Double ={
    var tc =comida+mantenimiento+adquisicion+liberacion
    tc
  }
  def promedio(specie: String, name: String,comida: Int, mantenimiento: Int, adquisicion: Int, liberacion: Int): Double ={
    var ac =(comida+mantenimiento+adquisicion+liberacion)/4
    ac
  }
  def costos(specie: String, name: String,comida: Int, mantenimiento: Int, adquisicion: Int, liberacion: Int): Unit ={
    /*var tc = total(specie, name, comida, mantenimiento, adquisicion, liberacion);
    var ac = promedio(specie, name, comida, mantenimiento, adquisicion, liberacion);*/
    println("The total cost of the "+specie+" called "+name+" is "+total(specie, name, comida, mantenimiento, adquisicion, liberacion)+" and his average cost is: "+promedio(specie, name, comida, mantenimiento, adquisicion, liberacion))
  }
}
class AnimalTypes {
  def anml = List("Eagle", "Hippopotamus", "Leon", "Deer", "Monkey")
  println("The List of the animals that you can use is:\n")
  anml.foreach{println}
  println("The List of the status that you can use is:\n")

  def tst = List("Stable", "Low", "Great")
  tst.foreach{println}
}
var e = new AnimalTypes()
var x = new animals();
x.description("Leon","Cimba",10)
x.alimentar("Monkey","Goku",10)
var y = new cuidados();
y.CheckMedico("Deer","Bmbi",10)
y.liberacion("Hippopotamus","Hope",4)
var z = new status();
z.descripcion("Stable","Great","Great","Low")
z.recomendaciones("Low","Great","Great","Low")
var w = new costs();
//w.total("leon", "Cimba",1000, 4283, 15000, 2000)/
w.costos("leon", "Cimba",1000, 4283, 15000, 2000)