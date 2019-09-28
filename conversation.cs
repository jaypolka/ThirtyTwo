using System;
using System.Collections.Generic;
//cerner_2^5_2019
class Program
{
    static void Main(string[] args)
    {
        Dictionary<String, String> dictionary = new Dictionary<String, String>();

        while (true)
        {
            String previous = "hello";
            foreach (String s in Console.In.ReadLine().Split(' '))
            {
                dictionary.TryAdd(previous.ToLower(), s.ToLower());
                previous = s;
            }

            String response = previous;
            for (int i = 0; i < 10 && previous != null; ++i)
            {
                String nextItem = dictionary.GetValueOrDefault(previous);
                if (nextItem != null)
                    response += " " + nextItem;
                previous = nextItem;
            }
            Console.Out.WriteLine(response + "?");
            Console.Out.Flush();
        }
    }
}