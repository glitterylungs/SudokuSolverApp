package com.example.sudokusolver;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private SudokuBoard gameBoard;
    private Solver gameBoardSolver;
    private Button solveBTN;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        gameBoard = findViewById(R.id.SudokuBoard);
        gameBoardSolver = gameBoard.getSolver();
        solveBTN = findViewById(R.id.solveButton);
    }

    public void BTNOnePress(View view){
        gameBoardSolver.setNumberPosition(1);
        gameBoard.invalidate();
    }

    public void BTNTwoPress(View view){
        gameBoardSolver.setNumberPosition(2);
        gameBoard.invalidate();
    }

    public void BTNThreePress(View view){
        gameBoardSolver.setNumberPosition(3);
        gameBoard.invalidate();
    }

    public void BTNFourPress(View view){
        gameBoardSolver.setNumberPosition(4);
        gameBoard.invalidate();
    }

    public void BTNFivePress(View view){
        gameBoardSolver.setNumberPosition(5);
        gameBoard.invalidate();
    }

    public void BTNSixPress(View view){
        gameBoardSolver.setNumberPosition(6);
        gameBoard.invalidate();
    }

    public void BTNSevenPress(View view){
        gameBoardSolver.setNumberPosition(7);
        gameBoard.invalidate();
    }

    public void BTNEightPress(View view){
        gameBoardSolver.setNumberPosition(8);
        gameBoard.invalidate();
    }

    public void BTNNinePress(View view){
        gameBoardSolver.setNumberPosition(9);
        gameBoard.invalidate();
    }

    public void BTNSolve(View view){
        if(solveBTN.getText().toString().equals(getString(R.string.solve))){
            solveBTN.setText(getString(R.string.clear));

            gameBoardSolver.getEmptyBoxIndices();

            SolveBoardThread solveBoardThread = new SolveBoardThread();
            new Thread(solveBoardThread).start();
            gameBoard.invalidate();
        }
        else{
            solveBTN.setText(getString(R.string.solve));

            gameBoardSolver.resetBoard();
            gameBoard.invalidate();
        }
    }

    class SolveBoardThread implements Runnable{
        @Override
        public void run(){
            gameBoardSolver.solve(gameBoard);
        }
    }

}