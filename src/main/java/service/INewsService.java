package service;

import entity.News;

import java.util.List;
import java.util.Map;

public interface INewsService {
    List<News> findInternationalNewsTop10();
    List<News> findNationNewsTop10();

    List<News> findAllHomeNews(Map<String,Object> map);
    List<News> findNewsByType(int typeId);
}
