/*******************************************************************************
*                       Final Project- SoloAppTester                           *
*                                                                              *
* PROGRAMMER:       Angel Rivera                                               *
* CLASS:            CG102                                                      *
* ASSIGNMENT:       Final Project                                              *
* INSTRUCTOR:       Dean Zeller                                                *
* SUBMISSION DATE:  4/27/19                                                    *
*                                                                              *
* DESCRIPTION:                                                                 *
* This program works as the sologame tester                                    *
*                                                                              *
* COPYRIGHT:                                                                   *
* This program is (c) 2019 Angel Rivera and Dean Zeller. This is original work,*
* without use of outside sources.                                              *
*******************************************************************************/
public class YahtzeeScoreCardTester
{
    public static void main(String args[])
    {
        YahtzeeScoreCard card= new YahtzeeScoreCard();
       
        int i;
        i=0;
        while(i<13
             
             )
        {
            card.rollDice(true,true,true,true,true);
            card.user();
            card.tries();
            System.out.println();
            i++;
            
            
        }
        card.last();
        System.out.println("Your final score was: "+card.totalScore);
    }
}