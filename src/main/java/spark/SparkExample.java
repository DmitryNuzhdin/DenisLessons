package spark;

import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Row;
import org.apache.spark.sql.SparkSession;
import org.apache.spark.sql.expressions.Window;

import static org.apache.spark.sql.functions.*;

public class SparkExample {
    public static void main(String[] args) {
        SparkSession spark = SparkSession.builder()
                .appName("Simple Application")
                .config("spark.master", "local")
                .getOrCreate();

        Dataset<Row> hotels = spark
                .read()
                .format("csv")
                .option("header", "true")
                .load("src\\main\\resources\\tripadvisor_hotel_reviews.csv")
                .withColumn("ReviewId", row_number().over(Window.orderBy(lit(0))))
                .cache();

        //System.out.println(hotels.count());
        //hotels.show(10);

        Dataset<Row> hotels2 = hotels
                .withColumn("ReviewChars", length(col("Review")))
                .sort(col("ReviewChars").desc())
                .withColumn("WordArray", split(col("Review"), " "))
                .drop("Review")
                .withColumn("Word", explode(col("WordArray")))
                .select(
                        col("ReviewId"),
                        col("ReviewChars"),
                        col("Word"),
                        size(col("WordArray")).as("wordsCount1")
                )
                .withColumn("wordsCount2", count(lit(0)).over(Window.partitionBy("ReviewId")))
                .filter(col("wordsCount2").gt(300));


        hotels
                .join(hotels2, hotels.col("ReviewId").equalTo(hotels2.col("ReviewId")))
                .select(hotels.col("ReviewId"), col("Review"), col("wordsCount2"))
                .show(10);

        //hotels2.show(10);

        spark.close();
    }
}
