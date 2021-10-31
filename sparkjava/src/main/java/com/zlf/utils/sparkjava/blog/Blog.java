package com.zlf.utils.sparkjava.blog;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class Blog {

    public long id;

    public LocalDateTime date = LocalDateTime.now();

    public String author;

    public String title;

    public String content;

    @Override
    public String toString() {
        return "Blog{" +
                "id=" + id +
                ", date=" + date +
                ", author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}