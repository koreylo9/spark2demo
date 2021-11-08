package retail_db

import org.apache.spark.sql.SparkSession
import org.apache.spark.{SparkConf, SparkContext}

object GetRevenuePerOrder {
  def main(args: Array[String]): Unit = {
    System.setProperty("hadoop.home.dir", "C:\\hadoop")
    val spark = SparkSession
      .builder
      .appName("Hello Hive")
      .config("spark.master","local")
      .enableHiveSupport()
      .getOrCreate()
    println("created spark session")

    spark.sql("create table if not exits newTable(id Int,name String) row format delimited fields terminated by ','");
  }


}
