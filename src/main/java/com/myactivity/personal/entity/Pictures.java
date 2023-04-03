package com.myactivity.personal.entity;

import javax.persistence.*;

@Entity
@Table(name = "pictures")
public class Pictures {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String uri;
    @Column(nullable = false)
    private Byte file;
    @Column(nullable = false)
    private String extension;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public Byte getFile() {
        return file;
    }

    public void setFile(Byte file) {
        this.file = file;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }
}
