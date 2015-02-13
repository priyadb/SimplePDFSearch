package com.programmingfree.simplepdfsearch;

public class IndexItem {
	private Long id;
    private String title;
    private String content;

    public static final String ID = "id";
    public static final String TITLE = "title";
    public static final String CONTENT = "content";

    public IndexItem(Long id, String title, String content) {
        this.id = id;
        this.title = title;
        this.content = content;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    @Override
    public String toString() {
        return "IndexItem{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                '}';
    }

}
