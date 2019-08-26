package edu.ustc.SpringStart.tmall.util;

public class Page {
    int start;//开始位置
    int count;//每页数量
    int total;//总数
    String param;//参数

    private static final int defaultCount = 5;

    public Page() {
        count = defaultCount;
    }

    public Page(int start, int count) {
        this.start = start;
        this.count = count;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public String getParam() {
        return param;
    }

    public void setParam(String param) {
        this.param = param;
    }

    public int getTotalPage() {
        if (total == 0) return 1;
        if (0 == total % count)
            return total / count;
        else
            return total / count + 1;
    }

    public int getLast() {
        if (total == 0) return 0;
        if (0 == total % count) {
            return total - count;
        } else {
            return total - total % count;
        }
    }

    public boolean isHasPrevious() {
        return start > 0;
    }

    public boolean isHasNext() {
        return start < getLast();
    }

    @Override
    public String toString() {
        return "Page{" +
                "start=" + start +
                ", count=" + count +
                ", total=" + total +
                ", param='" + param + '\'' +
                '}';
    }
}
