class Car
{
  int num;
  double gas;

  int getNum()
  {
    System.out.println("ナンバーを調べます。");
    return num;
  }

  double getGas()
  {
    System.out.println("ガソリンを調べます。");
    return gas;
  }

  void setNumGas(int n, double g)
  {
    num = n;
    gas = g;
    System.out.println("ナンバーを" + num);
    System.out.println("ガソリンを" + gas + "に設定しました。");
  }

  void show()
  {
    System.out.println("車のナンバーは" + num + "です。");
    System.out.println("ガソリンは" + gas + "です。");
  }
}
class Sample6
{
  public static void main(String[] args)
  {
    Car car1 = new Car();

    car1.setNumGas(1234, 20.5);

    int number = car1.getNum();
    double gasoline = car1.getGas();

    System.out.println("ナンバーは" + number);
    System.out.println("ガソリンは" + gasoline);
  }
}
