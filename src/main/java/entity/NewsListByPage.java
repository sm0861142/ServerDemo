package entity;

import java.util.List;

public class NewsListByPage {
    private int code;
    private String msg;
    private PageEntity pageEntity;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public PageEntity getPageEntity() {
        return pageEntity;
    }

    public void setPageEntity(PageEntity pageEntity) {
        this.pageEntity = pageEntity;
    }

    public static class PageEntity {
        private int currentPage;
        private int totalPage;
        private int pageSize;
        private long totalRecordCount;
        private List<News> pageNewsList;

        public int getCurrentPage() {
            return currentPage;
        }

        public void setCurrentPage(int currentPage) {
            this.currentPage = currentPage;
        }

        public int getTotalPage() {
            return totalPage;
        }

        public void setTotalPage(int totalPage) {
            this.totalPage = totalPage;
        }

        public int getPageSize() {
            return pageSize;
        }

        public void setPageSize(int pageSize) {
            this.pageSize = pageSize;
        }

        public long getTotalRecordCount() {
            return totalRecordCount;
        }

        public void setTotalRecordCount(long totalRecordCount) {
            this.totalRecordCount = totalRecordCount;
        }

        public List<News> getPageNewsList() {
            return pageNewsList;
        }

        public void setPageNewsList(List<News> pageNewsList) {
            this.pageNewsList = pageNewsList;
        }
    }
}
