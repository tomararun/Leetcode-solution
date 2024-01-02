class Solution:
    def gameOfLife(self, board: List[List[int]]) -> None:
        """
        Do not return anything, modify board in-place instead.
        """
        m = len(board)
        n = len(board[0])
        d = [(1,0) , (-1,0) , (0,1) , (0,-1) , (1,1) , (-1,-1) , (1,-1) , (-1,1)]
        dummy = []
        for i in board :
            dummy.append(i[:])
            
        for i in range(m) :
            for j in range(n) :
                live = 0
                dead = 0
                for x , y in d :
                    a = x + i
                    b = y + j
                    
                    if m > a >= 0 and n > b >= 0 :
                        if dummy[a][b] == 1 :
                            live += 1
                            
                            
                        else :
                            dead += 1
                 
                if dummy[i][j] == 1:
                        
                    if live < 2 :
                        board[i][j] = 0
                    elif 3 >= live >= 2 :
                        board[i][j] = 1
                    elif live > 3 :
                        board[i][j] = 0
                    
                else :
                    if live == 3 :
                        board[i][j] = 1