class Car
{
  private int num;
  private double gas;

  public void setCar(int n)
  {
    num = n;
    System.out.println("ナンバーを" + num + "に設定しました。");
  }

  public void setCar(double g)
  {
    gas = g;
    System.out.println("ガソリンを" + gas + "に設定しました。");
  }

  public void setCar(int n, double g)
  {
    num = n;
    gas = g;
    System.out.println("ナンバーを" + num + "に、ガソリンを" + gas + "に設定しました。");
  }

  public void show()
  {
    System.out.println("ナンバーは" + num + "、ガソリンは" + gas + "です。");
  }
}

class Sample3
{
  public static void main(String[] args)
  {
    Car car1 = new Car();

    car1.setCar(1234, 10.5);
    car1.show();

    car1.setCar(5678);
    car1.show();

    car1.setCar(30.0);
    car1.show();

  }
}
