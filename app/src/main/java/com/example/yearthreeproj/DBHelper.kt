package com.example.yearthreeproj

import java.sql.Connection
import java.sql.DriverManager
import java.sql.ResultSet

//object DatabaseHelper {
//    private const val DB_URL = "jdbc:postgresql://your_host:your_port/your_database"
//    private const val DB_USER = "your_username"
//    private const val DB_PASSWORD = "your_password"
//
//    fun fetchArticles(): List<Article> {
//        val articles = mutableListOf<Article>()
//
//        try {
//            Class.forName("org.postgresql.Driver")
//            val connection: Connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)
//            val statement = connection.createStatement()
//            val resultSet: ResultSet = statement.executeQuery("SELECT * FROM articles")
//
//            while (resultSet.next()) {
//                val id = resultSet.getInt("id")
//                val title = resultSet.getString("title")
//                val content = resultSet.getString("content")
//                val imageUrl = resultSet.getString("image_url")
//
//                articles.add(Article(id, title, content, imageUrl))
//            }
//
//            resultSet.close()
//            statement.close()
//            connection.close()
//        } catch (e: Exception) {
//            e.printStackTrace()
//        }
//
//        return articles
//    }
//}