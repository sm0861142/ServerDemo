package dao;

import entity.News;

import java.util.List;

public interface NewsDao {
    List<News> findInternationalNewsTop10();
    List<News> findNationNewsTop10();

    List<News> findAllHomeNews();

    List<News> findNewsByType(int typeId);

}
