package service;

import com.github.pagehelper.PageHelper;
import dao.NewsDao;
import entity.News;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class NewsServiceImpl implements INewsService {
    @Autowired
    private NewsDao newsDao;
    @Override
    public List<News> findInternationalNewsTop10() {
        return newsDao.findInternationalNewsTop10();
    }

    @Override
    public List<News> findAllHomeNews(Map<String, Object> map) {
        Integer currentPage=(Integer)map.get("currentPage");
        Integer pageSize=(Integer)map.get("pageSize");
        PageHelper.startPage(currentPage,pageSize);
        return newsDao.findAllHomeNews();
    }

    @Override
    public List<News> findNationNewsTop10() {
        return newsDao.findNationNewsTop10();
    }
}
