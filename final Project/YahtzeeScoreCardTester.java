
/*******************************************************************************
*                         Assignment 5 � Yahtzee solo game                     *
*                                                                              *
* PROGRAMMER:       Angel Rivera                                               *
* CLASS:            CG102                                                      *
* ASSIGNMENT:       5                                                          *
* INSTRUCTOR:       Dean Zeller                                                *
* SUBMISSION DATE:  3/8/19                                                     *
*                                                                              *
* DESCRIPTION:                                                                 *
* The purpose of this tester is to simulate a solo game of Yahtzee.            *
*                         .                                                    *
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
        while(i<1)
        {
            card.rollDice(true,true,true,true,true);
            card.user();
            
            System.out.println();
            i++;
            
            
        }
        card.lastTable();
        System.out.println("Your final score was: "+card.totalScore);
    }
}