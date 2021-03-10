package com.example.retrofitnavernewsapi;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Result {
    /**
     {
         "lastBuildDate": "Wed, 10 Mar 2021 17:21:22 +0900",
         "total": 73317,
         "start": 1,
         "display": 20,
         "items": [
         {
            "title": "<b>유노윤호</b>의 사과",
            "originallink": "http://www.vogue.co.kr/2021/03/10/%ec%9c%a0%eb%85%b8%ec%9c%a4%ed%98%b8%ec%9d%98-%ec%82%ac%ea%b3%bc/?utm_source=naver&utm_medium=partnership",
            "link": "http://www.vogue.co.kr/2021/03/10/%ec%9c%a0%eb%85%b8%ec%9c%a4%ed%98%b8%ec%9d%98-%ec%82%ac%ea%b3%bc/?utm_source=naver&utm_medium=partnership",
            "description": "동방신기 <b>유노윤호</b>가 자신의 잘못을 사과했습니다. 평소 바른 생활과 열정 넘치는 모습을 보여주던 <b>유노윤호</b>, 어떤 실수를 한 걸까요. <b>유노윤호</b>는 지난 2월 말 서울의 한 음식점에서 자정까지 머물다 경찰에... ",
            "pubDate": "Wed, 10 Mar 2021 17:19:00 +0900"
        },
     */

    @SerializedName("lastBuildDate")
    private String lastBuildDate;
    @SerializedName("total")
    private int total;
    @SerializedName("start")
    private int start;
    @SerializedName("display")
    private int display;
    @SerializedName("items")
    private List<Items> items = null;

    public String getLastBuildDate() {
        return lastBuildDate;
    }

    public void setLastBuildDate(String lastBuildDate) {
        this.lastBuildDate = lastBuildDate;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getDisplay() {
        return display;
    }

    public void setDisplay(int display) {
        this.display = display;
    }

    public List<Items> getItems() {
        return items;
    }

    public void setItems(List<Items> items) {
        this.items = items;
    }
}
