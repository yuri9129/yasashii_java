class Car
{
  public static int sum = 0;

  private int num;
  private double gas;

  public Car()
  {
    num = 0;
    gas = 0.0;
    sum++;
    System.out.println("車を作成しました。");
  }

  public void setCar(int n, double g)
  {
    num = n;
    gas = g;
    System.out.println("ナンバーを" + num + "に、ガソリンを" + gas + "に設定しました。");
  }

  public static void showSum()
  {
    System.out.println("車は全部で" + sum + "台あります。");
  }

  public void show(){
    System.out.println("車のナンバーは" + num + "、ガソリンは" + gas + "です。");
  }
}

class Sample8
{
  public static void main(String[] args)
  {
    Car.showSum();

    Car car1 = new Car();
    car1.setCar(1234, 20.5);

    Car.showSum();

    Car car2 = new Car();
    car2.setCar(5678, 30.5);

    Car.showSum();
  }
}
