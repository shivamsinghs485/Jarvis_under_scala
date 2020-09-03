import org.apache.spark.SparkContext
import org.apache.spark.SparkContext._
import org.apache.spark.SparkConf


object test {
  def main(args : Array[String]){

    var path="C:\\Users\\Jarvis\\Documents\\Data_source\\Stock\\"
    val conf = new SparkConf().setAppName("Aggregate Example").setMaster("local[2]").set("spark.executor.memory", "1g")
    val sc = new SparkContext(conf)
    var adani=sc.textFile(path+"ADANIPORTS.csv")
    adani.take(10).foreach(println)

  }}