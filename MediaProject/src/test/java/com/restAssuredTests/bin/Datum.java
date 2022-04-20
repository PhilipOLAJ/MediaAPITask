
package com.restAssuredTests.bin;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Datum {

    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("segment_type")
    @Expose
    private String segmentType;
    @SerializedName("title_list")
    @Expose
    private TitleList titleList;
    @SerializedName("synopses")
    @Expose
    private Object synopses;
    @SerializedName("image_url")
    @Expose
    private Object imageUrl;
    @SerializedName("offset")
    @Expose
    private Offset offset;
    @SerializedName("uris")
    @Expose
    private List<Uri> uris = null;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSegmentType() {
        return segmentType;
    }

    public void setSegmentType(String segmentType) {
        this.segmentType = segmentType;
    }

    public TitleList getTitleList() {
        return titleList;
    }

    public void setTitleList(TitleList titleList) {
        this.titleList = titleList;
    }

    public Object getSynopses() {
        return synopses;
    }

    public void setSynopses(Object synopses) {
        this.synopses = synopses;
    }

    public Object getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(Object imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Offset getOffset() {
        return offset;
    }

    public void setOffset(Offset offset) {
        this.offset = offset;
    }

    public List<Uri> getUris() {
        return uris;
    }

    public void setUris(List<Uri> uris) {
        this.uris = uris;
    }

}
