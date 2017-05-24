class MyPoint
{
  private int x;
  private int y;

  public MyPoint()
  {
    x = 0;
    y = 0;
    System.out.println("座標を作成しました。");
  }

  public MyPoint(int px, int py)
  {
    if( x >= 0 && x <= 100 && y >= 0 && y <= 100){
      x = px;
      y = py;
      System.out.println("座標(" + x + "," + y + ")を設定しました。");
    }else{
      System.out.println("0から100以外の値が入力されています。");
    }
  }

  public void setX(int px)
  {
    if(x >= 0 && x <= 100){
      x = px;
      System.out.println("X座標を" + x + "に変更しました。");
    }else{
      System.out.println("0から100以外の値が入力されています。");
    }
  }

  public void setY(int py)
  {
    if(y >= 0 && y <= 100){
      y = py;
      System.out.println("y座標を" + y + "に変更しました。");
    }else{
      System.out.println("0から100以外の値が入力されています。");
    }
  }

  public int getX()
  {
    System.out.println("X座標は" + x + "です。");
    return x;
  }

  public int getY()
  {
    System.out.println("Y座標は" + y + "です。");
    return y;
  }
}


class SampleP5
{
  public static void main(String[] args)
  {
    MyPoint myPoint = new MyPoint(12, 34);
    myPoint.getX();
    myPoint.getY();
  }
}
