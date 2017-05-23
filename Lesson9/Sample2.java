class Car
{
  private int num;
  private double gas;
  //int num;
  //double gas;
  public void setNumGas(int n, double g)
  {
    if(g > 0 && g < 1000){
      num = n;
      gas = g;
      System.out.println("ナンバーを" + num +"に、ガソリンを" + gas + "に設定しました。");
    }else{
      System.out.println(g + "はただしいガソリンの値ではありません。");
      System.out.println("ガソリンを変更できませんでした。");
    }
  }

  public void show()
  {
    System.out.println("車のナンバーは" + num);
    System.out.println("ガソリンは" + gas + "です。");
  }n
}

class Sample2
{
  public static void main(String[] args)
  {
    Car car1 = new Car();

    car1.setNumGas(1234, -10);
    car1.show();
  }
}
