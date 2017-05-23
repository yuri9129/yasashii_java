class Car
{
  int num;
  double gas;

  void setNum(int n)
  {
    num = n;
    System.out.println("ナンバーを" + num + "に設定しました。");
  }

  void setGas(double g)
  {
    gas = g;
    System.out.println("ガソリンを" + gas + "に設定しました。");
  }

  void show()
  {
    System.out.println("ナンバーは" + num);
    System.out.println("ガソリンは" + gas + "です。");
  }
}

class Sample4
{
  public static void main(String[] args)
  {
    Car car1 = new Car();
    car1.setNum(1234);
    car1.setGas(21.5);

    car1.show();
  }
}
