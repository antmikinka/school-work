import java.text.DecimalFormat;
/**
 * Write a description of class APChapter7Notes here.
 *
 * @author (AM)
 * @version (12/9/19)
 */
public class Auto
{ 
  //instance variables
      
  private String model;//model of auto
  private int milesDriven;//number of miles driven
  private double gallonsOfGas;//number of gallons of gas
  private int value;//value of vehicle
  public Auto()
  {
          model = "unknown";
  }
     
    
  public Auto(String startModel,
                  int startMilesDriven, 
                  double startGallonsOfGas, 
                  int startValue)
  { 
      model = startModel;
      if(startMilesDriven>=0)
      milesDriven = startMilesDriven;
      
      if(startGallonsOfGas>=0.0)
      gallonsOfGas = startGallonsOfGas;
      
      value = startValue;
  }
    //Accessor method
    //returns value
  public String getModel()
  {
        return model;  
  }
  
  public int getMilesDriven()
  {
          return milesDriven;
  }
      
  public double getGallonsOfGas()
  {
          return gallonsOfGas;
  }
  
  public int getValue()
  {
      return value;
  }
  
  public void setModel(String newModel)
  {
      this.model = newModel;
  }
  
  public void setMilesDriven(int newMilesDriven)
  {
      if(newMilesDriven>=0)
        milesDriven = newMilesDriven;
  }
  
  public void setGallonsOfGas(double newGallonsOfGas)
  {
      if(newGallonsOfGas>=0.0)
      gallonsOfGas = newGallonsOfGas;
  }
  
  public void setValue(int newValue)
  {
      value = newValue;
  }
  
  public int depreciatedValue(int years)
  {
      int depValue = 0; //local variable
      if(value-years*250>=0)
      depValue = value-years*250;
      return depValue;
  }
  
  @Override
  public String toString()
   {
      DecimalFormat gallonsFormat = new DecimalFormat("#0.00");
      DecimalFormat valueFormat = new DecimalFormat("$0");
      return "Model: " + model
      + "; miles driven: " + milesDriven
      + "; gallons of gas: " 
      + gallonsFormat.format(gallonsOfGas) + "value: " 
      + valueFormat;
  }
  
  @Override
  public boolean equals(Object o)
  {
     if(!(o instanceof Auto))
        return false;
        else
        {
            Auto objAuto = (Auto) o;
            if(model.equals(objAuto.model)
                && milesDriven == objAuto.milesDriven
                && Math.abs(gallonsOfGas - objAuto.gallonsOfGas)
                                                    <0.0001)
                   return true;
            else
                   return false;
        }
  }
}
