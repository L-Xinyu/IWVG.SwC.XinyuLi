public class Point {
    private String x;
    private String y;
    /**
     * 默认构造函数
     */
    public Point(){
    }
    /**
     *有x和y的构造方法。
     */
    public Point(String x,String y){
        this.x=x;
        this.y=y;
    }
    public String getX() {
        return x;
    }
    public void setX(String x) {
        this.x = x;
    }
    public String getY() {
        return y;
    }
    public void setY(String y) {
        this.y = y;
    }
}

