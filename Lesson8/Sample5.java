class Car
{
  int num;
  double gas;

  void setNumGas(int n, double g)
  {
    num = n;
    gas = g;
    System.out.println("車のナンバーを" + num);
    System.out.println("ガソリンを" + gas + "に設定しました。");
  }

  void show()
  {
    System.out.println("車のナンバーは" + num);
    System.out.println("ガソリンは" + gas + "です。");
  }
}

class Sample5
{
  public static void main(String[] args)
  {
    int number;
    double gasoline;

    System.out.println("car1の設定を始めます。");
    Car car1 = new Car();
    number = 1234;
    gasoline = 10.5;
    car1.setNumGas(number, gasoline);
    car1.show();

    System.out.println("car2の設定を始めます。");
    Car car2 = new Car();
    number = 5678;
    gasoline = 20.6;
    car2.setNumGas(number, gasoline);
    car2.show();
  }
}
