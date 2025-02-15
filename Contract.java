
public class Contract extends Employee {

  private double nbHours = -1.0;
  private double hourRate = -1.0;
  private double percentHourSup  = -1.0;
  private static final double dueHour  = 40.0;

  Contract(String name) {
    super(name);
  }

  Contract (String name, double nbHours, double hourRate, double percentHourSup) {
    super(name);
    this.nbHours = nbHours;
    this.hourRate = hourRate;
    this.percentHourSup = percentHourSup;
  }

  public void setSalaryInfo(double nbHours, double hourRate, double percentHourSup) {
    this.nbHours = nbHours;
    this.hourRate = hourRate;
    this.percentHourSup = percentHourSup;
  }
  
   
  public double getSalary() {
    if (this.nbHours > dueHour){
      return (dueHour * this.hourRate) + ((this.nbHours-dueHour)*this.hourRate*(1+(this.percentHourSup/100)));
    }
    else {
      return this.nbHours * this.hourRate;
    }
  }

 public double getNbHours() {  
    return nbHours;
  }

  public double getHourRate() {
    return hourRate;
  }

  public double getPercentHourSup() {
    return percentHourSup;
  }

   public String toString() {
    return super.toString() + "; nbHours=" + nbHours 
      + "; Hour rate=" + hourRate + "; % Hour Sup=" + percentHourSup;
  }

}

