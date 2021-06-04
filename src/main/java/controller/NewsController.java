package controller;

import Until.R;
import com.github.pagehelper.PageInfo;

import entity.NewType;
import entity.News;
import entity.NewsListByPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import service.INewTypeService;
import service.INewsService;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/news")
public class NewsController {
    @Autowired
    private INewsService iNewsService;
    @Autowired
    private INewTypeService iNewTypeService;
    @RequestMapping("/findType2Top10")
    @ResponseBody
    public R findInternationalNewsTop10(){
        List<News> newsList=iNewsService.findInternationalNewsTop10();
        R r;
        if (newsList!=null && newsList.size()>0){
            r=R.ok(newsList);
        }else{
            r= R.error();
        }
        return r;
    }

    @RequestMapping("/findType1Top10")
    @ResponseBody
    public R findNationNewsTop10(){
        List<News> newsList=iNewsService.findNationNewsTop10();
        R r;
        if (newsList!=null && newsList.size()>0){
            r=R.ok(newsList);
        }else{
            r= R.error();
        }
        return r;
    }

    @RequestMapping("/homeNewsListByPage")
    @ResponseBody
    public NewsListByPage homeNewsListByPage(@RequestParam(name = "currentPage",required = true,defaultValue = "1")Integer currentPage, @RequestParam(name = "pageSize",required = true,defaultValue = "3")Integer pageSize){
        Map<String,Object> map=new HashMap<>();
        map.put("currentPage",currentPage);
        map.put("pageSize",pageSize);

        List<News> newsList= iNewsService.findAllHomeNews(map);
        PageInfo<News> pageInfo=new PageInfo<>(newsList);

        NewsListByPage newsListByPage=new NewsListByPage();

        if(currentPage>pageInfo.getPages()||currentPage<1){
            newsListByPage.setCode(3);
            newsListByPage.setMsg("查询页码错误");
            return newsListByPage;
        }

        NewsListByPage.PageEntity pageEntity=new NewsListByPage.PageEntity();
        pageEntity.setCurrentPage(pageInfo.getPageNum());
        pageEntity.setTotalPage(pageInfo.getPages());
        pageEntity.setPageSize(pageInfo.getPageSize());
        pageEntity.setTotalRecordCount(pageInfo.getTotal());
        pageEntity.setPageNewsList(pageInfo.getList());
        newsListByPage.setPageEntity(pageEntity);

        if(pageInfo.getTotal()>0){
            newsListByPage.setCode(1);
            newsListByPage.setMsg("查询成功");
        }else {
            newsListByPage.setCode(2);
            newsListByPage.setMsg("没有查询到国内新闻数据");
        }

        return newsListByPage;
    }

    @RequestMapping("/allNewType")
    @ResponseBody
    public R getAllNewType(){
        List<NewType> newsList=iNewTypeService.getAllType();
        R r;
        if (newsList!=null && newsList.size()>0){
            r=R.ok(newsList);
        }else{
            r= R.error();
        }
        return r;
    }
    @RequestMapping("/findTypeId")
    @ResponseBody
    public R findNewsByTypeId(Integer typeId){
        List<News> newsList=iNewsService.findNewsByType(typeId);
        R r;
        if (newsList!=null && newsList.size()>0){
            r=R.ok(newsList);
        }else{
            r= R.error();
        }
        return r;
    }
}
