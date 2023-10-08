package com.schedule.your.day.lhj.hj.ffy

import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var flag:String = ""

        val notebook:String = "mynotebook"

        val nob = "6:00"
        val nod = "What you think to do"

        val monTime1 = "monTime1"
        val monText1 = "monText1"
        val monTime2 = "monTime2"
        val monText2 = "monText2"
        val monTime3 = "monTime3"
        val monText3 = "monText3"
        val monTime4 = "monTime4"
        val monText4 = "monText4"
        val monTime5 = "monTime5"
        val monText5 = "monText5"
        val monTime6 = "monTime6"
        val monText6 = "monText6"

        val tueTime1 = "tueTime1"
        val tueText1 = "tueText1"
        val tueTime2 = "tueTime2"
        val tueText2 = "tueText2"
        val tueTime3 = "tueTime3"
        val tueText3 = "tueText3"
        val tueTime4 = "tueTime4"
        val tueText4 = "tueText4"
        val tueTime5 = "tueTime5"
        val tueText5 = "tueText5"
        val tueTime6 = "tueTime6"
        val tueText6 = "tueText6"

        val wedTime1 = "wedTime1"
        val wedText1 = "wedText1"
        val wedTime2 = "wedTime2"
        val wedText2 = "wedText2"
        val wedTime3 = "wedTime3"
        val wedText3 = "wedText3"
        val wedTime4 = "wedTime4"
        val wedText4 = "wedText4"
        val wedTime5 = "wedTime5"
        val wedText5 = "wedText5"
        val wedTime6 = "wedTime6"
        val wedText6 = "wedText6"

        val thuTime1 = "thuTime1"
        val thuText1 = "thuText1"
        val thuTime2 = "thuTime2"
        val thuText2 = "thuText2"
        val thuTime3 = "thuTime3"
        val thuText3 = "thuText3"
        val thuTime4 = "thuTime4"
        val thuText4 = "thuText4"
        val thuTime5 = "thuTime5"
        val thuText5 = "thuText5"
        val thuTime6 = "thuTime6"
        val thuText6 = "thuText6"

        val friTime1 = "friTime1"
        val friText1 = "friText1"
        val friTime2 = "friTime2"
        val friText2 = "friText2"
        val friTime3 = "friTime3"
        val friText3 = "friText3"
        val friTime4 = "friTime4"
        val friText4 = "friText4"
        val friTime5 = "friTime5"
        val friText5 = "friText5"
        val friTime6 = "friTime6"
        val friText6 = "friText6"

        val satTime1 = "satTime1"
        val satText1 = "satText1"
        val satTime2 = "satTime2"
        val satText2 = "satText2"
        val satTime3 = "satTime3"
        val satText3 = "satText3"
        val satTime4 = "satTime4"
        val satText4 = "satText4"
        val satTime5 = "satTime5"
        val satText5 = "satText5"
        val satTime6 = "satTime6"
        val satText6 = "satText6"

        val sunTime1 = "sunTime1"
        val sunText1 = "sunText1"
        val sunTime2 = "sunTime2"
        val sunText2 = "sunText2"
        val sunTime3 = "sunTime3"
        val sunText3 = "sunText3"
        val sunTime4 = "sunTime4"
        val sunText4 = "sunText4"
        val sunTime5 = "sunTime5"
        val sunText5 = "sunText5"
        val sunTime6 = "sunTime6"
        val sunText6 = "sunText6"

        val pref:SharedPreferences = getSharedPreferences(notebook,0)
        val editor = pref.edit()


        val mondayBtn = findViewById<Button>(R.id.monday_btn)
        val tuesdayBtn = findViewById<Button>(R.id.tuesday_btn)
        val wednesdayBtn = findViewById<Button>(R.id.wednesday_btn)
        val thursdayBtn = findViewById<Button>(R.id.thursday_btn)
        val fridayBtn = findViewById<Button>(R.id.friday_btn)
        val saturdayBtn = findViewById<Button>(R.id.saturday_btn)
        val sundayBtn = findViewById<Button>(R.id.sunday_btn)

        val firstTime = findViewById<EditText>(R.id.first_time)
        val firstText = findViewById<EditText>(R.id.frist_text)
        val secondTime = findViewById<EditText>(R.id.second_time)
        val secondText = findViewById<EditText>(R.id.second_text)
        val thirdTime = findViewById<EditText>(R.id.third_time)
        val thirdText = findViewById<EditText>(R.id.third_text)
        val fourthTime = findViewById<EditText>(R.id.fourth_time)
        val fourthText = findViewById<EditText>(R.id.fourth_text)
        val fifthTime = findViewById<EditText>(R.id.fifth_time)
        val fifthText = findViewById<EditText>(R.id.fifth_text)
        val sixTime = findViewById<EditText>(R.id.six_time)
        val sixText = findViewById<EditText>(R.id.six_text)

        val btnSave = findViewById<Button>(R.id.first_btn)


        fun del() {
            if (firstTime.getText().toString().equals("") || firstText.getText().toString().equals(""))
            {
                firstTime.hint = "6:00"
                firstText.hint = "What you think to do"
            }
            else{
                firstTime.setText(null)
                firstText.setText(null)
            }
            if (secondTime.getText().toString().equals("") || secondText.getText().toString().equals(""))
            {
                secondTime.hint = "6:00"
                secondText.hint = "What you think to do"
            }
            else{
                secondTime.setText(null)
                secondText.setText(null)
            }
            if (thirdTime.getText().toString().equals("") || thirdText.getText().toString().equals(""))
            {
                thirdTime.hint = "6:00"
                thirdText.hint = "What you think to do"
            }
            else{
                thirdTime.setText(null)
                thirdText.setText(null)
            }
            if (fourthTime.getText().toString().equals("") || fourthText.getText().toString().equals(""))
            {
                fourthTime.hint = "6:00"
                fourthText.hint = "What you think to do"
            }
            else{
                fourthTime.setText(null)
                fourthText.setText(null)
            }
            if (fifthTime.getText().toString().equals("") || fifthText.getText().toString().equals(""))
            {
                fifthTime.hint = "6:00"
                fifthText.hint = "What you think to do"
            }
            else{
                fifthTime.setText(null)
                fifthText.setText(null)
            }
            if (sixTime.getText().toString().equals("") || sixText.getText().toString().equals(""))
            {
                sixTime.hint = "6:00"
                sixText.hint = "What you think to do"
            }
            else{
                sixTime.setText(null)
                sixText.setText(null)
            }

        }
        mondayBtn.setOnClickListener {
            del()
            flag = "Monday"
            firstTime.hint = pref.getString(monTime1,"6:00")
            firstText.hint = pref.getString(monText1,"What you think to do")
            secondTime.hint = pref.getString(monTime2,"6:00")
            secondText.hint = pref.getString(monText2,"What you think to do")
            thirdTime.hint = pref.getString(monTime3,"6:00")
            thirdText.hint = pref.getString(monText3,"What you think to do")
            fourthTime.hint = pref.getString(monTime4,"6:00")
            fourthText.hint = pref.getString(monText4,"What you think to do")
            fifthTime.hint = pref.getString(monTime5,"6:00")
            fifthText.hint = pref.getString(monText5,"What you think to do")
            sixTime.hint = pref.getString(monTime6,"6:00")
            sixText.hint = pref.getString(monText6,"What you think to do")
        }
        tuesdayBtn.setOnClickListener {
            del()
            flag = "Tuesday"
            firstTime.hint = pref.getString(tueTime1,"6:00")
            firstText.hint = pref.getString(tueText1,"What you think to do")
            secondTime.hint = pref.getString(tueTime2,"6:00")
            secondText.hint = pref.getString(tueText2,"What you think to do")
            thirdTime.hint = pref.getString(tueTime3,"6:00")
            thirdText.hint = pref.getString(tueText3,"What you think to do")
            fourthTime.hint = pref.getString(tueTime4,"6:00")
            fourthText.hint = pref.getString(tueText4,"What you think to do")
            fifthTime.hint = pref.getString(tueTime5,"6:00")
            fifthText.hint = pref.getString(tueText5,"What you think to do")
            sixTime.hint = pref.getString(tueTime6,"6:00")
            sixText.hint = pref.getString(tueText6,"What you think to do")
        }
        wednesdayBtn.setOnClickListener {
            del()
            flag = "Wednesday"
            firstTime.hint = pref.getString(wedTime1,"6:00")
            firstText.hint = pref.getString(wedText1,"What you think to do")
            secondTime.hint = pref.getString(wedTime2,"6:00")
            secondText.hint = pref.getString(wedText2,"What you think to do")
            thirdTime.hint = pref.getString(wedTime3,"6:00")
            thirdText.hint = pref.getString(wedText3,"What you think to do")
            fourthTime.hint = pref.getString(wedTime4,"6:00")
            fourthText.hint = pref.getString(wedText4,"What you think to do")
            fifthTime.hint = pref.getString(wedTime5,"6:00")
            fifthText.hint = pref.getString(wedText5,"What you think to do")
            sixTime.hint = pref.getString(wedTime6,"6:00")
            sixText.hint = pref.getString(wedText6,"What you think to do")
        }
        thursdayBtn.setOnClickListener {
            del()
            flag = "Thursday"
            firstTime.hint = pref.getString(thuTime1,"6:00")
            firstText.hint = pref.getString(thuText1,"What you think to do")
            secondTime.hint = pref.getString(thuTime2,"6:00")
            secondText.hint = pref.getString(thuText2,"What you think to do")
            thirdTime.hint = pref.getString(thuTime3,"6:00")
            thirdText.hint = pref.getString(thuText3,"What you think to do")
            fourthTime.hint = pref.getString(thuTime4,"6:00")
            fourthText.hint = pref.getString(thuText4,"What you think to do")
            fifthTime.hint = pref.getString(thuTime5,"6:00")
            fifthText.hint = pref.getString(thuText5,"What you think to do")
            sixTime.hint = pref.getString(thuTime6,"6:00")
            sixText.hint = pref.getString(thuText6,"What you think to do")
        }
        fridayBtn.setOnClickListener {
            del()
            flag = "Friday"
            firstTime.hint = pref.getString(friTime1,"6:00")
            firstText.hint = pref.getString(friText1,"What you think to do")
            secondTime.hint = pref.getString(friTime2,"6:00")
            secondText.hint = pref.getString(friText2,"What you think to do")
            thirdTime.hint = pref.getString(friTime3,"6:00")
            thirdText.hint = pref.getString(friText3,"What you think to do")
            fourthTime.hint = pref.getString(friTime4,"6:00")
            fourthText.hint = pref.getString(friText4,"What you think to do")
            fifthTime.hint = pref.getString(friTime5,"6:00")
            fifthText.hint = pref.getString(friText5,"What you think to do")
            sixTime.hint = pref.getString(friTime6,"6:00")
            sixText.hint = pref.getString(friText6,"What you think to do")
        }
        saturdayBtn.setOnClickListener {
            del()
            flag = "Saturday"
            firstTime.hint = pref.getString(satTime1,"6:00")
            firstText.hint = pref.getString(satText1,"What you think to do")
            secondTime.hint = pref.getString(satTime2,"6:00")
            secondText.hint = pref.getString(satText2,"What you think to do")
            thirdTime.hint = pref.getString(satTime3,"6:00")
            thirdText.hint = pref.getString(satText3,"What you think to do")
            fourthTime.hint = pref.getString(satTime4,"6:00")
            fourthText.hint = pref.getString(satText4,"What you think to do")
            fifthTime.hint = pref.getString(satTime5,"6:00")
            fifthText.hint = pref.getString(satText5,"What you think to do")
            sixTime.hint = pref.getString(satTime6,"6:00")
            sixText.hint = pref.getString(satText6,"What you think to do")
        }
        sundayBtn.setOnClickListener {
            del()
            flag = "Sunday"
            firstTime.hint = pref.getString(sunTime1,"6:00")
            firstText.hint = pref.getString(sunText1,"What you think to do")
            secondTime.hint = pref.getString(sunTime2,"6:00")
            secondText.hint = pref.getString(sunText2,"What you think to do")
            thirdTime.hint = pref.getString(sunTime3,"6:00")
            thirdText.hint = pref.getString(sunText3,"What you think to do")
            fourthTime.hint = pref.getString(sunTime4,"6:00")
            fourthText.hint = pref.getString(sunText4,"What you think to do")
            fifthTime.hint = pref.getString(sunTime5,"6:00")
            fifthText.hint = pref.getString(sunText5,"What you think to do")
            sixTime.hint = pref.getString(sunTime6,"6:00")
            sixText.hint = pref.getString(sunText6,"What you think to do")
        }

        btnSave.setOnClickListener {
            fun tueCh(){
                if(firstTime.getText().toString().equals("") && firstText.getText().toString().equals(""))
                {

                }
                else{
                    editor.putString(tueTime1,firstTime.text.toString()).apply()
                    editor.putString(tueText1,firstText.text.toString()).apply()
                }
                if(secondTime.getText().toString().equals("") && secondText.getText().toString().equals(""))
                {

                }
                else{
                    editor.putString(tueTime2,secondTime.text.toString()).apply()
                    editor.putString(tueText2,secondText.text.toString()).apply()
                }
                if(thirdTime.getText().toString().equals("") && thirdText.getText().toString().equals(""))
                {

                }
                else{
                    editor.putString(tueTime3,thirdTime.text.toString()).apply()
                    editor.putString(tueText3,thirdText.text.toString()).apply()
                }
                if(fourthTime.getText().toString().equals("") && fourthText.getText().toString().equals(""))
                {

                }
                else{
                    editor.putString(tueTime4,fourthTime.text.toString()).apply()
                    editor.putString(tueText4,fourthText.text.toString()).apply()
                }
                if(fifthTime.getText().toString().equals("") && fifthText.getText().toString().equals(""))
                {

                }
                else{
                    editor.putString(tueTime5,fifthTime.text.toString()).apply()
                    editor.putString(tueText5,fifthText.text.toString()).apply()
                }
                if(sixTime.getText().toString().equals("") && sixText.getText().toString().equals(""))
                {

                }
                else{
                    editor.putString(tueTime6,sixTime.text.toString()).apply()
                    editor.putString(tueText6,sixText.text.toString()).apply()
                }
            }
            fun monCh(){
                if(firstTime.getText().toString().equals("") && firstText.getText().toString().equals(""))
                {

                }
                else{
                    editor.putString(monTime1,firstTime.text.toString()).apply()
                    editor.putString(monText1,firstText.text.toString()).apply()
                }
                if(secondTime.getText().toString().equals("") && secondText.getText().toString().equals(""))
                {

                }
                else{
                    editor.putString(monTime2,secondTime.text.toString()).apply()
                    editor.putString(monText2,secondText.text.toString()).apply()
                }
                if(thirdTime.getText().toString().equals("") && thirdText.getText().toString().equals(""))
                {

                }
                else{
                    editor.putString(monTime3,thirdTime.text.toString()).apply()
                    editor.putString(monText3,thirdText.text.toString()).apply()
                }
                if(fourthTime.getText().toString().equals("") && fourthText.getText().toString().equals(""))
                {

                }
                else{
                    editor.putString(monTime4,fourthTime.text.toString()).apply()
                    editor.putString(monText4,fourthText.text.toString()).apply()
                }
                if(fifthTime.getText().toString().equals("") && fifthText.getText().toString().equals(""))
                {

                }
                else{
                    editor.putString(monTime5,fifthTime.text.toString()).apply()
                    editor.putString(monText5,fifthText.text.toString()).apply()
                }
                if(sixTime.getText().toString().equals("") && sixText.getText().toString().equals(""))
                {

                }
                else{
                    editor.putString(monTime6,sixTime.text.toString()).apply()
                    editor.putString(monText6,sixText.text.toString()).apply()
                }
            }
            fun wedCh(){
                if(firstTime.getText().toString().equals("") && firstText.getText().toString().equals(""))
                {

                }
                else{
                    editor.putString(wedTime1,firstTime.text.toString()).apply()
                    editor.putString(wedText1,firstText.text.toString()).apply()
                }
                if(secondTime.getText().toString().equals("") && secondText.getText().toString().equals(""))
                {

                }
                else{
                    editor.putString(wedTime2,secondTime.text.toString()).apply()
                    editor.putString(wedText2,secondText.text.toString()).apply()
                }
                if(thirdTime.getText().toString().equals("") && thirdText.getText().toString().equals(""))
                {

                }
                else{
                    editor.putString(wedTime3,thirdTime.text.toString()).apply()
                    editor.putString(wedText3,thirdText.text.toString()).apply()
                }
                if(fourthTime.getText().toString().equals("") && fourthText.getText().toString().equals(""))
                {

                }
                else{
                    editor.putString(wedTime4,fourthTime.text.toString()).apply()
                    editor.putString(wedText4,fourthText.text.toString()).apply()
                }
                if(fifthTime.getText().toString().equals("") && fifthText.getText().toString().equals(""))
                {

                }
                else{
                    editor.putString(wedTime5,fifthTime.text.toString()).apply()
                    editor.putString(wedText5,fifthText.text.toString()).apply()
                }
                if(sixTime.getText().toString().equals("") && sixText.getText().toString().equals(""))
                {

                }
                else{
                    editor.putString(wedTime6,sixTime.text.toString()).apply()
                    editor.putString(wedText6,sixText.text.toString()).apply()
                }
            }
            fun thuCh(){
                if(firstTime.getText().toString().equals("") && firstText.getText().toString().equals(""))
                {

                }
                else{
                    editor.putString(thuTime1,firstTime.text.toString()).apply()
                    editor.putString(thuText1,firstText.text.toString()).apply()
                }
                if(secondTime.getText().toString().equals("") && secondText.getText().toString().equals(""))
                {

                }
                else{
                    editor.putString(thuTime2,secondTime.text.toString()).apply()
                    editor.putString(thuText2,secondText.text.toString()).apply()
                }
                if(thirdTime.getText().toString().equals("") && thirdText.getText().toString().equals(""))
                {

                }
                else{
                    editor.putString(thuTime3,thirdTime.text.toString()).apply()
                    editor.putString(thuText3,thirdText.text.toString()).apply()
                }
                if(fourthTime.getText().toString().equals("") && fourthText.getText().toString().equals(""))
                {

                }
                else{
                    editor.putString(thuTime4,fourthTime.text.toString()).apply()
                    editor.putString(thuText4,fourthText.text.toString()).apply()
                }
                if(fifthTime.getText().toString().equals("") && fifthText.getText().toString().equals(""))
                {

                }
                else{
                    editor.putString(thuTime5,fifthTime.text.toString()).apply()
                    editor.putString(thuText5,fifthText.text.toString()).apply()
                }
                if(sixTime.getText().toString().equals("") && sixText.getText().toString().equals(""))
                {

                }
                else{
                    editor.putString(thuTime6,sixTime.text.toString()).apply()
                    editor.putString(thuText6,sixText.text.toString()).apply()
                }
            }
            fun friCh(){
                if(firstTime.getText().toString().equals("") && firstText.getText().toString().equals(""))
                {

                }
                else{
                    editor.putString(friTime1,firstTime.text.toString()).apply()
                    editor.putString(friText1,firstText.text.toString()).apply()
                }
                if(secondTime.getText().toString().equals("") && secondText.getText().toString().equals(""))
                {

                }
                else{
                    editor.putString(friTime2,secondTime.text.toString()).apply()
                    editor.putString(friText2,secondText.text.toString()).apply()
                }
                if(thirdTime.getText().toString().equals("") && thirdText.getText().toString().equals(""))
                {

                }
                else{
                    editor.putString(friTime3,thirdTime.text.toString()).apply()
                    editor.putString(friText3,thirdText.text.toString()).apply()
                }
                if(fourthTime.getText().toString().equals("") && fourthText.getText().toString().equals(""))
                {

                }
                else{
                    editor.putString(friTime4,fourthTime.text.toString()).apply()
                    editor.putString(friText4,fourthText.text.toString()).apply()
                }
                if(fifthTime.getText().toString().equals("") && fifthText.getText().toString().equals(""))
                {

                }
                else{
                    editor.putString(friTime5,fifthTime.text.toString()).apply()
                    editor.putString(friText5,fifthText.text.toString()).apply()
                }
                if(sixTime.getText().toString().equals("") && sixText.getText().toString().equals(""))
                {

                }
                else{
                    editor.putString(friTime6,sixTime.text.toString()).apply()
                    editor.putString(friText6,sixText.text.toString()).apply()
                }
            }
            fun satCh(){
                if(firstTime.getText().toString().equals("") && firstText.getText().toString().equals(""))
                {

                }
                else{
                    editor.putString(satTime1,firstTime.text.toString()).apply()
                    editor.putString(satText1,firstText.text.toString()).apply()
                }
                if(secondTime.getText().toString().equals("") && secondText.getText().toString().equals(""))
                {

                }
                else{
                    editor.putString(satTime2,secondTime.text.toString()).apply()
                    editor.putString(satText2,secondText.text.toString()).apply()
                }
                if(thirdTime.getText().toString().equals("") && thirdText.getText().toString().equals(""))
                {

                }
                else{
                    editor.putString(satTime3,thirdTime.text.toString()).apply()
                    editor.putString(satText3,thirdText.text.toString()).apply()
                }
                if(fourthTime.getText().toString().equals("") && fourthText.getText().toString().equals(""))
                {

                }
                else{
                    editor.putString(satTime4,fourthTime.text.toString()).apply()
                    editor.putString(satText4,fourthText.text.toString()).apply()
                }
                if(fifthTime.getText().toString().equals("") && fifthText.getText().toString().equals(""))
                {

                }
                else{
                    editor.putString(satTime5,fifthTime.text.toString()).apply()
                    editor.putString(satText5,fifthText.text.toString()).apply()
                }
                if(sixTime.getText().toString().equals("") && sixText.getText().toString().equals(""))
                {

                }
                else{
                    editor.putString(satTime6,sixTime.text.toString()).apply()
                    editor.putString(satText6,sixText.text.toString()).apply()
                }
            }
            fun sunCh(){
                if(firstTime.getText().toString().equals("") && firstText.getText().toString().equals(""))
                {

                }
                else{
                    editor.putString(sunTime1,firstTime.text.toString()).apply()
                    editor.putString(sunText1,firstText.text.toString()).apply()
                }
                if(secondTime.getText().toString().equals("") && secondText.getText().toString().equals(""))
                {

                }
                else{
                    editor.putString(sunTime2,secondTime.text.toString()).apply()
                    editor.putString(sunText2,secondText.text.toString()).apply()
                }
                if(thirdTime.getText().toString().equals("") && thirdText.getText().toString().equals(""))
                {

                }
                else{
                    editor.putString(sunTime3,thirdTime.text.toString()).apply()
                    editor.putString(sunText3,thirdText.text.toString()).apply()
                }
                if(fourthTime.getText().toString().equals("") && fourthText.getText().toString().equals(""))
                {

                }
                else{
                    editor.putString(sunTime4,fourthTime.text.toString()).apply()
                    editor.putString(sunText4,fourthText.text.toString()).apply()
                }
                if(fifthTime.getText().toString().equals("") && fifthText.getText().toString().equals(""))
                {

                }
                else{
                    editor.putString(sunTime5,fifthTime.text.toString()).apply()
                    editor.putString(sunText5,fifthText.text.toString()).apply()
                }
                if(sixTime.getText().toString().equals("") && sixText.getText().toString().equals(""))
                {

                }
                else{
                    editor.putString(sunTime6,sixTime.text.toString()).apply()
                    editor.putString(sunText6,sixText.text.toString()).apply()
                }
            }
            if(flag == "Monday") {
                monCh()
            }
            if(flag == "Tuesday") {
                tueCh()
            }
            if(flag == "Wednesday") {
                wedCh()
            }
            if(flag == "Thursday") {
                thuCh()
            }
            if(flag == "Friday") {
                friCh()
            }
            if(flag == "Saturday") {
                satCh()
            }
            if(flag == "Sunday") {
                sunCh()
            }

            }
        }



    }
