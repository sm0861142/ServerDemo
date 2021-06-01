package entity;

import java.util.Date;

public class News {
    private Integer id;
    private String title;
    private String content;
    private Integer typeId;
    private String imagePath;
    private Date publishDate;

    public News() {
    }

    public News(Integer id, String title, String content, Integer typeId, String imagePath, Date publishDate) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.typeId = typeId;
        this.imagePath = imagePath;
        this.publishDate = publishDate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public Date getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }

    @Override
    public String toString() {
        return "News{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", typeId=" + typeId +
                ", imagePath='" + imagePath + '\'' +
                ", publishDate=" + publishDate +
                '}';
    }
}
