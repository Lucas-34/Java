/* 
THE SPIRAL-PATTERN MAZE = step 2

Now we use '1' instead of '.' to indicate empty cells. Space (' ') cells are walls.

This exercise will ask you to print a maze shaped like a spiral.

111111
     1
 111 1
 1 1 1
 1   1
 11111
 
11111111
       1
 11111 1
 1   1 1
 1 1 1 1
 1 111 1
 1     1
 1111111
 
 
Hint: 
- carefully think of what possible values the Size constant can have. 
Then initialize size in a correct way

Questions:
	1 - Complete the code to obtain a labryrinth where the paths form a spiral 
	starting from the top left corner and going toward the center. 
	
	2 - Change size/2 cells containing a wall (a space ' ') into cells containing a path ('1')
	with the following constraints: 
	    - each modified cell connects two horizontal paths
	    - each modified cell is not adjacent to another modified cell
	Hint: the resulting maze should now have shortcuts to go from the top left cell to the center, 
	and the maze still be readable (not a mess ;)
*/

public class Main
{
    public static void display(char labyrinth [][])
    {
        for(int i=0 ; i<labyrinth.length; i++) // for each row of the labyrinth
        {  
			for(int j=0; j<labyrinth.length;j++) // for each column of the labyrinth
			{
                System.out.print(labyrinth[i][j]);
            }
        	
        	System.out.println();
        }
    }
    public static void main(String[] args)
    {
        final int size = 12;
        char [][] labyrinth = new char [size][size];
        // complete code here to fill the labyrinth as requested
		
		System.out.println("Labyrinth: \n");
		
		for(int i=0 ; i<size; i++) // for each row of the labyrinth
		{  
			for(int j=0; j<size;j++) // for each column of the labyrinth
			{  
				labyrinth[i][j] = '1';
			}
		}
        
        display(labyrinth);
        
        System.out.println("That's all folks");
    }
}




/*

x=center
y=center
nbones=1
dir='e'

while(not an edge)
{
    onesInDirection(x,y,dir,lab,nbones)
    {
        modif x
        modif y
        dir = next(dir)
        nbones ++
    }
}

onesInDirection(nb)
{
    i=x
    j=y
    
    for(n=0;n<nb;n++)
    {
        lab[i][j] = '1'
        
        switch(dir)
        {
            case 'N':i
            case 'S':i
            case 'E':j
            case 'W':j
        }
    }
}
        }
    }
}