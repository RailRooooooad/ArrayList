/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NOTGENERICSContainerArrayProgram;

/**
 * 
 * 
 * 
 * 
 */


public class EthanHourihanContainer
{
    int max=0;
    int currentPosition=0, positionRequested;
    String[] data;
    String inputData;
    
    public EthanHourihanContainer()
    {
        currentPosition=0;
        data[0]="Ethan";
    }
    
    public EthanHourihanContainer(String inputData)//, int position)
    {
        //currentPosition=position;
        this.inputData=inputData;        
    }
    
    public void setNum1(String data[])
    {
        this.data=data;
    }
    
    public void setCurrentPosition(int currentPosition)
    {
        this.currentPosition=currentPosition;
    }
    
    public int getCurrentPosition()
    {
        return currentPosition;
    }
    
    
    public void setPosition(int positionRequested)
    {
        if(positionRequested>data.length)
            System.out.println("The array is smaller. Use a smaller number");
        else
            this.positionRequested=positionRequested;
    }
    
    
    public int getMax()
    {
        return max;
    }
    
    public void setArray()
    {
        data=inputData.split(" ");
        for(int i = 0; i<data.length; i++)
        {
            //System.out.println("TEST: "+data[i]);
            max++;
        }
    }
    
    
    public String getData()
    {
        return this.data[positionRequested];
    }
    
    
    
    
    
}
