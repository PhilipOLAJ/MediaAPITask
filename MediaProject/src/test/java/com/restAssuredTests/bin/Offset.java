
package com.restAssuredTests.bin;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Offset {

    @SerializedName("start")
    @Expose
    private Integer start;
    @SerializedName("end")
    @Expose
    private Integer end;
    @SerializedName("label")
    @Expose
    private Object label;
    @SerializedName("now_playing")
    @Expose
    private Boolean nowPlaying;

    public Integer getStart() {
        return start;
    }

    public void setStart(Integer start) {
        this.start = start;
    }

    public Integer getEnd() {
        return end;
    }

    public void setEnd(Integer end) {
        this.end = end;
    }

    public Object getLabel() {
        return label;
    }

    public void setLabel(Object label) {
        this.label = label;
    }

    public Boolean getNowPlaying() {
        return nowPlaying;
    }

    public void setNowPlaying(Boolean nowPlaying) {
        this.nowPlaying = nowPlaying;
    }

}
