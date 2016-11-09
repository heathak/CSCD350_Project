package f16cs350.project.loader.communication;

import java.util.*;

public class CommunicationLoader
{
   public CommunicationLoader(int base, int encodingSize)
   {
   
   }
   
   public int calculateMaxValue(int base, int size)
   {
      return 0;
   }
   
   public String decodeLog(String log)
   {
      return log;
   }
   
   public String decodeStatement(String statement)
   {
      return statement;
   }
   
   public double decodeTime(String time)
   {
      return 0.0;
   }
   
   public String encodeStatement(double time, String words)
   {
      return words;
   }
   
   public String encodeTime(double time)
   {
      return "";
   }
   
   public int getBase()
   {
      return 0;
   }
   
   public Map getDictionary() // String, String
   {
      Map<String, String> map = new HashMap<String, String>();
      return map;
   }
   
   public int getDictionaryChecksum()
   {
      return 0;
   }
   
   public int getEncodingSize()
   {
      return 0;
   }
   
   public String getNextFreeIndex()
   {
      return "";
   }
   
   public boolean isValidCustomIndex(String index)
   {
      return false;
   }
   
   public boolean isValidIndex(String index)
   {
      return false;
   }
   
   public String registerCustomerWord(String index, String word)
   {
      return word;
   }
   
   @Override
   public String toString()
   {
      return "";
   }
}
