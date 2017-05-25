class Car
{
  private int num;
  private double gas;

  public Car()
  {
    num = 0;
    gas = 0;
    System.out.println("車を作成しました。");
  }

  public Car(int n, double g)
  {
    num = n;
    gas = g;
    System.out.println("ナンバーを" + num + "に、ガソリンを" + gas + "にしました。");
  }

  public void show()
  {
    System.out.println("ナンバーは" + num + "です。");
    System.out.println("ガソリンは" + gas + "です。");
  }
}

class RacingCar extends Car
{
  private int course;

  public RacingCar()
  {
    course = 0;
    System.out.println("レーシングカーを作成しました。");
  }

  public RacingCar(int n, double g, int c)
  {
    super(n, g);
    course = c;
    System.out.println("コース番号" + c + "のレーシングカーを作成しました。");
  }

  public void setCource(int c)
  {
    course = c;
    System.out.println("コース番号を" + course + "にしました。");
  }
}

class Sample2
{
  public static void main(String[] args)
  {
    RacingCar rccar1 = new RacingCar(1234, 20.5, 5);
  }
}
