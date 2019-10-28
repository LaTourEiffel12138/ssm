package org.ssm.utils;

import java.util.List;

public class PageBean<T> {
    private int nowPage;
    private int pageSize;
    private int totalCount;
    private int totalPage;
    private List<T> data;

    public PageBean() {
        super();
        // TODO Auto-generated constructor stub
    }

    public PageBean(int nowPage, int pageSize, int totalCount, int totalPage, List<T> data) {
        super();
        this.nowPage = nowPage;
        this.pageSize = pageSize;
        this.totalCount = totalCount;
        this.totalPage = totalPage;
        this.data = data;
    }

    @Override
    public String toString() {
        return "PageBean [nowPage=" + nowPage + ", pageSize=" + pageSize + ", totalCount=" + totalCount + ", totalPage="
                + totalPage + ", data=" + data + "]";
    }

    public int getNowPage() {
        return nowPage;
    }

    public void setNowPage(int nowPage) {
        this.nowPage = nowPage;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }

    public boolean isNextPage() {
        if (nowPage == totalPage) {
            return false;
        }
        return true;
    }

    public boolean isPrePage() {
        if (nowPage == 1) {
            return false;
        }
        return true;
    }
}
