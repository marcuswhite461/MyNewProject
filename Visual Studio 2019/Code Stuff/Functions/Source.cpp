#include <iostream>
using std::cout;
using std::cin;
using std::endl;
void board();
int check4Win();

char square[10] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

int player = 1, i, choise;

int main()
{
    
	
    
    char Mark1;

    do 
    {

        board();
        
        cin >> choise;

        player = (player % 2) ? 1 : 2;

        Mark1 = (player == 1) ? 'X' : 'O' ;
        if (choise == 1 && square[1] == '1')
            square[1] = Mark1;

        else if (choise == 2 && square[2] == '2')
            square[2] = Mark1;

        else if (choise == 3 && square[3] == '3')
            square[3] = Mark1;

        else if (choise == 4 && square[4] == '4')
            square[4] = Mark1;

        else if (choise == 5 && square[5] == '5')
            square[5] = Mark1;

        else if (choise == 6 && square[6] == '6')
            square[6] = Mark1;

        else if (choise == 7 && square[7] == '7')
            square[7] = Mark1;

        else if (choise == 8 && square[8] == '8')
            square[8] = Mark1;

        else if (choise == 9 && square[9] == '9')
            square[9] = Mark1;
        
        else
        {
            cout << "Invalid move";

            player--;
            cin.ignore();
            cin.get();
        }
        
        check4Win();
    } while (i == 1);
    int i = 1;
        
    if (i == -1)

        cout << " ==> aPlayer" << player << " win ";
    else if (i = 0)
        cout << " ==> aGame draw";

    board();
    cin.ignore();
    cin.get();
    return 0;
    






}
int check4Win()
{
    if (square[1] == square[2] && square[2] == square[3])

        return 1;
    else if (square[4] == square[5] && square[5] == square[6])

        return 1;
    else if (square[7] == square[8] && square[8] == square[9])

        return 1;
    else if (square[1] == square[4] && square[4] == square[7])

        return 1;
    else if (square[2] == square[5] && square[5] == square[8])

        return 1;
    else if (square[3] == square[6] && square[6] == square[9])

        return 1;
    else if (square[1] == square[5] && square[5] == square[9])

        return 1;
    else if (square[3] == square[5] && square[5] == square[7])

        return 1;
    else if (square[1] != '1' && square[2] != '2' && square[3] != '3'
        && square[4] != '4' && square[5] != '5' && square[6] != '6'
        && square[7] != '7' && square[8] != '8' && square[9] != '9')

        return 0;
    else
        return -1;
}











void board()
{
    system("cls");
    cout << "\n\n\tTic Tac Toe\n\n";

    cout << "Player 1 (X)  -  Player 2 (O)" << endl << endl;
    cout << endl;

    cout << "     |     |     " << endl;
    cout << "  " << square[1] << "  |  " << square[2] << "  |  " << square[3] << endl;

    cout << "_____|_____|_____" << endl;
    cout << "     |     |     " << endl;

    cout << "  " << square[4] << "  |  " << square[5] << "  |  " << square[6] << endl;

    cout << "_____|_____|_____" << endl;
    cout << "     |     |     " << endl;

    cout << "  " << square[7] << "  |  " << square[8] << "  |  " << square[9] << endl;

    cout << "     |     |     " << endl << endl;


    cout << "Welcome Player " << player << " Select a square " << endl;
}





