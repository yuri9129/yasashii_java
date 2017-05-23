class Car
{
  int num;
  double gas;

  void show()
  {
    System.out.println("車のナンバーは" + num);
    System.out.println("ガソリンは" + gas);
  }

  void showCar()
  {
    System.out.println("車の情報を表示します。");
    show();
  }
}

class Sample3
{
  public static void main(String[] args)
  {
    Car car1 = new Car();
    car1.num = 1234;
    car1.gas = 20.9;
    car1.showCar();
    System.out.println("======");
    car1.show();
  }
}
