package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;

//TODO: Find a way to have things pull from the database
//TODO: Code the buttons and the textViews so that they show the required information
//TODO: Figure out a way of randomising things so the answer isn't always on the first button
//TODO: See if there's a better way to add things to the database
//TODO: Add more things to the database

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        databaseCreation();
    }
    public void databaseCreation(){
        SQLiteDatabase mydatabase = openOrCreateDatabase("Questions Database",MODE_PRIVATE,null);
        mydatabase.execSQL("CREATE TABLE IF NOT EXISTS Questions(Category VARCHAR,Question VARCHAR, Correct VARCHAR, Wrong VARCHAR, Wrong2 VARCHAR, Wrong3 VARCHAR);");
        mydatabase.execSQL("INSERT INTO Questions VALUES('Geography','What is the capital of Chile?', 'Santigo', 'Valparaiso', 'Vina del Mar', 'Punta Arenas');");
        mydatabase.execSQL("INSERT INTO Questions VALUES('Geography', 'What is the highest mountain in Britian?', 'Ben Nevis','Scafell Pike','Snowdon','Helvellyn')");
        mydatabase.execSQL("INSERT INTO Questions VALUES('Geography', 'What is the smallest county in the world?','Vatican City','Monaco','Tuvalu','San Marino')");
        mydatabase.execSQL("INSERT INTO Questions VALUES('Geography', 'Alberta is a province of which county?','Canada','Australia','America','Brazil')");
        mydatabase.execSQL("INSERT INTO Questions VALUES('Geography', 'How many countries have the shilling as currency?','4','2','1','5')");
        mydatabase.execSQL("INSERT INTO Questions VALUES('Geography', 'Which is the only vowel not used used as the first letter of a US state?','E','U','I','O')");
        mydatabase.execSQL("INSERT INTO Questions VALUES('Geography', 'What is the largest country in the world?','Russia','India','Canda','China')");
        mydatabase.execSQL("INSERT INTO Questions VALUES('Geography', 'Where would you find the Severn River?','Wales','Scotland','England','Ireland')");
        mydatabase.execSQL("INSERT INTO Questions VALUES('Geography', 'What is the hottest continent on Earth?','Africa','South America','Asia','Oceania')");
        mydatabase.execSQL("INSERT INTO Questions VALUES('Geography', 'What is the longest river in the world?','River Nile','Amazon River','Yangtze','Yellow River')");
        mydatabase.execSQL("INSERT INTO Questions VALUES('History', 'What did the Romans call Scotland?','Caledonia','Dictim','Canturia','Lindinis')");
        mydatabase.execSQL("INSERT INTO Questions VALUES('History', 'Who was the mayor of London in 1397, 1398, 1406 and 1419?','Richard (Dick) Whittington','John le Blund','William More','Thomas Knollys')");
        mydatabase.execSQL("INSERT INTO Questions VALUES('History', 'Who was Henry VIIIs last wife?','Katherine Parr','Catherine Howard','Anne of Cleves','Jane Seymour')");
        mydatabase.execSQL("INSERT INTO Questions VALUES('History', 'Who was the youngest British Prime Minister?','William Pitt','William Cavendish','Charles Watson-Wentworth','Augustus FitzRoy')");
        mydatabase.execSQL("INSERT INTO Questions VALUES('History', 'In what year was Joan of Arc burned at the stake?','1431','1435','1421','1442')");
        mydatabase.execSQL("INSERT INTO Questions VALUES('History', 'What nationality was the polar explorer Roald Amundsen?','Norwegian','Swiss','Polish','Scandinavian')");
        mydatabase.execSQL("INSERT INTO Questions VALUES('History', 'Which English explorer was executed in 1618, fifteen years after being found guilty of conspiracy against King James I of England and VI of Scotland?','Sir Walter Raleigh','Sir Andrew Watson','Sir Matthew Rols','Sir Edward Hound')");
        mydatabase.execSQL("INSERT INTO Questions VALUES('History','Who was the first female Prime Minister of Australia?','Julia Gillard','Clare Martin','Carmen Lawrence','Kate Carnell')");
        mydatabase.execSQL("INSERT INTO Questions VALUES('History','Which English city was once known as Duroliponte?','Cambridge','Canterbury','Godmanchester','Dover')");
        mydatabase.execSQL("INSERT INTO Questions VALUES('History','The first successful vaccine introduced in 1796 guarded against which disease?','Smallpox','Leprosy','Tuberculosis','Mumps')");
        //mydatabase.execSQL("INSERT INTO Questions VALUES('','','','','','')");//
    }
}